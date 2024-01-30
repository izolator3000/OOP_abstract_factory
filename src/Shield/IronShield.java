package Shield;

public class IronShield implements Shield{
    @Override
    public void block() {
        System.out.println("Удар заблокирован :)");
    }

    @Override
    public int hp() {
        return 20;
    }
}
