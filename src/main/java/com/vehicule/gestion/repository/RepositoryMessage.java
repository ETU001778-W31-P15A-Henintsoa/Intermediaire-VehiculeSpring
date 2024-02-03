package com.vehicule.gestion.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.vehicule.gestion.modele.Message;
import com.vehicule.gestion.modele.Utilisateur;

@Repository
public interface RepositoryMessage extends MongoRepository<Message, String> {
    // @Query(value = "SELECT a FROM message WHERE (message.idutilidateurenvoyeur = :idutilisateur and message.idutilidateurenvoyeur= :idutilisateur2) ||  (message.idutilidateurenvoyeur = :idutilisateur2 and message.idutilidateurenvoyeur= :idutilisateur) order by datemessage")
    // List<Message> getMessage(@Param("idutilisateur") Utilisateur idUtilisateur,
    //         @Param("idutilisateur2") Utilisateur idutilisateur2);

}
