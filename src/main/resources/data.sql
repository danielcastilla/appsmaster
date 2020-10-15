DROP TABLE IF EXISTS application;


CREATE TABLE application (
  id INT PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  mail VARCHAR(50) NOT NULL,
  description VARCHAR(250) NOT NULL,
  initDate date NULL
);

-- INSERT INTO application (id, name, mail, description, initDate) VALUES
--  (1,'Application1', 'mail1@domain.com','1 Description of application number one', '2020-8-1'),
--  (2,'Application2', 'mail2@domain.com','2 Description of application number two', '2020-8-1'),
--  (3,'ApplicationX', 'mail3@domain.com','3 Description of application other application', '2020-8-1');
