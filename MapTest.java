/**
 * File : MapTest.java 31/06/2023
 * Nama : Ahmad Alvin Griffin
 * NIM  : 24060121140106
 * Deskripsi : Implementasi lambda pada Map, digunakan sebagai parameter pada method.
 */

import java.util.*;

public class MapTest {
	public static void main(String[] args) {
		Map<String,String> mahasiswa = new HashMap<>();
		mahasiswa.put("24060121130058", "Agustina Mita Amalia");
		mahasiswa.forEach((nim, nama)->System.out.println("NIM: " + nim + ", Nama Mahasiswa: " + nama));
	}
}