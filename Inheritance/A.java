import java.util.Scanner;
class A {
	Scanner masukan = new Scanner(System.in);
	int pilihan,jmp;
	int bb;
	String nama;
	int tot, bayar, kembalian;
	
	void tampil() {
		System.out.print("Masukkan Nama = ");
		nama = masukan.nextLine();
	
		System.out.println("Tipe Rumah:");
		System.out.println("31. Rp.100.000");
		System.out.println("32. Rp.125.000");
		System.out.println("33. Rp.450.000");
		System.out.println("34. Rp.480.000");
		System.out.println("35. Rp.500.000");
		System.out.println("40. Rp.550.000");
	}
}