package flower.store;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public final class FlowerBucket {

    private List<FlowerPack> packs;

    public double getPrice() {
        double overall = 0;
        for (final FlowerPack pack : packs) {
            overall += pack.getPrice();
        }
        return overall;
    }

    public void addPack(final FlowerPack pack) {
        if (packs == null) {
            packs = new ArrayList<>();
        }
        packs.add(pack);
    }
}
