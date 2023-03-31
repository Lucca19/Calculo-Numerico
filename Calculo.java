import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int x = -1000;
        int func = 0;
        int aux = 0;
        int aux_x = 0;
        int func2 = 0;
        System.out.println("\nDigite o grau da polinomial:");
        int grau = entrada.nextInt();

        int [] arrayNum = new int[grau+1];

        for (int i=0; i<arrayNum.length;i++){
            if(i==0){
                System.out.println("\nDigite o numero: ");
                int num = entrada.nextInt();
                arrayNum[i] = num;
            }else{
                System.out.printf("\nDigite o numero (x^%d): ", i);
                int num = entrada.nextInt();
                arrayNum[i] = num;
            }
        }

        System.out.println("\nResultado:");

        while (x != 1001) {
            func2 = 0;
            func = 0;

            for (int j=0; j<arrayNum.length;j++){
                func = (int) (arrayNum[j] * (Math.pow(x, j)));
                func2 += func;
            }
            
            if(x >= -999){
                if((aux < 0 && func2 > 0) || (aux > 0 && func2 < 0)) {
                    System.out.printf("\n[%d,%d]", aux_x, x);
                }
            }

            aux = func2;
            aux_x = x;
            x+=1;
        }
        System.out.println("\n");
    }
}