import java.util.ArrayList;

public class City {
    private String name;
    private ArrayList<Bussiness> businesses;

    public City(String name) {
        this.name = name;
        businesses = new ArrayList<>();
    }
    public void addBusiness(Bussiness b) throws BussinessAlreadyExistException
    {
        //if( !businesses.contains(b))
        if( getBusinessByLicenseNum( b.getLicenseNum()) ==null )
        {
            businesses.add(b);
        }
        else {
            throw new BussinessAlreadyExistException("Business already registered in this city");
        }
    }

    public Bussiness getBusinessByLicenseNum(int licenseNum)
    {
        for (Bussiness b :
                businesses) {
            if (b.getLicenseNum() == licenseNum)
            {
                return b;
            }
        }
        return null;
    }
    public double calcArnona()
    {
        double sum = 0;
        for (Bussiness b :
                businesses) {
            sum+=b.propertyTax();
        }
        return sum;
    }
    public double calcGarbagetax()
    {
        double sum = 0;
        for (Bussiness b :
                businesses) {
            if( b instanceof GarbageTax )
            {
                sum+=((GarbageTax) b).calcGarbageTax();
            }
        }
        return sum;
    }
    public double calcParkingTak()
    {
        double sum=0;
        for (Bussiness b :
                businesses) {
            if (b instanceof ParkingTax)
            {
                sum+=((ParkingTax) b).calcParkingTax();
            }
        }
        return sum;
    }
}
