package baitaptuan9_1;

public abstract class Cattle {

    private int numChild;
    private int literMilk;
    private String sayToFeed;

    public Cattle() {
        numChild = 0;
        literMilk = 0;
        sayToFeed = "";
    }

    public Cattle(int numChild, int literMilk, String sayToFeed) {
        this.numChild = numChild;
        this.literMilk = literMilk;
        this.sayToFeed = sayToFeed;
    }

    public int getNumChild() {
        return numChild;
    }

    public void setNumChild(int numChild) {
        this.numChild = numChild;
    }

    public int getLiterMilk() {
        return literMilk;
    }

    public void setLiterMilk(int literMilk) {
        this.literMilk = literMilk;
    }

    public String getSayToFeed() {
        return sayToFeed;
    }

    public void setSayToFeed(String sayToFeed) {
        this.sayToFeed = sayToFeed;
    }

    public void print() {
        System.out.println("có " + getNumChild() + " đứa con and cung cấp " + getLiterMilk()
                + " (l)sữa, kêu " + getSayToFeed() + " khi đói.");
    }

    public abstract void say();
}
