public class DrinkTest {
    public static void main(String[] args) {
        Drink myDrink = Drink.DrinkFactory.getDrink("Regular Bubble Tea");
        System.out.println(myDrink.getSugarLevel()); 
        System.out.println(myDrink.getIceLevel()); 
        System.out.println(myDrink.checkPearls()); 
        System.out.println(myDrink.checkJelly()); 
    }
}