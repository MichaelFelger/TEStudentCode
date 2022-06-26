package com.techelevator.dao;

import com.techelevator.pizza.Pizza;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class JdbcPizzaDao implements PizzaDao {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    // constructor
    public JdbcPizzaDao(DataSource dataSource) {
        this.dataSource = dataSource; // where is database
        this.jdbcTemplate = new JdbcTemplate(dataSource); // get and send info from and to database
    }


    public void createPizza(Pizza pizza) {
        String insertPizzaSql =
                " INSERT INTO (sale_id, size_id, crust, " +
                        "sauce, price, additional_instructions)"
                        + " VALUES (1, 'XL', 'Pan', 'Normal', 12.99," +
                        " 'Cut into squares')" + " VALUES (?,?,?,?,?,?);";

    }
}
