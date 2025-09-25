package DesignPatterns.behavioural.StateDesignPattern.vendingMachine.state;

import DesignPatterns.behavioural.StateDesignPattern.vendingMachine.VendingMachine;

public class HasMoneyState  implements MachineState {
    @Override
    public void selectItem(VendingMachine vendingMachine, String itemCode) {
        System.out.println("Cannot change item after inserting money.");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, double amount) {
        System.out.println("Money already inserted.");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Dispensing item: " + vendingMachine.getSelectedItem());
        vendingMachine.setState(new DispensingState());

        // Simulate dispensing
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Item dispensed successfully.");
        vendingMachine.resetMachine();
    }
}
