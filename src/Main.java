public class Main {
    public static void main(String[] args) {

        int balance = 50;
        int refill = 1300;
        int bonus;
        int amount;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        amount = balance + refill + bonus;
        System.out.println("Количество бонусных рублей = " + bonus);
        System.out.println("Итоговая сумма баланса = " + amount);
    }
}