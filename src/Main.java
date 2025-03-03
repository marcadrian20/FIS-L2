import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Ajutor ajutor=new Ajutor();
		while(true)
		{
			System.out.println("Optiuni: 1)afisare 2)info 3)exit");
			String input=scanner.nextLine();
			switch(input)
			{
				case "afisare":ajutor.afisare();
						  break;
				case "info":ajutor.info();
			    		break;
				case "exit": System.exit(0);
				default: System.out.println("retry");
			}
		}
		
		
	}

}
