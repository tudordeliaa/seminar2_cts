package clase;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;

		try {
			Readeable angajatiReader = new AngajatiReader("angajati.txt");
			listaAngajati = angajatiReader.readAplicants();
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString()); //liskov
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
