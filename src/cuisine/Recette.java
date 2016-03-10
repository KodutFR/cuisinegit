package cuisine;
import java.util.*;
public class Recette {
	
	private Map<Ingred, Integer> ingredients;
	 
    Recette(Map<Ingred, Integer> ingredients) {
        this.ingredients=ingredients;
    }
    
    public List<Ingred> getListeDesIngredients() {
        return new ArrayList<>(ingredients.keySet());
    }

    public int getNombreDe(Ingred ingred) {
        return ingredients.getOrDefault(ingred, 0);
   	}

	
}
