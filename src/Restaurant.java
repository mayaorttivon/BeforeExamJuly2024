public class Restaurant extends Bussiness implements GarbageTax, ParkingTax{
    public static final double ARNONA = 412;
    public static final double GARBAGE_TAX_PER_MONTH = 250;
    public static final double PARKING_TAX_PER_MONTH = 700;

    private boolean isKosher;
    private String openingHours;

    public Restaurant(int licenseNum, String name, double surface, boolean isKosher, String openingHours) {
        super(licenseNum, name, surface);
        this.isKosher = isKosher;
        this.openingHours = openingHours;
        setArnonaPerMeter(ARNONA);
    }

    @Override
    public String toString() {
        return super.toString() + (isKosher?"Kosher ":"Not Kosher ") + "Opening Hours: " + openingHours;
    }

    @Override
    public double calcGarbageTax() {
        return GARBAGE_TAX_PER_MONTH;
    }

    @Override
    public double calcParkingTax() {
        return PARKING_TAX_PER_MONTH;
    }
}
