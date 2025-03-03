import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Ajutor ajutor=new Ajutor();
		Test test=new Test();
		while(true)
		{
			System.out.println("Optiuni: 1)hello 2)info 3)num 4)exit");
			String input=scanner.nextLine();
			switch(input)
			{
				case "hello":ajutor.afisare();
						  break;
				case "info":ajutor.info();
			    		break;
				case "num":System.out.println("num: "+test.getRng(5));
							break;
				case "exit": scanner.close();
							 System.exit(0);
				default: System.out.println("retry");
			}
		}
		
		
	}

}
