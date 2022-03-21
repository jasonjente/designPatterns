CREATE TABLE USER_ACCOUNT (
	user_id serial PRIMARY KEY,
	username VARCHAR ( 50 ) UNIQUE NOT NULL,
	password VARCHAR ( 50 ) NOT NULL,
	email VARCHAR ( 255 ) UNIQUE NOT NULL,
	created_on TIMESTAMP NOT NULL,
        last_login TIMESTAMP 
);

CREATE TABLE ROLES(
   role_id serial PRIMARY KEY,
   role_name VARCHAR (255) UNIQUE NOT NULL
);

CREATE TABLE USER_RULES (
  user_id INT NOT NULL,
  role_id INT NOT NULL,
  grant_date TIMESTAMP,
  PRIMARY KEY (user_id, role_id),
  FOREIGN KEY (role_id)
      REFERENCES ROLES (role_id),
  FOREIGN KEY (user_id)
      REFERENCES USER_ACCOUNT (user_id)
);

INSERT INTO 
	ROLES(role_id, role_name)
VALUES
	(1,'MANAGER'),
	(2,'PRODUCT MANAGER'),
	(3,'TEAM LEADER'),
	(4,'LEAD ENGINEER'),
	(5,'SENIOR ENGINEER'),
	(6,'ENGINEER'),
	(7,'JUNIOR ENGINEER'),
	(8,'INTERN');
INSERT INTO USER_ACCOUNT(username,password,email,created_on) values
('bbb','password2','email2',NOW()),
('ccc','password3','email3',NOW()),
('ddd','password4','email4',NOW()),
('eee','password5','email5',NOW()),
('fff','password6','email6',NOW());

insert into user_rules(user_id,role_id,grant_date) values
(1,1,NOW()),
(2,2,NOW()),
(3,3,NOW()),
(4,5,NOW()),
(5,5,NOW()),
(6,7,NOW());
