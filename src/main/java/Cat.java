public class Cat implements Animal {
    private final String name;
    private int drunkAmountInMl;

    public Cat(String name, int startAmount) {
        if (startAmount < 0) {
            throw new IllegalArgumentException("Start amount can not be negative");
        }
        this.name = name;
        this.drunkAmountInMl = startAmount;
    }

    public int getDrunkAmountInMl() {
        return drunkAmountInMl;
    }

    @Override
    public String getDrinkingDetails() {
        return String.format("Animal type: %s, name: %s, drunk amount: %s ", Cat.class.getName(), name, drunkAmountInMl);
    }

    @Override
    public void drink(int amountInMl) {
        if (amountInMl < 0) {
            throw new IllegalArgumentException("Amount can not be negative");
        }
        this.drunkAmountInMl += amountInMl;
    }
}
