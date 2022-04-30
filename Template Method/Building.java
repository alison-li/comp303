/**
 * Abstract Class or Template
 */
public abstract class Building {
    protected boolean isPublicWork = false;
    
    // Template method
    public final void constructBuilding() {
        constructFoundation();
        constructWalls();
        constructWindows();
        if (isPublicWork) {
            System.out.println("This building is property of the State Government. Please treat kindly.");
        }
    }

    // Methods to be implemented by subclasses
    public abstract void constructFoundation();
    public abstract void constructWalls();
    public abstract void constructWindows();

    // Hook, which subclasses can choose to override
    public void setPublicWork() { 
        isPublicWork = true;
    }
}