package org.ismek.oop;

public class OopProgram {

	public static void main(String[] args) {
		
		Dukkan[] dukkanlar = new Dukkan[2];
		
		Calisan calisan = new Calisan();
		calisan.isim = "ŞAFAK TAŞKIN";
		calisan.maasKatSayisi = 5;
		calisan.yas = 19;
		calisan.gorevi = "ÇAYCI";
		calisan.ogrenimDurumu = EnumEgitimDurumu.ILKOKUL;
		
		CayOcagi cayOcagi = new CayOcagi();
		cayOcagi.setAd("ŞAFAK ÇAY OCAKLARI");
		cayOcagi.calisanSayisi = 1;
		cayOcagi.calisanlar[0] = calisan;
		cayOcagi.adres = "SABIHA GÖKÇEN HAVA ALANI";
		cayOcagi.kiralik = false;
		cayOcagi.metreKare = 3;
		cayOcagi.vergiNo = 12312312l;
		cayOcagi.cayParasi = 0.75f;
		dukkanlar[0] = cayOcagi;
		
		
		Urun urun = new Urun();
		urun.ad = "BUĞDAY EKMEĞİ";
		urun.fiyat = 1.75f;
		urun.gram = 200;
		
		Firin firin = new Firin();
		firin.setAd("ŞAFAK FIRINCILIK");
		firin.calisanSayisi = 1;
		firin.calisanlar[0] = calisan;
		firin.adres = "BEBEK SAHIL YOLU";
		firin.kiralik = true;
		firin.metreKare = 100;
		firin.vergiNo = 12312312l;
		firin.satilabilirUrunler[0] = urun;
		dukkanlar[1] = firin;
		
		for (Dukkan dukkan : dukkanlar) {
			if (dukkan instanceof Firin) {
				System.out.println("Bu bir fırındır");
			} else if (dukkan instanceof CayOcagi) {
				System.out.println("Bu bir çay ocağıdır");
			}
			dukkan.dukkanBilgileriniYazdir();
		}
		
		System.out.println(cayOcagi.getAd());
	}

}
