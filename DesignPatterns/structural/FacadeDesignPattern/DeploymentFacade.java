package DesignPatterns.structural.FacadeDesignPattern;

import DesignPatterns.structural.FacadeDesignPattern.deployment.BuildSystem;
import DesignPatterns.structural.FacadeDesignPattern.deployment.Deployment;
import DesignPatterns.structural.FacadeDesignPattern.deployment.TestFramework;
import DesignPatterns.structural.FacadeDesignPattern.deployment.VersionControlSystem;

public class DeploymentFacade {

    private VersionControlSystem vcs = new VersionControlSystem();
    private BuildSystem buildSystem = new BuildSystem();
    private TestFramework testingFramework = new TestFramework();
    private Deployment deploymentTarget = new Deployment();

    public boolean deployApplication(String branch, String serverAddress) {
        System.out.println("\nFACADE: --- Initiating FULL DEPLOYMENT for branch: " + branch + " to " + serverAddress + " ---");
        boolean success = true;
        try {
            vcs.pullLatestChanges(branch);
            if (!buildSystem.compileProject()) {
                System.err.println("Build compilation failed.");
                return false;
            }
            String artifactPath = buildSystem.getArtifactPath();

            if (!testingFramework.runUnitTests()) {
                System.err.println("Unit tests failed.");
                return false;
            }
            if (!testingFramework.runIntegrationTests()) {
                System.err.println("Integration tests failed.");
                return false;
            }

            deploymentTarget.transferArtifact(artifactPath, serverAddress);
            deploymentTarget.activateNewVersion(serverAddress);
            System.out.println("FACADE: APPLICATION DEPLOYED SUCCESSFULLY TO " + serverAddress + "!");
        } catch (Exception e) {
            System.err.println("FACADE: DEPLOYMENT FAILED - An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
            success = false;
        }
        return success;
    }


    public boolean deployHotfix(String branch, String serverAddress) {
        System.out.println("\nFACADE: --- Initiating HOTFIX DEPLOYMENT for branch: " + branch + " to " + serverAddress + " ---");
        boolean success = true;
        try {
            vcs.pullLatestChanges(branch);
            if (!buildSystem.compileProject()) {
                System.err.println("FACADE: HOTFIX FAILED - Build compilation failed.");
                return false;
            }
            String artifactPath = buildSystem.getArtifactPath();

            System.out.println("FACADE: Skipping full test suite for hotfix deployment (or running minimal smoke tests).");
            // if (!testingFramework.runSmokeTests()) { return false; } // Example

            deploymentTarget.transferArtifact(artifactPath, serverAddress);
            deploymentTarget.activateNewVersion(serverAddress);

            System.out.println("FACADE: HOTFIX DEPLOYED SUCCESSFULLY TO " + serverAddress + "!");
        } catch (Exception e) {
            System.err.println("FACADE: HOTFIX FAILED - An unexpected error occurred: " + e.getMessage());
            success = false;
        }
        return success;
    }
}
