package baitaptuan9_1;

import java.util.Random;

public class Cow extends Cattle {
    private final String say = "cowcowcow";
    public Cow() {
        super(new Random().nextInt(10) + 1, new Random().nextInt(20) + 1 ,"CowCowCow");
    }
    @Override
    public void say() {
        System.out.println(say);
    }
}
