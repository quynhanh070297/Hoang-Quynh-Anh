package Baitap;

public class main
{
    public static void main(String[] args)
    {
        Hinhtron tron1 = new Hinhtron (2.2, "Red");
        double dienTich=  tron1.getArea();

        double chuVi=  tron1.chuVi();

        System.out.println( "Dien tich la : " +dienTich + "Chu Vi la : "+chuVi);
    }
}
