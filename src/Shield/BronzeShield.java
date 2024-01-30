package Shield;

public class BronzeShield implements Shield {
    @Override
    public void block() {
        System.out.println("Пробил :(");
    }

    @Override
    public int hp() {
        return -5;
    }
}
