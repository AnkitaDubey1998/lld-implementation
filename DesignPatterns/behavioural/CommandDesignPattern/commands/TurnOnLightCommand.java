package DesignPatterns.behavioural.CommandDesignPattern.commands;

import DesignPatterns.behavioural.CommandDesignPattern.receivers.Light;

public class TurnOnLightCommand implements Command {
    private final Light light;

    public TurnOnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}
