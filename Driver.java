import java.util.Scanner;
public class Driver
{

    public static void main (String[] args)
    {
        String color1,color2;
        String made1,made2;
        int price1,price2;
        double weight1,weight2;

        Scanner scan=new Scanner(System.in);
        System.out.println("please insert the first pen color ");
        color1=scan.next();
        System.out.println(" insert the second pen color ");
        color2=scan.next();
        System.out.println(" insert the first pen manufacturer");
        made1=scan.next();
        System.out.println(" insert the second pen manufacturer");
        made2=scan.next();
        System.out.println(" insert the first pen price ");
        price1=scan.nextInt();
        System.out.println(" insert the second pen price ");
        price2=scan.nextInt();
        System.out.println(" insert the first pen weight ");
        weight1=scan.nextDouble();
        System.out.println(" insert the second pen weight ");
        weight2=scan.nextDouble();

        Pen penA=new Pen (color1,made1,price1,weight1);
        Pen penB=new Pen (color2,made2,price2,weight2);
        System.out.println(penA);
        System.out.println(penB);

        System.out.println("the color of first pen is: " +penA.getColor()+
                "\n and the color of the second pen is: " +penB.getColor());

        System.out.println("the manufacturer of firs pen is: "+penA.getMade()+
                "\n and the manufacturer of second pen is: "+penB.getMade());

        boolean m=penA.isSameMade(penB);
        System.out.println(m);

        boolean p=penA.isSamePrice(penB);
        System.out.println(p);

        System.out.println("the price of first pen is: "+penA.getPrice()+
                "\n and the price of second pen is: "+penB.getPrice());

        boolean b= penA.isBluePen();
        System.out.println(b);

        penA.setPrice(8);
        System.out.println("the new price of pen is: "+penA.getPrice());

        System.out.println("the weight of first pen is: "+penA.getWeight()+
                "\n and the weight of second pen is: "+penB.getWeight());
    }
}