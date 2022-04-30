import java.util.HashMap;

/**
 * Flyweight Pattern Demo
 * Requires:
 * Private constructor for Flyweight class
 * Private static data structure to hold Flyweight instances
 * Static factory method for returning Flyweight instances that match a given parameter
 */
public class Drink {
    private int sugarLevel = 0;
    private int iceLevel = 0;
    private boolean hasPearls = false;
    private boolean hasJelly = false;

    private Drink() {
        
    }

    private Drink(int pSugarLevel, int pIceLevel, boolean pPearls, boolean pJelly) {
        assert pSugarLevel <= 10 && pSugarLevel > 0 && pIceLevel <= 10 && pIceLevel > 0;
        
        sugarLevel = pSugarLevel;
        iceLevel = pIceLevel;
        hasPearls = pPearls;
        hasJelly = pJelly;
    }

    public int getSugarLevel() {
        return sugarLevel;
    }

    public int getIceLevel() {
        return iceLevel;
    }

    public boolean checkPearls() {
        return hasPearls;
    }

    public boolean checkJelly() {
        return hasJelly;
    }

    /**
     * Factory method for retrieving drinks as flyweight instances.
     */
    public static class DrinkFactory {
        private static HashMap<String, Drink> drinkCache = new HashMap<>();

        /**
         * Static block for initializing the drink cache
         */
        static {
            drinkCache.put("Regular Milk Tea", new Drink());
            drinkCache.put("Regular Bubble Tea", new Drink(10, 10, true, false));
            drinkCache.put("Regular Jelly Tea", new Drink(10, 10, false, true));
        }

        public static Drink getDrink(String drinkName) {
            Drink d = null;
            
            if (drinkCache.containsKey(drinkName)) {
                d = drinkCache.get(drinkName);
            } else {
                d = new Drink();
            }
            drinkCache.put(drinkName, d);

            return d;
        }
    }
}