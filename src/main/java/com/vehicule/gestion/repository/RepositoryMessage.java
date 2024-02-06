package com.vehicule.gestion.repository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.vehicule.gestion.modele.Message;
import com.vehicule.gestion.modele.Utilisateur;

@Repository
public interface RepositoryMessage extends MongoRepository<Message, String> {
    @Query("{$or:[" +
    "{$and:[{idUtilisateurEnvoyeur: :idUtilisateur}, {idUtilisateurDestinataire: :idUtilisateur2}]}, " +
    "{$and:[{idUtilisateurEnvoyeur: :idUtilisateur2}, {idUtilisateurDestinataire: :idUtilisateur}]}" +
    "]}," +
    "sort:{dateMessage:1}")
List<Message> getMessage(@Param("idUtilisateur") String idUtilisateur,
                      @Param("idUtilisateur2") String idUtilisateur2);
}
