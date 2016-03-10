package cuisine;

public class Fecul extends Tempere {
	
	
	public Fecul() {
		nomobj = "inconnu";
		qte = 0;
		prix = 0;
		unite = "unités";
		this.setPlace();
	}
	
	public Fecul (String nom, int qtee, String unit, double pri){
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

