package Principal;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Array_bidimension {

	public static void main(String [] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		double decimal;
		char letra;
		String cadena;
		float flotante;
		
		numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese una cadena de String"));
		decimal=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero Double"));
		flotante=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el dato de tipo float"));
		cadena=JOptionPane.showInputDialog("Ingrese la cedena de String");
		letra=JOptionPane.showInputDialog("Ingrese el caracter").charAt(0);
		
		JOptionPane.showMessageDialog(null, "Este es para sacar datos");;
		
		int [][] matrix=new int[4][5];
		
		matrix[0][0]=15;
		matrix[0][1]=21;
		matrix[0][2]=18;
		matrix[0][3]=9;
		matrix[0][4]=15;
		
		matrix[1][0]=10;
		matrix[1][1]=52;
		matrix[1][2]=17;
		matrix[1][3]=19;
		matrix[1][4]=7;
		
		matrix[2][0]=19;
		matrix[2][1]=2;
		matrix[2][2]=19;
		matrix[2][3]=17;
		matrix[2][4]=7;
		
		matrix[3][0]=92;
		matrix[3][1]=13;
		matrix[3][2]=13;
		matrix[3][3]=32;
		matrix[3][4]=41;
		
		//Si deseamos visualizar uno de manra manual lo indicamos con un Syste.ou.println
		
		System.out.println("el valor almacenado en el item 2,3 es " + matrix[2][3]);
		
		//Ahora vamos añidar dos bucles for para recorrer la matrix en las 2 dimensiones y verla en consola
		
		for(int i =0; i<4; i++) {
			
			System.out.println("");
			
			for( int j=0; j<5; j++) {
				
				System.out.println(" el valor almacenado en la posicion "+i+","+j+ " es = "+matrix [i][j]);
			}
		}
		
		//tambien podemos definir un array de manera corta y mostrarla en pantalla
		
		int [][]  matrix2= {
							{10,15,18,19,21},
							{5,25,37,41,15},
							{7,19,32,14,90},
							{85,2,7,40,27}
		};
		
		for(int x=0; x<4; x++) {
			
			System.out.println("");
			
			for(int y=0; y<5; y++) {
				System.out.println("le valor almacenado en la posicion "+x+","+y+ " es = " +matrix2[x][y]);
			}
		}
		
		//tambien podemos recorrer un array de dos dimensiones con un bucle simplificado for each
		
		for(int [] fila:matrix2){
			
			System.out.println();
			
			for(int z: fila) {
				
				System.out.print(z +" ");
			}
		}
	}
}
