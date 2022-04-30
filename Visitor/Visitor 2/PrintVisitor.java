/**
 * Concrete Visitor
 */
public class PrintVisitor implements Visitor {
    public void visit(File pFile) {
        System.out.println("File Name: " + pFile.getName());
    }

    public void visit(Folder pFolder) {
        System.out.println("Folder Name: " + pFolder.getName());
    }

    public void visit(Directory pDirectory) {
        System.out.println("Directory Name: " + pDirectory.getName());
    }

    public void visit(HiddenDirectory pHiddenDirectory) {
        System.out.println("Directory Name: " + pHiddenDirectory.getName());
    }
}