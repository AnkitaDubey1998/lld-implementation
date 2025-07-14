package DesignPatterns.structural.FacadeDesignPattern.deployment;

public class BuildSystem {

    public boolean compileProject() {
        System.out.println("BuildSystem: Compiling project...");
        simulateDelay();
        System.out.println("BuildSystem: Build successful.");
        return true;
    }

    public String getArtifactPath() {
        String path = "target/myapplication-1.0.jar";
        System.out.println("BuildSystem: Artifact located at " + path);
        return path;
    }

    private void simulateDelay() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
