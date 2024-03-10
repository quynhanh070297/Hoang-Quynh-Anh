package Luong;

import java.util.Scanner;

public class Employed
{
    //mã nhân viên(employeeId), tên nhân viên (employeeName) ,
    // tuổi (age), giới tính (gen), hệ số lương(rate) và lương(salary)

    private String employeeId ;
    private String employeeName;
    private int age ;
    private  double rate;
    private double salary;

    public Employed()
    {
    }

    public Employed(String employeeId, String employeeName, int age, int rate, int salary)
    {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.rate = rate;
        this.salary = salary;
    }

    public String getEmployeeId()
    {
        return employeeId;
    }

    public void setEmployeeId(String employeeId)
    {
        this.employeeId = employeeId;
    }

    public String getEmployeeName()
    {
        return employeeName;
    }

    public void setEmployeeName(String employeeName)
    {
        this.employeeName = employeeName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public double getRate()
    {
        return rate;
    }

    public void setRate(double rate)
    {
        this.rate = rate;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }
   public void inputData()
   {

       Scanner scanner= new Scanner(System.in);
       System.out.println("Nhap ID");
       salary=Integer.parseInt(scanner.nextLine());
       System.out.println("Nhap ten Nhan Vien");
       employeeName = scanner.nextLine();
       System.out.println("Nhap tuoi Nhan Vien");
       age = Integer.parseInt(scanner.nextLine());
       System.out.println("Nhap he so luong");
       rate= Integer.parseInt(scanner.nextLine());
   } ;
    public  void displayData() {

        System.out.println("ID Nhan Vien la " + employeeId);
        System.out.println("Ten NV" + employeeName);
        System.out.println("Tuoi Nhan Vien" + age);
        System.out.println("He so luong" + rate);
        System.out.println("Luong Thang nay　la "+ salary);
    }

    public double calSalary()
    {
       // salary = rate * 1.300.000 .
        return rate*1300000;

    }
}
