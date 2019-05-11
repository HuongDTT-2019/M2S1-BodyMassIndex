import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        double weight;
        double height;
        double bmi;
        Scanner input=new Scanner(System.in);
        System.out.println("Your Weight (in kilogram)");
        weight=input.nextDouble();
        System.out.println("Your height (in meters)");
        height=input.nextDouble();
        bmi=weight/Math.pow(height,2);
        System.out.printf("%-20s%s","bmi","Interpretation\n");
        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
