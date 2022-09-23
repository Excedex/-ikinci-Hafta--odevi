
public class JavaDersi24 {

	public static void main(String[] args) {
		
		sayiBulmaca();

		
	}
	// method isimleri camel casing yazýlýr
	public static void sayiBulmaca() {
		int sayilar[]=new int[] {1,2,5,7,9,0};
		int aranacak=6;
		boolean varMi=false;
		/*
		 * 
		 * mesaj="";
		 *  gibi düþünülebilir boþ methoda eþitliyor bu method 
		 *  daha sonra yazdýrma iþlemi boþ methotta gerçekleþiyor.
		 */
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
			varMi=true;
			break;
			
			}
		}
		if(varMi) {
			mesajVer("Sayý Mevcuttur: "+aranacak);
		}
		else
			mesajVer("Sayý Mevcut Deðildir: "+aranacak);
		
	}
	//parametreli method oldu.
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
		
	}

}
