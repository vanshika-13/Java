//Given is an Array of Employee Salary, add the tax 10% in each salary and return the new array which contains (salary + tax).

import java.util.ArrayList;

public class Salary {
    static void help(ArrayList<Double> num, int i) {
        if (i == num.size()) {
            return;
        }
        num.set(i, num.get(i) + 0.1 * num.get(i));
        help(num, i + 1);
    }

    public static void main(String args[]) {
        ArrayList<Double> num = new ArrayList<>();
        num.add(200.00);
        num.add(500.00);
        num.add(600.00);
        num.add(400.00);
        help(num, 0);
        for (int i = 0; i < 4; i++) {
            System.out.print(num.get(i) + " ");
        }
    }
}
