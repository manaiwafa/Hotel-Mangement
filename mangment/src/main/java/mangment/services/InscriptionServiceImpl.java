package mangment.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mangment.Repository.HotelRepository;
import mangment.Repository.UtilisateurRepository;
import mangment.entities.Hotel;
import mangment.entities.Utilisateur;

@Service
public class InscriptionServiceImpl implements InscriptionService {
	
    @Autowired
    private UtilisateurRepository utilisateurRepository;
    @Autowired
    public HotelRepository hotelRepository;

	@Override
	public Utilisateur inscrire(Utilisateur utilisateur, Hotel hotel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Utilisateur> findByEmailAndMotdepasse(String email, String motdepasse) {
		Optional<Utilisateur> utilisateur = utilisateurRepository.findUtilisateurByEmailAndMotDePasse(email, motdepasse);
		// TODO Auto-generated method stub
		return utilisateur;
	}


	
	

    
}
