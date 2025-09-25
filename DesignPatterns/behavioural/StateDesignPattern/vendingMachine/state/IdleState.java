package DesignPatterns.behavioural.StateDesignPattern.vendingMachine.state;

import DesignPatterns.behavioural.StateDesignPattern.vendingMachine.VendingMachine;

public class IdleState implements MachineState {
    @Override
    public void selectItem(VendingMachine vendingMachine, String itemCode) {
        System.out.println("Item selected : " + itemCode);
        vendingMachine.setSelectedItem(itemCode);
        vendingMachine.setState(new ItemSelectedState());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, double amount) {
        System.out.println("Please select an item before inserting coins.");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("No item selected. Nothing to dispense.");
    }
}
