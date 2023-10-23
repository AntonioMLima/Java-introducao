public class RelationalOperator {
    public static void main(String[] args) {
        int number1 = 3;
        int number2 = 6;
        String nome1 = "ararara";
        String nome2 = "ararara";
         
        
        boolean yesNo = number1 == number2; // É igual?
        System.out.println(yesNo);
        
        yesNo = number1 != number2; // Não é igual?
        System.out.println(yesNo);
        
        yesNo = number1 > number2; // É maior?
        System.out.println(yesNo);

        yesNo = number1 < number2; // É menor?
        System.out.println(yesNo);
        
        String name1 = "ANTONIO";
        String name2 = new String("ANTONIO");
        //Será necessário usar o método equals nesse caso
        
        System.out.println(name1.equals(name2)); // Tem conteúdos iguais?
        System.out.println(name1 == name2);
    }
}
