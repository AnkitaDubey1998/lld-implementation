package DesignPatterns.behavioural.StateDesignPattern.vendingMachine.state;

import DesignPatterns.behavioural.StateDesignPattern.vendingMachine.VendingMachine;

public class DispensingState implements MachineState {
    @Override
    public void selectItem(VendingMachine vendingMachine, String itemCode) {
        System.out.println("Please wait, dispensing in progress.");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, double amount) {
        System.out.println("Please wait, dispensing in progress.");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Already dispensing. Please wait.");
    }
}
