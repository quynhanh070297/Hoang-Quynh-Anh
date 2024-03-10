package Student;

import java.util.Scanner;

public class Student
{
    //mã HS, tên HS, tuổi, giới tính, địa chỉ và số điện thoại
    private String studentID;
    private String studentName;
    private int age;
    private int className;
    private boolean sex;
    private String address;
    private int phoneNumber;

    public Student()
    {

    };

    public Student(String studentID, String studentName, int age, int className, boolean sex, String address, int phoneNumber)
    {
        this.studentID = studentID;
        this.studentName = studentName;
        this.age = age;
        this.className = className;
        this.sex = sex;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }


    public String getStudentID()
    {
        return studentID;
    }

    public void setStudentID(String studentID)
    {
        this.studentID = studentID;
    }

    public String getStudentName()
    {
        return studentName;
    }

    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getClassName()
    {
        return className;
    }

    public void setClassName(int className)
    {
        this.className = className;
    }

    public boolean isSex()
    {
        return sex;
    }

    public void setSex(boolean sex)
    {
        this.sex = sex;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public int getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public void inputData(Scanner scanner) {
        System.out.println("Nhap vao ID") ;
        studentID = scanner.nextLine();
        System.out.println("Nhap Ten Hoc sinh") ;
        studentName = scanner.nextLine();
        System.out.println("Nhap Tuoi") ;
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap Gioi tinh") ;
        sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhap Lop") ;
        className = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap Dia chi") ;
        address = scanner.nextLine();
    }
    public void displayData() {
        System.out.println("Ma sinh vien " + studentID);
        System.out.println("Ten Sinh Vien " + studentName);
        System.out.println("Tuoi " + age);
        System.out.println("Gioi tinh " + (sex?"Nam":"Nu"));
        System.out.println("Dia chi " +address);
    }
}
