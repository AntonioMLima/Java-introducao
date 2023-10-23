

public class MyClass {
    // Your code will be written here

    public static void main(String[] args) {
        // main function body

        System.out.print("Hello class, be welcome.\n");
        // System class will allow us to display something on console

        int ano = 2000; // type name = value
        ano = 2023;

        final String SP = "São Paulo\n";
        // Uppercase variables cannot be changed

        System.out.print(SP);
        System.out.print(ano);
        System.out.print("\n");


        int age = 18;
        String name = "Antonio";
        String secondName = "Manoel";
        boolean isBlack = true;
        age = 19;
    

        int sum = sum(age,10); 
        String nomeCompleto = nomeCompleto(name, secondName);
        System.out.print( nomeCompleto );
        System.out.print( sum );

    }
    
    //typeOfReturn InfinitiveVerb ( Params )
    public static int sum ( int numberOne, int numberTwo ){
        return numberOne + numberTwo;
    };
    
    
    public static String nomeCompleto (String firstName, String secondName){
        return "Resultado: " + firstName.concat(" ").concat(secondName).concat(", ");
    }
    
}
