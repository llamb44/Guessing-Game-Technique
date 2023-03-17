public class Summation
{
	private int n;
	
	public Summation(int nValue)
	{
		this.n = nValue;
	}
	
	public int addition()
	{
		int total = 0;
		for(int i =n; i > 0; i--)
		{
			total = total+i;
		}
		return total;
	}
	
}
