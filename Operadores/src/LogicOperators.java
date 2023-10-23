public class LogicOperators {
    public static void main(String[] args) {
        boolean condition1 = false;
        boolean condition2 = true;

        if(condition1 && condition2){
            System.out.println("Ambas condições verdadeiras");
        } 

        if ((condition1 || condition2) && (17 > 6)) {
            System.out.println("Pelo menos uma condição é verdadeira e 17 é maior que 6.");
        }

        System.out.println("FIM!");

    }
}
