public class Hall extends Bussiness implements GarbageTax{
    public static final double ARNONA = 574;
    public static final double GARBAGE_TAX_PER_MONTH_PER_METER = 33;
    private int capacity;

    public Hall(int licenseNum, String name, double surface, int capacity) {
        super(licenseNum, name, surface);
        this.capacity = capacity;
        setArnonaPerMeter(ARNONA);
    }

    @Override
    public String toString() {
        return "Hall{" + super.toString() +
                "capacity=" + capacity +
                '}';
    }

    @Override
    public double calcGarbageTax() {
        return getSurface()* GARBAGE_TAX_PER_MONTH_PER_METER;
    }
}
