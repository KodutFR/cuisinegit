package cuisine;

public class Rangement extends Objet {
	
	int capacite;
	int temperatureRangement;
	
	public Rangement(){
		nomobj = "inconnu";
		qte = 0;
		prix = 0;
		capacite = 0;
		temperatureRangement = 0;
	}
	
	public Rangement(String nom, int capacit, int temperatur, int qtee, double pri){
		nomobj= nom;
		qte = qtee;
		prix = pri;
		capacite = capacit;
		temperatureRangement = temperatur;
	}

	public String toString (){
		return "Il y a " + this.qte + " " + this.nomobj + "\nCela représente " + this.capacite*this.qte + " de place.";
	}
}
