
public class JavaDersi24 {

	public static void main(String[] args) {
		
		sayiBulmaca();

		
	}
	// method isimleri camel casing yaz�l�r
	public static void sayiBulmaca() {
		int sayilar[]=new int[] {1,2,5,7,9,0};
		int aranacak=6;
		boolean varMi=false;
		/*
		 * 
		 * mesaj="";
		 *  gibi d���n�lebilir bo� methoda e�itliyor bu method 
		 *  daha sonra yazd�rma i�lemi bo� methotta ger�ekle�iyor.
		 */
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
			varMi=true;
			break;
			
			}
		}
		if(varMi) {
			mesajVer("Say� Mevcuttur: "+aranacak);
		}
		else
			mesajVer("Say� Mevcut De�ildir: "+aranacak);
		
	}
	//parametreli method oldu.
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
		
	}

}
