import java.util.Scanner;
public class TotalHitung22 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian");
        }
        if (kodePromo.equals("Diskon 50")) {
            System.out.println("Kode masih berlaku. Anda mendapat diskon 50%");
        } else if (kodePromo.equals("Diskon 30")) {
            System.out.println("Kode masih berlaku. Anda mendapat diskon 30%");
        } 
        System.out.println("==== MENU RESTO CAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("============================");
        System.out.println("Silahkan pilih menu yang anda inginkan");
    }
    public static int hitungTotalHarga(int pilihanMenu,int banyakItem, String kodePromo){
        int[] hargaItems={15000,20000,22000,12000,10000,18000};
        int hargaTotal=hargaItems[pilihanMenu-1]*banyakItem;
        System.out.println("Total harga pesanan anda : Rp"+hargaTotal);
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            int diskon = hargaTotal / 2; 
            System.out.println("Diskon 50%: Rp" + diskon);
            hargaTotal -= diskon;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            int diskon = (hargaTotal * 30) / 100; 
            System.out.println("Diskon 30%: Rp" + diskon);
            hargaTotal -= diskon;
        } else {
            System.out.println("Kode promo invalid. Tidak ada diskon.");
        }
        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Budi", true, "Diskon 30");
        System.out.print("Masukkan nomor menu yang ingin anda pesan:");
        int pilihanMenu=sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan:");
        int banyakItem=sc.nextInt();
        System.out.print("Masukkan kode promo (DISKON50/DISKON30): ");
        String kodePromo = sc.next();
        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
        System.out.println("Total harga pesanan Anda setelah diskon: Rp" + totalHarga);
        sc.close();
    }
}
