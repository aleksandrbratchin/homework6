public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    private static void task1() {
        System.out.println("\nЗадача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    private static void task2() {
        System.out.println("\nЗадача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    private static void task3() {
        System.out.println("\nЗадача 3");
        for (int i = 0; i < 17; i += 2) {
            System.out.println(i);
        }
    }

    private static void task4() {
        System.out.println("\nЗадача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    private static void task5() {
        System.out.println("\nЗадача 5");
        int startYear = 1904;
        int endYear = 2096;
        for (int i = startYear; i <= endYear; i += 4) {
            System.out.println(i + " год является високосным");
        }
    }

    private static void task6() {
        System.out.println("\nЗадача 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void task7() {
        System.out.println("\nЗадача 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void task8() {
        System.out.println("\nЗадача 8");
        int mounths = 12;
        int accumulation = 29_000;
        for (int i = 1, j = accumulation; i <= mounths; i++, j += accumulation) {
            System.out.println("Месяц " + i + ", сумма накоплений равна " + j + " рублей");
        }
    }

    private static void task9() {
        System.out.println("\nЗадача 9");
        int mounths = 12;
        double percentagePerAnnum = 12;
        double percentagePerMonth = percentagePerAnnum / mounths;
        double deposit = 29_000;
        double incomePerMonth = deposit / 100D * percentagePerMonth;
        for (int i = 1; i <= mounths; i++) {
            double accumulation = deposit + (incomePerMonth * i);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + accumulation + " рублей");
        }
    }

    private static void task10() {
        System.out.println("\nЗадача 10");
        int num = 2;
        for (int i = 1, result = num; i <= 10; result = num * ++i) {
            System.out.println(num + " * " + i + " = " + result);
        }
    }
}