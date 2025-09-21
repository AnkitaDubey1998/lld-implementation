package DesignPatterns.behavioural.CommandDesignPattern.commands;

import DesignPatterns.behavioural.CommandDesignPattern.receivers.Light;

public class TurnOffLightCommand implements Command {
    private final Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }
}
