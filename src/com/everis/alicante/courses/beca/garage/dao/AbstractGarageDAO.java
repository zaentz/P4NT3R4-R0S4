package com.everis.alicante.courses.beca.garage.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public abstract class AbstractGarageDAO {

	class LeeFichero {

		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		{

			try {

				archivo = new File("C:\\development\\archivo.txt");
				fr = new FileReader(archivo);
				br = new BufferedReader(fr);

				String linea;
				while ((linea = br.readLine()) != null)
					System.out.println(linea);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {

				try {
					if (null != fr) {
						fr.close();
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}

		}

		public class EscribeFichero {

			FileWriter fichero = null;
			PrintWriter pw = null;
			{
				try {
					fichero = new FileWriter("C:\\development\\archivo.txt");
					pw = new PrintWriter(archivo);

					for (int i = 0; i < 10; i++)
						pw.println("Linea " + i);

				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {

						if (null != fichero)
							fichero.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
			}
		}
	}
}
/*import java.io.File;
import java.util.Scanner;

public class LecturaFicheros {

	public static void main(String[] args) {

		// Fichero del que queremos leer
		File fichero = new File("fichero_leer.txt");
		Scanner s = null;

		try {
			// Leemos el contenido del fichero
			System.out.println("... Leemos el contenido del fichero ...");
			s = new Scanner(fichero);

			// Leemos linea a linea el fichero
			while (s.hasNextLine()) {
				String linea = s.nextLine(); 	// Guardamos la linea en un String
				System.out.println(linea);      // Imprimimos la linea
			}

		} catch (Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} finally {
			// Cerramos el fichero tanto si la lectura ha sido correcta o no
			try {
				if (s != null)
					s.close();
			} catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}
	}
}
import java.io.FileWriter;

public class EscrituraFicheros {

	public static void main(String[] args) {

		String[] lineas = { "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "..." };

		 FORMA 1 DE ESCRITURA 
		FileWriter fichero = null;
		try {

			fichero = new FileWriter("fichero_escritura.txt");

			// Escribimos linea a linea en el fichero
			for (String linea : lineas) {
				fichero.write(linea + "\n");
			}

			fichero.close();

		} catch (Exception ex) {
			System.out.println("Mensaje de la excepción: " + ex.getMessage());
		}
	}
}*/
