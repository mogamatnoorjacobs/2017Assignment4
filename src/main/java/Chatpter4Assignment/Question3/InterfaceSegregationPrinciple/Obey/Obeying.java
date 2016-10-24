package Chatpter4Assignment.Question3.InterfaceSegregationPrinciple.Obey;

/**
 * Created by fatimam on 2016-06-26.
 */
public class Obeying implements ProductInterface,ProductWheels

{
    private String name;
    private double price;

    public void setName(String name)
    {
        this.name=name;
    }

    public void setPrice(double price)
    {
        this.price=price;
    }


    public void wheels()
    {
        System.out.println("Product has wheels");
    }


}
