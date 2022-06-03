import java.util.Scanner;


public class bangunRuang {
	
	public static void bersihkanlayar(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
	
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		char y ;
		do { 
		
		System.out.println("Aplikasi Bangun Ruang : ");
		System.out.println("1. Kubus");
		System.out.println("2. Lingkaran");
		System.out.println("3. Limas");
		System.out.println("4. Bola");
		System.out.println("5. Segitiga");
		System.out.println("6. Keluar");
		
		System.out.print("Pilih menu : ");
		int pilihan = scanner.nextInt();
		
		if(pilihan==1) {
			System.out.print("Masukkan sisi kubus = ");
			int sisi = scanner.nextInt();
			int Volume = sisi*sisi*sisi;
			System.out.println("Hasil Volume Kubus = "+Volume);	
		}
		if(pilihan==2) {
			final float Pi = 22.0f/7;
			System.out.print("Masukkan jari - jari = ");
			int jari = scanner.nextInt();
			float Volume = (1f/2)*Pi*(jari*jari);
			System.out.println("Hasil Volume Lingkaran = "+Volume);	
		}
		if(pilihan==3) {
			System.out.print("Masukkan alas = ");
			int alas=scanner.nextInt();
			System.out.print("Masukkan tinggi = ");
			int tinggi=scanner.nextInt();
			float Volume = 1.0f/2*(alas*alas)*tinggi;
			System.out.println("Hasil Perhitungan Volume Limas = "+Volume);	
		}
		if(pilihan==4) {
			final float Pi = 22.0f/7;
			System.out.print("Masukkan jari - jari = ");
			int jari = scanner.nextInt();
			float Volume = (4f/3)*Pi*(jari*jari*jari);
			System.out.println("Hasil Volume Bola = "+ Volume);	
		}
		if(pilihan==5) {
			System.out.print("Masukkan alas = ");
			int alas=scanner.nextInt();
			System.out.print("Masukkan tinggi = ");
			int tinggi=scanner.nextInt();
			float Volume = 1.0f/2*(alas*tinggi);
			System.out.println("Hasil Perhitungan Luas Segitiga = "+Volume);	
		}
		if(pilihan==6) {
			break;
		}
			System.out.println("Apakah Anda Ingin Keluar Ke Menu Utama ?");
			y = scanner.next().charAt(0);
			bersihkanlayar();
			
		} 
			while(y=='y');
			
		
		
	}
		
		
		/*
		 Aplikasi Bangun Ruang 
		 1. Kubus
		 2. Lingkaran
		 3. Limas
		 4. Keluar
		 Pilihan Anda (1/2/3/4) :
		 Apakah anda ingin kembali ke menu utama (y/n)?
		 percabangan untuk 1,2,3,4
		 while  => bungkus code untuk mengulang ke perintah pertama?
		 //cetak menu
		 //terima input pilihan 1,2,3,4
		 //percabangan
		 //terima input yes or no
		 //perulangan
		 */

		
		
	}