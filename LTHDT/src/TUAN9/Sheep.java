package TUAN9;

public class Sheep extends GiaSuc{
    public  Sheep(){
    }
    public Sheep(String ID_GS, String tiengKeu, String tenLoai, int amoutMilk)
    {
    }

    @Override
    public void setID_GS(String ID_GS) {
        super.setID_GS("111");
    }

    @Override
    public void setTenLoai() {
        super.setTenLoai("Bò");
    }
    @Override
    public String getTiengKeu() {
        super.setTiengKeu("Ùm boaaaaaa");
        return null;
    }

    @Override
    public int  getMilkAmount() {
        return (int)(Math.random() * 5);
    }

    @Override
    public void giveBirth() {
        super.giveBirth();
    }

}
