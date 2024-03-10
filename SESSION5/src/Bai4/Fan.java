package Bai4;

public class Fan
{
    private String color = "Blue" ;
    private String speed = "Slow";
    private boolean  isOn = false ;
    private double radius = 5;

    // Phuong thuc khoi tao khong tham so
    public Fan()
    {
    }
    // Phuong thuc khoi tao khong tham so


    public Fan(String color, String speed, boolean isOn, double radius)
    {
        this.color = color;
        this.speed = speed;
        this.isOn = isOn;
        this.radius = radius;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getSpeed()
    {
        return speed;
    }

    public void setSpeed(String speed)
    {
        this.speed = speed;
    }
    public boolean isOn()
    {
        return isOn;
    }
    public void setOn(boolean on)
    {
        isOn = on;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public void display()
    {
        System.out.println("Color is " + color);
        System.out.println("Speed is" + speed);
        System.out.println("Radius is" + radius);
        System.out.println("Fan is " + (isOn?"On":"Off"));
    }
    public String toString() {
        if (isOn==true)
        {
            return "Color is " + color + "Speed is" + speed +"Radius is" + radius+"Fan is On";
        }else
        {
            return "Color is " + color + "Speed is" + speed +"Radius is" + radius+"Fan is Off";
        }
    }
}
