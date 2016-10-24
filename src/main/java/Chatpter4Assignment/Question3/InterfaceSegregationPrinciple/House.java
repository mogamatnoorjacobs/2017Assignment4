package Chatpter4Assignment.Question3.InterfaceSegregationPrinciple;

/**
 * Created by fatimam on 2016-06-26.
 */
public class House implements VoilatingProductInterface
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

    public void wheels(){};
}
