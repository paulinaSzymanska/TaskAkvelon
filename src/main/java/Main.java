public class Main {
    public static void main(String[] args) {
        Animal human = new Human("Jack", 1000);
        Container glass = new Glass(500);
        DrinkingProcessView drinkingProcessView = new DrinkingProcessView();

        Controller controller1 = new Controller(human, glass, drinkingProcessView);

        controller1.updateView();
        controller1.drink(100);
        controller1.updateView();


        Animal cat = new Cat("Felix", 500);
        Container bowl = new Bowl(100);

        Controller controller2 = new Controller(cat, bowl, drinkingProcessView);
        controller2.updateView();
        controller2.drink(20);
        controller2.updateView();
    }
}
