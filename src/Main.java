public class Main {
    public static int typeYear(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println(year + " явлется высокостным годом");

        else
            System.out.println(year + " явлется невысокостным годом");

        return 0;
    }

    private static void currentYear(int clientOS, int clientDeviceYear) {


        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        if (clientOS == 0)
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        else if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }

    }

    private static void deliveryTime(int deliveryDistance, int deliveryDays) {

        if (deliveryDistance > 20) {
            deliveryDays++;
            System.out.println(deliveryDays + " дня необходимо для доставки");
        } else if (deliveryDistance > 40) {
            deliveryDays++;
            System.out.println(deliveryDays + " дня необходимо для доставки");
        } else if (deliveryDistance > 60) {
            deliveryDays++;
            System.out.println(deliveryDays + " дня необходимо для доставки");
        }
    }

    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1.");

        typeYear(2024);

        // Задание 2
        System.out.println("Задание 2.");

        currentYear(0, 2016);

        // Задание 3
        System.out.println("Задание 3.");

        deliveryTime(45, 1);


    }


}



