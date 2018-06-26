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
					fichero = new FileWriter("c:/prueba.txt");
					pw = new PrintWriter(fichero);

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
