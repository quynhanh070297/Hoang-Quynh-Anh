package Bai2;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println( "Nhap Ma sinh vien ");
        String maSinhVien = scanner.nextLine();
        System.out.println( "Nhap Ten Sinh Vien ");
        String tenSV = scanner.nextLine();
        System.out.println("Nhap tuoi ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap gioi tinh (Nam : true , Nu: False");
        boolean sex = Boolean.parseBoolean(scanner.nextLine());

        Sinhvien sinhVien1 = new Sinhvien(maSinhVien, tenSV, age,sex);
        sinhVien1.display();

    }

}
