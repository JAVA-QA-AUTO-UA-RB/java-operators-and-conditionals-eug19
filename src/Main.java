import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Привіт, відважний герою!");
        System.out.println("Тебе чекає цікава подорож");
        System.out.println("Ти йшов чарівною стежкою, і натрапив на роздоріжжя: 1 - піти наліво, 2 - піти направо");
        Scanner sc = new Scanner(System.in);
        int health = 100;
        int luck = 50;
        int choice1 = sc.nextInt();
        if (choice1 == 1) {
            System.out.println("Ти обрав піти наліво");
            health -= 20;
            System.out.println("На жаль, там на тебе чекав злий троль, ти переміг його, але поплатився здоровʼям, і тепер воно складає: " + health);
        } else if (choice1 == 2) {
            System.out.println("Ти обрав піти направо");
            luck += 30;
            System.out.println("Ти зустрів привітного єдинорога :) Удача сьогодні на твоїй стороні! Її рівень: " + luck);
        } else {
            System.out.println("Ти заплутався :(");
            health -= 10;
            System.out.println("Рівень твого здоров'я зменшився, і складає: " + health);
        }
        System.out.println("Попереду видніється загадковий колодязь, що ти зробиш?");
        System.out.println("1 - Випʼю магічну воду");
        System.out.println("2 - Пройду повз");
        int choice2 = sc.nextInt();
        if (choice2 == 1) {
            System.out.println("Ти обрав випити магічної води, вона додала сил і здоровʼя!");
            health += 50;
            System.out.println("Твоє здоров'я тепер: " + health);
        } else if (choice2 == 2) {
            System.out.println("Ти обрав пройти повз, на жаль, рівень удачі зменшився");
            luck -= 10;
            System.out.println("Твоя удача тепер: " + health);
        } else {
            System.out.println("Ти просто пройшов повз колодязь, нічого не змінилося, все як завжди :)");
        }
        System.out.println("На твоєму шляху з'являється чарівна істота...");
        Random rand = new Random();
        int creatureType = rand.nextInt(3) + 1;
        if (creatureType == 1) {
            System.out.println("Істота дуже дружня — поділилася їжею :) ");
            health += 20;
            System.out.println("Здоров’я: " + health);
        } else if (creatureType == 2) {
            System.out.println("Істота виявилась ворожою і напала на тебе! Т_Т ");
            health -= 30;
            System.out.println("Здоров’я: " + health);
        } else {
            System.out.println("Істота байдужа, нічого не відбулось :) ");
            System.out.println("Здоров’я: " + health);
        }
        System.out.println("От і закінчилася твоя подорож:");
        System.out.println("Здоров’я: " + health);
        System.out.println("Удача: " + luck);
        if (health <= 0 || luck <= 0) {
            System.out.println("Ти не зміг пройти ліс... Спробуй ще раз!");
        } else {
            System.out.println("Вітаємо! Ти зміг пройти через чарівний ліс!");
        }
    }

}
