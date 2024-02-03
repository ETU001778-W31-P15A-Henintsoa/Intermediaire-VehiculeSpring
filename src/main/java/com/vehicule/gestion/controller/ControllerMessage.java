package com.vehicule.gestion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.List;

import com.google.gson.Gson;
import com.vehicule.gestion.modele.ApiResponse;
import com.vehicule.gestion.modele.Message;
import com.vehicule.gestion.modele.Utilisateur;
import com.vehicule.gestion.service.ServiceMessage;
import com.vehicule.gestion.service.UtilisateurService;
import com.vehicule.gestion.tools.Role;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
// @RequestMapping("/api/people")
public class ControllerMessage {

    @Autowired
    private ServiceMessage servicemessage;
    @Autowired
    private UtilisateurService utilisateurService;
    private Gson gson = new Gson();
    private ApiResponse reponse;

    // Insertion Message
    // @PostMapping("message/{idreceveur}/{message}/{files}")
    // public ResponseEntity<String> save(@PathVariable("idreceveur") String receveur,
    //         @PathVariable("message") String message, @PathVariable("files") List<String> path) {
    //     try {
    //         String mailEnvoyeur = String.valueOf(SecurityContextHolder.getContext().getAuthentication().getName());

    //         Utilisateur envoyeur = utilisateurService.findByMail(mailEnvoyeur).get();
    //         Utilisateur recepteur = utilisateurService.findById(receveur).get();

    //         Message essaie = new Message();
    //         essaie.setIdUtilisateurEnvoyeur(envoyeur);
    //         essaie.setIdUtilisateurReceveur(recepteur);
    //         essaie.setDateMessage(LocalDateTime.now());
    //         essaie.setLiensImages(path);
    //         essaie.setMessage(message);

    //         servicemessage.save(essaie);

    //         List<Message> lesmessages = servicemessage.findAll();

    //         reponse = new ApiResponse("", lesmessages);

    //         return ResponseEntity.status(500).body(gson.toJson(reponse));

    //     } catch (Exception e) {
    //         e.printStackTrace();
    //         reponse = new ApiResponse(e.getMessage(), null);
    //         return ResponseEntity.status(500).body(gson.toJson(reponse));
    //     }
    //         }

    // @GetMapping("/greeting/{idj}")
    // public ResponseEntity<String> greeting(@PathVariable("idj") String receveur) {
    //     try {
    //         String mailEnvoyeur = String.valueOf(SecurityContextHolder.getContext().getAuthentication().getName());

    //         Utilisateur envoyeur = utilisateurService.findByMail(mailEnvoyeur).get();
    //         Utilisateur recepteur = utilisateurService.findById(receveur).get();

    //         List<Message> lesmessages = servicemessage.messages(envoyeur, recepteur);

    //         reponse = new ApiResponse("", lesmessages);

    //         return ResponseEntity.status(500).body(gson.toJson(reponse));

    //     } catch (Exception e) {
    //         e.printStackTrace();
    //         reponse = new ApiResponse(e.getMessage(), null);
    //         return ResponseEntity.status(500).body(gson.toJson(reponse));
    //     }
    // }

}