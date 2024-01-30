package Knife;

import java.util.Random;

public class IronKnife implements Knife{
    @Override
    public void cut() {
        System.out.println("Порезал яблоко");
    }

    @Override
    public boolean sharpened() {
        // Заточен с 50% вероятностью
        return new Random().nextInt() % 2 == 0;
    }
}
