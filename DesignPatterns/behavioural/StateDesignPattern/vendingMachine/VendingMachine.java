package DesignPatterns.behavioural.StateDesignPattern.vendingMachine;

import DesignPatterns.behavioural.StateDesignPattern.vendingMachine.state.IdleState;
import DesignPatterns.behavioural.StateDesignPattern.vendingMachine.state.MachineState;

public class VendingMachine {
    private MachineState currentState;
    private String selectedItem;
    private double insertedAmount;

    public VendingMachine() {
        this.currentState = new IdleState();
    }

    public void setState(MachineState state) {
        this.currentState = state;
    }

    public void setSelectedItem(String itemCode) {
        this.selectedItem = itemCode;
    }

    public String getSelectedItem() {
        return selectedItem;
    }

    public void setInsertedAmount(double amount) {
        this.insertedAmount = amount;
    }

    public void selectItem(String itemCode) {
        currentState.selectItem(this, itemCode);
    }

    public void insertCoin(double amount) {
        currentState.insertCoin(this, amount);
    }

    public void dispenseItem() {
        currentState.dispenseItem(this);
    }

    public void resetMachine() {
        this.currentState = new IdleState();
        this.selectedItem = "";
        this.insertedAmount = 0.0;
    }


}
