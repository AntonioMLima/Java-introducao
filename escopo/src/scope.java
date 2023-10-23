public class scope {
    public static void main(String[] args) {
        int a = 6; //variável visível apenas nesse bloco 

        int x = 1;
        for ( x = 1; x <= 10; x++){
            System.out.println(x);

        }
        
       
        System.out.println(x);
    }
    
    

}
