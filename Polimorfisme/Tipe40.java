import java.util.Scanner;
class Tipe40 extends Tipe {
	void tampil40() {
		bb=550000;
		System.out.println("Biaya Beban = Rp.550.000");
		System.out.print("Masukkan Jumlah Meteran Pemakaian = ");
		jmp = masukan.nextInt();
		tot = jmp * bb;
		System.out.println("Total harga = " +tot);
		System.out.print("Masukkan Bayaran = ");
		bayar = masukan.nextInt();
		kembalian = bayar-tot; 
	}
}