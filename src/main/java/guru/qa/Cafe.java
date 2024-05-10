package guru.qa;
import java.util.ArrayList;
import java.util.List;
//Кафе
public class Cafe {
    public boolean alco;
    public List<String> menu;

    public Cafe (boolean alco) {
        this.alco = alco;
        this.menu = new ArrayList<>();
    }
    //Просмотр содержимого меню
    public void printMenu(){
        System.out.println("Количество позиций в меню: " + menu.size());
        int i = 0;
        while (i < menu.size()) {
            System.out.println(menu.get(i));
            i++;
        }
    }
    //Поиск позиции в меню
    public void searchMenu(String value){
        int i = 0;
        while (i < menu.size()){
            if(menu.get(i).equals(value)){
                System.out.println(i + " " + menu.get(i));
                break;
            }
            i++;
        }
    }
    //Добавление позиций в меню
    public void putMenu(String value){
        menu.add(value);
    }
    //Удаление позиции из меню
    public void removeMenu(String value){
        int i = 0;
        while (i < menu.size() ) {
            if (menu.get(i).equals(value)){
                System.out.println("Удаление " + menu.get(i));
                menu.remove(i);
                break;
            }
            i++;
        }
    }
}
