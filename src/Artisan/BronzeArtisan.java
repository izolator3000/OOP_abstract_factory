package Artisan;

import Knife.Knife;
import Knife.BronzeKnife;
import Shield.Shield;
import Shield.BronzeShield;
import Sword.Sword;
import Sword.BronzeSword;

public class BronzeArtisan implements Artisan{
    @Override
    public Knife createKnife() {
        return new BronzeKnife();
    }

    @Override
    public Sword createSword() {
        return new BronzeSword();
    }

    @Override
    public Shield createSheild() {
        return new BronzeShield();
    }
}
