-- products
insert into products values(1,'ラケット',5000);
insert into products values(2,'ボール',200);
insert into products values(3,'シューズ',8000);
-- customers
insert into customers values(1,'Akira Abe','Chiba','0120-9999-9999');
insert into customers values(2,'Foo Bar','Tokyo','0120-0000-0000');
-- orders
insert into orders values(1, '2017-01-22', 1);
insert into orders values(2, '2017-01-24', 2);
insert into orders values(3, '2017-01-25', 1);
-- order_details
insert into order_details values(1,1,1,100);
insert into order_details values(2,1,2,50);
--
insert into order_details values(3,2,1,120);
insert into order_details values(4,2,3,50);
--
insert into order_details values(5,3,3,20);
insert into order_details values(6,3,2,12);
