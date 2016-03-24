package cuisine;

public class Legume extends Froid {

	
	public Legume(){
		nomobj = "Inconnu";
		unite = "unités";
		qte = 0;
		prix = 0;
		coef = 10;
		this.setPlace();
	}
	
	public Legume (String nom, int qtee, String unit, double pri){
		nomobj = nom;
		qte = qtee;
		unite = unit;
		prix = pri;
		coef = 10;
		this.setPlace();
	}
	
	
	public void setPlace(){
		place = qte * 10;
	}
}
