package mangment.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private int nombreChambres;
    private String emplacementVille;
    private int nombrePiscines;
    private int nombreTerrains;
    private String parking;
    private String  resto;
    private String coindecoffe ;
    private String activitéetanimation;
    private boolean active;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNombreChambres() {
		return nombreChambres;
	}
	public void setNombreChambres(int nombreChambres) {
		this.nombreChambres = nombreChambres;
	}
	public String getEmplacementVille() {
		return emplacementVille;
	}
	public void setEmplacementVille(String emplacementVille) {
		this.emplacementVille = emplacementVille;
	}
	public int getNombrePiscines() {
		return nombrePiscines;
	}
	public void setNombrePiscines(int nombrePiscines) {
		this.nombrePiscines = nombrePiscines;
	}
	public int getNombreTerrains() {
		return nombreTerrains;
	}
	public void setNombreTerrains(int nombreTerrains) {
		this.nombreTerrains = nombreTerrains;
	}
	
	public String getParking() {
		return parking;
	}
	public void setParking(String parking) {
		this.parking = parking;
	}
	public String getResto() {
		return resto;
	}
	public void setResto(String resto) {
		this.resto = resto;
	}
	public String getCoindecoffe() {
		return coindecoffe;
	}
	public void setCoindecoffe(String coindecoffe) {
		this.coindecoffe = coindecoffe;
	}
	public String getActivitéetanimation() {
		return activitéetanimation;
	}
	public void setActivitéetanimation(String activitéetanimation) {
		this.activitéetanimation = activitéetanimation;
	}
	public boolean isActive() {
		return active;
	}
	public void setIsActive(boolean active) {
		this.active = active;
	}
	
}
	