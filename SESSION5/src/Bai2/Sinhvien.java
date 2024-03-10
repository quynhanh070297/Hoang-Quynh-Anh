package Bai2;

public class Sinhvien
{
        private String studentCode ;
        private String studentName ;
        private int age;
        private boolean sex;

        // Phuong thuc khoi tao khong tham so
        public Sinhvien()
        {
        }
        // Phuong thuc khoi tao co tham so
        public Sinhvien(String studentCode, String studentName, int age, boolean sex)
        {
                this.studentCode = studentCode;
                this.studentName = studentName;
                this.age = age;
                this.sex = sex;
        }

        public void display()
        {
                System.out.println("Ma sinh vien " + studentCode);
                System.out.println("Ten Sinh Vien " + studentName);
                System.out.println("Tuoi " + age);
                System.out.println("Gioi tinh " + (sex?"Nam":"Nu"));
        }

        public String getStudentCode()
        {
                return studentCode;
        }

        public String getStudentName()
        {
                return studentName;
        }

        public int getAge()
        {
                return age;
        }

        public boolean isSex()
        {
                return sex;
        }

        // set

        public void setStudentCode(String studentCode)
        {
                this.studentCode = studentCode;
        }

        public void setStudentName(String studentName)
        {
                this.studentName = studentName;
        }

        public void setAge(int age)
        {
                this.age = age;
        }

        public void setSex(boolean sex)
        {
                this.sex = sex;
        }
}
