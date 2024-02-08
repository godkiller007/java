class akashg 
{
	static int a=10;
	public void add()
	{
		System.out.println("this: "+this.a);

	}
	public static void main(String[] args) 
	{
		akashg ref=new akashg();
		System.out.println(ref);
        ref.add();
		System.out.println(akashg.a);
		System.out.println("Hello World!");
	}
}
