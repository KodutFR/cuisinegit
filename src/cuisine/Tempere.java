package cuisine;

abstract class Tempere extends Ingred {
	
	int temperatureIngred = 20;

	public String toString (){
		return super.toString() + "\nLa temp�rature de conservation est de " + this.temperatureIngred + " degre";
	}
}



