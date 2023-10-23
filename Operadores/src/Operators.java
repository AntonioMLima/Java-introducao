public class Operators {
    public static void main(String[] args) throws Exception {
        char grade = 'A'; // '=' é um operador de atribuição

        double arithmetic = (1 + 2) - (3 * 4) / (5 % 3); // operadores aritméticos 

        String concat = "'+' TAMBÉM " + "FAZ CONCATENAÇÃO " + "DE " + "TEXTOS";
        System.out.println(concat);
        
        int number = 5;
        System.out.println(- number); // '-' e '+' também é um operador unario
        int numberIncrement = ++ number; // operador de incremento
        int numberDecrement = -- number; // operador de decremento
        System.out.println(numberIncrement);
        System.out.println(numberDecrement);

        boolean negation = false;

        System.out.println(!negation); // "!" operador de negação de um valor boolean

    }
}
