package org.ismek.oop;

public class CayOcagi extends Dukkan implements Uretebilir {

	float cayParasi;
	
	@Override
	public void uretir() {
		System.out.println("Bir SU Bardağı çay koy");
		System.out.println("SUYU KAYNAT");
		System.out.println("KAYNAYINCA DEMLE");
		System.out.println("ÇAY HAZIR");
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
		System.out.println("ÇAY PARASI = " + cayParasi);
		WriterUtils.baslikYazdir("ÇALIŞANLAR");
		for (Calisan calisan : calisanlar) {
			System.out.println(calisan.isim);
		}
		
		WriterUtils.ayracYazdir();
	}
	
	@Override
	public String getAd() {
		// TODO Auto-generated method stub
		return "Çay Ocağı " + super.getAd();
	}
}
