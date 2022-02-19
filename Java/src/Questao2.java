import java.util.Scanner;
import java.util.regex.Pattern;

public class Questao2 {

    // String[] upperMatch= { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
    //                "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
    // String[] lowerMatch= {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
    //                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
    // String[] specialChar = { "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "+ "};

    public static void main(String[] args) {

        String password = "Ya3";
        String pwdCondition = "^(?=.*[0-9])" + "(?=.*[a-z])" + "(?=.*[A-Z])" + "(?=.*[!@#$%^&*()+-])" + "(?=\\S+$).{6,}$";

        System.out.println("Crie uma senha conforme as condições abaixo:\n" +
                "● Possui no mínimo 6 caracteres.\n" +
                "● Contém no mínimo 1 digito.\n" +
                "● Contém no mínimo 1 letra em minúsculo.\n" +
                "● Contém no mínimo 1 letra em maiúsculo.\n" +
                "● Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+ \n ");

        System.out.println("Senha: " + password);


        boolean passwordMatch = Pattern.matches(pwdCondition,password );
        int pwdQuantity = (6 - password.length());

        System.out.println(passwordMatch);

        if ( password.length() < 6 && !passwordMatch) {
            System.out.println("Sua senha precisa de mais " + pwdQuantity + " caracteres e não atende todos requisitos de caractere.");

        } else if ( password.length() < 6 && passwordMatch){
            System.out.println("Sua senha precisa de mais " + pwdQuantity + " caracteres, mesmo atendendo os requisitos de caratere.");

        } else if ( password.length() > 6 && !passwordMatch) {
            System.out.println("Sua senha não atende todos requisitos.");

        } else {
            System.out.println("Senha Válida.");
        }
    }
}
