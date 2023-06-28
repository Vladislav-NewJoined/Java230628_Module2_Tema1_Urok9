import java.util.ArrayList;

public class Task2_1_9_1 {
    final static int pageSize = 5;

    public static void main(String[] args) {
        System.out.println("Задание : \n1.\tУ Вас есть список моделей смартфонов, 'iPhone 6 S', 'Lumia 950', " +
                "\n'Samsung Galaxy S 6', 'LG G 4', 'Nexus 7', Вам нужно вывести в консоль названия " +
                "\nдвух моделей пропустив при этом первый бренд при помощи метода skip и limit\n\nРешение: ");
        ArrayList<String> catalog = new ArrayList<>();
        catalog.add("iPhone 6 S");
        catalog.add("Lumia 950");
        catalog.add("Samsung Galaxy S 6");
        catalog.add("LG G 4");
        catalog.add("Nexus 7");

        System.out.println("Исходный массив: ");
        for (int i = 0; i < catalog.size(); i++) {
            System.out.println(catalog.get(i));
        }

        System.out.println(); // Это перенос строки
        System.out.println("Полученный массив: ");
        catalog.stream().skip(1).limit(2).forEach(a -> System.out.println(a));
    }

}