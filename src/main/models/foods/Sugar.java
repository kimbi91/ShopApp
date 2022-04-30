package main.models.foods;

public class Sugar extends Food {

    private boolean isBrown;

    public Sugar() {
        super(1.0, "kilo", false, 100);
    }

    public Sugar(double quantity, int price) {
        super(quantity, "kilo", price);
    }

    public Sugar(double quantity, String unitType, int price) {
        super(quantity, unitType, price);
    }

    public Sugar(double quantity, String unitType, boolean isLongLife, int price, boolean isBrown) {
        super(quantity, unitType, isLongLife, price);
        this.isBrown = isBrown;
    }

    public boolean isBrown() {
        return isBrown;
    }

    public void setBrown(boolean brown) {
        isBrown = brown;
    }

}
