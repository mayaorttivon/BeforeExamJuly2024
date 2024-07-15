import java.util.ArrayList;

public class Molecule {
    ArrayList<Element> elements;

    public Molecule() {
        elements = new ArrayList<Element>();
    }
    public void addAtom(Element element, int num)
    {
        for(int i=0;i<num;i++)
        {
            elements.add(element);
        }
    }
    public void addAtom(Element element)
    {
        addAtom(element,1);
    }
    public  ArrayList<Element> atoms()
    {
        ArrayList<Element> atoms = new ArrayList<>();
        for (Element e :
                elements) {
            if (!atoms.contains(e))
            {
                atoms.add(e);
            }
        }
        return atoms;
    }
    public double weight()
    {
        double weight=0;
        for (Element e :
                elements) {
            weight += e.getWeight();
        }
        return weight;
    }

    @Override
    public String toString() {
        int count=0;
        Element prev = null;
        String str="";
        for (Element e :
                elements) {
            if (prev == null || e.getSym().equals(prev.getSym())) {
                count++;

            } else {
                str += prev.getSym() + (count != 1 ? count : "");
                count = 1;
            }
            prev = e;
        }
        //add last
        str += prev.getSym() + (count != 1 ? count : "");
        return str;
    }
}
