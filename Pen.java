/**
 * Write a description of class Pen here.
 *
 * @author (itay)
 * @version (13\12\2018)
 */
public class Pen
{
    // instance variables - replace the example below with your own
    private String _color;
    private String _made;
    private int _price;
    private double _weight;
    private final int DEFAUL_VAL=0;

    public Pen(String color,String made,int price,double weight)
    {
        _color=color;
        _made=made;
        _price=price>=DEFAUL_VAL?price:DEFAUL_VAL;//price cannot be negative
        _weight=weight>=DEFAUL_VAL?weight:DEFAUL_VAL;//weight cannot be negative
    }

    public String getColor()
    {
        return  _color;
    }

    public String getMade()
    {
        return _made;
    }

    public boolean isSameMade(Pen other)
    {
        if( _made.equals(other._made))
            return true;

        else return false;

    }

    public boolean isSamePrice(Pen other)
    {
        if(_price==other._price)
            return true;

        else return false;
    }

    public int getPrice()
    {
        return _price;
    }

    public boolean isBluePen()
    {
        if(_color.equals("blue"))
            return true;

        else return false;
    }

    public void setPrice(int x)
    {
        int oldPrice=_price;
        _price=x>=DEFAUL_VAL?x:oldPrice;
    }

    public double getWeight()
    {
        return _weight;
    }

    public String toString()
    {
        return _color +" pen, made by "+_made+", weights "+ _weight+" grams, "+
                "price: "+_price+" shekels";
    }
}
