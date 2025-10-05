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
        Rose rose = new Rose();
        rose.setColor(FlowerColor.RED);
        rose.setPrice(10);
        rose.setSepalLength(15);

        Tulip tulip = new Tulip();
        tulip.setColor(FlowerColor.BLUE);
        tulip.setPrice(8);
        tulip.setSepalLength(12);

        Chamomile chamomile = new Chamomile();
        chamomile.setColor(FlowerColor.RED);
        chamomile.setPrice(6);
        chamomile.setSepalLength(10);

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
        Flower searchSample = new Rose();
        searchSample.setColor(FlowerColor.RED);
        searchSample.setPrice(10);
        searchSample.setSepalLength(15);

        FlowerPack rosePack = new FlowerPack(searchSample, 5);
        FlowerBucket flowerBucket = new FlowerBucket();
        flowerBucket.addPack(rosePack);

        ArrayList<FlowerBucket> found = store.search(searchSample);
        Assertions.assertEquals(roseBucket, found.get(0));
        Assertions.assertEquals(1, found.size());
    }

    @Test
    public void testNotFound() {
        Flower searchSample = new Rose();
        searchSample.setColor(FlowerColor.BLUE);
        searchSample.setPrice(12);
        searchSample.setSepalLength(10);

        ArrayList<FlowerBucket> found = store.search(searchSample);
        Assertions.assertEquals(new ArrayList<>(), found);
    }
}
