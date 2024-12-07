public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] money = new int[5];
        money[0] = 15000;
        money[1] = 18000;
        money[2] = 20000;
        money[3] = 12000;
        money[4] = 22000;
        int sum = 0;
        for (int i : money) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //Задача 2
        int[] moneyNew = {15000, 18000, 20000, 12000, 22000};
        int maxMoney = moneyNew[0];
        int minMoney = moneyNew[0];
        for (final int current : moneyNew) {
            if (current > maxMoney) {
                maxMoney = current;
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxMoney + " рублей");
        for (final int current : moneyNew) {
            if (current < minMoney) {
                minMoney = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minMoney + " рублей");


        //Задача 3
        int[] newMoney = {15000, 18000, 20000, 12000, 22000};
        double averageSum = 0;
        double sum1 = 0;
        for (int i : newMoney) {
            sum1 += i;
        }

        averageSum = sum1 / newMoney.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");

        //Задача 4

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int n = reverseFullName.length;
        char temp;
        for (int i = 0; i < n / 2; i++) {
            temp = reverseFullName[n - i - 1];
            reverseFullName[n - i - 1] = reverseFullName[i];
            reverseFullName[i] = temp;
        }
        System.out.println(reverseFullName);
    }
}