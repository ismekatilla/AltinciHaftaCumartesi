package org.ismek.oop;

// Pass By Reference
// https://stackoverflow.com/questions/373419/whats-the-difference-between-passing-by-reference-vs-passing-by-value
public class ProgramDegisken {

	public static void main(String[] args) {
		
		int degisken = 1;
		test(degisken);
		System.out.println(degisken);
		
		Calisan calisan = new Calisan();
		calisan.yas = 3;
		calisanYasiGuncelle(calisan);
		System.out.println(calisan.yas);
		
		Integer integerDeger = 1;
		test2(integerDeger);
		System.out.println(integerDeger);
	}
	
	private static void test2(Integer integerDeger) {
		integerDeger++;
	}

	public static void test(int degisken) {
		degisken = degisken + 1;
		System.out.println(degisken);
	}
	
	public static void calisanYasiGuncelle(Calisan calisan) {
		calisan.yas = calisan.yas + 1;
	}
}