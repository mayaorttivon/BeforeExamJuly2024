public class Store extends Bussiness implements ParkingTax{
    public static final double ARNONA = 313;
    public static final double PARKING_TAX_PER_MONTH_FOR_CLOTHING = 300;
    public static final double PARKING_TAX_PER_MONTH = 500;
    public static final String[] MERCHANDISE_TYPES = {"Food", "Clothing", "Electronix"};
    public String merchandise;


    public Store(int licenseNum, String name, double surface, String merchandise) {
        super(licenseNum, name, surface);
        this.merchandise = merchandise;
        setArnonaPerMeter(ARNONA);
    }

    @Override
    public String toString() {
        return super.toString() + "Merchandise: " + merchandise;
    }

    @Override
    public double calcParkingTax() {
        if( merchandise.toUpperCase().equals("CLOTHING"))
        {
            return PARKING_TAX_PER_MONTH_FOR_CLOTHING;
        }
        else {
            return PARKING_TAX_PER_MONTH;
        }
    }
}
