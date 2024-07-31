Create database SalesSystem;
go

use SalesSystem;
go

Create table Roles
(
  roleid int identity(1,1) primary key,
  rolename nvarchar(50) not null,
  registrationdate datetime default getDate()
);
go

Create table Permission
(
  permissionid int identity(1,1) primary key,
  roleid int References Roles(roleid),
  permissionName nvarchar(50) not null,
  registrationdate datetime default getDate()
);
go

Create table Clients
(
  clientid int identity(1,1) primary key,
  fullname nvarchar(150) not null,
  birthdate date not null,
  identificationcard int not null,
  phone int null,
  email varchar(100) null,
  registrationdate datetime default getDate()
);
go

Create table Employees
(
  employeeid int identity(1, 1) primary key,
  fullname nvarchar(150) not null,
  birthdate date not null,
  identificationcard int not null,
  phone int null,
  email varchar(100) null,
  position nvarchar(100) not null,
  salary decimal(10,2) not null,
  registrationdate datetime default getDate()
);
go

Insert into Employees (fullname, birthdate, identificationcard, phone, email, position, salary)

/*Create table Payroll
(
  pyrollid int identity(1,1) primary key,

);
go

CREATE TABLE [dbo].[Nominas]
(
  [Id] [int] IDENTITY(1,1) NOT NULL,
  [Nombre] [varchar](30) NOT NULL,
  [Apellido] [varchar](30) NOT NULL,
  [Cargo] [varchar](50) NOT NULL,
  [SueldoBruto] [varchar](50) NOT NULL,
  [HorasExt] [int] NULL,
  [PrecioHoraExt] [int] NULL,
  [PagoHorasExt] [int] NULL,
  [BonoTransporte] [int] NULL,
  [SeguroMedico] [float] NOT NULL,
  [AdelantoSueldo] [int] NULL,
  [SueldoNeto] [float] NOT NULL
)

Create table CompanyCapital
(
  capitalid int identity(1,1) primary key,
  totalamount money,
  --con un trigger para actualizarlo cada vez que se deduzca de nomina, pasivos, compra de productos o se venda un producto.
  companyassets money,
  -- trigger para deducir cada que se venda un producto o se compre producto
  modificationdate datetime default GETDATE()
);
go*/

Create table Users
(
  userid int identity(1,1) primary key,
  roleid int references Roles(roleid),
  employeeid int references Employees(employeeid),
  username nvarchar(40) not null,
  password nvarchar(50) not null,
  registrationdate datetime default getDate()
);
go

Insert into Users (roleid, employeeid, username, password)
values (1, 1, 'Ov3rst', '123');

Create table Category
(
  categoryid int identity(1,1) primary key,
  descriptions nvarchar(100) not null,
  registrationdate datetime default getDate()
);
go

Create table Products
(
  productid int identity(1,1) primary key,
  categoryid int references Category(categoryid),
  code as ('PCT' + Right ('0000' + Cast(productid as varchar(10)), 4)) Persisted,
  productname varchar(50) not null,
  descriptions nvarchar(100) null,
  stock int not null default 0,
  purchaseprice decimal(10,2) default 0,
  saleprice decimal(10,2) default 0,
  registrationdate datetime default getDate()
);
go

Create table Supplier
(
  supplierid int identity(1,1) primary key,
  businessname nvarchar(150) not null,
  rnc int null,
  phone int not null,
  email varchar(100) null,
  registrationdate datetime default getDate()
);
go

Create table Shopping
(
  shoppingid int identity(1,1) primary key,
  userid int references Users(userid),
  supplierid int references Supplier(supplierid),
  invoicenumber  as ('CP' + Right ('0000' + Cast(shoppingid as varchar(10)), 4)) Persisted,
  totalamount decimal(10,2) not null,
  registrationdate datetime default getDate()
);
go

Create table PurchaseDetail
(
  purchasedetailid int identity(1,1) primary key,
  shoppingid int references Shopping(shoppingid),
  productid int references Products(productid),
  purchaseprice decimal(10,2) default 0,
  saleprice decimal(10,2) default 0,
  amount int not null,
  totalamount decimal(10,2),
);
go

Create table Sales
(
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

Create table SaleDetail
(
  saledetailid int identity(1,1) primary key,
  saleid int references Sales(saleid),
  productid int references Products(productid),
  saleprice decimal(10,2),
  amount int not null,
  totalamount decimal(10,2),
);
go

Create table Debts
(
  debtid int identity(1, 1) primary key,
  saledetailid int references SaleDetail(saledetailid),
  purchasedetailid int references PurchaseDetail(purchasedetailid),
  debttype bit not null,
  totalamount decimal(10, 2) not null,
  due decimal(10, 2) not null,
  registrationdate datetime default getDate()
);
go

Create table Payments
(
  paymentid int identity(1, 1) primary key,
  debtid int references Debts(debtid),
  paymentnum as ('PAY' + Right ('0000' + Cast(paymentid as varchar(10)), 4)) Persisted,
  amountpaid decimal(10, 2) not null,
  paymentdate datetime default getDate()
);
go

drop database SalesSystem

Insert into Roles
  (rolename)
values('Administrador'),
  ('Empleado');

select *
from Roles

select *
from Users

select *from Employees



/*select  
*from Users u
Inner join Employees e on e.employeeid = u.employeeid;*/

