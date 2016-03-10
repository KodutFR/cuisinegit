package cuisine;

public class Congele extends gele {
	

	public Congele() {
		nomobj = "inconnu";
		unite = "unités";
		qte = 0;
		prix = 0;
		this.setPlace();
	}
	
	public Congele (String nom, int qtee, String unit, double pri){
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
