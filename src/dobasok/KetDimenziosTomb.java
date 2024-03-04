
package dobasok;

public class KetDimenziosTomb {
    public static void main(String[] args) {
        System.out.println("Négyzetes: ");
        final int SOR_DB = 3;
        final int OSZLOP_DB = 5;
        int[][] negyzetes = new int[SOR_DB][OSZLOP_DB];
        
        negyzetes[1][2] = 1;
        
        for (int sor = 0; sor < SOR_DB; sor++) {
            for (int oszl = 0; oszl < OSZLOP_DB; oszl++) {
                System.out.print(negyzetes[sor][oszl]);
            }
            System.out.println("");
            
        }
        System.out.println("");
        
        
        System.out.println("Fűrészes: ");
        int[][] furesz = new int[7][];
        for (int s = 0; s < furesz.length; s++) {
            int oszlDB = (int)(Math.random()*7)+1;
            furesz[s] = new int[oszlDB];
        }
        
        for (int sor = 0; sor < furesz.length; sor++) {
            for (int oszl = 0; oszl < furesz[sor].length; oszl++) {
                System.out.print(furesz[sor][oszl]);
            }
            System.out.println("");
            
        }
        System.out.println("");
        
        int[][] dobasokStatisztika = new int[7][7];
        int dobas1 = (int)(Math.random()*6)+1;
        int dobas2 = (int)(Math.random()*6)+1;
        dobasokStatisztika[dobas1][dobas2]++;
    
        int sorDb = dobasokStatisztika.length;
        for (int i = 0; i < sorDb; i++) {
            int oszlDb = dobasokStatisztika[i].length;
            for (int j = 0; j < oszlDb; j++) {
                System.out.print(dobasokStatisztika[i][j]+ " ");
            }
            System.out.println("");
        }
        
        
        System.out.println("Szorzótábla");
        int[][] szorzotabla = new int[6][6];
        for (int i = 0; i < szorzotabla.length; i++) {
            for (int j = 0; j < szorzotabla[i].length; j++) {
                    szorzotabla[i][j] = i * j;
                
            }
        }
        for (int i = 0; i < szorzotabla.length; i++) {
            for (int j = 0; j < szorzotabla[i].length; j++) {
                System.out.printf("%2d ",szorzotabla[i][j] );
            }
            System.out.println("");
        }
        System.out.println("");
        
        
    }
}
