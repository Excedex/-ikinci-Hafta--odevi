
public class JavaDersi26 {

	public static void main(String[] args) {
		
		String mesaj="Bugun hava çok güzel.";
		String yeniMesaj=mesaj.substring(0,2);
		int sayi=topla(5,7);
		System.out.println(sayi);
		int toplarr=topla2(2,3,4,36,65,85);
		System.out.println(toplarr);
	}
	
	public static void ekle() {
	
		System.out.println("Eklendi");
		
	}
	public static void sil() {
		System.out.println("Silindi");	
		
		
	}
	public static void guncelle() {
		System.out.println("Güncellendi");
		
	}
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
		
	}
	// variable arguement yapýyoruz birden fazla sayinin kullanýlmasý için
	//integer array gibi iþlem görüyor.
	public static int topla2(int... sayilar) {
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}
	
	
}
