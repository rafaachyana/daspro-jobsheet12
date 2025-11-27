public class Kafe22 {
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
    public static void main(String[] args) {
        Menu("Budi", true, "Diskon 30");
    }
}
