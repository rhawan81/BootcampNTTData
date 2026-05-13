package EstruturasdControleJava;

public class Numeros {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;

        int opcao  = 1;


        for (int i = num2; i >= num1 ; i--) {
            if(i % 2== 0 && opcao == 2){
                System.out.println(i + " é par");
            }
            else if (i % 2 != 0 && opcao == 1){
                System.out.println(i + " é impar");
            }

        }
    }
}
