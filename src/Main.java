public class Main {
    public static void main(String[] args) {
        Manager man = new Manager();
        man.choose();
        for (int i = 0; i < 4; i++) man.order();
    }
}