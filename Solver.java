import java.util.Scanner;
import java.util.InputMismatchException;

public class Solver {
    public static void main(String[] args) {
        System.out.println("一元二次方程计算器 Linear Equation with Two Unknowns Solver 2023.2.0");
        System.out.println("????/??????????锟斤拷??OvO");
        System.out.println("Copyright (c) 2023 ???锟斤拷??OvO");
        System.out.println("----------------------------------------------------------------------");

        double a = 0;
        double b = 0;
        double c = 0;

        var scanner = new Scanner(System.in);
        try {
            System.out.println("  ??????a?????");
            a = scanner.nextDouble();
        } catch (InputMismatchException e) {
            raise_solution("a???????????????????????");
        }

        try {
            System.out.println("  ??????b?????");
            b = scanner.nextDouble();
        } catch (InputMismatchException e) {
            raise_solution("b???????????????????????");
        }

        System.out.println("  ??????c?????");
        scanner.nextLine();
        String cget = scanner.nextLine();
        System.out.println(cget);
        String lxy = "刘续尧";

        if (cget.equals(lxy)) {
            raise_solution("解得：x=鸡儿");
        }

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    equation_to_solve("0=0");
                    raise_solution("???????????????");
                } else {
                    equation_to_solve(c+"=0");
                    raise_solution("????????");
                }
            } else {
                equation_to_solve(b+"x+"+c+"=0");
                double answer = (-1 * c) / b;
                raise_solution("????x="+answer);
            }
        } else {
            equation_to_solve(a+"x2+"+b+"x+"+c+"=0");
            double delta = b * b - 4 * a * c;
            double delta_sqrt = Math.sqrt(delta);
            if (Double.isNaN(delta_sqrt)) {
                raise_solution("????????????");
            } else {
                double x1 = (-1 * b + delta) / 2 * a;
                double x2 = (-1 * b - delta) / 2 * a;
                raise_solution("????x1="+x1+", x2="+x2);
            }
        }
    }

    public static void equation_to_solve(String equation) {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("  ?????" + equation);
    }

    public static void raise_solution(String solution) {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("  " + solution);
        System.out.println("----------------------------------------------------------------------");
        System.exit(0);
    }
}