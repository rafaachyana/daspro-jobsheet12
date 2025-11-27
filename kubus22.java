import java.util.Scanner;
public class kubus22{
    public static int volumeKubus(int sisi){
        int volumeKubus=sisi*sisi*sisi;
        return volumeKubus;
    }
    public static int luasPermukaanKubus(int sisi){
        int luasPermukaanKubus=6*sisi*sisi;
        return luasPermukaanKubus;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan ukuran sisi kubus: ");
        int sisi = sc.nextInt();
        int volume=volumeKubus(sisi);
        int luas=luasPermukaanKubus(sisi);
        System.out.println("Volume kubus : " + volume);
        System.out.println("Luas permukaan kubus : " + luas);
        sc.close();
    }
}
