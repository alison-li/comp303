/**
 * Visitor
 */
public interface Visitor {
    // Overloaded method
    public void visit(File pFile);
	public void visit(Folder pFolder);
    public void visit(Directory pDirectory);
    public void visit(HiddenDirectory pHiddenDirectory);
}
