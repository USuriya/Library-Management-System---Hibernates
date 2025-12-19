# Library-Management-System---Hibernates

Database name : library_db
Table name : library


mysql> describe library;
+---------------+--------------+------+-----+---------+-------+
| Field         | Type         | Null | Key | Default | Extra |
+---------------+--------------+------+-----+---------+-------+
| bid           | int          | NO   | PRI | NULL    |       |
| author        | varchar(255) | YES  |     | NULL    |       |
| genre         | varchar(255) | YES  |     | NULL    |       |
| publisher     | varchar(255) | YES  |     | NULL    |       |
| title         | varchar(255) | YES  |     | NULL    |       |
| yearPublished | int          | NO   |     | NULL    |       |
+---------------+--------------+------+-----+---------+-------+



mysql> select * from library;
+-----+---------------------+------------------------------------------+----------------------------+---------------------------------+---------------+
| bid | author              | genre                                    | publisher                  | title                           | yearPublished |
+-----+---------------------+------------------------------------------+----------------------------+---------------------------------+---------------+
|   1 | William Shakespeare | Tragedy / Historical Drama               | First Folio, London        | Julius Caesar                   |          1623 |
|   2 | Marry Beard         | History / Non-Fiction                    | Profile Books              | SPQR: A History of Ancient Rome |          2015 |
|   3 | Arundhati Roy       | Literary Fiction                         | IndiaInk / HarperCollins   | The God of Small Things         |          1997 |
|   4 | William Shakespeare | Tragedy / Historical Drama               | First Folio, London        | Julius Caesar                   |          1623 |
|   5 | Jhumpa Lahiri       | Short Stories / Fiction                  | Houghton Mifflin Harcourt  | Interpreter of Maladies         |          1999 |
|   6 | Aravind Adiga       | Contemporary Fiction / Social Commentary | HarperCollins              | The White Tiger                 |          2008 |
|   7 | Ruskin Bond         | Children's Fiction                       | National Book Trust, India | The Blue Umbrella               |          1980 |
+-----+---------------------+------------------------------------------+----------------------------+---------------------------------+---------------+
