public class Main {
    public static void main(String[] args) {
        int initialAccount = 1100;
        int replenishmentAmount = 1400;
        int numberOfBonuses = 0;
        if (replenishmentAmount > 1000) {
            initialAccount += replenishmentAmount/100;
            numberOfBonuses = replenishmentAmount/100;
        }
        System.out.println(initialAccount);
        System.out.println(numberOfBonuses);
    }
}