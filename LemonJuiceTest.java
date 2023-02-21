
public class LemeonJuiceTest {
	public static void main(String[] args) {
		
		Sugar1 s = new Sugar1(20,"high","white");
		Water w = new Water(10,"medium","white");
		Lemeon l = new Lemeon(2);
		Kitchen1 k = new Kitchen1();
		Juice juice = k.makejuice(s, w, l);
		System.out.println(juice);
		
		
				
		
	}

}
class Juice
{
	int quantity;
	String density;
	String flavour;
	public Juice(int quantity, String density, String flavour) {
		super();
		this.quantity = quantity;
		this.density = density;
		this.flavour = flavour;
	}
	@Override
	public String toString() {
		return "Juice [quantity=" + quantity + ", density=" + density + ", flavour=" + flavour + "]";
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDensity() {
		return density;
	}
	public void setDensity(String density) {
		this.density = density;
	}
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	
	
}

class Kitchen1
{
	Juice makejuice(Sugar1 x,Water y,Lemeon z)
	{
		System.out.println("lets start making juice");
		Juice juice = new Juice(10,"medium","sweet");
		return juice;
	}

}



class Sugar1
{
	int quantity;
	String density;
	String color;
	public Sugar1(int quantity, String density, String color) {
		super();
		this.quantity = quantity;
		this.density = density;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Sugar [quantity=" + quantity + ", density=" + density + ", color=" + color + "]";
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDensity() {
		return density;
	}
	public void setDensity(String density) {
		this.density = density;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
class Water
{
	int quantity;
	String density;
	String color;
	public Water(int quantity, String density, String color) {
		super();
		this.quantity = quantity;
		this.density = density;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Water [quantity=" + quantity + ", density=" + density + ", color=" + color + "]";
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDensity() {
		return density;
	}
	public void setDensity(String density) {
		this.density = density;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
class Lemeon
{
	int quantity;

	public Lemeon(int quantity) {
		super();
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Lemeon [quantity=" + quantity + "]";
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}

