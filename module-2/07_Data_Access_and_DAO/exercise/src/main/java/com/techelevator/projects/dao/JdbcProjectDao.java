package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.techelevator.projects.model.Department;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Project;

public class JdbcProjectDao implements ProjectDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcProjectDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Project getProject(int projectId) {
//		return new Project(0, "Not Implemented Yet", null, null);
		Project project = null;
		String sql = "SELECT project_id, name, from_date, to_date FROM 	project WHERE project_id = ? ";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, projectId);
		if (results.next()) {
			project = mapRowToProject(results);
		}
		return project;
	}

	@Override
	public List<Project> getAllProjects() {
		List<Project> projects = new ArrayList<>();
		SqlRowSet results = jdbcTemplate.queryForRowSet("SELECT project_id, name, from_date, to_date FROM project");
		while (results.next()) {
			projects.add(mapRowToProject(results));
		}
		return projects;
	}


	@Override
	public Project createProject(Project newProject) {
		String sql = "INSERT INTO project (project_id, name, from_date, to_date) " +
				"VALUES (?, ?, ?, ?) RETURNING project_id";
		Integer newId = jdbcTemplate.queryForObject(sql, Integer.class,
				newProject.getId(), newProject.getName(), newProject.getFromDate(), newProject.getToDate());

		return getProject(newId);
	}

	@Override
	public void deleteProject(int projectId) {
		String sql = "DELETE FROM project_employee WHERE project_id = ?";
		jdbcTemplate.update(sql, projectId);
		String sql1 = "DELETE FROM project WHERE project_id = ?";
		jdbcTemplate.update(sql1, projectId);
	}
	private Project mapRowToProject(SqlRowSet rowSet) {
		Project project = new Project();
		project.setId(rowSet.getInt("project_id"));
		project.setName(rowSet.getString("name"));
		if (rowSet.getDate("from_date") != null ) {
			project.setFromDate(rowSet.getDate("from_date").toLocalDate());
		} else {
			project.setFromDate(null);
		}
		if (rowSet.getDate("to_date") != null) {
			project.setToDate(rowSet.getDate("to_date").toLocalDate());

		} else {
			project.setToDate(null);
		}

		return project;
	}
	

}
