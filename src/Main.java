public class Main {
    public static void main(String[] args) {

        int balans = 50;
        int popolnenie = 1300;
        int bonus;
        int summa;
        if (popolnenie > 1000) {
            bonus = popolnenie / 100;
        } else bonus = 0;
        summa = balans + popolnenie + bonus;
        System.out.println("Количество бонусных рублей = " + bonus);
        System.out.println("Итоговая сумма баланса = " + summa);
    }
}