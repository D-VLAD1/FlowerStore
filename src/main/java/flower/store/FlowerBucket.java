package flower.store;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public class FlowerBucket {
    private ArrayList<FlowerPack> packs = new ArrayList<>();

    public void add(FlowerPack flowerPack) {
        packs.add(flowerPack);
    }

    public double getPrice() {
        double overall = 0;
        for (FlowerPack pack : packs)
            overall += pack.getPrice();
        return overall;
    }

    public void addPack(FlowerPack pack) {
        packs.add(pack);
    }
}
