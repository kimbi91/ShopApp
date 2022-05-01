package main.models.clothes;

public class Trousers extends Wearable{

    protected String materialType;

    public Trousers() {
    }

    public Trousers(double quantity, int price, String brand, Size size, Gender gender, String materialType) {
        super(quantity, price, brand, size, gender);
        this.materialType = materialType;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    @Override
    public String toString() {
        return "Trousers{" +
                "materialType='" + materialType + '\'' +
                ", brand='" + brand + '\'' +
                ", size=" + size +
                ", gender=" + gender +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
