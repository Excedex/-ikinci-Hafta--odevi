
public class JavaDersi25 {

	public static void main(String[] args) {
		
		String mesaj="Bugun hava �ok g�zel.";
		String yeniMesaj=mesaj.substring(0,2);
		int sayi=topla(5,7);
		System.out.println(sayi);
	}
	
	public static void ekle() {
	
		System.out.println("Eklendi");
		
	}
	public static void sil() {
		System.out.println("Silindi");	
		
		
	}
	public static void guncelle() {
		System.out.println("G�ncellendi");
		
	}
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
		
	}
}
