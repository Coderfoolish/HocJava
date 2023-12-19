package baitaptuan9_1;

import java.util.Random;

public class Goat extends Cattle {

    private final String say = "GoatGoatGoat";

    public Goat() {
        super(new Random().nextInt(10) + 1, new Random().nextInt(10) + 1, "GoatGoatGoat");
    }

    @Override
    public void say() {
        System.out.println(say);
    }
}