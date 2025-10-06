package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

public class FlowerStoreTest {
    private Store store;
    private final FlowerBucket roseBucket = new FlowerBucket();
    private final FlowerBucket tulipBucket = new FlowerBucket();
    private final FlowerBucket chamomileBucket = new FlowerBucket();

    @BeforeEach
    public void init() {
        Flower rose = new Flower(15, FlowerColor.RED, 10, FlowerType.ROSE);
        Flower tulip = new Flower(12, FlowerColor.BLUE, 8, FlowerType.TULIP);
        Flower chamomile = new Flower(10, FlowerColor.RED, 6, FlowerType.CHAMOMILE);

        FlowerPack rosePack = new FlowerPack(rose, 5);
        FlowerPack tulipPack = new FlowerPack(tulip, 7);
        FlowerPack chamomilePack = new FlowerPack(chamomile, 9);

        roseBucket.addPack(rosePack);
        tulipBucket.addPack(tulipPack);
        chamomileBucket.addPack(chamomilePack);

        ArrayList<FlowerBucket> buckets = new ArrayList<>();
        buckets.add(roseBucket);
        buckets.add(tulipBucket);
        buckets.add(chamomileBucket);

        store = new Store(buckets);
    }

    @Test
    public void testSearch() {
        Flower searchSample = new Flower(15, FlowerColor.RED, 10, FlowerType.ROSE);

        ArrayList<FlowerBucket> found = store.search(searchSample);
        Assertions.assertEquals(roseBucket, found.get(0));
        Assertions.assertEquals(1, found.size());
    }

    @Test
    public void testNotFound() {
        Flower searchSample = new Flower(10, FlowerColor.BLUE, 12, FlowerType.ROSE);

        ArrayList<FlowerBucket> found = store.search(searchSample);
        Assertions.assertEquals(new ArrayList<>(), found);
    }
}
