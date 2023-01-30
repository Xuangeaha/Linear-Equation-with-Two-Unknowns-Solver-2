import java.util.Scanner;
import java.util.InputMismatchException;

public class Solver {
    public static void solveIO() {
        System.out.println("一元二次方程计算器 Linear Equation with Two Unknowns Solver 2023.3.1");
        System.out.println("作者/开发者：轩哥啊哈OvO");
        System.out.println("Copyright (c) 2023 轩哥啊哈OvO");
        System.out.println("----------------------------------------------------------------------");

        double a = 0;
        double b = 0;
        double c = 0;

        var scanner = new Scanner(System.in);
        try {
            System.out.println("  请设置a的值：");
            a = scanner.nextDouble();
        } catch (InputMismatchException e) {
            raise_solution("a的值输入有误，请重新输入。");
        }

        try {
            System.out.println("  请设置b的值：");
            b = scanner.nextDouble();
        } catch (InputMismatchException e) {
            raise_solution("b的值输入有误，请重新输入。");
        }

        System.out.println("  请设置c的值：");
        scanner.nextLine();
        String cget = scanner.nextLine();
        String lxy = "刘续尧";
        String glx = "葛灵萱";

        if (cget.equals(lxy)) {
            equation_to_solve("刘续尧=0");
            raise_solution("解得：x=鸡儿");
        } else if (cget.equals(glx)) {
            equation_to_solve("葛灵萱=0");
            raise_solution("0姐永远的0！！！");
        } else {
            try {
                c = Integer.parseInt(cget);
            } catch (Exception e) {
                raise_solution("c的值输入有误，请重新输入。");
            }
        }

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    equation_to_solve("0=0");
                    raise_solution("原方程的解为任意实数");
                } else {
                    equation_to_solve(c+"=0");
                    raise_solution("原方程无解");
                }
            } else {
                equation_to_solve(b+"x+"+c+"=0");
                double answer = (-1 * c) / b;
                raise_solution("解得：x="+answer);
            }
        } else {
            equation_to_solve(a+"x2+"+b+"x+"+c+"=0");
            double delta = b * b - 4 * a * c;
            double delta_sqrt = Math.sqrt(delta);
            if (Double.isNaN(delta_sqrt)) {
                raise_solution("原方程无实数根");
            } else {
                double x1 = (-1 * b + delta) / 2 * a;
                double x2 = (-1 * b - delta) / 2 * a;
                raise_solution("解得：x1="+x1+", x2="+x2);
            }
        }
    }

    public static void equation_to_solve(String equation) {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("  解方程：" + equation);
    }

    public static void raise_solution(String solution) {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("  " + solution);
        System.out.println("----------------------------------------------------------------------");
        System.exit(0);
    }
}