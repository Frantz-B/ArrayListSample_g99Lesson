public class LiteSwitch{
	public static void main(String[] args){
		int iOption = 4;
		//Using Switch Block
		switch(iOption){
			case 2:
			System.out.println("Number chosen was Two");
			break;

			case 4:
			System.out.println("Number chosen was Four");
			break;

			default:
			System.out.println("Selection chosen did not options given");
			break;
			//G99 - In case the break is not provided, it will execute the matching conditions as well as the default condition. 
			//Your logic will go haywire if that occurs.
		}
	}
}