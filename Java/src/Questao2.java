public class Questao2 {

    public boolean passwordMatch(String pwd ) {

        int count = 0;
        int pwdQty = ( 6 - pwd.length());

        if ( pwd.length() >= 6 ) {
            if ( pwd.matches(".*\\d.*") )
                count ++;
            if ( pwd.matches(".*[a-z].*") )
                count ++;
            if ( pwd.matches(".*[A-Z].*") )
                count ++;
            if ( pwd.matches(".*[!@#$%^&*()+-].*") )
                count ++;
        } else {
            System.out.println("Sua senha precisa de mais " + pwdQty + " caracteres");
        }

        return count >= 3;
    }

    public static void main(String[] args) {

        Questao2 pwdVal = new Questao2();
        String password = "Ya3";

        System.out.println("""
                Crie uma senha conforme as condições abaixo:
                ● Possui no mínimo 6 caracteres.
                ● Contém no mínimo 1 digito.
                ● Contém no mínimo 1 letra em minúsculo.
                ● Contém no mínimo 1 letra em maiúsculo.
                ● Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+\s
                \s""");

        System.out.println("Senha: " + password);

        boolean result = pwdVal.passwordMatch(password);

        System.out.println(result);

    }
}
