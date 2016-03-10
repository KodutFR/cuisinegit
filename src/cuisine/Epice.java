package cuisine;

public class Epice extends Tempere {
	
	
	public Epice() {
		nomobj = "inconnu";
		qte = 0;
		prix = 0;
		unite = "unités";
		this.setPlace();
	}
	
	public Epice (String nom, int qtee, String unit, double pri){
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

