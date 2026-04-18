package HomeWork;

public class Primitivs2 {
    public static void main(String[] args) {
        int popoln=1200;
        int bolanse=100;
        if (popoln > 1000) {

        int bonus = popoln/100;
        int itog=bolanse+popoln+bonus;

        System.out.println("Бонус руб "+bonus);
            System.out.println("Игог баланс "+itog);
        }
        else {
            int itog=bolanse+popoln;
            System.out.println("Игог баланс "+itog);
        }
    }
}
