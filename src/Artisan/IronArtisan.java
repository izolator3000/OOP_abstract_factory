package Artisan;

import Knife.Knife;
import Knife.IronKnife;
import Shield.Shield;
import Shield.IronShield;
import Sword.Sword;
import Sword.IronSword;

public class IronArtisan implements Artisan{
    @Override
    public Knife createKnife() {
        return new IronKnife();
    }

    @Override
    public Sword createSword() {
        return new IronSword();
    }

    @Override
    public Shield createSheild() {
        return new IronShield();
    }
}
