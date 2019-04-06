package org.ismek.exception;

public class MyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String hataKodu;
	private String hataMesaji;

	public MyException(String hataKodu, String hataMesaji) {
		this.hataKodu = hataKodu;
		this.hataMesaji = hataMesaji;
	}
	
	public String getHataKodu() {
		return hataKodu;
	}

	public void setHataKodu(String hataKodu) {
		this.hataKodu = hataKodu;
	}

	public String getHataMesaji() {
		return hataMesaji;
	}

	public void setHataMesaji(String hataMesaji) {
		this.hataMesaji = hataMesaji;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return hataKodu + " " + hataMesaji;
	}
}