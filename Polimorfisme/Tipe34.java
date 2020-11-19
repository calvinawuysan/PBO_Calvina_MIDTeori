import java.util.Scanner;
class Tipe34 extends Tipe {
	void tampil34() {
		bb=480000;
		System.out.println("Biaya Beban = Rp.480.000");
		System.out.print("Masukkan Jumlah Meteran Pemakaian = ");
		jmp = masukan.nextInt();
		tot = jmp * bb;
		System.out.println("Total harga = " +tot);
		System.out.print("Masukkan Bayaran = ");
		bayar = masukan.nextInt();
		kembalian = bayar-tot;
	}
}