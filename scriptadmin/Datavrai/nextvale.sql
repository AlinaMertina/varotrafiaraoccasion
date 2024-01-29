SELECT nextval('historiqueetat_sequence') AS prochaine_valeur;

SELECT setval('configufavorie_sequence', (SELECT idconfiguration+1 from configufavorie ORDER by idconfiguration desc limit 1  ));

SELECT setval('boitdevitesse_sequence', (SELECT idboitedevitesse+1 from boitdevitesse ORDER by idboitedevitesse desc limit 1  ));

SELECT setval('caracteristique_sequence', (SELECT idcaracteristique+1 from caracteristique ORDER by idcaracteristique desc limit 1  ) );

SELECT setval('client_sequence',  (SELECT client+1 from client ORDER by idclient desc limit 1  ));
SELECT setval('clientdateinscription_sequence', (SELECT idclientdateinscription+1 from clientdateinscription ORDER by idclientdateinscription desc limit 1  ) );
SELECT setval('commission_sequence', (SELECT idcommission+1 from commission ORDER by idcommission desc limit 1  ));

SELECT nextval('configufavorie_sequence') AS prochaine_valeur;

SELECT setval('configufavorie_sequence', (SELECT idconfiguration+1 from configufavorie ORDER by idconfiguration desc limit 1  ));

SELECT setval('couleur_sequence', 90);
SELECT setval('detaillecaequipement_sequence', (SELECT iddetaillecaequipement+1 FROM detaillecaequipement ORDER BY iddetaillecaequipement DESC LIMIT 1));

-- Énergie
SELECT setval('energie_sequence', (SELECT idenergie+1 FROM energie ORDER BY idenergie DESC LIMIT 1));

-- Équipement
SELECT setval('equipement_sequence', (SELECT idequipement+1 FROM equipement ORDER BY idequipement DESC LIMIT 1));

-- État
SELECT setval('etat_sequence', (SELECT idetat+1 FROM etat ORDER BY idetat DESC LIMIT 1));

-- Favori
SELECT setval('favorie_sequence', (SELECT idfavorie+1 FROM favorie ORDER BY idfavorie DESC LIMIT 1));

-- Genre
SELECT setval('genre_sequence', (SELECT idgenre+1 FROM genre ORDER BY idgenre DESC LIMIT 1));

-- Localisation
SELECT setval('localisation_sequence', (SELECT idlocalisation+1 FROM localisation ORDER BY idlocalisation DESC LIMIT 1));

-- Marque
SELECT setval('marque_sequence', (SELECT idmarque+1 FROM marque ORDER BY idmarque DESC LIMIT 1));

-- Message Poste Gres
SELECT setval('messagepostegres_sequence', (SELECT idmessagepostegres+1 FROM messagepostegres ORDER BY idmessagepostegres DESC LIMIT 1));

-- Modèle
SELECT setval('model_sequence', (SELECT idmodel+1 FROM model ORDER BY idmodel DESC LIMIT 1));

-- Notification
SELECT setval('notification_sequence', (SELECT idnotification+1 FROM notification ORDER BY idnotification DESC LIMIT 1));

-- Photo Caractéristique
SELECT setval('photocaracteristique_sequence', (SELECT idphotocaracteristique+1 FROM photocaracteristique ORDER BY idphotocaracteristique DESC LIMIT 1));

-- Type de Véhicule
SELECT setval('typevehicule_sequence', (SELECT idtypevehicule+1 FROM typevehicule ORDER BY idtypevehicule DESC LIMIT 1));

-- Validation
SELECT setval('validation_sequence', (SELECT idvalidation+1 FROM validation ORDER BY idvalidation DESC LIMIT 1));



SELECT nextval('energie_sequence') AS prochaine_valeur;






CREATE SEQUENCE cmessagepostegres_sequence START WITH 5;

select * from Historiqueetat limit 1;