
Insert into LMS_MEMBERS
Values('LM001', 'AMIT', 'CHENNAI', '2012-02-12', '2013-02-11','Temporary');
Insert into LMS_MEMBERS
Values('LM002', 'ABDHUL', 'DELHI', '2012-04-10', '2013-04-09','Temporary');
Insert into LMS_MEMBERS
Values('LM003', 'GAYAN', 'CHENNAI', '2012-05-13','2013-05-12', 'Permanent');
Insert into LMS_MEMBERS
Values('LM004', 'RADHA', 'CHENNAI', '2012-04-22', '2013-04-21', 'Temporary');
Insert into LMS_MEMBERS
Values('LM005', 'GURU', 'BANGALORE', '2012-03-30', '2013-05-16','Temporary');
Insert into LMS_MEMBERS
Values('LM006', 'MOHAN', 'CHENNAI', '2012-04-12', '2013-05-16','Temporary');


Insert into  LMS_SUPPLIERS_DETAILS 
Values ('S01','SINGAPORE SHOPPEE', 'CHENNAI', 9894123555,'sing@gmail.com');
Insert into  LMS_SUPPLIERS_DETAILS 
Values ('S02','JK Stores', 'MUMBAI', 9940123450 ,'jks@yahoo.com');
Insert into  LMS_SUPPLIERS_DETAILS 
Values ('S03','ROSE BOOK STORE', 'TRIVANDRUM', 9444411222,'rose@gmail.com');
Insert into  LMS_SUPPLIERS_DETAILS 
Values ('S04','KAVARI STORE', 'DELHI', 8630001452,'kavi@redif.com');
Insert into  LMS_SUPPLIERS_DETAILS 
Values ('S05','EINSTEN BOOK GALLARY', 'US', 9542000001,'eingal@aol.com');
Insert into  LMS_SUPPLIERS_DETAILS 
Values ('S06','AKBAR STORE', 'MUMBAI',7855623100 ,'akbakst@aol.com');

Insert into LMS_FINE_DETAILS Values('R0', 0);
Insert into LMS_FINE_DETAILS Values('R1', 20);
insert into LMS_FINE_DETAILS Values('R2', 50);
Insert into LMS_FINE_DETAILS Values('R3', 75);
Insert into LMS_FINE_DETAILS Values('R4', 100);
Insert into LMS_FINE_DETAILS Values('R5', 150);
Insert into LMS_FINE_DETAILS Values('R6', 200);


Insert into LMS_BOOK_DETAILS
Values('BL000001', 'Java How To Do Program', 'JAVA', 'Paul J. Deitel', 'Prentice Hall', '1999-12-10', 6, 600.00, 'A1', '2011-05-10', 'S01');
Insert into LMS_BOOK_DETAILS
Values('BL000002', 'Java: The Complete Reference ', 'JAVA', 'Herbert Schildt',  'Tata Mcgraw Hill ', '2011-10-10', 5, 750.00, 'A1', '2011-05-10', 'S03');
Insert into LMS_BOOK_DETAILS 
Values('BL000003', 'Java How To Do Program', 'JAVA', 'Paul J. Deitel', 'Prentice Hall', '1999-05-10', 6, 600.00, 'A1', '2012-05-10', 'S01');
Insert into LMS_BOOK_DETAILS
Values('BL000004', 'Java: The Complete Reference ', 'JAVA', 'Herbert Schildt', 'Tata Mcgraw Hill ', '2011-10-10', 5, 750.00, 'A1', '2012-05-11', 'S01');
Insert into LMS_BOOK_DETAILS 
Values('BL000005', 'Java How To Do Program', 'JAVA', 'Paul J. Deitel',  'Prentice Hall', '1999-12-10', 6, 600.00, 'A1', '2012-05-11', 'S01');
Insert into LMS_BOOK_DETAILS
Values('BL000006', 'Java: The Complete Reference ', 'JAVA', 'Herbert Schildt', 'Tata Mcgraw Hill ', '2011-10-10', 5, 750.00, 'A1', '2012-05-12', 'S03');
Insert into LMS_BOOK_DETAILS 
Values('BL000007', 'Let Us C', 'C', 'Yashavant Kanetkar ', 'BPB Publications', '2010-12-11',  9, 500.00 , 'A3', '2010-11-03', 'S03');
Insert into LMS_BOOK_DETAILS 
Values('BL000008', 'Let Us C', 'C', 'Yashavant Kanetkar ','BPB Publications', '2010-05-12',  9, 500.00 , 'A3', '2011-08-09', 'S04');


