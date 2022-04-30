import java.util.ArrayList;

/**
 * Extend the file system class hierarchy to include a HiddenDirectory class 
 * that is a subclass of Directory.
 */
public class HiddenDirectory extends Directory {
    private ArrayList<AbstractFile> aContents;

    public HiddenDirectory(String pName) {
        super(pName);
        aContents = new ArrayList<>();
    }

    @Override
    public String getName() {
        return "~" + super.getName();
    }

    public void add(AbstractFile pAbstractFile) {
        aContents.add(pAbstractFile);
    }

    public void remove(AbstractFile pAbstractFile) {
        aContents.remove(pAbstractFile);
    }

    public void accept(Visitor pVisitor) {
        pVisitor.visit(this);
        for (AbstractFile abstractFile : aContents) {
            abstractFile.accept(pVisitor);
        }
    }
}