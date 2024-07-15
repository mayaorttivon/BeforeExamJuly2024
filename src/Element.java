public class Element {
    private String element;
    private int atomicNum;
    private String sym;
    private double weight;

    @Override
    public String toString() {
        return "Element{" +
                "element='" + element + '\'' +
                ", atomicNum=" + atomicNum +
                ", sym='" + sym + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getElement() {
        return element;
    }

    public int getAtomicNum() {
        return atomicNum;
    }

    public String getSym() {
        return sym;
    }

    public double getWeight() {
        return weight;
    }

    public Element(String element, int atomicNum, String sym, double weight) {
        this.element = element;
        this.atomicNum = atomicNum;
        this.sym = sym;
        this.weight = weight;
    }
}
