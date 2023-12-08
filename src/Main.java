public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human costumer1 = new Human("Costumer1");
        //Human costumer2 = new Human("Costumer2");

        market.acceptToMarket(costumer1);
        market.takeInQueue(costumer1);
        //market.acceptToMarket(costumer2);
        //market.takeInQueue(costumer2);

        market.update();

    }
}