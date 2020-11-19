import java.util.Scanner;
class Tipe35 extends Tipe {
	void tampil35() {
		bb=500000;
		System.out.println("Biaya Beban = Rp.500.000");
		System.out.print("Masukkan Jumlah Meteran Pemakaian = ");
		jmp = masukan.nextInt();
		tot = jmp * bb;
		System.out.println("Total harga = " +tot);
		System.out.print("Masukkan Bayaran = ");
		bayar = masukan.nextInt();
		kembalian = bayar-tot;
	}
}