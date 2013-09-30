import java.util.Scanner;


public class Sistema {

	public Sistema() {
		// TODO Auto-generated constructor stub
	}

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cmd="";
		
		do {
			
			Scanner scan = new Scanner(System.in);
			System.out.print("C:\\ ");
			cmd = scan.next();
			
			
			if (cmd.equalsIgnoreCase("image")) {
				
				Imagem img = new Imagem();
				int h = scan.nextInt();
				int w = scan.nextInt();
				String cor = scan.next();
				
				
			} else if (cmd.equalsIgnoreCase("reta")) {
				Reta reta = new Reta();
				int a = scan.nextInt();
				int b = scan.nextInt();
				int x = scan.nextInt();
				int y = scan.nextInt();
				
			} else if (cmd.equalsIgnoreCase("Circulo")) {
				
			} else if (cmd.equalsIgnoreCase("Triangulo")) {
				
			} else {
				cmd = "FIM";
			}			
		
		
		} while (!cmd.equalsIgnoreCase("FIM"));
			
			
			
			
		
	}

}
