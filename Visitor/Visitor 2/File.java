/**
 * Concrete Visitable
 */
public class File extends AbstractFile {
    
    public File(String pName) {
        super(pName);
    }

    public void accept(Visitor pVisitor) {
        pVisitor.visit(this);
    }
}