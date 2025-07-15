package DesignPatterns.structural.CompositeDesignPattern.fileSystem;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemItem{

    private String folderName;
    private List<FileSystemItem> children = new ArrayList<>();

    public Folder(String folderName) {
        this.folderName = folderName;
    }

    public void addItem(FileSystemItem fileSystemItem) {
        children.add(fileSystemItem);
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for(FileSystemItem item : children) {
            totalSize += item.getSize();
        }
        return totalSize;
    }

    @Override
    public void printStructure(String indent) {
        System.out.println(indent + "+ " + folderName + "/");
        for (FileSystemItem item : children) {
            item.printStructure(indent + "  ");
        }
    }

    @Override
    public void delete() {
        for (FileSystemItem item : children) {
            item.delete();
        }
        System.out.println("Deleting folder: " + folderName);
    }
}
