CHARACTER SET 'utf8';
CREATE DATABASE db_librarysys;

USE db_librarysys;

DROP TABLE IF EXISTS tb_bookcase;
CREATE TABLE tb_bookcase (
  id int(10) unsigned NOT NULL AUTO_INCREMENT,
  name varchar(30) DEFAULT NULL,
  Column_3 char(10) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

insert  into tb_bookcase(id,name,Column_3) values (3,'A货架',NULL),(4,'B货架',NULL);
select * from tb_bookcase;


DROP TABLE IF EXISTS tb_bookinfo;
CREATE TABLE tb_bookinfo (
  barcode varchar(30) DEFAULT NULL,
  bookname varchar(70) DEFAULT NULL,
  typeid int(10) unsigned DEFAULT NULL,
  author varchar(30) DEFAULT NULL,
  translator varchar(30) DEFAULT NULL,
  ISBN varchar(20) DEFAULT NULL,
  price float(8,2) DEFAULT NULL,
  page int(10) unsigned DEFAULT NULL,
  bookcase int(10) unsigned DEFAULT NULL,
  inTime varchar(30) DEFAULT NULL,
  operator varchar(30) DEFAULT NULL,
  del tinyint(1) DEFAULT '0',
  id int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;


insert  into `tb_bookinfo`
(`barcode`,`bookname`,`typeid`,`author`,`translator`,`ISBN`,`price`,`page`,`bookcase`,`inTime`,`operator`,`del`,`id`) 
values ('9787302047230','Java学习指南',1,'***','11','7-302',39.00,440,3,'2007-11-22','tsoft',0,1),
('jk','kjkj',1,'***','','7-302',12.00,0,1,'2007-11-22','tsoft',1,2),
('9787115157690','JSP啊',1,'***','','978-7',89.00,816,3,'2007-11-23','tsoft',0,3),
('123','额',1,'11','11','7-302',11.00,11,1,'2007-12-18','tsoft',1,5),
('001','建筑测试',4,'做做','的','7-302',11.00,11,4,'2013-05-03','java1234',0,6);

select * from tb_bookinfo;
       

DROP TABLE IF EXISTS tb_booktype;

CREATE TABLE tb_booktype(
  id int(10) unsigned NOT NULL AUTO_INCREMENT,
  typename varchar(30) DEFAULT NULL,
  days int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

insert  into tb_booktype(id,typename,days) values (1,'计算机类',30),(3,'文学类',35),(4,'建筑类',20);
select * from tb_booktype;


DROP TABLE IF EXISTS tb_borrow;

CREATE TABLE tb_borrow(
  id int(10) unsigned NOT NULL AUTO_INCREMENT,
  readerid int(10) unsigned DEFAULT NULL,
  bookid int(10) DEFAULT NULL,
  borrowTime date DEFAULT NULL,
  backTime date DEFAULT NULL,
  operator varchar(30) DEFAULT NULL,
  ifback tinyint(1) DEFAULT '0',
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `tb_borrow` */

insert  into tb_borrow
(`id`,`readerid`,`bookid`,`borrowTime`,`backTime`,`operator`,`ifback`) 
values (1,1,1,'2007-11-22','2007-12-22','tsoft',1),
(2,1,3,'2007-11-26','2007-12-26','tsoft',0),
(3,1,1,'2007-11-26','2007-12-26','tsoft',0),
(4,3,6,'2007-12-29','2007-01-08','Tsoft',0),
(5,3,1,'2007-12-29','2008-01-28','Tsoft',0),
(6,3,3,'2007-12-29','2008-01-28','Tsoft',1),
(7,1,6,'2013-05-03','2013-05-23','java1234',1),
(8,1,6,'2013-05-03','2013-05-23','java1234',1),
(9,1,6,'2013-05-03','2013-05-23','java1234',1),
(10,1,1,'2013-05-03','2013-06-02','java1234',0);

select * from tb_borrow;

/*Table structure for table `tb_giveback` */

DROP TABLE IF EXISTS `tb_giveback`;

CREATE TABLE `tb_giveback` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `readerid` int(11) DEFAULT NULL,
  `bookid` int(11) DEFAULT NULL,
  `backTime` date DEFAULT NULL,
  `operator` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

insert  into `tb_giveback`(`id`,`readerid`,`bookid`,`backTime`,`operator`) 
values (1,1,1,'2007-11-22','tsoft'),
(2,3,3,'2007-01-03','Tsoft'),
(3,1,6,'2013-05-03','java1234'),
(4,1,6,'2013-05-03','java1234'),(5,1,6,'2013-05-03','java1234');
select * from tb_giveback;

/*Table structure for table `tb_library` */

DROP TABLE IF EXISTS `tb_library`;

CREATE TABLE `tb_library` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `libraryname` varchar(50) DEFAULT NULL,
  `curator` varchar(10) DEFAULT NULL,
  `tel` varchar(20) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `url` varchar(100) DEFAULT NULL,
  `createDate` varchar(100) DEFAULT NULL,
  `introduce` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

insert  into `tb_library`(`id`,`libraryname`,`curator`,`tel`,`address`,`email`,`url`,`createDate`,`introduce`)
values (1,'是','wgh','13634567894','ccs','wgh717@163.com','http://','1999-05-06','是');

/*Table structure for table `tb_manager` */

DROP TABLE IF EXISTS `tb_manager`;

CREATE TABLE `tb_manager` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `pwd` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `tb_manager` */

insert  into `tb_manager`(`id`,`name`,`pwd`) values (3,'java1234','1234'),(4,'tsoft','111');
insert  into `tb_manager`(`id`,`name`,`pwd`) values (1,'sky','123');
insert  into `tb_manager`(`id`,`name`,`pwd`) values (5,'ysk','123');

/*Table structure for table `tb_parameter` */

DROP TABLE IF EXISTS `tb_parameter`;

CREATE TABLE `tb_parameter` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cost` int(10) unsigned DEFAULT NULL,
  `validity` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

insert  into `tb_parameter`(`id`,`cost`,`validity`) values (1,45,3);

/*Table structure for table `tb_publishing` */

DROP TABLE IF EXISTS `tb_publishing`;

CREATE TABLE `tb_publishing` (
  `ISBN` varchar(20) DEFAULT NULL,
  `pubname` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_publishing` */

insert  into `tb_publishing`(`ISBN`,`pubname`) values ('7-302','电子工业出版社'),('978-7','清华大学出版社');

/*Table structure for table `tb_purview` */

DROP TABLE IF EXISTS `tb_purview`;

CREATE TABLE `tb_purview` (
  `id` int(11) NOT NULL,
  `sysset` tinyint(1) DEFAULT '0',
  `readerset` tinyint(1) DEFAULT '0',
  `bookset` tinyint(1) DEFAULT '0',
  `borrowback` tinyint(1) DEFAULT '0',
  `sysquery` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_purview` */

insert  into `tb_purview`(`id`,`sysset`,`readerset`,`bookset`,`borrowback`,`sysquery`) 
values (3,1,1,1,1,1),(4,1,1,1,1,1);

/*Table structure for table `tb_reader` */

DROP TABLE IF EXISTS `tb_reader`;

CREATE TABLE `tb_reader` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `barcode` varchar(30) DEFAULT NULL,
  `vocation` varchar(50) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `paperType` varchar(10) DEFAULT NULL,
  `paperNO` varchar(20) DEFAULT NULL,
  `tel` varchar(20) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `createDate` varchar(100) DEFAULT NULL,
  `operator` varchar(30) DEFAULT NULL,
  `remark` text,
  `typeid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `tb_reader` */


insert  into `tb_reader`
(`id`,`name`,`sex`,`barcode`,`vocation`,`birthday`,`paperType`,`paperNO`,`tel`,`email`,`createDate`,`operator`,`remark`,`typeid`)
values 
(1,'wgh','M','2008010100001','的','1980-07-17','身份证','2201041980********','13634*******','wgh717@****.com','2007-11-22','tsoft','的',1),
(2,'的','F','123123123','的','1983-02-22','身份证','220','','','2007-12-29','tsoft','',2),
(3,'姚思恺','M','123123321','学生','1996-04-13','身份证','212010519920413485','18502201275','18502201275@163.com','2017-05-11','sky','',2);

/*Table structure for table `tb_readertype` */

DROP TABLE IF EXISTS `tb_readertype`;

CREATE TABLE `tb_readertype` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `number` int(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `tb_readertype` */

insert  into `tb_readertype`(`id`,`name`,`number`) values (1,'学生',10),(2,'教师',20),(3,'其他',5);

select * from tb_bookcase;
select * from tb_bookinfo;
select * from tb_booktype;
select * from tb_borrow;
select * from tb_giveback;
select * from tb_library;
select * from tb_manager;
select * from tb_parameter;
select * from tb_publishing;
select * from tb_purview;
select * from tb_reader;
select * from tb_readertype;
   select id,name,pwd
   from tb_manager where name='sky';
insert tb_manager(name,pwd) values ('kkk', '456');
  


   select tb_reader.id,tb_reader.name,sex,barcode,vocation,birthday,paperType,paperNo,tel,email,createDate,operator,remark,typeid,tb_readertype.name
   from tb_reader join tb_readertype
   on tb_reader.typeid = tb_readertype.id;
   
   select * from tb_readertype;
   
   select tb_reader.id,tb_reader.name,sex,barcode,vocation,birthday,paperType,paperNo,tel,email,createDate,operator,remark,typeid,tb_readertype.name as 'type' 
   from tb_reader join tb_readertype
   on tb_reader.typeid = tb_readertype.id
   where tb_reader.id = 1
   
   select * from tb_booktype;
   select 
         i.barcode as barcode,
         i.bookname as bookname,
         t.typename as type,
         p.pubname as pubname,
         c.name as casename
   from ((tb_bookinfo i INNER JOIN tb_booktype t ON i.typeid=t.id) INNER JOIN tb_publishing p ON i.ISBN = p.ISBN) INNER JOIN tb_bookcase c ON i.bookcase=c.id
   
      select 
         barcode,
         bookname as bookName,
         typeId as typeid,
         author,
         translator,
         ISBN as isbn,
         price,
         page,
         bookcase,
         inTime,
         operator,
         del,
         id
    from tb_bookinfo where id=6;
    
       select id name
   from tb_bookcase
   where id=3;
   
   select ISBN as isbn,pubname
   from tb_publishing
   where ISBN='7-302';
   insert into tb_booktype values(5,'科技类',25);
   
   select * from tb_booktype;
   
   select 
     i.id as id,
     i.barcode as barcode,
     i.bookname as bookname,
     t.typename as type,
     p.pubname as pubname,
     c.name as casename
   from ((tb_bookinfo i INNER JOIN tb_booktype t ON i.typeid=t.id) INNER JOIN tb_publishing p ON i.ISBN = p.ISBN) INNER JOIN tb_bookcase c ON i.bookcase=c.id
   where c.name LIKE '%A%';
   