import java.util.Scanner;
class Tipe33 extends Tipe {
	void tampil33() {
		bb = 450000;
		System.out.println("Biaya Beban = Rp.450.000");
		System.out.print("Masukkan Jumlah Meteran Pemakaian = ");
		jmp = masukan.nextInt();
		tot = jmp * bb;
		System.out.println("Total harga = " +tot);
		System.out.print("Masukkan Bayaran = ");
		bayar = masukan.nextInt();
		kembalian = bayar-tot;
	}
}