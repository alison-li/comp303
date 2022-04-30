/**
 * Concrete Visitor
 */
public class SearchVisitor implements Visitor {
    String aSearchName;

    public SearchVisitor(String pSearchName) {
        aSearchName = pSearchName;
    }
    
    public void visit(File pFile) {
        if (pFile.getName().equals(aSearchName)) {
            System.out.println("File exists with name " + aSearchName);
        }
    }

    public void visit(Folder pFolder) {
        if (pFolder.getName().equals(aSearchName)) {
            System.out.println("Folder exists with name " + aSearchName);
        }
    }

    public void visit(Directory pDirectory) {
        if (pDirectory.getName().equals(aSearchName)) {
            System.out.println("Directory exists with name " + aSearchName);
        }
    }

    public void visit(HiddenDirectory pHiddenDirectory) {
        if (pHiddenDirectory.getName().equals(aSearchName)) {
            System.out.println("Hidden directory exists with name " + aSearchName);
        }
    }
}