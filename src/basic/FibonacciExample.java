package basic;

public class FibonacciExample {

    //fibonacci series
    public void fibonacciSeries(int n) {
        int term_1 = 0, term_2 = 1, nextTerm;
        if (n == 1) {
            System.out.println(term_1);
        } else if (n == 2) {
            System.out.print(term_1 + " " + term_2);
        } else if (n > 2) {
            System.out.print(term_1 + " " + term_2);
            for (int i = 3; i <= n; i++) {
                nextTerm = term_1 + term_2;
                term_1 = term_2;
                term_2 = nextTerm;

                System.out.print(" " + nextTerm);
            }
        } else {
            System.out.println("Terms can be only greater than 0 !!");
        }
    }

    public static void main(String[] args) {
        new FibonacciExample().fibonacciSeries(5);
    }
}
