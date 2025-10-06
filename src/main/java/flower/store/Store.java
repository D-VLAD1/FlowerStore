package flower.store;

import java.util.ArrayList;

public class Store {

    private final ArrayList<FlowerBucket> buckets;

    public Store(final ArrayList<FlowerBucket> buckets) {
        this.buckets = buckets;
    }

    public ArrayList<FlowerBucket> search(final Flower flower) {
        ArrayList<FlowerBucket> output = new ArrayList<>();
        for (FlowerBucket bucket: buckets) {
            for (FlowerPack pack: bucket.getPacks()) {
                Flower pack_flower = pack.getFlower();
                if (Flower.compareFlowers(flower, pack_flower)) {
                    output.add(bucket);
                    break;
                }
            }
        }
        return output;
    }
}
