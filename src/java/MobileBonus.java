public class MobileBonus {
    public static void main(String[] args) {
        int balance = 100;
        int newPayment = 100;

        int bonus;
        if (newPayment > 1000) {

            bonus = newPayment / 100;
           System.out.println("Добавлено бонусов: " + bonus);

        } else {
        bonus = 0;

        }
        int totalBalance = balance + newPayment + bonus;
        System.out.println("Итоговый баланс: " + totalBalance );
    }
}
