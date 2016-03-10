package cuisine;
import java.util.*;

public class Recettebuild {
	
	private final Map<Ingred, Integer> map;
	 
    public Recettebuild() {
         map = new HashMap<>();
    }

    public Recettebuild add(Ingred ingredient, int nombre) { // Ingredient �tant par exemple une interface commune � toutes les classes d'ingr�dients
    	Integer n = map.get(ingredient);
    	if ( n==null ) { // l'ingredient n'�tait pas encore dans la map
    	    map.put(ingredient, nombre); // on met l'ingredient dans la map et on lui associe le nombre
    	}
    	else { // l'ingr�dient �tait d�j� dans la map avec le nombre n
    	   n = n + nombre; // on augment le nombre d�j� ajout� avec le nouveau nombre 
    	    map.put(ingredient, nombre); // on associe � l'ingr�dient le nouveau nombre   
    	}
         return this;
    }

    public Recette create() {
         return new Recette(map);
    }

}
