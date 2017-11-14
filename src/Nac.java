
public class Nac extends Na{
	int y ;
	
	public Nac() {
		super(2);
		y = 20 ;
	}

	public void show() {
		super.show();
		System.out.println("y =" + y);
	}
	
	public void sum() {
		System.out.println(x + "+" + y + "=" + (x+y));
		
	}
}
