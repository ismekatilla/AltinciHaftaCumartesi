package org.ismek.oop;

public class Firin extends Dukkan implements Uretebilir {

	Urun[] satilabilirUrunler = new Urun[1];
	
	void ekmekSatar() {
		
	}
	
	void hamurKaristirir() {
		System.out.println("Hamur karıştırıldı");
	}

	@Override
	public void uretir() {
		hamurKaristirir();
		System.out.println("SUYU EKLE");
		System.out.println("FIRINA AT");
		System.out.println("PİŞİNCE EKMEK HAZIR");
	}

	@Override
	float getMaasSabiti() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	void dukkanBilgileriniYazdir() {
		WriterUtils.baslikYazdir(getAd());
		System.out.println("DÜKKAN ADI = " + getAd());
		System.out.println("DÜKKAN VERGİ NO = " + vergiNo);
		System.out.println("DÜKKAN ADRES = " + adres);
		System.out.println("DÜKKAN METREKARE = " + metreKare);
		System.out.println("DÜKKAN ÇALIŞAN SAYISI = " + calisanSayisi);
		System.out.println("DÜKKAN KİRALIK MI = " + kiralik);
		WriterUtils.baslikYazdir("ÇALIŞANLAR");
		for (Calisan calisan : calisanlar) {
			System.out.println(calisan.isim);
		}
		
		WriterUtils.baslikYazdir("SATILABİLİR ÜRÜNLER");
		for (Urun urun : satilabilirUrunler) {
			System.out.println(urun.ad);
		}
		
		WriterUtils.ayracYazdir();
	}
	
	
}