Insert into LMS_BOOK_ISSUE 
Values (001, 'LM001', 'BL000001', '2012-05-01', '2012-05-16', '2012-05-16', 'R0');
Insert into LMS_BOOK_ISSUE 
Values (002, 'LM002', 'BL000002', '2012-05-01', '2012-05-06','2012-05-16', 'R2');
Insert into LMS_BOOK_ISSUE
Values (003, 'LM003', 'BL000007', '2012-04-01', '2012-04-16', '2012-04-20','R1');
Insert into LMS_BOOK_ISSUE 
Values (004, 'LM004', 'BL000005', '2012-04-01', '2012-04-16','2012-04-20', 'R1');
Insert into LMS_BOOK_ISSUE 
Values (005, 'LM005', 'BL000008', '2012-03-30', '2012-04-15','2012-04-20' , 'R1');
Insert into LMS_BOOK_ISSUE 
Values (006, 'LM005', 'BL000008', '2012-04-20', '2012-05-05','2012-05-05' , 'R0');
Insert into LMS_BOOK_ISSUE 
Values (007, 'LM003', 'BL000007', '2012-04-22', '2012-05-07','2012-05-25' , 'R4');




select * from lms_members;
select member_name,city,membership_status from lms_members;

select * from lms_book_details;
select book_title,lms_book_details.supplier_id, book_code
from lms_book_details, lms_suppliers_details
where lms_book_details.supplier_id = lms_suppliers_details.supplier_id
group by supplier_id 
order by count(book_code)desc;


select lms_members.member_id, member_name, (3-count(book_code)) remaining_books
from lms_members, lms_book_issue
where lms_members.member_id = lms_book_issue.member_id
group by member_name;

select lms_suppliers_details.supplier_id,supplier_name
from lms_suppliers_details,lms_book_details
where lms_suppliers_details.supplier_id = lms_book_details.supplier_id
and book_code = (select book_code from lms_book_details
group by lms_book_details.supplier_id
having count(book_code) <=all(select count(book_code) from lms_book_details group by supplier_id));

select lms_book_issue.member_id,member_name,lms_book_issue.book_code,book_title
from lms_members,lms_book_issue,lms_book_details
where lms_members.member_id = lms_book_issue.member_id
and lms_book_issue.book_code=lms_book_details.book_code;
 

select * from lms_book_issue;
select count(distinct(book_code)) from lms_book_issue;

select lms_members.member_id, member_name, lms_book_issue.fine_range, lms_fine_details.fine_amount
from lms_book_issue,lms_fine_details,lms_members
where lms_book_issue.member_id= lms_members.member_id
and lms_book_issue.fine_range= lms_fine_details.fine_range
and fine_amount<100;


select book_code,book_title,publication,book_edition,price,publish_date
from lms_book_details
order by 'publish_date','publication','edition';

select book_code,book_title,rack_num
from lms_book_details
where rack_num='a1'
 order by 'book_title';
 
 select * from lms_book_issue;
 select* from lms_members;

select lms_book_issue.member_id, member_name, date_return,date_returned
from lms_book_issue,lms_members
where lms_book_issue.member_id = lms_members.member_id
and  date_return=date_returned;

select * from lms_book_issue;

select date_issue, count(book_code) from lms_book_issue
group by date_issue
having
count(book_code) >=all(select count(book_code) from lms_book_issue
group by date_issue);

select * from lms_book_issue;

select lms_members.member_id,member_name,date_register
from lms_members,lms_book_issue

where lms_members.member_id<>lms_book_issue.member_id
and book_code='';



select * from lms_members;
select * from lms_book_issue;
select * from lms_fine_details;

