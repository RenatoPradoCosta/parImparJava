import java.util.Scanner;

public class ParImpar {
    public static Scanner teclado;

    public static String verificarParImpar(int n) {
        if (n % 2 == 0){
            return "Par";
        } else {
            return "Impar";
        }
    }

    public static int lerNumero() {
        int num;
        System.out.println("Digite um numero inteiro:");
        num = teclado.nextInt();
        return num;        
    }

    public static void main(String[] args) {
        int num;
        teclado = new Scanner(System.in);
        do {
            num = lerNumero();
            if (num > 0) {
                System.out.println(verificarParImpar(num));
            } 
        }while (num >= 0);
            teclado.close();
    }
}

