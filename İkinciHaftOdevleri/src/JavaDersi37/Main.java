package JavaDersi37;

public class Main {

	public static void main(String[] args) {
	
	/*
	  OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
	  ogretmenKrediManager.hesapla();
	*/
	KrediUi krediUi=new KrediUi();
	krediUi.KrediHesapla(new OgretmenKrediManager());
	krediUi.KrediHesapla(new TarımKrediManager());
	}
}
