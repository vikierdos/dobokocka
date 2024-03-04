// Erdős Viktória
package dobasok;

import java.util.Random;
import java.util.Scanner;


public class Dobasok {

    static Scanner sc = new Scanner(System.in, "latin2");
    static Random rd = new Random();
    public static void main(String[] args) {
            System.out.println("Hányszor dobjon a dobókockával? ");
            int hanyszor = Integer.parseInt(sc.nextLine());
            while (hanyszor <= 0) {            
            hanyszor = Integer.parseInt(sc.nextLine());
            
            }
            int[] dobas = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            for (int i = 0; i < hanyszor; i++) {
                int kocka = rd.nextInt(2, 13);
                if(kocka == 2){
                    dobas[2] ++;
                }
                else if(kocka == 3){
                    dobas[3] ++;
                }
                else if(kocka == 4){
                    dobas[4] ++;
                }
                else if(kocka == 5){
                    dobas[5] ++;
                }
                else if(kocka == 6){
                    dobas[6] ++;
                }
                else if(kocka == 7){
                    dobas[7] ++;
                }
                else if(kocka == 8){
                    dobas[8] ++;
                }
                else if(kocka == 9){
                    dobas[9] ++;
                }
                else if(kocka == 10){
                    dobas[10] ++;
                }
                else if(kocka == 11){
                    dobas[11] ++;
                }
                else if(kocka == 12){
                    dobas[12] ++;
                }
            }
            
            int max_i = 0;
            int max_csillag = 40;
            String cs = "*";
            
            for (int i = 1; i < dobas.length; i++) {
                if (dobas[max_i] < dobas[i]) {
                    max_i = i;
                }
            }
            
            for (int i = 2; i < dobas.length; i++) {
                System.out.printf("%2d %s (%d db)\n", i, cs.repeat((dobas[i]*max_csillag)/dobas[max_i]), dobas[i]);
            }
            
            
            
            
    }
    
}
