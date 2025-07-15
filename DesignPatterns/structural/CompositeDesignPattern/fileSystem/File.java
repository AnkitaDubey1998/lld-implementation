package DesignPatterns.structural.CompositeDesignPattern.fileSystem;

public class File implements FileSystemItem {
    private String fileName;
    private int size;

    public File(String fileName, int size) {
        this.size = size;
        this.fileName = fileName;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void printStructure(String indent) {
        System.out.println(indent + "- " + fileName + " (" + size + " KB)");
    }

    @Override
    public void delete() {
        System.out.println("Deleting file: " + fileName);
    }
}
