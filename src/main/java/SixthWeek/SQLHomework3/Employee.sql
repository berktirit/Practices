-- test veritabanında employee tablosu oluşturma
DROP TABLE IF EXISTS employee;
CREATE TABLE employee (
    id INTEGER PRIMARY KEY,
    name VARCHAR(50),
    birthday DATE,
    email VARCHAR(100)
);

-- 50 kayıt INSERT (Mockaroo)
insert into Employee (id, name, birthday, email) values (1, 'Alikee Hansmann', '1998-03-17', 'ahansmann0@buzzfeed.com');
insert into Employee (id, name, birthday, email) values (2, 'Sinclair Glackin', '1999-09-03', 'sglackin1@xinhuanet.com');
insert into Employee (id, name, birthday, email) values (3, 'Christoph Caldecott', '1998-01-13', 'ccaldecott2@qq.com');
insert into Employee (id, name, birthday, email) values (4, 'Dulci Brayne', '2005-03-19', 'dbrayne3@tiny.cc');
insert into Employee (id, name, birthday, email) values (5, 'Shurlock Escudier', '2002-02-20', 'sescudier4@privacy.gov.au');
insert into Employee (id, name, birthday, email) values (6, 'Audry Arthars', '2001-12-19', 'aarthars5@xrea.com');
insert into Employee (id, name, birthday, email) values (7, 'Quill Toal', '1995-12-27', 'qtoal6@cafepress.com');
insert into Employee (id, name, birthday, email) values (8, 'Zerk Ruddin', '2004-08-26', 'zruddin7@theglobeandmail.com');
insert into Employee (id, name, birthday, email) values (9, 'Marlyn Reinhardt', '2000-10-06', 'mreinhardt8@sakura.ne.jp');
insert into Employee (id, name, birthday, email) values (10, 'Mattie Kowalik', '2000-12-10', 'mkowalik9@patch.com');
insert into Employee (id, name, birthday, email) values (11, 'Costa Tawse', '2001-12-21', 'ctawsea@ucsd.edu');
insert into Employee (id, name, birthday, email) values (12, 'Corine Badger', '1998-09-19', 'cbadgerb@desdev.cn');
insert into Employee (id, name, birthday, email) values (13, 'Agosto Stares', '2004-12-06', 'astaresc@icio.us');
insert into Employee (id, name, birthday, email) values (14, 'Elga Simonich', '1995-03-25', 'esimonichd@diigo.com');
insert into Employee (id, name, birthday, email) values (15, 'Roxanne Nobbs', '2000-02-17', 'rnobbse@house.gov');
insert into Employee (id, name, birthday, email) values (16, 'Devlin Galego', '2005-03-11', 'dgalegof@taobao.com');
insert into Employee (id, name, birthday, email) values (17, 'Kizzie Merrall', '2005-07-17', 'kmerrallg@baidu.com');
insert into Employee (id, name, birthday, email) values (18, 'Kain Everson', '2003-11-15', 'keversonh@edublogs.org');
insert into Employee (id, name, birthday, email) values (19, 'Antoinette Skedgell', '1995-05-21', 'askedgelli@biglobe.ne.jp');
insert into Employee (id, name, birthday, email) values (20, 'Nappie Ockenden', '1999-02-02', 'nockendenj@newyorker.com');
insert into Employee (id, name, birthday, email) values (21, 'King Dimond', '1999-06-07', 'kdimondk@imageshack.us');
insert into Employee (id, name, birthday, email) values (22, 'Vally Harryman', '1998-09-30', 'vharrymanl@myspace.com');
insert into Employee (id, name, birthday, email) values (23, 'Franchot Lapslie', '2000-08-12', 'flapsliem@csmonitor.com');
insert into Employee (id, name, birthday, email) values (24, 'Lesley Addicote', '2000-07-31', 'laddicoten@reference.com');
insert into Employee (id, name, birthday, email) values (25, 'Katha Mitkov', '1995-01-17', 'kmitkovo@163.com');
insert into Employee (id, name, birthday, email) values (26, 'Talya Buckler', '2002-12-22', 'tbucklerp@1688.com');
insert into Employee (id, name, birthday, email) values (27, 'Brett Cicculini', '2000-02-13', 'bcicculiniq@fastcompany.com');
insert into Employee (id, name, birthday, email) values (28, 'Percy Proppers', '2000-09-18', 'pproppersr@cpanel.net');
insert into Employee (id, name, birthday, email) values (29, 'Dolly Wondraschek', '2005-05-24', 'dwondrascheks@google.pl');
insert into Employee (id, name, birthday, email) values (30, 'Agnese Ganford', '2005-07-31', 'aganfordt@yandex.ru');
insert into Employee (id, name, birthday, email) values (31, 'Paulette Winslade', '2003-09-06', 'pwinsladeu@biglobe.ne.jp');
insert into Employee (id, name, birthday, email) values (32, 'Berkie Josovitz', '2000-06-11', 'bjosovitzv@home.pl');
insert into Employee (id, name, birthday, email) values (33, 'Binnie Hufton', '1995-11-23', 'bhuftonw@berkeley.edu');
insert into Employee (id, name, birthday, email) values (34, 'Sonnnie Haggath', '1995-02-05', 'shaggathx@nih.gov');
insert into Employee (id, name, birthday, email) values (35, 'Lori De Meis', '1998-04-15', 'ldey@epa.gov');
insert into Employee (id, name, birthday, email) values (36, 'Lil Perton', '2001-07-13', 'lpertonz@csmonitor.com');
insert into Employee (id, name, birthday, email) values (37, 'Jaime Sail', '2002-06-17', 'jsail10@bluehost.com');
insert into Employee (id, name, birthday, email) values (38, 'Geraldine Whear', '2004-10-23', 'gwhear11@amazon.com');
insert into Employee (id, name, birthday, email) values (39, 'Orran Aronsohn', '2005-04-14', 'oaronsohn12@twitter.com');
insert into Employee (id, name, birthday, email) values (40, 'Ophelie Forty', '2004-12-24', 'oforty13@spotify.com');
insert into Employee (id, name, birthday, email) values (41, 'Adelaide Sushams', '2001-07-02', 'asushams14@youku.com');
insert into Employee (id, name, birthday, email) values (42, 'Wendye Baythorp', '1996-08-19', 'wbaythorp15@ifeng.com');
insert into Employee (id, name, birthday, email) values (43, 'Gannie Pilger', '1995-04-04', 'gpilger16@uiuc.edu');
insert into Employee (id, name, birthday, email) values (44, 'Phyllis Dei', '2001-11-15', 'pdei17@google.fr');
insert into Employee (id, name, birthday, email) values (45, 'Heath Clayborn', '2003-10-14', 'hclayborn18@time.com');
insert into Employee (id, name, birthday, email) values (46, 'Stefa Henker', '2001-02-13', 'shenker19@simplemachines.org');
insert into Employee (id, name, birthday, email) values (47, 'Der Melling', '2004-04-11', 'dmelling1a@gov.uk');
insert into Employee (id, name, birthday, email) values (48, 'Cammi Frantzeni', '1995-11-25', 'cfrantzeni1b@google.co.uk');
insert into Employee (id, name, birthday, email) values (49, 'Coleman Piser', '2002-04-19', 'cpiser1c@omniture.com');
insert into Employee (id, name, birthday, email) values (50, 'Wini Rawlence', '2003-11-03', 'wrawlence1d@chicagotribune.com');

-- UPDATE işlemleri (5 farklı örnek)
UPDATE employee SET name = 'Updated Name' WHERE id = 1;
UPDATE employee SET email = 'newmail@example.com' WHERE name = 'Updated Name';
UPDATE employee SET name = 'Birthday Updated' WHERE birthday = '1980-01-01';
UPDATE employee SET birthday = '2000-01-01' WHERE id = 2;
UPDATE employee SET email = 'finalupdate@example.com' WHERE id = 3;

-- DELETE işlemleri (5 farklı örnek)
DELETE FROM employee WHERE id = 4;
DELETE FROM employee WHERE name = 'Updated Name';
DELETE FROM employee WHERE birthday = '2000-01-01';
DELETE FROM employee WHERE email = 'finalupdate@example.com';
DELETE FROM employee WHERE id = 5;