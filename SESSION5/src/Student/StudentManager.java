package Student;

import java.util.Scanner;

public class StudentManager {
    private static Student[] students = new Student[100];
    static {
        students[0] = new Student("A1", "Hoang Quynh Anh", 18, 9, false, "Lang Son", 01666545641);
        students[1] = new Student("A2", "Hoang Quynh Trang", 18, 9, false, "Lang Son", 01666545641);
        students[2] = new Student("A3", "Hoang Anh", 18, 9, false, "Lang Son", 01666545641);
    }





    private static int length = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager.showAllStudent();
        do {
            System.out.println("1.\tHiển thị danh sách sinh viên\n" +
                    "2.\tThêm mới n sinh viên\n" +
                    "3.\tUpdate thông tin sinh viên theo id\n" +
                    "4.\tXoá sinh viên theo id\n" +
                    "5.\tThoát\n");
            System.out.println("Chọn ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    showAllStudent();
                    break;
                case 2:
                    createStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
            }
        } while (true);
    }

    public static void showAllStudent(){

        for (int j = 0; j < length; j++) {
            students[j].displayData();
            System.out.println("--------------------------");
        }

    }
    public static void createStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Sinh Vien ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            Student student = new Student();
            student.inputData(scanner);
            students[length] = student;
            length++;
        }
    }

    public  static void updateStudent()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ID sinh vien muon sua");
        String edit = scanner.nextLine();
        for (int i = 0; i < length; i++)
        {
            if (students[i].getStudentID()==edit)
            {
                System.out.println("1.Sua ten Sinh vien");
                System.out.println("2.Sua tuoi sinh vien");
                System.out.println("3.Sua dia chi sinh vien");
                System.out.println("4.Sua So dien thoai ");
                System.out.println("5.Sua Gioi Tinh");
                System.out.println("Thoat");
                int choice = 0;
                switch (choice)
                {
                    case 1 :
                        System.out.println("Nhap ten muon sua");
                        students[i].setStudentID(scanner.nextLine());
                        break;
                    case 2:
                        System.out.println("Nhap tuoi muon sua");
                        students[i].setAge(Integer.parseInt(scanner.nextLine()));
                        break;
                    case 3:
                        System.out.println("Nhap dia chi muon sua");
                        students[i].setAddress(scanner.nextLine());
                        break;
                    case 4:
                        System.out.println("Nhap so dien thoai muon sua");
                        students[i].setAge(Integer.parseInt(scanner.nextLine()));
                        break;
                    case 5:
                        System.out.println("Nhap gioi tinh muon sua");
                        students[i].setSex(Boolean.parseBoolean(scanner.nextLine()));
                        break;
                    case 6:
                        System.exit(0);
                        break;




                }


            }
        }
    }
}

