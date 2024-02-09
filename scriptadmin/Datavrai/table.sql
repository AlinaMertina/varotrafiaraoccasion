create table Utilisateur (
    id bigint primary key,
    pseudo text,
    password text,
    role text
);

create table favorie(
    idfavorie bigint  primary key,
    idfcaracteristique bigint references caracteristique(idcaracteristique),
    idclient bigint references client(idclient)
);

create table typevehicule(
    idtypevehicule bigint primary key,
    nomtypevehicule varchar(50)
);
create table marque (
    idmarque bigint primary key,
    nommarque varchar(100)
);

create table model(
    idmodel bigint primary key,
    nommodel varchar(100),
    idfmarque bigint references marque(idmarque)
);

create table energie(
    idenergie bigint primary key,
    nomenergie varchar(100)
);

create table equipement(
    idequipement  bigint primary key,
    nomequipement varchar(100)
);
create table couleur(
    idcouleur bigint primary key,
    nomcouleur varchar(100)
);
create table localisation(
    idlocalisation bigint primary key,
    nomlocalisation varchar(100)
);
create table boitdevitesse(
    idboitedevitesse bigint primary key,
    nomboitdereception varchar(100)
);
create table genre(
    idgenre bigint primary key,
    nomgenre varchar(20)
);
create table client(
    idclient bigint primary key,
    nomclient varchar(100),
    prenomclient varchar(100),
    datenaissance date,
    email text,
    motdepasse varchar(20),
    idfgenre bigint references genre(idgenre),
    tel text,
    idflocalisation bigint references localisation(idlocalisation)
);
ALTER TABLE client
ADD CONSTRAINT emailunique UNIQUE (email);
ALTER TABLE client
ALTER COLUMN motdepasse TYPE text;

create table clientdateinscription(
    idclientdateinscription bigint primary key,
    idclient bigint references client(idclient),
    date timestamp
);

select * from clientdateinscription;

--- laste modification base
create table connecter(
    idconnecter bigint primary key,
    idclient bigint references client(idclient),
    datedeconnexion timestamp
);
insert into connecter values (1,1,null);
insert into connecter values (2,2,null);
insert into connecter values (3,3,null);
insert into connecter values (4,5,null);
insert into connecter values (5,6,null);



CREATE VIEW v_info_client_chat AS
SELECT client.idclient,nomclient,prenomclient,datenaissance,email,nomgenre,tel,nomlocalisation,datedeconnexion
FROM client join localisation on client.idflocalisation=localisation.idlocalisation
join genre on genre.idgenre=client.idfgenre join connecter on connecter.idclient=client.idclient;

select * from v_info_client_chat;