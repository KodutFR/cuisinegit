package cuisine;

abstract class Objet {
	
	double prix;
	int qte;
	String nomobj;
	
	public void setPlace(){
	}
	
	public double acheter(int nbrachat){
		this.qte = qte + nbrachat;
		this.setPlace();
		return this.prix * nbrachat;
	}
	
	public double checkAcheter(int nbrachat){
		this.qte = qte + nbrachat;
		this.setPlace();
		return this.prix * nbrachat;
	}
	
	public void jeter(int nbrjet){
		this.qte = qte - nbrjet;
		this.setPlace();
	}

}
