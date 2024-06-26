package guru.qa;

public class Main {
    public static void main(String[] args) {
       System.out.println("Класс, использующий массив");
       Fridge haier = new Fridge(true, true, 5);
       System.out.println(haier);
       System.out.println("Добавление элементов в массив");
       haier.putProduct("apple");
       haier.putProduct("melon");
       haier.putProduct("pie");
       haier.putProduct("cake");
       haier.putProduct("watermelon");
       haier.printProducts();
       System.out.println("Превышение вместимости массива");
       haier.putProduct("tomato");
       System.out.println("Поиск элемента в массиве");
       haier.searchProduct("apple");
       haier.searchProduct("tomato");
       System.out.println("Удаление элемента из массива");
       haier.removeProduct("pie");
       haier.printProducts();

       System.out.println("\n");
       System.out.println("Класс, использущий коллекцию Список");
       Cafe donut = new Cafe(true);
       System.out.println("Добавление элементов в коллекцию");
       donut.putMenu("tea");
       donut.putMenu( "coffee");
       donut.putMenu("beer");
       donut.putMenu("snacks");
       donut.putMenu("burger");
       donut.printMenu();
       System.out.println("Поиск элемента в коллекции");
       donut.searchMenu("beer");
       System.out.println("Удаление элемента из коллекции");
       donut.removeMenu("burger");
       donut.printMenu();

       System.out.println("\n");
       System.out.println("Класс, использущий коллекцию Set");
       Soup kharcho = new Soup();
       System.out.println("Добавление элемента в коллекцию");
       kharcho.addRecipe("chicken");
       kharcho.addRecipe("garlic");
       kharcho.addRecipe("onion");
       kharcho.addRecipe("tomato");
       kharcho.addRecipe("salt");
       kharcho.printRecipe();
       System.out.println("Попытка пересолить");
       kharcho.addRecipe("salt");
       kharcho.printRecipe();
       System.out.println("Поиск элемента в коллекции");
       kharcho.searchRecipe("garlic");
       System.out.println("Удаление элемента из коллекции");
       kharcho.removeRecipe("tomato");
       kharcho.printRecipe();

       System.out.println("\n");
       System.out.println("Класс, использущий коллекцию Map");
       Kitchen kitchen = new Kitchen();
       System.out.println("Добавление элемента в коллекцию");
       kitchen.addPasport(1, " kharcho");
       kitchen.addPasport(2, " bolognese pasta");
       kitchen.addPasport(3, " cake");
       kitchen.addPasport(4, " cappuccino coffee");
       kitchen.addPasport(5, " schnitzel");
       kitchen.printPasports();
       System.out.println("Поиск элемента в коллекции");
       kitchen.searchPassport(2);
       System.out.println("Удаление элемента из коллекции");
       kitchen.removePassport(5);
       kitchen.printPasports();

       System.out.println("\n");
       System.out.println("Класс, использущий коллекцию Deque");
       ServingTable table = new ServingTable();
       System.out.println("Добавление элемента в коллекцию");
       table.putOrder("Заказ для стола 1");
       table.putOrder("Заказ для стола 2");
       table.putOrder("Заказ для стола 3");
       table.putOrder("Заказ для стола 4");
       table.putOrder("Заказ для стола 5");
       table.printOrder();
       System.out.println("Поиск элемента в коллекции");
       table.searchOrder("Заказ для стола 3");
       System.out.println("Получение первого элемента из очереди");
       table.getOrder();
       System.out.println("Удаление элемента из коллекции");
       table.removeOrder("Заказ для стола 3");
       table.printOrder();
    }
}
