  

## Conteúdo introdutório da linguagem Java

O repositório tem como objetivo expor alguns conteúdos que todo iniciante na linguagem Java irá se reparar.

  

Esses conceitos são extremamente importantes para futuros aprendizados.

  

##  Anatomia de classes

  

Acredito que seja importante dizer que todo arquivo em Java representa uma classe. Classes essas que possuem atributos e funções de acordo com o objetivo da mesma.

  

A declaração de uma classe é feita da seguinte forma:

  

```Java
public class Myclass {
	//Seu código aqui
}
```

  

Algumas classes podem não conter visibilidade pública, mas é o caso da maioria.

Por convenção, todas classes devem começar com letra maíuscula. também é importante que toda classe tenha o mesmo nome do arquivo em que foi definida, qualquer IDE garantirá isso.



## Tipos de variáveis

Java é uma linguagem fortemente tipada, isso significa que todas as varíaveis possuem seus tipos declarados explicitamente e que cada tipo tem sua forma de ser tratado.

  

Tipos numéricos:

| Tipo | Valor mínimo | Valor máximo |
| ------ | ---------------| -------------|
| byte | -128 | 128 |
| short | -32.768 | 32.767 |
| int | -2.147.483.648| 2.147.483.647 |
| long | -9.223.372.036.854.775.808 | 9.223.372.036.854.775.807 |
| float | -3,4028E + 38 | 3,4028E + 38 |
| double | -1,7976E + 308 | 1,7976E + 308 |

  

Como pode ser visto, apenas os tipos **float** e **double** possuem casas decimais, enquanto o resto são números inteiros. Isso é muito importante e afeta os momentos em que cada um deles deve ser usado.

  

Os tipos mais usandos são **int** e **double** por uma questão de praticidade.

  

