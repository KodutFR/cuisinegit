package cuisine;

abstract class Ingred extends Objet {
	
	double place;
	String unite;
	int temperatureIngred;
	

	
	public String toString (){
		return "il y a " + this.qte + " " + this.unite + " de "+ this.nomobj + "\nCela prend " + place + " de place.";
	}

}

