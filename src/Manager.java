import Artisan.*;

import java.util.Scanner;

public class Manager {
    Artisan artisan = null;
    void choose(){
        System.out.println("Сколько денег готовы потратить на оружие? Целое число 0<x<100, пжлст");
        artisan =  new Scanner(System.in).nextInt() <= 50 ? new BronzeArtisan() : new IronArtisan();
    }
    void order(){
        System.out.println("Хотите нож: 1, меч: 2, щит: 3? Одно число, пжлст");
        switch (new Scanner(System.in).nextInt()){
            case (1): artisan.createKnife().cut();
            break;
            case (2): artisan.createSword().attack();
            break;
            case (3): artisan.createSheild().block();
            default:
                System.out.println("Ввели не '1', '2' или '3'");
                break;
        }
        System.out.println("Спасибо за сотрудничество!");
    }
}
