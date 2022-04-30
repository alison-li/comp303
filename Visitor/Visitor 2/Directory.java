import java.util.ArrayList;

/**
 * Concrete Visitable
 */
public class Directory extends AbstractFile {
    private ArrayList<AbstractFile> aContents;

    public Directory(String pName) {
        super(pName);
        aContents = new ArrayList<>();
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