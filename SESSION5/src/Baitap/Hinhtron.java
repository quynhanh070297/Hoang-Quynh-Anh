package Baitap;

public class Hinhtron
{
    //
    private double banKinh ;
    private String mauSac;

    public Hinhtron()
    {
    }
    // Phuong thuc khai bao khong co tham so;

    // Phuong thuc khai bao co tham so;
    public Hinhtron(double banKinh, String mauSac)
    {
        this.banKinh = banKinh;
        this.mauSac = mauSac;
    }
    // Phuong thuc Getter
    public double getBanKinh()
    {
        return banKinh;
    }

    public String getMauSac()
    {
        return mauSac;
    }

    // Phuong thuc setter

    public void setBanKinh(double banKinh)
    {
        this.banKinh = banKinh;
    }

    public void setMauSac(String mauSac)
    {
        this.mauSac = mauSac;
    }
    //(tính diện tích)
     public double  getArea()
     {
         return Math.PI*Math.pow(banKinh,2);

     }
     //Tính Chu vi
    public double  chuVi()
    {
        return  2 * Math.PI * banKinh;

    }
    @Override
    public String toString()
    {
        return "Hinhtron{" +
                "banKinh=" + banKinh +
                ", mauSac='" + mauSac + '\'' +
                '}';
    }
}
