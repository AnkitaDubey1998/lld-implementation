package DesignPatterns.behavioural.CommandDesignPattern.invoker;

import DesignPatterns.behavioural.CommandDesignPattern.commands.Command;

import java.util.Stack;

public class SmartButton {
    private Command currentCommand;
    private final Stack<Command> history = new Stack<>();

    public void setCommand(Command command) {
        this.currentCommand = command;
    }

    public void pressButton() {
        if(currentCommand != null) {
            currentCommand.execute();
            history.push(currentCommand);
        } else {
            System.out.println("Command not assigned");
        }
    }

    public void undoLast() {
        if(!history.isEmpty()) {
            Command lastCommand = history.pop();
            lastCommand.undo();
        } else {
            System.out.println("Nothing to undo");
        }
    }
}
