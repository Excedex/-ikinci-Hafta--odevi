
public class JavaDersi29 {

	public static void main(String[] args) {
		//Java Dersi 29 : �ok �nemli - De�er ve Referans Tipleri Anlamak

		JavaDersi27CustomerManager javaDersi27CustomerManager=new JavaDersi27CustomerManager();
		JavaDersi27CustomerManager javaDersi27CustomerManager2=new JavaDersi27CustomerManager();
		
		javaDersi27CustomerManager.Add();
		javaDersi27CustomerManager.Remove();
		javaDersi27CustomerManager.Update();
		
		int sayi1=10;
		int sayi2=20;
		sayi2=sayi1;
		sayi1=30;
		System.out.println(sayi2);
		
		int sayilar1 []=new int[] {1,2,3};
		int sayilar2 []=new int[] {4,5,6};
	
		sayilar2=sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);
		
		
	}

}
