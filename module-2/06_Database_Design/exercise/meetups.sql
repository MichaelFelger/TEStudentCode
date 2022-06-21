DROP TABLE IF EXISTS member,interest_group, group_member, event, event_member;

CREATE TABLE member (
	member_id serial PRIMARY KEY,
	last_name VARCHAR(50) NOT NULL,
	first_name VARCHAR(50) NOT NULL,
	email_address VARCHAR(50) NOT NULL,
	phone_number VARCHAR(10) NOT NULL,
	date_of_birth DATE NOT NULL,
	wants_reminders BOOLEAN NOT NULL
);

CREATE TABLE interest_group (
	interest_group_id serial PRIMARY KEY,
	interest_group_name VARCHAR(50) NOT NULL
);

CREATE TABLE group_member (
	group_member_id INT NOT NULL,
	interest_group_id INT NOT NULL,
	CONSTRAINT PK_group_member PRIMARY KEY (group_member_id, interest_group_id)
);

CREATE TABLE event (
	event_id serial PRIMARY KEY,
	event_name VARCHAR(50) NOT NULL,
	event_description VARCHAR(140) NOT NULL,
	event_date DATE NOT NULL,
	event_time TIME NOT NULL,
	duration VARCHAR(10) NOT NULL,
	interest_group_id INT NOT NULL
);

CREATE TABLE event_member (
	event_id INT NOT NULL,
	member_id INT NOT NULL,
	CONSTRAINT PK_event_member PRIMARY KEY (member_id, event_id)
);

ALTER TABLE group_member ADD CONSTRAINT FK_group_member_group FOREIGN KEY(interest_group_id) REFERENCES interest_group(interest_group_id);
ALTER TABLE group_member ADD CONSTRAINT FK_group_member_member FOREIGN KEY(group_member_id) REFERENCES member(member_id);


ALTER TABLE event_member ADD CONSTRAINT FK_event_member_member FOREIGN KEY(member_id) REFERENCES member(member_id);
ALTER TABLE event_member ADD CONSTRAINT FK_event_member_event FOREIGN KEY(event_id) REFERENCES event(event_id);

ALTER TABLE event ADD CONSTRAINT FK_interest_group FOREIGN KEY(interest_group_id) REFERENCES interest_group(interest_group_id);



-- I think I need to add in some more FK

--   ********************************************
--   ********************************************
--   ********************************************
--   ********************************************
--   ********************************************
--   ********************************************

INSERT INTO member (last_name, first_name, email_address, phone_number, date_of_birth, wants_reminders)
VALUES ('Messi', 'Lionel', 'elmago10@gmail.com.ar', 5554443322, '1985-04-08', true);
INSERT INTO member (last_name, first_name, email_address, phone_number, date_of_birth, wants_reminders)
VALUES ('Ronaldo', 'Cristiano', 'narciso10@gmail.com.po', 4554443322, '1984-06-07', false);
INSERT INTO member (last_name, first_name, email_address, phone_number, date_of_birth, wants_reminders)
VALUES ('Benzema', 'Karim', 'ouichef10@gmail.com.fr', 4554486722, '1986-09-01', false);
INSERT INTO member (last_name, first_name, email_address, phone_number, date_of_birth, wants_reminders)
VALUES ('Mercury', 'Freddie', 'highnotes@gmail.co.uk', 4554486722, '1952-09-21', true);
INSERT INTO member (last_name, first_name, email_address, phone_number, date_of_birth, wants_reminders)
VALUES ('May', 'Brian', 'stringtheory@gmail.co.uk', 3141592653, '1952-03-14', true);
INSERT INTO member (last_name, first_name, email_address, phone_number, date_of_birth, wants_reminders)
VALUES ('Greene', 'Brian', 'stringtheory_1@columbia.edu.', 3141592654, '1958-09-21', true);
INSERT INTO member (last_name, first_name, email_address, phone_number, date_of_birth, wants_reminders)
VALUES ('Hawking', 'Stephen', 'blackholeson@gmail.co.uk', 3196722654, '1948-05-19', false);
INSERT INTO member (last_name, first_name, email_address, phone_number, date_of_birth, wants_reminders)
VALUES ('Turing', 'Alan', 'enigmatic@princeton.edu', 3966720054, '1919-12-21', true);

INSERT INTO interest_group (interest_group_name)
VALUES ('World Cup');
INSERT INTO interest_group (interest_group_name)
VALUES ('A Night at the Opera');
INSERT INTO interest_group (interest_group_name)
VALUES ('Star Talk');


