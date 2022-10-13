public class Controller {
    private final Animal animal;
    private final Container container;
    private final DrinkingProcessView drinkingProcessView;

    public Controller(Animal animal, Container container, DrinkingProcessView drinkingProcessView) {
        this.animal = animal;
        this.container = container;
        this.drinkingProcessView = drinkingProcessView;
    }

    public void updateView() {
        drinkingProcessView.printDrinkingProcess(animal.getDrinkingDetails(), container.getDrinkingDetails());
    }

    public void drink(int amountInMl) {
        animal.drink(amountInMl);
        container.decreaseAmount(amountInMl);
    }
}
