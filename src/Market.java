import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {
    private final List<Actor> queue;
    private final List<Actor> releasedFromQueue;

    public Market() {
        this.queue = new ArrayList<>();
        this.releasedFromQueue = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " - в магазине");
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " - в очереди");
        queue.add(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor actor: queue){
            if (!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " - заказ сделан");
            }
        }

    }

    @Override
    public void giveOrders() {
        for (Actor actor: queue){
            if (!actor.isTakeOrder()){
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " - заказ получен");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        for (Actor actor: queue){
            if (actor.isTakeOrder){
                releasedFromQueue.add(actor);
                System.out.println(actor.getName() + " - покинул очередь");
            }

        }
        releaseFromMarket(releasedFromQueue);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor: actors){

            System.out.println(actor.getName() + " - покинул магазин");
            queue.remove(actor);

        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();

    }

}
