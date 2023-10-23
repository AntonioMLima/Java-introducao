

public class SalarioImposto {
    public static void main(String[] args) {
        double salarioBruto = 1800.00;
        double imposto = 0.00;

        if (salarioBruto > 900 && salarioBruto < 1800){
            imposto = (salarioBruto - 900) * 0.1500;
        } 
        else if (salarioBruto >= 1800){
            imposto = 135 + (salarioBruto - 1800) * 0.27500; 
        }
        
        
        System.out.println("Total de imposto a pagar: R$" + imposto);
    }
}
