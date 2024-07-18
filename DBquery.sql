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

Create table Users(
userid int identity(1,1) primary key,
roleid int references Roles(roleid),
fullname nvarchar(150) not null,
birthdate date not null,
identificationcard int not null,
phone int null,
email varchar(100) null,
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
invoicenumber varchar(50) not null,
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
clientname nvarchar(150) not null,
identificationcard int not null,
invoicenumber varchar(50) not null,
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

drop database SalesSystem