INSERT INTO event (event_name, event_description, event_date, event_time, duration, interest_group_id)
VALUES ('Qatar 2022', 'Sportsball meets desert', '2022-01-12', '12:00', 90, (SELECT interest_group_id FROM interest_group WHERE interest_group_name ='World Cup'));
INSERT INTO event (event_name, event_description, event_date, event_time, duration, interest_group_id)
VALUES ('Live at Wembley Rehearsal', 'Prepping for the big show', '1986-05-22', '18:00', 90, (SELECT interest_group_id FROM interest_group WHERE interest_group_name ='A Night at the Opera'));
INSERT INTO event (event_name, event_description, event_date, event_time, duration, interest_group_id)
VALUES ('Good Vibrations', 'Roundtable on the evolving state of String Theory', '2011-11-12', '18:00', 90, (SELECT interest_group_id FROM interest_group WHERE interest_group_name ='Star Talk'));

INSERT INTO group_member (group_member_id, interest_group_id)
VALUES((SELECT member_id FROM member WHERE last_name = 'Messi'),
	  (SELECT interest_group_id FROM interest_group WHERE interest_group_name = 'World Cup'));
INSERT INTO group_member (group_member_id, interest_group_id)
VALUES((SELECT member_id FROM member WHERE last_name = 'Ronaldo'),
	  (SELECT interest_group_id FROM interest_group WHERE interest_group_name = 'World Cup'));
INSERT INTO group_member (group_member_id, interest_group_id)
VALUES((SELECT member_id FROM member WHERE last_name = 'Benzema'),
	  (SELECT interest_group_id FROM interest_group WHERE interest_group_name = 'World Cup'));
INSERT INTO group_member (group_member_id, interest_group_id)
VALUES((SELECT member_id FROM member WHERE last_name = 'Mercury'),
	  (SELECT interest_group_id FROM interest_group WHERE interest_group_name = 'A Night at the Opera'));
INSERT INTO group_member (group_member_id, interest_group_id)
VALUES((SELECT member_id FROM member WHERE last_name = 'May'),
	  (SELECT interest_group_id FROM interest_group WHERE interest_group_name = 'A Night at the Opera'));
INSERT INTO group_member (group_member_id, interest_group_id)
VALUES((SELECT member_id FROM member WHERE last_name = 'May'),
	  (SELECT interest_group_id FROM interest_group WHERE interest_group_name = 'Star Talk'));
INSERT INTO group_member (group_member_id, interest_group_id)
VALUES((SELECT member_id FROM member WHERE last_name = 'Greene'),
	  (SELECT interest_group_id FROM interest_group WHERE interest_group_name = 'Star Talk'));
INSERT INTO group_member (group_member_id, interest_group_id)
VALUES((SELECT member_id FROM member WHERE last_name = 'Hawking'),
	  (SELECT interest_group_id FROM interest_group WHERE interest_group_name = 'Star Talk'));
INSERT INTO group_member (group_member_id, interest_group_id)
VALUES((SELECT member_id FROM member WHERE last_name = 'Turing'),
	  (SELECT interest_group_id FROM interest_group WHERE interest_group_name = 'Star Talk'));
	  
INSERT INTO event_member (event_id, member_id)
VALUES ((SELECT event_id FROM event WHERE event_name = 'Qatar 2022'),
(SELECT member_id FROM member WHERE last_name = 'Messi'));
INSERT INTO event_member (event_id, member_id)
VALUES ((SELECT event_id FROM event WHERE event_name = 'Qatar 2022'),
(SELECT member_id FROM member WHERE last_name = 'Ronaldo'));
INSERT INTO event_member (event_id, member_id)
VALUES ((SELECT event_id FROM event WHERE event_name = 'Qatar 2022'),
(SELECT member_id FROM member WHERE last_name = 'Benzema'));
INSERT INTO event_member (event_id, member_id)
VALUES ((SELECT event_id FROM event WHERE event_name = 'Live at Wembley Rehearsal'),
(SELECT member_id FROM member WHERE last_name = 'Mercury'));
INSERT INTO event_member (event_id, member_id)
VALUES ((SELECT event_id FROM event WHERE event_name = 'Live at Wembley Rehearsal'),
(SELECT member_id FROM member WHERE last_name = 'May'));
INSERT INTO event_member (event_id, member_id)
VALUES ((SELECT event_id FROM event WHERE event_name = 'Good Vibrations'),
(SELECT member_id FROM member WHERE last_name = 'May'));
INSERT INTO event_member (event_id, member_id)
VALUES ((SELECT event_id FROM event WHERE event_name = 'Good Vibrations'),
(SELECT member_id FROM member WHERE last_name = 'Greene'));
INSERT INTO event_member (event_id, member_id)
VALUES ((SELECT event_id FROM event WHERE event_name = 'Good Vibrations'),
(SELECT member_id FROM member WHERE last_name = 'Hawking'));
INSERT INTO event_member (event_id, member_id)
VALUES ((SELECT event_id FROM event WHERE event_name = 'Good Vibrations'),
(SELECT member_id FROM member WHERE last_name = 'Turing'));

		


SELECT * FROM event;

