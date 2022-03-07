package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleviReader extends Readeable{
    public EleviReader(String file) throws FileNotFoundException {
        super(file);
    }

    @Override
    public List<Aplicant> readAplicants() throws FileNotFoundException {

        super.scanner.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (super.scanner.hasNext()) {
            Elev elev = new Elev();
            readAplicant(super.scanner,elev);
            elev.setClasa(super.scanner.nextInt());
            elev.setTutore(super.scanner.next());
            elevi.add(elev);
        }

        super.scanner.close();
        return elevi;
    }
}
