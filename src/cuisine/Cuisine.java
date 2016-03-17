package cuisine;
import java.util.ArrayList;
import java.util.Scanner;
public class Cuisine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		double argent = 201;
		Legume Opoivron = new Legume("poivron", 1, " ", 0.7);
		Legume Ocarotte = new Legume("carotte", 0, " ", 0.5);
		Legume Otomate = new Legume("tomate", 2, " ", 0.5);
		Legume Opomme = new Legume("pomme", 0, " ", 0.5);
		Legume Opeche = new Legume("peche", 0, " ", 0.5);
		
		Viande Oboeuf = new Viande("boeuf", 0, "portions", 4);
		Viande Opoulet = new Viande("poulet", 3, "portions", 2.5);
		Viande Opoisson = new Viande("poisson", 0, "portions", 3);
		Viande Omozza = new Viande("mozza", 0, "portions", 3);
		Viande Ochantilly = new Viande("chantilly", 0, "portions", 1);
		
		Fecul Oriz = new Fecul("riz", 0, "grammes", 0.003);
		Fecul Opates = new Fecul("pates", 0, "grammes", 0.004);
		Fecul Ofarine = new Fecul("farine", 0, "grammes", 0.001);
		Fecul Ochocolat = new Fecul("chocolat", 0, "grammes", 0.02);
		Fecul Osucre = new Fecul("sucre", 0, "grammes", 0.005);
		Fecul Opdt = new Fecul("pomme de terre", 0, "grammes", 0.5);
		
		Epice Opoivre = new Epice ("poivre", 0, "grammes", 0.03);
		Epice Osel = new Epice ("sel", 0, "grammes", 0.007);
		Epice Ocanelle = new Epice ("canelle", 0, "grammes", 0.1);
		
		Liquide Ohuile = new Liquide ("huile", 0, "cl", 0.01);
		Liquide Ovinrouge = new Liquide ("vinrouge", 0, "cl", 0.1);
		Liquide Ovinblanc = new Liquide ("vinblanc", 0, "cl", 0.05);
		Liquide Olait = new Liquide ("lait", 0, "cl", 0.01);
		Liquide Obalsamique = new Liquide ("balsamique", 0, "cl", 0.05);
		
		Congele Ovanille = new Congele ("crème vanille", 0, "cl", 0.05);
		
		Rangement Placard = new Rangement("placard", 1000, 20, 1, 80);
		Rangement Frigo = new Rangement("frigo", 2000, 5, 1, 200);
		Rangement Congelateur = new Rangement("congélateur", 400, -18, 0, 100);
		
		Ingred[] ingredTab = {Opoivron, Ocarotte, Otomate, Opomme, Opeche,
				Oboeuf, Opoulet, Opoisson, Omozza, Ochantilly, 
				Oriz, Opates, Ofarine, Ochocolat, Osucre, Opdt, 
				Opoivre, Osel, Ocanelle, 
				Ohuile, Ovinrouge, Ovinblanc, Olait, Obalsamique, 
				Ovanille};
		
		Froid[] froidTab = {Opoivron, Ocarotte, Otomate, Opomme, Opeche,
				Oboeuf, Opoulet, Opoisson, Omozza, Ochantilly};
		
		Tempere[] tempereTab = {Oriz, Opates, Ofarine, Ochocolat, Osucre, Opdt, 
				Opoivre, Osel, Ocanelle, 
				Ohuile, Ovinrouge, Ovinblanc, Olait, Obalsamique};
		
		gele[] geleTab = {Ovanille};
		
		Legume[] legumeTab = {Opoivron, Ocarotte, Otomate, Opomme, Opeche};
		Viande[] viandeTab = {Opoulet, Oboeuf, Opoisson};
		Fecul[] feculTab = {Oriz, Opates, Opdt};
		Epice[] epiceTab = {Osel, Opoivre, Ocanelle};
		Liquide[] liquideTab = {Ovinrouge, Ovinblanc, Obalsamique, Ohuile, Olait};
		Ingred[] autreTab = {Ovanille, Osucre, Ofarine, Omozza};
		Rangement[] rangementTab = {Placard, Frigo, Congelateur};

		double stockTempere=0;
		double stockFroid=0;
		double stockGele=0;
		
		char reponse1 = ' ';
		

	while (reponse1 == ' '){
		
		
		System.out.println("______________________________");
		System.out.println(" ");
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
			char reponseachat1 = ' ';
			System.out.println("Que voulez-vous acheter ?");
			System.out.println("1 - Fruits et légumes");
			System.out.println("2 - Viandes et poissons");
			System.out.println("3 - Féculents");
			System.out.println("4 - Assaisonnement et épices");
			System.out.println("5 - Liquides");
			System.out.println("6 - Autres ingrédients");
			System.out.println("7 - Rangements");
			reponseachat1 = sc.nextLine().charAt(0);
			
			String reponseachat2 = " ";
			int reponseachat2int = -1;
			String reponseQte = " ";
			int reponseQteInt = -1;
			
			
			if (reponseachat1 == '1'){
				System.out.println("1 - Poivron ");
				System.out.println("2 - Carotte");
				System.out.println("3 - Tomate");
				System.out.println("4 - Pomme");
				System.out.println("5 - Pêche");
				reponseachat2 = sc.nextLine();
				reponseachat2int = Integer.valueOf(reponseachat2) -1;  //conversion de ascii
				System.out.println("Combien de " + legumeTab[reponseachat2int].nomobj + " ?");
				reponseQte = sc.nextLine();
				reponseQteInt = Integer.valueOf(reponseQte);
				if (argent > legumeTab[reponseachat2int].prix * reponseQteInt){
					argent -= legumeTab[reponseachat2int].acheter(reponseQteInt);
					if (reponseQteInt == 1)
						System.out.println("Achat de " + reponseQteInt + " " + legumeTab[reponseachat2int].nomobj +".");
					if (reponseQteInt > 1)
						System.out.println("Achat de " + reponseQteInt + " " + legumeTab[reponseachat2int].nomobj +"s.");	
				}
					else 
						System.out.println("argent insuffisant");
			}
			
			if (reponseachat1 == '2'){
				System.out.println("1 - Poulet ");
				System.out.println("2 - Boeuf");
				System.out.println("3 - Poisson");
				reponseachat2 = sc.nextLine();
				reponseachat2int = Integer.valueOf(reponseachat2)-1;  //conversion de ascii
				System.out.println("Combien de portions ?");
				reponseQte = sc.nextLine();
				reponseQteInt = Integer.valueOf(reponseQte);
				if (argent > viandeTab[reponseachat2int].prix * reponseQteInt){
					argent -= viandeTab[reponseachat2int].acheter(reponseQteInt);
					if (reponseQteInt == 1)
						System.out.println("Achat de " + reponseQteInt + " portion de " + viandeTab[reponseachat2int].nomobj +".");
					if (reponseQteInt > 1)
						System.out.println("Achat de " + reponseQteInt + " portions de " + viandeTab[reponseachat2int].nomobj +".");	
				}
					else 
						System.out.println("argent insuffisant");
								
			}
			
			if (reponseachat1 == '3'){
				System.out.println("1 - Riz ");
				System.out.println("2 - Pâtes");
				System.out.println("3 - Pomme de terre");
				reponseachat2 = sc.nextLine();
				reponseachat2int = Integer.valueOf(reponseachat2)-1;  //conversion de ascii
				System.out.println("Combien de grammes ?");
				reponseQte = sc.nextLine();
				reponseQteInt = Integer.valueOf(reponseQte);
				if (argent > feculTab[reponseachat2int].prix * reponseQteInt){
					argent -= feculTab[reponseachat2int].acheter(reponseQteInt);
					if (reponseQteInt == 1)
						System.out.println("Achat de " + reponseQteInt + " gramme de " + feculTab[reponseachat2int].nomobj +".");
					if (reponseQteInt > 1)
						System.out.println("Achat de " + reponseQteInt + " grammes de " + feculTab[reponseachat2int].nomobj +".");	
				}
					else 
						System.out.println("argent insuffisant");
			}
			
			if (reponseachat1 == '4'){
				System.out.println("1 - Sel ");
				System.out.println("2 - Poivre");
				System.out.println("3 - Canelle");
				reponseachat2 = sc.nextLine();
				reponseachat2int = Integer.valueOf(reponseachat2)-1;  //conversion de ascii
				System.out.println("Combien de grammes ?");
				reponseQte = sc.nextLine();
				reponseQteInt = Integer.valueOf(reponseQte);
				if (argent > epiceTab[reponseachat2int].prix * reponseQteInt){
					argent -= epiceTab[reponseachat2int].acheter(reponseQteInt);
					if (reponseQteInt == 1)
						System.out.println("Achat de " + reponseQteInt + " gramme de " + epiceTab[reponseachat2int].nomobj +".");
					if (reponseQteInt > 1)
						System.out.println("Achat de " + reponseQteInt + " grammes de " + epiceTab[reponseachat2int].nomobj +".");	
				}
					else 
						System.out.println("argent insuffisant");
			}
			
			if (reponseachat1 == '5'){
				System.out.println("1 - Vin rouge ");
				System.out.println("2 - Vin blanc");
				System.out.println("3 - Vinaigre balsamique");
				System.out.println("4 - Huile");
				System.out.println("5 - Lait");
				reponseachat2 = sc.nextLine();
				reponseachat2int = Integer.valueOf(reponseachat2)-1;  //conversion de ascii
				System.out.println("Combien de cl ?");
				reponseQte = sc.nextLine();
				reponseQteInt = Integer.valueOf(reponseQte);
				if (argent > liquideTab[reponseachat2int].prix * reponseQteInt){
					argent -= liquideTab[reponseachat2int].acheter(reponseQteInt);
					System.out.println("Achat de " + reponseQteInt + "cl de " + liquideTab[reponseachat2int].nomobj +".");
				}
					else 
						System.out.println("argent insuffisant");
			}
			
			if (reponseachat1 == '6'){
				System.out.println("1 - Glace vanille "); //cl
				System.out.println("2 - Sucre"); //g
				System.out.println("3 - Farine"); //g
				System.out.println("4 - Mozzarella");//portion
				System.out.println("5 - Chantilly");//portion
				System.out.println("6 - Chocolat"); //g
				reponseachat2 = sc.nextLine();
				reponseachat2int = Integer.valueOf(reponseachat2)-1;  //conversion de ascii
				System.out.println("Combien de " + autreTab[reponseachat2int].unite + " de " + autreTab[reponseachat2int].nomobj +" ?");
				reponseQte = sc.nextLine();
				reponseQteInt = Integer.valueOf(reponseQte);
				if (argent > autreTab[reponseachat2int].prix * reponseQteInt){
					argent -= autreTab[reponseachat2int].acheter(reponseQteInt);
					System.out.println("Achat de " + reponseQteInt + " " + autreTab[reponseachat2int].unite + " de " + autreTab[reponseachat2int].nomobj +".");	
				}
					else 
						System.out.println("argent insuffisant");
			}
			
			if (reponseachat1 == '7'){
				System.out.println("1 - Placard ");
				System.out.println("2 - Frigo");
				System.out.println("3 - Congélateur");
				reponseachat2 = sc.nextLine();
				reponseachat2int = Integer.valueOf(reponseachat2)-1;  //conversion de ascii
				System.out.println("Combien de " + rangementTab[reponseachat2int].nomobj +" ?");
				reponseQte = sc.nextLine();
				reponseQteInt = Integer.valueOf(reponseQte);
				if (argent > rangementTab[reponseachat2int].prix * reponseQteInt){
					argent -= rangementTab[reponseachat2int].acheter(reponseQteInt);
					System.out.println("Achat de " + reponseQteInt + " " + rangementTab[reponseachat2int].nomobj +".");	
				}
					else 
						System.out.println("argent insuffisant");
			}
		} //fin de reponse1 = 2
		
		if (reponse1 == '3'){
			System.out.println("Que voulez-vous jeter ?");
			
			int i = 0;
			int j = 0;
			int k = 1;
			String reponsejet = " ";
			int reponsejetint = -1;
			String reponsejetqte = " ";
			int reponsejetqteint = -1;
			for(Ingred I : ingredTab){
				if (I.qte > 0)
					i++;				
			}
			Ingred[] ingredStockTab = new Ingred[i];
			for(Ingred F : ingredTab){
				if (F.qte > 0){
					ingredStockTab[j] = F;	
					j++;
				}
			}
			for(Ingred G : ingredStockTab){
				System.out.println(k + " - " + G.nomobj + " (" + G.qte + " " + G.unite + " en stock)");
				k++;
			}
			reponsejet = sc.nextLine();
			reponsejetint = Integer.valueOf(reponsejet)-1;
			System.out.println("Combien ?");
			reponsejetqte = sc.nextLine();
			reponsejetqteint = Integer.valueOf(reponsejetqte);
			if (reponsejetqteint < ingredStockTab[reponsejetint].qte)
				System.out.println("Vous ne pouvez pas jeter plus d'objets que vous n'en possédez.");
			else {
				ingredStockTab[reponsejetint].jeter(reponsejetqteint);
				System.out.println("Vous avez jeté " + reponsejetqteint + " " + ingredStockTab[reponsejetint].unite + " de " + ingredStockTab[reponsejetint].nomobj + ".");
			}
		}
		
		if (reponse1 == '4'){
			System.out.println("Que voulez-vous cuisiner ?");
			System.out.println("1 - Boeuf carottes ");
			System.out.println("2 - Poulet au vin");
			System.out.println("3 - Poisson frit purée");
			System.out.println("4 - Fajitas");
			System.out.println("5 - Tomates mozza");
			System.out.println("6 - Pêche melba ");
			System.out.println("7 - Dame blanche");
			System.out.println("8 - Gauffre robot");
			System.out.println("9 - Grand festin victorieux");
			String reponsecuis = " ";
			reponsecuis = sc.nextLine();
			String reponsecuisqte = " ";
			int reponsecuisqteint = -1;
			
			if (reponsecuis.equals("1")){
				System.out.println("Il faudra : 1 portion de boeuf, 2 carottes, 40g de riz, 1g de sel, 1g de poivre");
				System.out.println("Cela vous fera gagner ??€");
				System.out.println("Combien voulez-vous en préparer ?");
				reponsecuisqte = sc.nextLine();
				reponsecuisqteint = Integer.valueOf(reponsecuisqte);
				
			}
				
		}
		
		reponse1 = ' ';
	} //fin du while
		
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
