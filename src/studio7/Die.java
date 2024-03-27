package studio7;

public class Die {
	
	private int n;
	public Die (int n){
		this.n = n;
	}
	public int Roll () {
		return (int) (Math.random() * (this.n - 1) + 1);
	}
	public static void main(String[] args) {
		Die d1 = new Die (7);
		System.out.print(d1.Roll());
		

	}

}
