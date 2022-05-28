public class Main {
    public static void main(String[] args) {
        int balance = 150;
        int cash1 = 100;
        int bonus = cash1 / 100;
        if (cash1 >= 1000) {
            bonus = cash1 / 100;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);
        System.out.println(balance + cash1 + bonus);

        int cash2 = 1475;
        int bonus2 = cash2 / 100;
        if (cash2 >= 1000) {
            bonus2 = cash2 / 100;
        } else {
            bonus = 0;
        }
        System.out.println(bonus2);
        System.out.println(balance + cash2 + bonus2);
    }
}

