import java.util.Scanner;
public class RekapPenjualanCafe22 {
    static int jumlahMenu=5;
    static int jumlahHari=7;
    static String[] namaMenu = {"Kopi","Teh","Es Kelapa Muda","Roti Bakar","Gorengan"};
    static int[][] penjualan = new int[jumlahMenu][jumlahHari];
    public static void inputData() {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<jumlahMenu; i++){
            System.out.print("Masukkan nama menu ke-"+(i+1)+":");
            namaMenu[i]=sc.nextLine();
        }
        for (int i=0; i<jumlahMenu; i++) {
            System.out.println("Masukkan data penjualan untuk menu: " + namaMenu[i]);
            for (int j=0; j<jumlahHari; j++) {
                System.out.print("  Hari ke-"+(j+1)+": ");
                penjualan[i][j]=sc.nextInt();
            }
        }
        sc.close();
    }
    public static void tampilData() {
        System.out.println("\nTabel Penjualan:");
        System.out.printf("%-15s","Menu");
        for (int h=1; h<=jumlahHari; h++) {
            System.out.printf("%-10s","Hari"+h);
        }
        System.out.println();
        for (int i=0; i<jumlahMenu; i++) {
            System.out.printf("%-15s",namaMenu[i]);
            for (int j=0; j<jumlahHari; j++) {
                System.out.printf("%-10d",penjualan[i][j]);
            }
            System.out.println();
        }
    }
    public static void menuTerlaris() {
        int maxTotal = 0;
        String menuTerlaris = "";
        for (int i=0; i<jumlahMenu; i++) {
            int total = 0;
            for (int j=0; j<jumlahHari; j++) {
                total += penjualan[i][j];
            }
            if (total>maxTotal) {
                maxTotal=total;
                menuTerlaris=namaMenu[i];
            }
        }
        System.out.println("\nMenu dengan penjualan tertinggi: "+menuTerlaris + " ("+maxTotal+" item)");
    }
    public static void rataRataMenu() {
        System.out.println("\nRata-rata penjualan tiap menu:");
        for (int i=0; i<jumlahMenu; i++) {
            int total = 0;
            for (int j=0; j<jumlahHari; j++) {
                total += penjualan[i][j];
            }
            double rata = (double) total / jumlahHari;
            System.out.printf("%-15s: %.2f item/hari\n",namaMenu[i],rata);
        }
    }
    public static void main(String[] args) {
        inputData();
        tampilData();
        menuTerlaris();
        rataRataMenu();
    }
}
