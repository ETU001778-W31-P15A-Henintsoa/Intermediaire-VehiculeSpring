insert into marque(idmarque,nomMarque) values
(default,'Hyundai');

insert into categorie values
(default,'sport');

insert into modele values 
(default,'MAR1','CAT1','Hyundai Veloster N');
insert into TypeCarburant values
(default,'essence');

insert into sousModele(idModele,vitesseMax,Consommation,idTypeCarburant,automatique,puissanceMoteur,batterie,compte,nomsous) values
('MOD1',400,100,'TYCAR1',false,250,200,default,'phase 2');

insert into Utilisateur(nom,prenom,mail,motdepasse,adresse,sexe,dateNaissance) values('Santatra','Fifalina','santatra@gmail.com','12345','faratsiho',1,'2000-04-02');

insert into annonce(idUtilisateur,idSousModele,couleur,prix,prixMinimum,DateAnnonce,etat) values
('UTI1','SMOD1','grenat',2000000,1900000,'2024-02-25',3),
('UTI1','SMOD1','vert',3000000,2900000,'2024-02-25',3);

insert into annonce(idUtilisateur,idSousModele,couleur,prix,prixMinimum,DateAnnonce,etat) values
('UTI2','SMOD1','rouge',2000000,1900000,'2023-02-25',3);

insert into vente values (default,'2024-01-26','UTI1','ANN2','UTI2',2000000),
(default,'2023-12-26','UTI1','ANN2','UTI2',100000),
(default,'2023-08-05','UTI1','ANN8','UTI2',345000),
(default,'2023-09-12','UTI1','ANN8','UTI2',300000),
(default,'2023-10-12','UTI2','ANN8','UTI1',10000),
(default,'2024-01-03','UTI2','ANN8','UTI1',345000);

insert into interet values(default,1,'2023-05-11');