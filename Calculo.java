import java.util.Scanner;

public class Calculo {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int x = -1000;
        int func = 0;
        int aux = 0;
        int [] arrayNum = new int[10];
        int [] arrayNum2 = new int [10];

        for (int i=0; i<arrayNum.length;i++){
            System.out.println("Digite o numero: ");
            int num = entrada.nextInt();
            arrayNum[i] = num;
        }
        
        while (x != 1001) {
            func = 0;
            aux = 0;
            func = (int) (arrayNum[0] + arrayNum[1]*(Math.pow(x, 1)) + arrayNum[2]*(Math.pow(x, 2)) + arrayNum[3]*(Math.pow(x, 3)) + arrayNum[4]*(Math.pow(x, 4)) + arrayNum[5]*(Math.pow(x, 5)) + arrayNum[6]*(Math.pow(x, 6)) + arrayNum[7]*(Math.pow(x, 7)) + arrayNum[8]*(Math.pow(x, 8)) + arrayNum[9]*(Math.pow(x, 9)));
            System.out.println(func);
            x+=1;
            aux = func;
            
            if (aux < 0 && func > 0){
                System.out.println("[" + aux + "," + func + "]");
            }else{
                System.out.println("nada!");
            }
        }
    }
}