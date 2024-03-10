package Bai4;


public class Main
{
    public static void main(String[] args)
    {
        // Đối tượng Fan 1: Gán giá trị lớn nhất cho speed, radius là 10,
        // color là yellow và quạt ở trạng thái bật.
        // Đối tượng Fan 2: Gán giá trị trung bình cho speed, radius là 5,
        // color là blue và quạt ở trạng thái tắt.

        Fan fan0 = new Fan();
        fan0.display();

        Fan fan1 = new Fan("Yellow", "Max", true, 10);
        System.out.println(fan1.toString());

    }

}


