
public class Product {
	String name;
	double price;
	Product(String name,double price){
		this.name=name;
		this.price=price;
	}
	void display() {
		System.out.println("Name:" + name);
		System.out.println("Price:"+ price);
	}

}
 class Electronic extends Product{
	String Brand;
	int warrenty;
	Electronic(String name,double price,String Brand,int warrenty){
		super(name,price);
		
		this.Brand=Brand;
		this.warrenty=warrenty;
	}
	void display() {
		super.display();
		System.out.println("Brand:"+ Brand);
		System.out.println("Warrenty:"+warrenty);
	}
	
}
 class Cloth extends Product{
	 String size;
	 String material;
	 Cloth(String name,double price,String size,String material)
	 {
		 super(name,price);
		 
		 this.size=size;
		 this.material=material;
		 
	 }
	 void display() {
			super.display();
			System.out.println("size:"+size);
			System.out.println("material:"+material);
		}
	 
 }
 
