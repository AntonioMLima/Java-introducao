public class TernaryOperator {
    public static void main(String[] args) {
        int a, b;

        a = 12;
        b = 11;

        String result, result2;
        //isso
        result = (a == b) ? "True" : "False" ; 

        //equivale a isso: 
        if (a == b){
            result2 = "True";
        } else {
            result2 = "False";
        }

        System.out.println(result);
        System.out.println(result2);
    }
}
