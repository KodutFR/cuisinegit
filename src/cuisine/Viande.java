package cuisine;

public class Viande extends Froid {
	

	
	public Viande() {
		nomobj = "inconnu";
		qte = 0;
		unite = "unités";
		prix = 0;
		this.setPlace();
	}
	
	public Viande (String nom, int qtee, String unit, double pri){
		nomobj = nom;
		qte = qtee;
		unite = unit;
		prix = pri;
		this.setPlace();
	}

	
	public void setPlace(){
		place = qte * 100;
	}
}
