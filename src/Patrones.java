import java.util.Scanner;

public class Patrones {

	public static void main(String[] args) {
		int num=0;
		Scanner sc = new Scanner(System.in);
		asteriscoPunto(sc, num);
		unoACuatro(sc, num);
		barBarAsterisco(sc, num);
		
	}// cierre main
		
		// PATRÓN 1: *.*.*.*.*.*.*
		private static void asteriscoPunto(Scanner sc, int nro) {
			System.out.print("Ingrese un número: ");
			nro = sc.nextInt();
			if (nro>0) {
				for (int i=0; i< nro; i++) {
					if(i%2==0) {
						System.out.print("*");
					}
					else 
						System.out.print(".");
				}
			}
			else
				System.out.println("Ingrese un número mayor a cero!");
		}// cierre asteriscoPunto
		
		// PATRÓN 2: 12341234
		private static void unoACuatro(Scanner sc1, int nro1) {
			int entero=1;
			System.out.print("Ingrese un número: ");
			nro1 = sc1.nextInt();
			if (nro1>0) {
				for (int i=0; i<nro1; i++) {
						if (entero<=4) {
						System.out.print(entero);
						}
						else {
							entero=1;
							System.out.print(entero);
						}
					entero+=1;
				}
			}
			else
				System.out.println("Ingrese un número mayor a cero!");
		}// cierre unoACuatro
		
		// PATRÓN 3: ||*||*||*||*
		private static void barBarAsterisco(Scanner sc2, int nro2){
			System.out.print("Ingrese un número: ");
			nro2 = sc2.nextInt();
			if (nro2>0) {
				for (int i=1; i<= nro2; i++) {
					if(i%3==0) {
						System.out.print("*");
					}
					else 
						System.out.print("|");
				}
			}
			else
				System.out.println("Ingrese un número mayor a cero!");
		}
		
}// cierre class
