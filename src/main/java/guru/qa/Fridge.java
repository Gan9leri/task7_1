package guru.qa;
//Холодильник
public class Fridge {
    public final boolean selfDefrost; //саморазморозка
    public final boolean freezer; //холодильная камера
    public int capacity;//вместимость
    String[] products;//продукты в холодильнике

    public Fridge(boolean selfDefrost, boolean freezer, int capacity) {
        this.selfDefrost = selfDefrost;
        this.freezer = freezer;
        this.capacity = capacity;
        this.products = new String[capacity];
    }
    //Вывести параметры холодильника
    @Override
    public String toString(){
        return "Fridge{" +
                "selfDefrost='" + selfDefrost + '\'' +
                ", freezer=" + freezer +
                ", capacity=" + capacity +
                '}';
    }
    //Вывести содержимое холодильника
    public void printProducts(){
        for (int i = 0; i < products.length; i++){
            System.out.println(products[i]);
        }
    }
    //Поиск продуктов в холодильнике
    public void searchProduct(String value){
        int found = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i].equals(value)){
                System.out.println("i =" + " " + i + " " + products[i]);
                found = 1;
                break;
            }
        }
        if (found == 0){
            System.out.println("Продукт не найден");
        }
    }
    //Добавление продуктов в холодильник
    public void putProduct(String value){
        for (int i = 0; i < products.length; i++){
            if (products[i] != null && i == capacity -1 ){
                System.out.println("Холодильник полон");
            }
            if (products[i] == null){
                products[i] = value;
                break;
            }
        }
    }
    //Удаление продуктов из холодильника
    public void removeProduct(String value){
        for (int i = 0; i < products.length; i++ ){
            if (products[i].equals(value)) {
                System.out.println("Удаление продукта "+ products[i]);
                products[i] = null;
            }
        }
    }
}
