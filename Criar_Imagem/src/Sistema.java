import java.util.Scanner;


public class Sistema {

	public Sistema() {
		// TODO Auto-generated constructor stub
	}

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cmd="";
		Scanner scan = new Scanner(System.in);
			
		do {
			cmd = scan.next().toLowerCase();	
			switch (cmd){
				case "fim":
					System.exit(0);				
				case "imagem":
					int h = scan.nextInt();
					int w = scan.nextInt();
					String cor = scan.next();
					Imagem img = new Imagem();
					img.criarImagem(h, w, cor);
				case "reta":
					int a = scan.nextInt();
					int b = scan.nextInt();
					int x = scan.nextInt();
					int y = scan.nextInt();
					Reta square = new Reta();
					Ponto p0 = new Ponto(a, b);
					Ponto p1 = new Ponto(x, y);
					square.setVertices(p0, p1);
					//square.draw(c);
					break;
						
				case "circulo":
					/*int a = scan.nextInt();
					int b = scan.nextInt();
					int r = scan.nextInt();*/
					Circulo circle = new Circulo();
					
				case "Triangulo":
					/*int a = scan.nextInt();
					int b = scan.nextInt();
					int p = scan.nextInt();
					int q = scan.nextInt();
					int x = scan.nextInt();
					int y = scan.nextInt();*/
					Triangulo triangle = new Triangulo();
				case "Retangulo":
					/*int a = scan.nextInt();
					int b = scan.nextInt();
					int x = scan.nextInt();
					int y = scan.nextInt();*/
					Retangulo rectangle = new Retangulo();
				case "cor":
					while (scan.hasNextInt()) {
						int r = scan.nextInt();
						
						System.out.printf("%s",r);
					}
				
					Cor c = new Cor();
					
			}
					
					
			/*public void tratarCmdImagem(){
						
			int h = scan.nextInt();
			int w = scan.nextInt();
			String cor = scan.next();
			Imagem img = new Imagem(h,w,cor);
			}*/
					
					
				
				
		} while (scan.hasNext());
				
	}

}
