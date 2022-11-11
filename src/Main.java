import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        int total = 0;
        int eachMonth = 15000;
        int monthNum = 1;
        while(total < 2459000){
            total += eachMonth;
            System.out.println("Месяц " + monthNum + ": сумма накоплений равна " + total + " рублей.");
            monthNum++;
        }

        System.out.println(" ");

        System.out.println("Задание 2:");
        int num = 1;
        while (num < 10){
            System.out.print(num + " ");
            num++;
        }
        System.out.println(num);
        for (int i = 10; i > 0; i--){
            System.out.print(i + " ");
        }

        System.out.println("\n");

        System.out.println("Задание 3:");
        int population = 12000000;
        float increment = 9/1000f;
        for (int i = 1; i <= 10; i++){
            population += increment*population;
            System.out.println("Год " + i + ": численность населения равна " + population + " человек.");
        }

        System.out.println(" ");

        System.out.println("Задание 4:");
        float percent = 0.07f;
        total = 15000;
        monthNum = 1;
        while (total < 12000000){
            total += total*percent;
            System.out.println("Месяц " + monthNum + ": сумма накоплений равна " + total + " рублей.");
            monthNum++;
        }
        System.out.println("Итого " + monthNum + " месяцев.");

        System.out.println(" ");

        System.out.println("Задание 5:");
        total = 15000;
        monthNum = 1;
        while (total < 12000000){
            total += total*percent;
            if (monthNum%6 == 0){
                System.out.println("Месяц " + monthNum + ": сумма накоплений равна " + total + " рублей.");
            }
            monthNum++;
        }
        System.out.println("Итого " + monthNum + " месяцев.");

        System.out.println(" ");

        System.out.println("Задание 6:");
        total = 15000;
        monthNum = 1;
        while (monthNum/12f <= 9){
            total += total*percent;
            if (monthNum%6 == 0){
                System.out.println("Полугодие " + monthNum/6 + ": сумма накоплений равна " + total + " рублей.");
            }
            monthNum++;
        }

        System.out.println(" ");

        System.out.println("Задание 7:");
        int friday = 6;
        for (int i = 1; i <= 31; i++){
            if (abs(i-friday)%7 == 0){
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
            }
        }

        System.out.println(" ");

        System.out.println("Задание 8:");
        int currentYear = 2022;
        int minYear = currentYear-200;
        while (minYear%79 != 0){
            minYear++;
        }
        for (int i = minYear; i <= currentYear+79; i+=79){
            System.out.println(i);
        }

        System.out.println(" ");

        System.out.println("Задание 9:");
        int multiplier = 2;
        for (int i = 1; i <= 10; i++){
            System.out.println(multiplier + "*" + i + "=" + multiplier*i);
        }
    }
}