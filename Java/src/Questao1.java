import java.io.PrintStream;

public class Questao1 {

    public static void main(String[] args) {
        int n, i, j;

        n = 6;

        PrintStream saida = System.out;

        for(i = 0; i < n; ++i) {

            for(j = 2 * (n - i); j >= 0; --j) {
                saida.print(" ");
            }

            for(j = 0; j <= i; ++j) {
                saida.print("* ");
            }

            saida.println();
        }
    }
}