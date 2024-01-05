create database backvarotrafiara;
\c backvarotrafiara;

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

create table etat(
    idetat bigint primary key,
    nometat varchar(50)
);

create table caracteristique(
    idcaracteristique bigint primary key,
    idfetat bigint references etat(idetat),
    idclient bigint references client(idclient),
    idfboitedevitesse bigint references boitdevitesse(idboitedevitesse),
    idfmarque bigint references marque(idmarque),
    idfmodel bigint references model(idmodel),
    idfenergie bigint references energie(idenergie),
    idftypevehicule bigint references typevehicule(idtypevehicule),
    idlocalisation bigint references localisation(idlocalisation),
    autonomie double precision,
    kilometrage double precision,
    anneedefabrication date,
    annemodel date,
    capacite double precision,
    consomation double precision,
    prixdevente double precision,
    coleur bigint references couleur(idcouleur),
    nbrporte int,
    nbrplace int,
    longueur double precision,
    largeur double precision,
    hauteur double precision,
    volumeducoffre double precision,
    commission double precision,
);

create table detaillecaequipement(
    iddetaillecaequipement bigint primary key,
    idfcaracteristique bigint references caracteristique(idcaracteristique),
    idfequipement bigint references equipement(idequipement)
);

create table photocaracteristique(
    idphotocaracteristique bigint primary key,
    idfcaracteristique bigint references caracteristique(idcaracteristique),
    nomimage text
);
