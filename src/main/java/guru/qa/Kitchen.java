package guru.qa;
import java.util.HashMap;
import java.util.Map;
//Кухня
public class Kitchen {
    public Map<Integer, String> dishPasports;
    public Kitchen(){
        dishPasports = new HashMap<Integer, String>();
    }
    //Просмотр технологических карт
    public void printPasports(){
        for (Map.Entry<Integer, String> dishPasports : dishPasports.entrySet()){
            System.out.println(dishPasports.getKey() + dishPasports.getValue());
        }
    }
    //Добавление технологической карты
    public void addPasport(int i, String value){
        dishPasports.put(i,value);
    }
    //Поиск технологической карты
    public void searchPassport(int value){
        for (Map.Entry<Integer, String> dishPasports : dishPasports.entrySet()){
            if (dishPasports.getKey() == value){
                System.out.println(dishPasports.getKey() + dishPasports.getValue());
                break;
            }
        }
    }
    //Удаление технологической карты
    public void removePassport(int value){
        for (Map.Entry<Integer, String> items : dishPasports.entrySet()){
            if (items.getKey() == value){
                dishPasports.remove(value);
                break;
            }
        }
    }
}