select lms_members.member_id,member_name
from lms_members,lms_book_issue
where lms_members.member_id=lms_book_issue.member_id
and fine_range=(select fine_range from lms_book_issue where extract(year from date(date_issue))<>2012);

select * from lms_book_details;

select lms_suppliers_details.supplier_id,book_title
from lms_book_details,lms_suppliers_details
where lms_book_details.supplier_id= lms_suppliers_details.supplier_id
and author='herbert schildt'
and book_edition=5;

select * from lms_book_details;

select rack_num,(select count(book_code) from lms_book_details order by rack_num) noofbooks
from lms_book_details
group by rack_num;

select lms_book_issue.book_issue_no, lms_members.member_name, lms_members.date_register, lms_members.date_expire, 
lms_book_details.book_title, 
lms_book_details.author, lms_book_details.price, lms_book_issue.date_issue, lms_book_issue.date_return, 
lms_book_issue.date_returned,lms_fine_details.fine_amount

from lms_book_issue,lms_members,lms_book_details,lms_fine_details

where lms_book_details.book_code= lms_book_issue.book_code
and lms_members.member_id= lms_book_issue.member_id
and lms_book_issue.fine_range= lms_fine_details.fine_range;


select book_code,book_title,publish_date
from lms_book_details
where extract(month from date(publish_date))='12';


select book_code,book_title,publish_date,lms_suppliers_details.supplier_id,supplier_name,price
from lms_book_details,lms_suppliers_details
where lms_book_details.supplier_id= lms_suppliers_details.supplier_id
and price = (select max(price) from lms_book_details order by supplier_id);


select book_code,book_title,publication,publish_date
from lms_book_details
order by 'publish_date' desc;

select * from lms_book_details;
select * from lms_book_issue;

select lms_book_details.book_code,publication,price,supplier_name

from lms_book_details,lms_suppliers_details,lms_book_issue

where lms_book_details.supplier_id= lms_suppliers_details.supplier_id

and lms_book_issue.book_code= lms_book_details.book_code

and lms_book_issue.book_code=(select max(count(member_id)) from lms_book_issue group by 'book_code');

select lms_members.member_id,member_name from lms_members,lms_book_issue
where lms_members.member_id= lms_book_issue.member_id
and book_code='bl000002';



select book_code,book_title, author
from lms_book_details
where author like 'p%';

 

select book_title, count(book_title) noofbooks
from lms_book_details
where book_title like 'java%';

select * from lms_book_details;
select category, count(book_title) noofbooks
from lms_book_details
group by category;

select count(book_title)no_of_books
from lms_book_details
where author='paul j. deitel';


select lms_book_details.book_code,book_title
from lms_book_details,lms_book_issue
where lms_book_details.book_code=lms_book_issue.book_code
and date_issue='2012-04-01';


select member_id,member_name,date_register,date_expire
from lms_members
where extract(month from date(date_expire))<4;

select member_id,member_name,date_register,membership_status
from lms_members
where date_register<'2012-03-01'
and membership_status='temporary';

select * from lms_members;


select member_id, upper (member_name) name
from lms_members
where city = 'delhi'
or city = 'chennai';
select * from lms_members;


select concat(book_title,' ','is written by',' ',author) book_title_is_written_by_author
from lms_book_details;

select avg(price) from lms_book_details
group by 'java';


select supplier_id,supplier_name
from lms_suppliers_details
where email like '%gmail%';

 

select supplier_id,supplier_name, coalesce(contact,address,email)
from lms_suppliers_details;


select supplier_id,supplier_name,
case
when contact is null
then 'no' 
else 'yes'
end as 'phonenumavailable'
from lms_suppliers_details;



select sum(fine_amount),lms_members.member_id,member_name,city,membership_status
from lms_members,lms_book_issue,lms_fine_details
where lms_members.member_id=lms_book_issue.member_id
and lms_book_issue.fine_range=lms_fine_details.fine_range
group by lms_members.member_id;

select * from lms_book_issue;
select count(member_id), book_code from lms_book_issue group by 'book_code';

Write a query to display the book code, publication, price and
 supplier name of the book witch is taken frequently.

