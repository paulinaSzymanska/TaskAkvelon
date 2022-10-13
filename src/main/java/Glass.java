public class Glass implements Container {
    private int currentAmountInMl;

    public Glass(int milliliters) {
        if (milliliters < 0) {
            throw new IllegalArgumentException("Glass volume cannot be negative");
        }
        this.currentAmountInMl = milliliters;
    }

    public int getCurrentAmountInMl() {
        return currentAmountInMl;
    }

    @Override
    public void decreaseAmount(int millilitres) {
        if (millilitres > this.currentAmountInMl) {
            throw new IllegalArgumentException("Not enough liquid");
        }
        if (millilitres < 0) {
            throw new IllegalArgumentException("Amount can not be negative");
        }
        this.currentAmountInMl -= millilitres;
    }

    @Override
    public String getDrinkingDetails() {
        return String.format("Container type: %s, left amount: %s ", Glass.class.getName(), currentAmountInMl);
    }

}
