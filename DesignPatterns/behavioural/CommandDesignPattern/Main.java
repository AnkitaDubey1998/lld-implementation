package DesignPatterns.behavioural.CommandDesignPattern;

import DesignPatterns.behavioural.CommandDesignPattern.commands.Command;
import DesignPatterns.behavioural.CommandDesignPattern.commands.SetTemperatureCommand;
import DesignPatterns.behavioural.CommandDesignPattern.commands.TurnOffLightCommand;
import DesignPatterns.behavioural.CommandDesignPattern.commands.TurnOnLightCommand;
import DesignPatterns.behavioural.CommandDesignPattern.invoker.SmartButton;
import DesignPatterns.behavioural.CommandDesignPattern.receivers.Light;
import DesignPatterns.behavioural.CommandDesignPattern.receivers.Thermostat;

public class Main {
    public static void main(String[] args) {
        // Receivers
        Light light = new Light();
        Thermostat thermostat = new Thermostat();

        // Invoker
        SmartButton smartButton = new SmartButton();

        // Commands
        Command turnOnLightCommand = new TurnOnLightCommand(light);
        Command turnOffLightCommand = new TurnOffLightCommand(light);
        Command setTemperatureCommand = new SetTemperatureCommand(thermostat, 22);

        // Simulation
        System.out.println("Setting TURN ON LIGHT Command");
        smartButton.setCommand(turnOnLightCommand);
        smartButton.pressButton();

        System.out.println("\nSetting SET TEMPERATURE Command");
        smartButton.setCommand(setTemperatureCommand);
        smartButton.pressButton();

        System.out.println("\nSetting TURN OFF LIGHT Command");
        smartButton.setCommand(turnOffLightCommand);
        smartButton.pressButton();

        System.out.println("\nUndo last action");
        smartButton.undoLast();

        System.out.println("\nUndo again");
        smartButton.undoLast();

        System.out.println("\nUndo again");
        smartButton.undoLast();

        System.out.println("\nUndo once more");
        smartButton.undoLast();
    }
}
