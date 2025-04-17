import java.util.*;

public class five {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of the student:");
        String a=sc.nextLine();
        System.out.println("Enter your Maths marks;");
        double b=sc.nextDouble();
        System.out.println("Enter your English marks;");
        double c=sc.nextDouble();
        System.out.println("Enter your Computer marks;");
        double d=sc.nextDouble();
        System.out.println("Enter your Physics marks;");
        double e=sc.nextDouble();
        System.out.println("Enter your Chemistry marks;");
        double f=sc.nextDouble();
        double avg=((b+c+d+e+f)/500)*100;
        System.out.println("The Percentage: "+avg);
    }
}
