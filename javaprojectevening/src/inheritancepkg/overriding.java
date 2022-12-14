package inheritancepkg;

class bank 
{
	int getrateofinterest()
	{
		return 0;
	}
}

class HNB extends bank //override
{
	int getrateofinterest()
	{
		return 15;
	}
}

class peoples extends bank //overriding
{
	int getrateofinterest()
	{
		return 22;
	}
}


class commercial extends bank //override
{
	int getrateofinterest() 
	{
		return 25;
	}
}


public class overriding {
	
	public static void main(String[] args) {
		
		HNB objHNB = new HNB();
		System.out.println(objHNB.getrateofinterest()); //15
		
		peoples objpeo = new peoples();
		System.out.println(objpeo.getrateofinterest()); //22
		
		commercial objcom = new commercial();
		System.out.println(objcom.getrateofinterest()); //25
		
		
	}

}
