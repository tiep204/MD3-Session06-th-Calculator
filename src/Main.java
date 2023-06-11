import ra.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập số a: ");
        double a = sc.nextDouble();
        System.out.println("mời bạn nhập số b");
        double b = sc.nextDouble();
        Calculator calculator = new Calculator(a,b);
        System.out.println("Tổng 2 số là: "+calculator.add());
        System.out.println("Hiệu của 2 số là: "+calculator.sub());
        System.out.println("Tích của 2 số là:"+calculator.multi());
        System.out.println("Thương của 2 số là: "+calculator.div());
    }
}