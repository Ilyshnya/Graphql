insert into Book (id,name) values ( (select max(id) FROM book) + 1,'Kniga');

