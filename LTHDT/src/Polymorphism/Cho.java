/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * @author nguyen thanh sang
 */
public class Cho extends DongVat{
    
  
    public Cho()
    {}
    public Cho(String tendongvat,double chieucao, double cannang, String tiengkeu, String thucan)
    {
    }
    @Override  
    public void an()
    {
        super.thucan="Xương";
    }
    @Override
    public void keu()
    {
        super.tiengkeu="Gau Gâu";
    }
    public void phuongthuccuacho()
    {
        System.out.println("Phương thuc cua cho");
    }
}
