import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {
    private final List<Actor> queue;

    public Market() {
        this.queue = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        //todo
    }

    @Override
    public void takeInQueue(Actor actor) {
        //todo
    }

    @Override
    public void takeOrders() {
        //todo

    }

    @Override
    public void giveOrders() {
        //todo
    }


    @Override
    public void releaseFromQueue() {
        //todo
    }
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        //todo
    }

    @Override
    public void update() {
        //todo
    }

}