![Imagem]( https://blog-static.infra.grancursosonline.com.br/wp-content/uploads/2022/02/28085337/tiposPrimitivosJava.png)

  

O tipo **boolean** possui dois possíveis valores,  é um tipo muito importante para trabalharmos com estruturas de controle.

  

Para que possamos representar uma String em java usamos a classe nativa [**String**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) que possui algumas funções bem interessante para trabalharmos com texto. Exemplo de String: "Seu texto aqui".

Por fim temos o tipo **char** que representa um caractere ou um número inteiro que corresponde a alguma letra na [Tabela ASII](https://web.fe.up.pt/~ee96100/projecto/Tabela%20ascii.htm).

  
  

A declaração de uma varível é feita da seguinte forma:

  
```Java
tipoVariável nomeVariável = valorVariável
```

Exemplos com tipos núméricos:

```Java
short year = 2021;

int cep = 21070333;

long cpf = 98765432109L;

float pi = 3.14F
  
double wage = 1275.33;
```

  

Exemplos com String e char:

```Java
String myText = "This is my text".

char letra_J = 74

char letra_a = 'a'
```

  

Exemplo com boolean:

```Java
boolean trueOrFalse_1 = false
boolean trueOrFalse_2 = true

boolean true = trueOrFalse_1 || trueOrFalse_2
boolean false = trueOrFalse_1 && trueOrFalse_2
```

  

Para definir uma variável constante basta adicionar a palavra final antes da definição do tipo.
```Java
 final double PI = 3.14
```

Por convenção todas as variáveis constantes são escritas com letras maiúsculas. Para váriaveis normais e funções usamos o padrão  [camelCase](https://coodesh.com/blog/dicionario/o-que-e-camelcase/).

## Escopo

Já sabemos do que se trata uma variável, agora precisamos falar sobre uma de suas características mais importantes, o escopo.

Podemos dizer que o escopo da varíavel se trata da visibilidade da mesma. Isso não é exclusivo da linguagem Java, você pode se deparar com esse conceito em JavaScript também.

A vantagem de possuirmos um escopo baixo em nossas variáveis pode ser vista em grandes projetos, em que a definição de duas varíaveis com o mesmo nome passa a não ser mais um problema.

```Java
public class Scope {
	public static void main(String[] args) {
		for  (int  x  =  1;  x  <=  10;  x++){
			System.out.println(x);
		}
		System.out.println(x)
	}
}
```
No exemplo acima, o código não é executável, pois a variável 'x' não está definida fora do escopo do laço de repetição.
```Java
	public class Scope {
		public static void main(String[] args) {
			int  x;

			for  (  x  =  1;  x  <=  10;  x++){
				System.out.println(x);
			}
			System.out.println(x);
		}	
	}
```
Agora nossa varível está vísivel e o código rodará perfeitamente. 



## Operadores

Operadores são uma parte fundamental de toda linguagem e eles são dividos em algumas categorias: lógicos, aritméticos, ralacionais, ternários, de atribuição e de igualdade.

- **Lógicos**

Possuímos dois operadores lógicos em Java: '&&' e '| |'.

Ambos operadores trabalham com duas ou mais varíveais do tipo boolean.

Também é importante mencionar o operador de negação, representado pelo simbolo '!', que tem como objetivo inverter o valor de uma variável do tipo boolean.



Usando como base os conceitos da [tabela verdade](https://www.todamateria.com.br/tabela-verdade/), o operador '&&' representa um conjunção, o operador '| |' representa uma disjunção e operador '!' representa uma negação. Ou também: && = E , | | = OU e ! = NÃO

```Java
public class LogicOperators {
    public static void main(String[] args) {
	      boolean condition1 = false;
        boolean condition2 = true;
        
        if(condition1 && condition2){
            System.out.println("Ambas condições precisam ser verdadeiras");
        } 
        if ((condition1 || condition2) && !(17 > 6)) {
            System.out.println("Pelo menos uma condição precisa ser verdadeira e 17 precisa ser maior que 6.");
        }
        System.out.println("FIM!");
    }
}
```
No exemplo acima temos um exemplo do uso do operador lógico e relacional em conjunto com algumas condições.

- **Aritméticos**

Os operadores aritméticos são usados para realizar operações matemáticas simples.

Também existem os operadores de incremento e decremento usados, respectivamente, para adicionar ou subtrair uma unidade de uma variável númerica
 
| Operador | Operação realizada | 
| ------ | ----------| 
| + | Adição e concatenação de strings|
| - | Subtração |
| * | Multiplicação | 
| / | Divisão |
| % | Resto da divisão |
| - - | Decrementa a variável |
| ++ | Incrementa a variável |

```Java
public class ArithmeticOperators {
    public static void main(String[] args) {
        
        double arithmetic = (1 + 2) - (3 * 4) / (5 % 3); 

        String concat = "'+' TAMBÉM " + "FAZ CONCATENAÇÃO " + "DE " + "TEXTOS";
        System.out.println(concat);
        
        int number = 5;
        System.out.println(- number);
        int numberIncrement = ++ number; 
        int numberDecrement = -- number; 
        System.out.println(numberIncrement);
        System.out.println(numberDecrement);
    }
}
```
No exemplo acima temos alguns usos de operadores artméticos, utlizando '+' tanto para adição de valores, como para concatenar varíaveis.

 
- **Relacionais**

Operadores relacionais são usados fazer comparações entre duas varíaveis númericas e retornar um valor do tipo boolean

| Operador | tipo de comparação | 
| ------ | ----------| 
| < | Menor que|
| <= | Menor ou igual a |
| >= | Maior ou igual a | 
| > | Maior que |
```Java
public class RelationalOperator {
    public static void main(String[] args) {
        int number1 = 3;
        int number2 = 6;

        yesNo = number1 > number2; // É maior?
        System.out.println(yesNo);

        yesNo = number1 < number2; // É menor?
        System.out.println(yesNo);
    }
}
```
- **Ternário**

Um operador ternário é usado para substituir um estrutura de repetição simples.

Veja o exemplo: 

```Java
public class TernaryOperator {
    public static void main(String[] args) {
        int a, b;
        a = 12;
        b = 11;

        if (a == b){
            result = "True";
        } else {
            result = "False";
        }

        System.out.println(result);
    }
}
```
No código acima temos uma estrutura condicional simples que define que o valor de uma varível 'result' como "True" caso 'a' seja igual à 'b', do contrário, o valor da variável sera "False".

```Java
public class TernaryOperator {
    public static void main(String[] args) {
        int a, b;
        a = 12;
        b = 11;
        
        String result, result2;
        result = (a == b) ? "True" : "False" ; 
      
        System.out.println(result);
    }
}
```
Agora usamos o operador ternário para definir o valor da variável 'result', tornando nosso código mais otimizado e legível.

- **Atribuição**

O operador de atribuição é de longe o mais simples de todos, é usado simplesmente para definir o valor de uma variável.

```Java
public class Operators {
	public static void main(String[] args) {
	    char grade = 'A'; // '=' é um operador de atribuição
		double nota;
		nota = 7.9
	}
}
```

- **Igualdade**

Por último nós temos o operador de igualdade que é usado para comparar se duas variáveis são iguais ou se dois objetos apontam para o endereço de memória. O operador também nos retorna um valor do tipo boolean.

```Java
public  static  void  main(String[]  args)  {

int  number1  =  3;
int  number2  =  6;

boolean  isEquals  =  number1  ==  number2;  
System.out.println(isEquals);

String  name1  =  "ANTONIO";
String  name2  =  new  String("ANTONIO");

System.out.println(name1  ==  name2);

//Será necessário usar o método equals nesse caso
System.out.println(name1.equals(name2));  
// Tem conteúdos iguais?
}
```
Quando tentamos comparar dois objetos da classe String instanciados de formas diferentes concluímos que o operador compara apenas o endereço de memória e não o conteúdo da variável. Sabendo disso, usamos o método [equals()](https://www.w3schools.com/java/ref_string_equals.asp) da classe String.

Recomendo fortemente que você teste o todos os códigos apresentados em uma IDE de sua preferência ou em [Online Java Compiler](https://www.jdoodle.com/online-java-compiler/).
