CREATE VIEW v_model_marque AS
SELECT idmodel, idmarque, nommarque,nommodel
FROM model join marque on model.idfmarque=marque.idmarque;

CREATE VIEW v_liste_equipement_voiture AS
SELECT idfcaracteristique,nomequipement,idequipement
FROM detaillecaequipement join equipement on detaillecaequipement.idfequipement=equipement.idequipement;

drop view v_liste_annonce;
select idequipement,idphotocaracteristique from v_liste_annonce;

System.out.println("idequipement :"+liste.get(i).getIdequipement() + liste.get(i).getNomequipement());

drop view v_liste_annonce;

CREATE VIEW v_liste_annonce AS
SELECT consomation,client.idclient,idphotocaracteristique,idcaracteristique,commission,volumeducoffre,hauteur,largeur,longueur,nbrplace
,nbrporte,prixdevente,capacite,annemodel,anneedefabrication,kilometrage,autonomie,
nomlocalisation,localisation.idlocalisation,nometat,etat.idetat,
nomboitdereception,boitdevitesse.idboitedevitesse,nommarque,marque.idmarque,nommodel,model.idmodel,
nomenergie,energie.idenergie,nomtypevehicule,typevehicule.idtypevehicule,nomcouleur,couleur.idcouleur,
nomclient,prenomclient,tel,email,v_liste_equipement_voiture.idequipement,nomequipement,nomimage
FROM caracteristique    join etat on caracteristique.idfetat=etat.idetat 
                        join client on  caracteristique.idclient=client.idclient
                        join boitdevitesse on caracteristique.idfboitedevitesse=boitdevitesse.idboitedevitesse
                        join marque on caracteristique.idfmarque= marque.idmarque
                        join model on caracteristique.idfmodel=model.idmodel
                        join energie on caracteristique.idfenergie=energie.idenergie
                        join typevehicule on caracteristique.idftypevehicule=typevehicule.idtypevehicule
                        join couleur on caracteristique.coleur=couleur.idcouleur
                        join localisation on caracteristique.idlocalisation=localisation.idlocalisation
                        left join v_liste_equipement_voiture on caracteristique.idcaracteristique=v_liste_equipement_voiture.idfcaracteristique
                        left join photocaracteristique on caracteristique.idcaracteristique=photocaracteristique.idfcaracteristique;

select localisation.idlocalisation,idequipement,nomequipement,idphotocaracteristique,nomimage from v_liste_annonce;

select nomequipement from v_liste_annonce order by idcaracteristique,idequipement
drop view v_view_annonce;
drop view v_view_annonce;

CREATE VIEW v_view_annonce AS
SELECT nommodel, nommarque, annemodel,prixdevente,nomimage,idclient,idcaracteristique,idetat,nometat
FROM caracteristique join model on caracteristique.idfmodel=model.idmodel 
join marque on caracteristique.idfmarque=marque.idmarque
join etat on etat.idetat=caracteristique.idfetat
join photocaracteristique on caracteristique.idcaracteristique=photocaracteristique.idfcaracteristique;

select * from v_view_annonce;
select * from v_liste_equipement_voiture;

select idphotocaracteristique,idequipement,nomequipement,nomimage from v_liste_annonce;


CREATE VIEW v_liste_annonce3 AS
SELECT idcaracteristique,commission,volumeducoffre,hauteur,largeur,longueur,nbrplace
,nbrporte,prixdevente,capacite,annemodel,anneedefabrication,kilometrage,autonomie,
nomlocalisation,localisation.idlocalisation,nometat,etat.idetat,
nomboitdereception,boitdevitesse.idboitedevitesse,nommarque,marque.idmarque,nommodel,model.idmodel,
nomenergie,energie.idenergie,nomtypevehicule,typevehicule.idtypevehicule,nomcouleur,couleur.idcouleur,
nomclient,prenomclient,tel,email,v_liste_equipement_voiture.idequipement,nomequipement,nomimage
FROM caracteristique    join etat on caracteristique.idfetat=etat.idetat 
                        join client on  caracteristique.idclient=client.idclient
                        join boitdevitesse on caracteristique.idfboitedevitesse=boitdevitesse.idboitedevitesse
                        join marque on caracteristique.idfmarque= marque.idmarque
                        join model on caracteristique.idfmodel=model.idmodel
                        join energie on caracteristique.idfenergie=energie.idenergie
                        join typevehicule on caracteristique.idftypevehicule=typevehicule.idtypevehicule
                        join couleur on caracteristique.coleur=couleur.idcouleur
                        join localisation on caracteristique.idlocalisation=localisation.idlocalisation
                        left join v_liste_equipement_voiture on caracteristique.idcaracteristique=v_liste_equipement_voiture.idfcaracteristique
                        left join photocaracteristique on caracteristique.idcaracteristique=photocaracteristique.idfcaracteristique;

update caracteristique set idetat=2 ;