DROP TABLE IF EXISTS applications;

CREATE TABLE applications (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  mail VARCHAR(50) NOT NULL,
  description VARCHAR(250) NOT NULL,
  date DATE NOT NULL
);

INSERT INTO applications (name, mail, description, date) VALUES
  ('Application1', 'mail1@domain.com','1 Description of application number one', 1-8-2020),
  ('Application2', 'mail2@domain.com','2 Description of application number two', 1-8-2020),
  ('Application3', 'mail3@domain.com','3 Description of application other application', 1-8-2020);