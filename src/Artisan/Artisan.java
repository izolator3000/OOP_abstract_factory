package Artisan;

import Knife.Knife;
import Shield.Shield;
import Sword.Sword;

public interface Artisan {
    Knife createKnife();
    Sword createSword();
    Shield createSheild();
}
