package cuisine;

abstract class gele extends Ingred{

	int temperatureIngred = -18;
	
	public String toString (){
		return super.toString() + "\nLa temp�rature de conservation est de " + this.temperatureIngred + " degre";
	}
}
