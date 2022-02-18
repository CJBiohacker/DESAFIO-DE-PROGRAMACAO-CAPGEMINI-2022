import org.jetbrains.annotations.NotNull;

public class Questao2 {

    // Possui no mínimo 6 caracteres. ==>
    // Contém no mínimo 1 digito. ==>  [ 1,2,3,4,5,... ]
    // Contém no mínimo 1 letra em minúsculo. ==> [ a, b, c, ... ]
    // Contém no mínimo 1 letra em maiúsculo. ==> [ A, B, C, ... ]
    // Contém no mínimo 1 caractere especial. Os caracteres especiais são: [ !, @, #, $, %, ^, &, *, (, ), -, + ]

    public void compareUpperCase(String @NotNull [] array, String senha) {

        boolean compare;

        for ( String element: array) {
            compare = senha == element;
        }

    }


    public static void main(String[] args) {

        String senha = "Ya3";
        int minimoSenha = 6;

        String[] upperCase= {"A",'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
        String[] lowerCase= {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        String[] specialChar = { '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+' };

        Questao2 teste = new Questao2();

        teste.compareUpperCase();

        if ( senha.length() <= minimoSenha ) {
                if ( compare ) {

                }
        }


    }
}
