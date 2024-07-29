Create database SalesSystem;
go

use SalesSystem;
go

Create table Roles(
roleid int identity(1,1) primary key,
rolename nvarchar(50) not null,
registrationdate datetime default getDate()
);
go

Create table Permission(
permissionid int identity(1,1) primary key,
roleid int References Roles(roleid),
permissionName nvarchar(50) not null,
registrationdate datetime default getDate()
);
go

Create table Clients(
clientid int identity(1,1) primary key,
fullname nvarchar(150) not null,
birthdate date not null,
identificationcard int not null,
phone int null,
email varchar(100) null,
registrationdate datetime default getDate()
);
go

Create table Employees(
employeeid int identity(1, 1) primary key,
fullname nvarchar(150) not null,
birthdate date not null,
identificationcard int not null,
phone int null,
email varchar(100) null,
registrationdate datetime default getDate()
);
go

Create table Users(
userid int identity(1,1) primary key,
roleid int references Roles(roleid),
employeeid int references Employees(employeeid),
username nvarchar(40) not null,
password nvarchar(50) not null,
registrationdate datetime default getDate()
);
go

Create table Category(
categoryid int identity(1,1) primary key,
descriptions nvarchar(100) not null,
registrationdate datetime default getDate()
);
go

Create table Products(
productid int identity(1,1) primary key,
code varchar(50) not null,
productname varchar(50) not null,
descriptions nvarchar(100) null,
categoryid int references Category(categoryid),
stock int not null default 0,
purchaseprice decimal(10,2) default 0,
saleprice decimal(10,2) default 0,
registrationdate datetime default getDate()
);
go

Create table Supplier(
supplierid int identity(1,1) primary key,
businessname nvarchar(150) not null,
rnc int null,
phone int not null,
email varchar(100) null,
registrationdate datetime default getDate()
);
go

Create table Shopping(
shoppingid int identity(1,1) primary key,
userid int references Users(userid),
supplierid int references Supplier(supplierid),
invoicenumber  as ('CP' + Right ('0000' + Cast(shoppingid as varchar(10)), 4)) Persisted,
totalamount decimal(10,2) not null,
registrationdate datetime default getDate()
);
go

Create table PurchaseDetail(
purchasedetailid int identity(1,1) primary key,
shoppingid int references Shopping(shoppingid),
productid int references Products(productid),
purchaseprice decimal(10,2) default 0,
saleprice decimal(10,2) default 0,
amount int not null,
totalamount decimal(10,2),
);
go

Create table Sales(
saleid int identity(1,1) primary key,
userid int references Users(userid),
clientid int references Clients(clientid),
clientname nvarchar(150) not null,
identificationcard int not null,
invoicenumber  as ('VT' + Right ('0000' + Cast(saleid as varchar(10)), 4)) Persisted,
amountpaid decimal(10,2),
changeamount decimal(10,2),
totalamount decimal(10,2),
registrationdate datetime default getDate()
);
go

Create table SaleDetail(
saledetailid int identity(1,1) primary key,
saleid int references Sales(saleid),
productid int references Products(productid),
saleprice decimal(10,2),
amount int not null,
totalamount decimal(10,2),
);
go

Create table Debts(
debtid int identity(1, 1) primary key,
saledetailid int references SaleDetail(saledetailid),
purchasedetailid int references PurchaseDetail(purchasedetailid),
debttype bit not null,
totalamount decimal(10, 2) not null,
due decimal(10, 2) not null,
registrationdate datetime default getDate()
);
go

Create table Payments(
paymentid int identity(1, 1) primary key,
debtid int references Debts(debtid),
paymentnum as ('PAY' + Right ('0000' + Cast(paymentid as varchar(10)), 4)) Persisted,
amountpaid decimal(10, 2) not null,
paymentdate datetime default getDate()
);
go

--drop database SalesSystem

Insert into Roles(rolename) values('Administrador'), ('Empleado');

select * from Roles

select * from Users

/* select userid, r.roleid, rolename, r.registrationdate, fullname, username, password, birthdate, identificationcard, phone, email, u.registrationdate from Users u
inner join Roles r on u.roleid = r.roleid

Insert into Users(roleid, fullname, username, password, birthdate, identificationcard, phone, email)
values(1, 'Oliver Ernesto Tejeda Marte', 'Ov3rst', '123', '20/05/1997', 002123451, 123456, 'otejeda41@gmail.com'),
(2, 'Edwin Nivar Lluveres', 'edwin','456', '25/05/1997', 002123451, 456346, 'edwin@gmail.com');*/

