public class VariableTypes {
    
    public static void main(String[] args) throws Exception {
        byte age = 123;
        // min: -128, max: 127. Pouco utilizado

		short year = 2021;
        // min: -32768, max: 32769. Pouco utilizado


		int cep = 21070333; 
        // min: -2147483648, max: 2.147.483.647. Uso altamente recomendado
        // se começar com zero, talvez tenha que ser outro tipo


		long cpf = 98765432109L;
        // min: -9223372036854775808, max: 9223372036854775807. Pouco usado
        // se começar com zero, talvez tenha que ser outro tipo
        // encerrado com "L"


		float pi = 3.14F;
        // min: -3,4028E + 38, max: 3,4028E + 38. Pouca precisão, pouco utilizado
        // pode conter parte fracionada
        // encerrado com "F"


		double wage = 1275.33;
        // min: -1,7976E + 308, max: 1,7976E + 308. Muito utilizado, alta precisão
        // pode conter parte fracionada

        String texto = "A variável do tipo String armazena textos";
        
    }
}
