package guru.qa;
import java.util.ArrayDeque;
import java.util.Deque;
//Раздаточный стол
public class ServingTable {
    Deque<String> order;
    public ServingTable(){
        order = new ArrayDeque<>();
    }
    //Просмотр стола
    public void printOrder(){
        for (String item : order){
            System.out.println(item);
        }
    }
    //Поставить заказ на стол
    public void putOrder(String value){
        order.add(value);
    }
    //Найти заказ на столе
    public void searchOrder(String value){
        for (String item : order){
            if (item.equals(value)){
                System.out.println(item);
                break;
            }
        }
    }
    //Выдать заказ
    public void getOrder(){
        System.out.println(order.getFirst());
    }
    //Убрать заказ
    public void removeOrder(String value){
        for(String item : order){
            if (item.equals(value)){
                order.remove(item);
                break;
            }
        }
    }
}
