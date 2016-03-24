package cuisine;

public class Congele extends gele {
	
	int coef = 1;

	public Congele() {
		nomobj = "inconnu";
		unite = "unités";
		qte = 0;
		coef = 1;
		prix = 0;
		this.setPlace();
	}
	
	public Congele (String nom, int qtee, String unit, double pri){
		nomobj = nom;
		qte = qtee;
		unite = unit;
		prix = pri;
		coef = 1;
		this.setPlace();
	}

	
	public void setPlace(){
		place = qte;
	}
	

}
