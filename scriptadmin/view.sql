CREATE VIEW v_model_marque AS
SELECT idmodel, idmarque, nommarque,nommodel
FROM model join marque on model.idfmarque=marque.idmarque;