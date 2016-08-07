create schema DEMO1;

CREATE TABLE DEMO1.CLIENTE (

	COD_CLI  integer NOT NULL primary key,
	DNI_CLI  varchar(8) not null,
	NOM_CLI varchar (20),
	APEPAT_CLI varchar (20),
	APEMAT_CLI varchar (20),
	EDAD_CLI integer ,
	DIRECC_CLI varchar (20)
);

insert into DEMO1.CLIENTE  values	(1,'72897327','alexis','zam','san','21','la victoria');
insert into DEMO1.CLIENTE  values	(2,'12345678','astrid','Huerta','Zambrano','2','Comas');





create table DEMO1.VENTA  (
		COD_VEN integer  not null Generated always as identity (start with 1 increment by 1),
		NUM_FACT varchar(20),
		FECH_VEN TIMESTAMP,
		COD_CLI integer not null
);

alter table DEMO1.VENTA add constraint PK_DEMO_VENTA  primary key(COD_VEN);
alter table DEMO1.VENTA add constraint FK_DEMO_VENTA_CLIENTE FOREIGN KEY (COD_CLI) REFERENCES DEMO1.CLIENTE (COD_CLI);

INSERT INTO DEMO1.VENTA (NUM_FACT ,FECH_VEN,COD_CLI) VALUES ('000002','2002-10-20 12:00:00',2);




//--------- reiniciar autoincrmental------------------------------------------------------------


ALTER TABLE DEMO1.VENTA ALTER COLUMN COD_VEN RESTART 