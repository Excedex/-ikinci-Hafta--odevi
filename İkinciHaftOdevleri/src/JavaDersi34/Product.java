package JavaDersi34;

public class Product {
	
	// product i�in new olu�turup classa eri�ti�imizde yap�c� blok da(constructor ) da �al���r.
	public Product(int _id,String _name,String Description,Double _price,int _stockAmount,String _Renk) {
		System.out.println("Yap�c� blok �al��t�");
		this._id=_id;
		this._Description=_Description;
		this._name=_name;
		this._Price=_Price;
		this._stockAmount=_stockAmount;
		this._Renk=_Renk;
		
		
	}
	//product parantez i�i bo� olursa �arts�z �al���r newlerken doldurmak gerekmez
	//ama product i�i yukardaki gibi doldurulursa newlerken doldurma �art� aran�r. aksi taktirde �al��maz
	public Product() {
		System.out.println("Yap�c� blok �al��t�");
		
	}

	//attributes veya fields
	private int _id;
	private String _name;
	private String _Description;
	private Double _Price;
	private int _stockAmount;
	private String _Renk;
	private String _kod;
	
	public String get_kod() {
		return this._name.substring(0,1)+_id;
	}
	
	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_Description() {
		return _Description;
	}

	public void set_Description(String _Description) {
		this._Description = _Description;
	}

	public Double get_Price() {
		return _Price;
	}

	public void set_Price(Double _Price) {
		this._Price = _Price;
	}

	public int get_stockAmount() {
		return _stockAmount;
	}

	public void set_stockAmount(int _stockAmount) {
		this._stockAmount = _stockAmount;
	}

	public String get_Renk() {
		return _Renk;
	}

	public void set_Renk(String _Renk) {
		this._Renk = _Renk;
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		 _id=id;
	}
	
}
