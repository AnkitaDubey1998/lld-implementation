package DesignPatterns.structural.FacadeDesignPattern;

public class Main {
    public static void main(String[] args) {
        DeploymentFacade deploymentFacade = new DeploymentFacade();
        // Deploy to production
        deploymentFacade.deployApplication("main", "prod.server.example.com");
    }
}
