package cuisine;

abstract class Froid extends Ingred {
	
	int temperatureIngred = 5;
	
	public String toString (){
		return super.toString() + "\nLa temp�rature de conservation est de " + this.temperatureIngred + " degre";
	}
}
