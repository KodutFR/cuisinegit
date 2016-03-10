package cuisine;
import java.util.*;

public class Recettebuild {
	
	private final Map<Ingred, Integer> map;
	 
    public Recettebuild() {
         map = new HashMap<>();
    }

    public Recettebuild add(Ingred ingredient, int nombre) { // Ingredient étant par exemple une interface commune à toutes les classes d'ingrédients
    	Integer n = map.get(ingredient);
    	if ( n==null ) { // l'ingredient n'était pas encore dans la map
    	    map.put(ingredient, nombre); // on met l'ingredient dans la map et on lui associe le nombre
    	}
    	else { // l'ingrédient était déjà dans la map avec le nombre n
    	   n = n + nombre; // on augment le nombre déjà ajouté avec le nouveau nombre 
    	    map.put(ingredient, nombre); // on associe à l'ingrédient le nouveau nombre   
    	}
         return this;
    }

    public Recette create() {
         return new Recette(map);
    }

}
