import java.util.Calendar;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Molecule mol1 = new Molecule();
        mol1.addAtom(new Element("Hydrogen", 1,"H", 1.01), 2);
        mol1.addAtom(new Element("Oxygen", 8, "O", 16));
        System.out.println(mol1);
        Molecule mol2 = new Molecule();
        mol2.addAtom(new Element("Carbon", 6, "C", 12.01), 6);
        mol2.addAtom(new Element("Hydrogen", 1, "H", 1.01), 12);
        mol2.addAtom(new Element("Oxygen", 8, "O", 16), 6);
        System.out.println(mol2);
        System.out.println(mol2.atoms());
        }
    }
