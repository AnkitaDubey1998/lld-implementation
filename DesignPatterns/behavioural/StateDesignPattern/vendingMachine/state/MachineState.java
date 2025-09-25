package DesignPatterns.behavioural.StateDesignPattern.vendingMachine.state;

import DesignPatterns.behavioural.StateDesignPattern.vendingMachine.VendingMachine;

public interface MachineState {
    void selectItem(VendingMachine vendingMachine, String itemCode);
    void insertCoin(VendingMachine vendingMachine, double amount);
    void dispenseItem(VendingMachine vendingMachine);
}
