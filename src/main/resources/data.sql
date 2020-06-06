DROP TABLE IF EXISTS applications;

CREATE TABLE applications (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  description VARCHAR(250) NOT NULL
);

INSERT INTO applications (name, description) VALUES
  ('Application1', '1 Description of application number one'),
  ('Application2', '2 Description of application number two'),
  ('Application3', '3 Description of application other application');