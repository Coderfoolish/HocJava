package TUAN9;

public class Cow extends GiaSuc{
    public  Cow(){
    }
    public Cow(String ID_GS, String tiengKeu, String tenLoai, int amoutMilk)
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
        return (int)(Math.random() * 20);
    }

    @Override
    public void giveBirth() {
        super.giveBirth();
    }
}
