import java.util.ArrayList;

/**
 * Concrete Visitable
 */
public class Folder extends AbstractFile {
    private ArrayList<File> aFiles;
    
    public Folder(String pName) {
        super(pName);
        aFiles = new ArrayList<>();
    }

    public void add(File pFile) {
        aFiles.add(pFile);
    }

    public void remove(File pFile) {
        aFiles.remove(pFile);
    }

    public void accept(Visitor pVisitor) {
        pVisitor.visit(this);
        for (File file : aFiles) {
            file.accept(pVisitor);
        }
    }
}