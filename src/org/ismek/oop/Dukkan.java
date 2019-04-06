package org.ismek.oop;

public abstract class Dukkan {
	
	private String ad;
	Long vergiNo;
	String adres;
	int metreKare;
	int calisanSayisi;
	Calisan[] calisanlar = new Calisan[1];
	boolean kiralik;
	
	float toplamMaasHesapla() {
		
		float toplamMaas = 0;
		for (Calisan calisan : calisanlar) {
			float maasSabiti = getMaasSabiti();
			toplamMaas = toplamMaas + (maasSabiti * calisan.maasKatSayisi);
		}
		return toplamMaas;
	}
	
	abstract float getMaasSabiti();
	
	void dukkanBilgileriniYazdir() {
		WriterUtils.baslikYazdir(ad);
		System.out.println("DÜKKAN ADI = " + ad);
		System.out.println("DÜKKAN VERGİ NO = " + vergiNo);
		System.out.println("DÜKKAN ADRES = " + adres);
		System.out.println("DÜKKAN METREKARE = " + metreKare);
		System.out.println("DÜKKAN ÇALIŞAN SAYISI = " + calisanSayisi);
		System.out.println("DÜKKAN KİRALIK MI = " + kiralik);
		WriterUtils.baslikYazdir("ÇALIŞANLAR");
		for (Calisan calisan : calisanlar) {
			System.out.println(calisan.isim);
		}
		
		WriterUtils.ayracYazdir();
	};
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
}