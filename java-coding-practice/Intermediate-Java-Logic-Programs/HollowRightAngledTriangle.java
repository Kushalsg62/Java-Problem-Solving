import java.util.Scanner;

class HallowRightTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        String star;
        String space;
        String hallowSpace;

        for (int i = 1; i < N + 1; i++) {
            if (i == 1) {
                star = "* ".repeat(N);
                System.out.println(star);
            } else if (i == N) {
                space = "  ".repeat(N - 1);
                star = "*";
                System.out.println(space + star);
            } else {
                space = "  ".repeat(i - 1);
                star = "* ";
                hallowSpace = "  ".repeat(N - i - 1);
                System.out.println(space + star + hallowSpace + star);
            }
        }

        input.close();
    }
}
