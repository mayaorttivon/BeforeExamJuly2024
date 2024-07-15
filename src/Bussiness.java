public abstract class Bussiness {
    private int licenseNum;
    private String name;
    private double surface;

    private double arnonaPerMeter;

    public Bussiness(int licenseNum, String name, double surface) {
        this.licenseNum = licenseNum;
        this.name = name;
        this.surface = surface;
    }

    @Override
    public String toString() {
        return "License Num: " + licenseNum + "Name: " + name + "Surface: " + surface;
    }

    @Override
    public boolean equals(Object obj) {
        return licenseNum==((Bussiness)obj).licenseNum;
    }
    //this can also be done by abstract method
    //public abstract double propertyTax();
    public double propertyTax() {
        return getSurface()*arnonaPerMeter;
    }

    public double getSurface() {
        return surface;
    }

    public void setArnonaPerMeter(double arnonaPerMeter) {
        this.arnonaPerMeter = arnonaPerMeter;
    }

    public int getLicenseNum() {
        return licenseNum;
    }

}
