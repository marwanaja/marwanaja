package motor;

public class motor {
    protected int type, unit;
    protected String brand;

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
