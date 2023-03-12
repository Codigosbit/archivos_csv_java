
import java.util.Scanner;  
import java.util.*;
import java.io.*;

public class Registros {
public static void main(String[] args) throws FileNotFoundException, IOException {

		System.out.println("************************************");	
		System.out.println("***********REGISTROS****************");
		System.out.println("************************************");
		Scanner sc = new Scanner(System.in);  
           String nombre;
           int n=0;
		       String opcion="s";
           System.out.println("****************************************");
           File archivo = new File("notajava.csv");
		   FileWriter fw=new FileWriter(archivo);
		   BufferedWriter bw=new BufferedWriter(fw);
		
		   while(opcion.equals("s")){			
			
			System.out.print("Introduzca el registro: ");       
			nombre = sc.nextLine();  //leer un String
			System.out.println("--------------------");
			System.out.println((Integer.toString(n++))+"| " + nombre + "|");
			System.out.println("--------------------");
			System.out.println("Desea realizar otro registro ¿s/n? ");
			System.out.println("--------------------");
			opcion = sc.nextLine();

           	bw.write(""+nombre+'\n');
           

			if(opcion.equals("s")){
				System.out.println("........Escribe el nuevo registro.........");
			}else{
				System.out.println("Salir");
				bw.close();
			}
		   }
		   System.out.println("****************************************");
	}

}
