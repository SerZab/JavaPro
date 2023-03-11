package practiceJava.lesson02.newGame;

public class Battle {
    public static void main(String[] args) {
        Superhero hero1 = Superhero.generateRandomSuperhero();
        Superhero hero2 = Superhero.generateRandomSuperhero();
        System.out.println(hero1);
        System.out.println(hero2);

        System.out.println("Битва между " + hero1.getName() + " и " + hero2.getName() + " начинается!");

        while (hero1.getHealth() > 0 && hero2.getHealth() > 0) {
            // герой1 атакует героя2
            hero1.fight(hero2);

            // ответная атака
            if (hero2.getHealth() > 0) {
                hero2.fight(hero1);
            }
        }

        // определить победителя
        if (hero1.getHealth() > 0) {
            System.out.println(hero1.getName() + " выигрывает!");
        } else {
            System.out.println(hero2.getName() + " выигрывает!");
        }
    }
}
