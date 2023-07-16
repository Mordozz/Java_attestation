import java.util.*;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addNotebook(new Notebook("HP", "Intel i5", 16, 1000, 2.3, 1000));
        shop.addNotebook(new Notebook("Lenovo", "Intel i7", 32, 2000, 2.5, 1500));
        shop.addNotebook(new Notebook("Apple", "Apple M1", 16, 500, 3.2, 2000));
        shop.addNotebook(new Notebook("MSI", "Intel i7", 64, 8000, 3.6, 3000));

        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> filterMap = new HashMap<>();

        int choice;
        do {
            System.out.println("Выберите критерии для фильтрации:");
            System.out.println("1 - ОЗУ");
            System.out.println("2 - Объем ЖД");
            System.out.println("3 - Частота процессора");
            System.out.println("0 - Завершить выбор и отфильтровать ноутбуки");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Введите минимальное значение ОЗУ:");
                    filterMap.put("ram", scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Введите минимальный объем ЖД:");
                    filterMap.put("hdd", scanner.nextInt());
                    break;
                case 3:
                    System.out.println("Введите минимальную частоту процессора:");
                    filterMap.put("cpuFrequency", scanner.nextInt());
                    break;
                case 0:
                    System.out.println("Начинаем фильтрацию...");
                    break;
                default:
                    System.out.println("Неизвестный критерий. Попробуйте еще раз.");
            }
        } while (choice != 0);

        List<Notebook> filteredNotebooks = shop.filterNotebooks(filterMap);

        for (Notebook notebook : filteredNotebooks) {
            System.out.println("Модель: " + notebook.getModel() + " Цена: " + notebook.getPrice());

        }
    }
}