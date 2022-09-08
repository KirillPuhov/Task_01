//Радиус малой окружности r1, большой – R2. Найти площадь заштрихованной части
//фигуры.
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите радиус малой окружности r1: ");
        double r1 = scan.nextDouble();

        System.out.print("Введите радиус большой окружности r2: ");
        double r2 = scan.nextDouble();

        double area = findShadedArea(r1, r2);
        System.out.printf("Площадь заштрихованной части: %f", area);
    }

    private static double findShadedArea(double r1, double r2){
        double area =
                getPartOfSmallCircle(r1) +
                getPartOfBigCircle(r1, r2) +
                getPartOfSquare(r2);

        return area;
    }

    private static double getPartOfSmallCircle(double r1){
        double result = 3 * Math.PI * Math.pow(r1, 2);
        result /= 4;

        return result;
    }

    private static double getPartOfBigCircle(double r1, double r2){
        double result = Math.PI * (Math.pow(r2, 2) - Math.pow(r1, 2));
        result /= 8;

        return result;
    }

    private static double getPartOfSquare(double r2){
        double result = Math.pow(r2, 2) * (4 - Math.PI);
        result /= 8;

        return result;
    }
}