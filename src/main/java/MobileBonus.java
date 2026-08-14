public class MobileBonus {
    public static void main(String[] args) {
        int balance = 100;
        int newPayment = 1100;
        int minBalance = 1000;
        int rubForBonus = 100;
        int totalBalance = balance + newPayment;

        if (newPayment > minBalance) {
            int i = newPayment / rubForBonus;
            System.out.println("Добавлено бонусов: " + i);
            System.out.println("Total balance: " + (totalBalance+i));

        } else {

            System.out.println("Баланс: " + totalBalance );
        }

    }
}
