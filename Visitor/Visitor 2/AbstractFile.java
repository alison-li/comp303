/**
 * Super type of File, Folder, and Directory.
 * Plays the role of a node in the file system hierarchy.
 */
public abstract class AbstractFile implements IFile {
    private String aName;

    protected AbstractFile(String pName) {
        aName = pName;
    }

    public String getName() {
        return aName;
    }
}