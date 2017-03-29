package Chatpter4Assignment.Question3.InterfaceSegregationPrinciple;

/**
 *
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
