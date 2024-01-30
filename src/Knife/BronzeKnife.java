package Knife;

public class BronzeKnife implements Knife{
    @Override
    public void cut() {
        System.out.println("Зарезал свинью");
    }

    @Override
    public boolean sharpened() {
        return false;
    }
}
