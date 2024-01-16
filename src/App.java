public class App {

    public static void main(String[] args) {
        // declaração de variáveis
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;


        // utilizando classes matematicas 
        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        // informando o resultado dos calculos
        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);

        //mais calculos
        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        
        // saida de dados dos calculos
        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = " + C);
        
        // outros calculos
        A = Math.abs(y);
        B = Math.abs(z);
        
        // ultima saida de dados
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);

    }
}
