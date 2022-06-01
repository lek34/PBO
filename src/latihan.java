import java.util.Scanner;

class LimasSegiEmpat {
	float alas;
	float tinggi;
	float luasalas;
	float volume;
	
	void hitungVolume() {
		luasalas=alas*alas;
		volume = (1.0f/3)*(luasalas)*tinggi;
	}
}


public class latihan {
	
	public static void main(String[] args) {
		
		LimasSegiEmpat limas = new LimasSegiEmpat();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan alas = ");
		limas.alas=scanner.nextFloat();
		System.out.print("Masukkan tinggi = ");
		limas.tinggi=scanner.nextFloat();
		limas.hitungVolume();
		System.out.println("Hasil Perhitungan Volume Limas = "+limas.volume);
	}

}