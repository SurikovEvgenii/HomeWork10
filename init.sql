CREATE TABLE students (id int PRIMARY KEY GENERATED ALWAYS AS IDENTITY, firstname varchar(250), lastname varchar(250), evaluation int);

INSERT INTO students(firstname, lastname, evaluation) VALUES ('Василий','Умный',100);
INSERT INTO students(firstname, lastname, evaluation) VALUES ('Генадий','Ловкий',100);
INSERT INTO students(firstname, lastname, evaluation) VALUES ('Василий','Умный',95);
INSERT INTO students(firstname, lastname, evaluation) VALUES ('Генадий','Ловкий',89);
INSERT INTO students(firstname, lastname, evaluation) VALUES ('Василиса','Прекрасная',80);
INSERT INTO students(firstname, lastname, evaluation) VALUES ('Василиса','Прекрасная',80);
INSERT INTO students(firstname, lastname, evaluation) VALUES ('Уолтер','Уайт',77);
INSERT INTO students(firstname, lastname, evaluation) VALUES ('Гомер','Симпсон',75);
INSERT INTO students(firstname, lastname, evaluation) VALUES ('Гомер','Симпсон',75);
INSERT INTO students(firstname, lastname, evaluation) VALUES ('Питер','Гриффин',65);
INSERT INTO students(firstname, lastname, evaluation) VALUES ('Мари','Гомес',50);
INSERT INTO students(firstname, lastname, evaluation) VALUES ('Гонг','Джои',45);



