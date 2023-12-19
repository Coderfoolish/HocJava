package baitaptuan9_1;

import java.util.Random;

public class Sheep extends Cattle {
    private final String say = "Cừu Cừu";
    public Sheep() {
        super(new Random().nextInt(10) + 1, new Random().nextInt(5) + 1, "Cừu Cừu");
    }
    @Override
    public void say() {
        System.out.println(say);
    }
}