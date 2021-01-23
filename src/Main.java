import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantas medias ponderadas deseja realizar:");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
		System.out.println("Entre com as notas dos 3 testes (p1, p2 e p3) respectivamente:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double medPond = ((a*2) + (b*3) + (c*5)) / 10;
		System.out.printf("%.1f\n",medPond);
		}
		sc.close();
	}

}
