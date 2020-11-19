import java.util.Scanner;
class Tipe32 extends Tipe {
	void tampil32() {
		bb=125000;
		System.out.println("Biaya Beban = Rp.125.000");
		System.out.print("Masukkan Jumlah Meteran Pemakaian = ");
		jmp = masukan.nextInt();
		tot = jmp * bb;
		System.out.println("Total harga = " +tot);
		System.out.print("Masukkan Bayaran = ");
		bayar = masukan.nextInt();
		kembalian = bayar-tot;
	}
}