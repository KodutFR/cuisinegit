package cuisine;
import java.util.ArrayList;
import java.util.Scanner;
public class Cuisine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		double argent = 200;
		Legume Opoivron = new Legume("poivron", 0, " ", 0.7);
		Legume Ocarotte = new Legume("carotte", 0, " ", 0.5);
		Legume Otomate = new Legume("tomate", 0, " ", 0.5);
		Legume Opomme = new Legume("pomme", 8, " ", 0.5);
		Legume Opeche = new Legume("peche", 0, " ", 0.5);
		
		Viande Oboeuf = new Viande("boeuf", 5, "portions", 4);
		Viande Opoulet = new Viande("poulet", 0, "portions", 2.5);
		Viande Opoisson = new Viande("poisson", 2, "portions", 3);
		Viande Omozza = new Viande("mozza", 0, "portions", 3);
		Viande Ochantilly = new Viande("chantilly", 1, "portions", 1);
		
		Fecul Oriz = new Fecul("riz", 0, "grammes", 0.003);
		Fecul Opates = new Fecul("pates", 0, "grammes", 0.004);
		Fecul Ofarine = new Fecul("farine", 200, "grammes", 0.001);
		Fecul Ochocolat = new Fecul("chocolat", 50, "grammes", 0.02);
		Fecul Osucre = new Fecul("sucre", 0, "grammes", 0.005);
		Fecul Opdt = new Fecul("pomme de terre", 0, "grammes", 0.5);
		
		Epice Opoivre = new Epice ("poivre", 10, "grammes", 0.03);
		Epice Osel = new Epice ("sel", 0, "grammes", 0.007);
		Epice Ocanelle = new Epice ("canelle", 0, "grammes", 0.1);
		
		Liquide Ohuile = new Liquide ("huile", 10, "cl", 0.01);
		Liquide Ovinrouge = new Liquide ("vinrouge", 0, "cl", 0.1);
		Liquide Ovinlanc = new Liquide ("vinlanc", 0, "cl", 0.05);
		Liquide Olait = new Liquide ("lait", 0, "cl", 0.01);
		Liquide Obalsamique = new Liquide ("balsamique", 0, "cl", 0.05);
		
		Congele Ovanille = new Congele ("crème vanille", 20, "cl", 0.05);
		
		Rangement Placard = new Rangement("placard", 1000, 20, 1, 80);
		Rangement Frigo = new Rangement("frigo", 2000, 5, 1, 200);
		Rangement Congelateur = new Rangement("congélateur", 400, -18, 0, 100);
		
		Ingred[] ingredTab = {Opoivron, Ocarotte, Otomate, Opomme, Opeche,
				Oboeuf, Opoulet, Opoisson, Omozza, Ochantilly, 
				Oriz, Opates, Ofarine, Ochocolat, Osucre, Opdt, 
				Opoivre, Osel, Ocanelle, 
				Ohuile, Ovinrouge, Ovinlanc, Olait, Obalsamique, 
				Ovanille};
		
		Froid[] froidTab = {Opoivron, Ocarotte, Otomate, Opomme, Opeche,
				Oboeuf, Opoulet, Opoisson, Omozza, Ochantilly};
		
		Tempere[] tempereTab = {Oriz, Opates, Ofarine, Ochocolat, Osucre, Opdt, 
				Opoivre, Osel, Ocanelle, 
				Ohuile, Ovinrouge, Ovinlanc, Olait, Obalsamique};
		
		gele[] geleTab = {Ovanille};

		double stockTempere=0;
		double stockFroid=0;
		double stockGele=0;
		
		char reponse1 = ' ';

		
		if (argent > Opoivron.prix * 50)
		argent -= Opoivron.acheter(50);
		else 
			System.out.println("argent insuffisant");

		
		System.out.println("Que voulez-vous faire ?");
		System.out.println("1 - Consulter les stocks / rangements / argent");
		System.out.println("2 - Acheter");
		System.out.println("3 - Jeter");
		System.out.println("4 - Cuisiner");
		reponse1 = sc.nextLine().charAt(0);
		
		if (reponse1 == '1')
		{
			System.out.println("En stock :");
			for(Ingred I : ingredTab){
				if (I.qte > 0)
				System.out.println(I.qte + " " + I.unite + " de " + I.nomobj);
			}
			
			for(Froid F : froidTab){
				stockFroid += F.place;
			}
			for(Tempere F : tempereTab){
				stockTempere += F.place;
			}
			for(gele F : geleTab){
				stockGele += F.place;
			}

			System.out.println("\nVous avez " + Placard.qte + " placard(s) (Occupé à " + (int)Math.floor(stockTempere*100 / (Placard.qte * Placard.capacite)) + "%)");
			System.out.println("Vous avez " + Frigo.qte + " frigo(s) (Occupé à " + (int)Math.floor(stockFroid*100 / (Frigo.qte * Frigo.capacite)) + "%)");
			if (Congelateur.qte != 0)
			System.out.println("Vous avez " + Congelateur.qte + " congélateur(s) (Occupé à " + (int)Math.floor(stockGele*100 / (Congelateur.qte * Congelateur.capacite)) + "%)");
			System.out.println("\nVous avez " + argent + "€");
		}

		if (reponse1 == '2')
		{
			System.out.println("Que voulez-vous acheter ?");
			System.out.println("1 - ");
			System.out.println("Que voulez-vous acheter ?");
			System.out.println("Que voulez-vous acheter ?");
			System.out.println("Que voulez-vous acheter ?");
			System.out.println("Que voulez-vous acheter ?");
		}
		
		//boeuf carottes : 1 boeuf 2 carottes, 40g de riz, 1g sel, 1g poivre
		//poulet au vin : 1 poulet, 1 vin blanc, 50g de pates, 20g de beurre
		//poisson frit purée: 1 poisson, 10g de farine, 50g de pomme de terre, 1g sel, 1g poivre, 10cl huile
		//pommes caramel : 1 pomme, 20g de sucre, 2g canelle
		//gauffres robot : 20g de sucre, 50g de farine, 20cl de lait, 5g de beurre
		//tomate mozza : 2 tomates, 1 mozza, 5cl de vinaigre balsamique
		//peche melba : 10cl de creme glacée vanille, 1 peche, 1 chantilly
		//dame blanche : 10cl de creme glacée vanille, 20g de chocolat, 1 chantilly
		//fajitas : 1 poivron, 1 poulet, 1 tomate
		
		//grand festin victorieux : 5 boeufs, 5 carottes, 300g de riz, 300g de pates, 10 tomates, 1 vin blanc, 
		//2 vin rouge, 4 pommes, 4 peches, 10g de sel, 10g de poivre, 100cl de vanille
	}


}
