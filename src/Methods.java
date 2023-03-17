import java.time.LocalDate;

public class Methods {
    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " не високосный год");
        }
        System.out.println();
    }

    public static void checkYear(byte device, int releaseYearDevice) {
        int currentYear = LocalDate.now().getYear();
        byte ios = 0;
        byte android = 1;
        if (device == ios) {
            if (releaseYearDevice < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        } else if (device == android) {
            if (releaseYearDevice < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Операционная система выбрана не верно");
        }
        System.out.println();
    }

    public static int cardDeliveryTime(int distance) {
        int distanceMax = 100;
        int distanceMin = 0;
        int daysForDelivery = 1;
        if (distance <= distanceMax && distance > distanceMin) {
            for (int i = 20; i < distance; i += 40) {
                daysForDelivery++;
            }
            System.out.println("Потребуется дней: " + daysForDelivery);
            return daysForDelivery;
        }
        System.out.println();
        return -1;
    }
}
