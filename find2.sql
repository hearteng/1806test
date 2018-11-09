   select * from tb_booktype;
   select * from tb_reader;
   select * from tb_borrow;
   select * from tb_bookinfo;
   select * from tb_borrow;
   
   update tb_borrow
   set ifback = 1
   where id=22;
   
   update tb_bookinfo
   set del=0
   where barcode=666;


   
   select readerid,bookid,borrowTime,backTime,operator,ifback
   from tb_borrow
   where readerid = 1
   and ifback=1;
   select readerid,bookid,borrowTime,backTime,operator,ifback
   from tb_borrow
   where id=11
   and ifback=0
insert  into `tb_bookinfo`
(`barcode`,`bookname`,`typeid`,`author`,`translator`,`ISBN`,`price`,`page`,`bookcase`,`inTime`,`operator`,`del`) 
values 
('666','C#ѧϰ',7,'FF','FICD','978-7',99.20,99,3,'2016-09-30','sky',0);


insert  into `tb_bookinfo`
(`barcode`,`bookname`,`typeid`,`author`,`translator`,`ISBN`,`price`,`page`,`bookcase`,`inTime`,`operator`,`del`) 
values 
('667','javaѧϰ',7,'GG','FICA','978-7',89.20,129,3,'2016-07-30','sky1',0);
insert  into `tb_bookinfo`
(`barcode`,`bookname`,`typeid`,`author`,`translator`,`ISBN`,`price`,`page`,`bookcase`,`inTime`,`operator`,`del`) 
values 
('668','PHPѧϰ',7,'EE','FICS','978-7',79.20,39,3,'2016-06-30','sky1',0);
insert  into `tb_bookinfo`
(`barcode`,`bookname`,`typeid`,`author`,`translator`,`ISBN`,`price`,`page`,`bookcase`,`inTime`,`operator`,`del`) 
values 
('669','Rѧϰ',7,'RR','FICF','978-7',69.20,399,3,'2016-06-30','sky1',0);
insert  into `tb_bookinfo`
(`barcode`,`bookname`,`typeid`,`author`,`translator`,`ISBN`,`price`,`page`,`bookcase`,`inTime`,`operator`,`del`) 
values 
('669','Rѧϰ',7,'RR','FICF','978-7',69.20,399,3,'2016-06-30','sky1',0);


delete from tb_bookinfo
where barcode='456';





select * from tb_manager;
insert  into tb_manager(name,pwd) values('rob','123');
insert  into tb_manager(name,pwd) values('j_lj','123');
insert  into tb_manager(name,pwd) values('h_lj','123');
insert  into tb_manager(name,pwd) values('l_lj','123');
insert  into tb_manager(name,pwd) values('k_lj','123');












