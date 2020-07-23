import java.util.Scanner;
//El usuario debe ingresar un número n, 
// el cual indicará el dibujo que se debe mostrar
public class PatronesAnidados {

	public static void main(String[] args) {
		int num=0;
		Scanner sc = new Scanner(System.in);
		cuadrado(sc, num);
		zeta(sc, num);
		equis(sc, num);
		torre(sc, num);
		
	}//cierre main
	
	// /////////////////////////// PATRÓN 1 (cuadrado vacío de ancho n)
	private static void cuadrado(Scanner sc, int nro) {
		System.out.print("Ingrese un número: ");
		nro = sc.nextInt();
		String cadena="";
		if (nro>0) {
			for (int i=0; i<nro; i++) {
				for (int j=0; j<nro; j++) {
						if( ((i>=1) && (i<(nro-1)) ) && (  (j>=1) && (j<(nro-1)) )) {// el i y el j están entre 1 y n-1
							cadena=" ";
						}
						else cadena="*";
						System.out.print(cadena);
				}
				System.out.println("");
			}
		}
	}// cierre cuadrado
	
	// /////////////////////////// PATRÓN 2 (Z de ancho n)
	private static void zeta(Scanner sc1, int nro1) {
		System.out.print("Ingrese un número: ");
		nro1 = sc1.nextInt();
		if (nro1 > 1) {
			//Linea inicial                                                                                                                                                                                                                                                   :
			for (int i=0; i<nro1; i++) {
					System.out.print("*");	
			}
			System.out.println("");
			//cuerpo del cuadrado
			for (int i=1; i<nro1-1; i++) {
				for (int j=1; j<nro1; j++) {
					if (j!=(nro1-i)) {
					System.out.print(" ");//el guión equivale a no imprimir
					}
					else System.out.print("*");
				}
				System.out.println("");
			}
			//Linea final:
			for (int k=0; k<nro1; k++) {
				System.out.print("*");	
			}
		}
		else if (nro1==1)// si ingresa un 1, se debe imprimir sólo un asterisco
			System.out.println("*");
		else 
			System.out.println("Ingrese un número mayor a cero!!");
	}// cierre zeta
	
	// ///////////////////////////PATRÓN 3 (X de ancho n)
	private static void equis(Scanner sc2, int nro2) {
		System.out.println(" ");
		System.out.print("Ingrese un número: ");
		nro2 = sc2.nextInt();
		if (nro2 > 1) {	
			//cuerpo del cuadrado //
			for (int i=0; i<nro2; i++) {
				for (int j=0; j<nro2; j++) {
					if (  (i==j) ) {//diagonal principal
					System.out.print("x");
					}				
					else if (  (j==(nro2-1)-i) || (  ( i == (nro2-(j+1)) ) && (j==nro2-i) ) ) {//diagonal secundaria
						System.out.print("x");//el # equivale a diagonal secundaria
						}
					else System.out.print(" ");//el guión equivale a no imprimir
				}
				System.out.println("");
			}
		}
		else if (nro2==1)// si ingresa un 1, se debe imprimir sólo un asterisco
			System.out.println("x");
		else 
			System.out.println("Ingrese un número mayor a cero!!");
	}// cierre equis

	// ///////////////////////////PATRÓN 4 (torre inclinada)
	private static void torre(Scanner sc3, int nro3) {
		//Imprimir un cuadrado con #
		System.out.print("Ingrese un número: ");
		nro3 = sc3.nextInt();
		String cadena="";
		
		if (nro3>0) {
			for (int i=0; i<nro3; i++) {
				for (int j=0; j<nro3; j++) {
						if( ((i>=1) && (i<(nro3-1)) ) && (  (j>=1) &&  j<(nro3-1)  )) {// el i y el j están entre 1 y n-1
								cadena="*";
						} 				
						else {
							if (i==0 && j<nro3-1) {
								cadena="*";
							}
							else {
								if (i==nro3-1 && j>=1)  {
									cadena="*";
								}
								else
									cadena=" ";// - guión para ver los espacios
							}
						}
						System.out.print(cadena); 
				}
						System.out.println("");
			}
		}
	}// cierre torre

}// cierre class
