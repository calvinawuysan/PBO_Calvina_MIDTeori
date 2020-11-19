import java.util.Scanner;
class B extends A {
	void tampil1() {
	System.out.print("Pilihan = ");
	pilihan = masukan.nextInt();
	if (pilihan == 31) {
		bb=100000;
		System.out.println("Biaya Beban = Rp.100.000");
		System.out.print("Masukkan Jumlah Meteran Pemakaian = ");
		jmp = masukan.nextInt();
		tot = jmp * bb;
		System.out.println("Total harga = " +tot);
		System.out.print("Masukkan Bayaran = ");
		bayar = masukan.nextInt();
		kembalian = bayar-tot;
	}
	else
	if (pilihan == 32) {
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
	else
	if (pilihan == 33) {
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
	else
	if (pilihan == 34) {
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
	else
	if (pilihan == 35) {
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
	else
	if (pilihan == 40) {
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
	else {
		System.out.println("Pilihan anda salah!!! silahkan masukkan pilihan yang benar");
		}
	
	}
}