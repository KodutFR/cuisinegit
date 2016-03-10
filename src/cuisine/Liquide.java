package cuisine;

public class Liquide extends Tempere {

	public Liquide() {
		nomobj = "inconnu";
		qte = 0;
		prix = 0;
		unite = "unités";
		this.setPlace();
	}
	
	public Liquide (String nom, int qtee, String unit, double pri){
		nomobj = nom;
		qte = qtee;
		unite = unit;
		prix = pri;
		this.setPlace();
	}


	public void setPlace(){
		place = qte;
	}
}
