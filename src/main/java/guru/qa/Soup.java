package guru.qa;
import java.util.HashSet;
//Суп
public class Soup {
    public HashSet<String> recipe;

    public Soup () {
        recipe = new HashSet<String>();
    }
    //Вывести рецепт
    public void printRecipe(){
        for(String recipe : recipe){
            System.out.println(recipe);
        }
    }
    //Добавление ингрдиентов в рецепт
    public void addRecipe(String value){
        recipe.add(value);
    }
    //Поиск ингридиентов в рецепте
    public void searchRecipe(String value){
        for (String recipe: recipe) {
            if (recipe.equals(value)) {
                System.out.println(recipe);
            }
        }
    }
    //Удаление ингридиентов из рецепта
    public void removeRecipe(String value){
        recipe.remove(value);
    }
}
