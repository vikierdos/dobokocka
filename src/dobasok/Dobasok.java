
package dobasok;

import java.util.Random;
import java.util.Scanner;


public class Dobasok {

    static Scanner sc = new Scanner(System.in, "latin2");
    static Random rd = new Random();
    public static void main(String[] args) {
        
//        System.out.println("Hányszor dobjon a dobókockával? ");
//        int hanyszor = Integer.parseInt(sc.nextLine());
//        while (hanyszor <= 0) {            
//            hanyszor = Integer.parseInt(sc.nextLine());
//        }
//        int[] dobas = new int[hanyszor];
//        for (int i = 0; i < hanyszor; i++) {
//            dobas[i] = rd.nextInt(1, 7);
//        }
//        int hat = 0;
//        int ot = 0;
//        int negy = 0;
//        int harom = 0;
//        int ketto = 0;
//        int egy = 0;
//        for (int i = 0; i < hanyszor; i++) {
//            if (dobas[i] == 6) {
//                hat++;
//            }
//            else if(dobas[i] == 5){
//                ot++;
//            }
//            else if(dobas[i] == 4){
//                negy++;
//            }
//            else if(dobas[i] == 3){
//                harom++;
//            }
//            else if(dobas[i] == 2){
//                ketto++;
//            }
//            else{
//                egy++;
//            }
//            
//            
//            
//        }
//        System.out.printf("6 volt %4d db\n5 volt %4d db\n4 volt %4d db\n3 volt %4d db\n2 volt %4d db\n1 volt %4d db\n", hat, ot, negy, harom, ketto, egy);
        
        /*2. feladat*/
            System.out.println("Hányszor dobjon a dobókockával? ");
            int hanyszor_2 = Integer.parseInt(sc.nextLine());
            while (hanyszor_2 <= 0) {            
            hanyszor_2 = Integer.parseInt(sc.nextLine());
            
            }
            int[] dobas_2 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            for (int i = 0; i < hanyszor_2; i++) {
                int kocka = rd.nextInt(1, 13);
                if (kocka == 1) {
                    dobas_2[0] ++;
                }
                else if(kocka == 2){
                    dobas_2[1] ++;
                }
                else if(kocka == 3){
                    dobas_2[2] ++;
                }
                else if(kocka == 4){
                    dobas_2[3] ++;
                }
                else if(kocka == 5){
                    dobas_2[4] ++;
                }
                else if(kocka == 6){
                    dobas_2[5] ++;
                }
                else if(kocka == 7){
                    dobas_2[6] ++;
                }
                else if(kocka == 8){
                    dobas_2[7] ++;
                }
                else if(kocka == 9){
                    dobas_2[8] ++;
                }
                else if(kocka == 10){
                    dobas_2[9] ++;
                }
                else if(kocka == 11){
                    dobas_2[10] ++;
                }
                else if(kocka == 12){
                    dobas_2[11] ++;
                }
            }
            
            int sz_egy = (dobas_2[0]*100)/hanyszor_2;
            int sz_ketto = (dobas_2[1]*100)/hanyszor_2;
            int sz_harom = (dobas_2[2]*100)/hanyszor_2;
            int sz_negy = (dobas_2[3]*100)/hanyszor_2;
            int sz_ot = (dobas_2[4]*100)/hanyszor_2;
            int sz_hat = (dobas_2[5]*100)/hanyszor_2;
            int sz_het = (dobas_2[6]*100)/hanyszor_2;
            int sz_nyolc = (dobas_2[7]*100)/hanyszor_2;
            int sz_kilenc = (dobas_2[8]*100)/hanyszor_2;
            int sz_tiz = (dobas_2[9]*100)/hanyszor_2;
            int sz_tizenegy = (dobas_2[10]*100)/hanyszor_2;
            int sz_tizenketto = (dobas_2[11]*100)/hanyszor_2;
            
            String cs = "*";
            System.out.printf("1  %s (%d db)\n", cs.repeat(sz_egy), dobas_2[0]);
            System.out.printf("2  %s (%d db)\n", cs.repeat(sz_ketto), dobas_2[1]);
            System.out.printf("3  %s (%d db)\n", cs.repeat(sz_harom), dobas_2[2]);
            System.out.printf("4  %s (%d db)\n", cs.repeat(sz_negy), dobas_2[3]);
            System.out.printf("5  %s (%d db)\n", cs.repeat(sz_ot), dobas_2[4]);
            System.out.printf("6  %s (%d db)\n", cs.repeat(sz_hat), dobas_2[5]);
            System.out.printf("7  %s (%d db)\n", cs.repeat(sz_het), dobas_2[6]);
            System.out.printf("8  %s (%d db)\n", cs.repeat(sz_nyolc), dobas_2[7]);
            System.out.printf("9  %s (%d db)\n", cs.repeat(sz_kilenc), dobas_2[8]);
            System.out.printf("10 %s (%d db)\n", cs.repeat(sz_tiz), dobas_2[9]);
            System.out.printf("11 %s (%d db)\n", cs.repeat(sz_tizenegy), dobas_2[10]);
            System.out.printf("12 %s (%d db)\n", cs.repeat(sz_tizenketto), dobas_2[11]);
            
            
            
            
    }
    
}
