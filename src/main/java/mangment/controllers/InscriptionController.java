package mangment.controllers;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mangment.Repository.HotelRepository;
import mangment.Repository.UtilisateurRepository;
import mangment.entities.Hotel;
import mangment.entities.Utilisateur;
import mangment.services.InscriptionService;
import model.AutentificationRequest;
import model.InscriptionRequest;

//@CrossOrigin(origins = "http://localhost:51756")
@RestController
@RequestMapping("/utilisateurs")
public class InscriptionController {
    @Autowired
    private HotelRepository hotelRepository;

    @Autowired
    private UtilisateurRepository utilisateurRepository;
    
    @Autowired
    private InscriptionService inscriptionService;
  
    @PostMapping("/inscription")
    public InscriptionRequest submitInscriptionForm(@RequestBody InscriptionRequest inscriptionDTO) {
    	Hotel hotel = hotelRepository.save(inscriptionDTO.getHotel());
    	Utilisateur utilisateur = inscriptionDTO.getUtilisateur();
    	utilisateur.setHotel(hotel);
		Utilisateur user= utilisateurRepository.save(utilisateur);
	    return inscriptionDTO;
    }
   
    @PostMapping("/login")
   public ResponseEntity<Utilisateur> connecterUtilisateur(@RequestBody AutentificationRequest autentificationRequest) {
        String email = autentificationRequest.email();
        String motDePasse = autentificationRequest.password();
      

        Utilisateur utilisateur = inscriptionService.findByEmailAndMotdepasse(email, motDePasse)
        		.orElseThrow(() -> new RuntimeException("veuillez verifier vos cordonner"));

       	return new ResponseEntity<>(utilisateur, HttpStatus.OK);
    }


}
    


