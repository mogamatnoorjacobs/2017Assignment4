package Chatpter4Assignment.Question3.InterfaceSegregationPrinciple.Obey;

/**
 *
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
