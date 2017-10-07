package Lesson1;
import java.util.Scanner;
public class MyClass {

    public static void main(String[] args) {
	double sum,count;
	Scanner inputVar=new Scanner(System.in);
	System.out.println("Enter first number");
	sum=inputVar.nextDouble();
	System.out.println("Enter second number");
	count=inputVar.nextDouble();
	MyClassTwo calc=new MyClassTwo(sum,count);
	System.out.println("two nums divided are "+calc.getAverage());
	inputVar.close();
    }
}
