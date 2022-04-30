/**
 * Product or Concrete Prototype
 */
public class OolongTea implements Tea {
    @Override
    public Tea clone() {
        Tea oTea = null;
        
        try {
            oTea = (OolongTea) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Failed to clone the Oolong Tea");
        }

        return oTea;
    }
}