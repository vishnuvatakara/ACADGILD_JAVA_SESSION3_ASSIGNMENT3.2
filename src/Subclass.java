
public class Subclass extends Myclass //subclass extends parent class
{	int value1,value2;
	int num=10;
	public Subclass()//subclass default constructor
	{	super("callig paremetraisde parent constructor");
		System.out.println("child constructor");
		
	}
	//subclass paremetraised constructors
	public Subclass(int value1,int value2)
	{
		this.value1=value1;
		this.value2=value2;
		System.out.println("section2========== this keyword use");
		System.out.println(value1);
		System.out.println(value2);
	}
	public Subclass(int value1) {
		this(value1,5);
	}
	public void dispaly() {
		System.out.printf("without super keyword num value "+num);
		System.out.print("\nwith super keyword num value "+super.num);
		
	}	

public static void main(String args[])
{
	Subclass sub=new Subclass();//overriding
	sub.dispaly();
	
	Subclass obj=new Subclass(8);//overriding
}
}