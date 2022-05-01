package main.models.textils;

public class Curtain extends Textil{

    protected String materialType;

    public Curtain() {
    }

    public Curtain(double quantity, int price, int with, int lenght, boolean isDecorated, String materialType) {
        super(quantity, price, with, lenght, isDecorated);
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
        return "Curtain{" +
                "quantity=" + quantity +
                ", price=" + price +
                ", materialType='" + materialType + '\'' +
                ", with=" + with +
                ", lenght=" + lenght +
                ", isDecorated=" + isDecorated +
                '}';
    }
}
