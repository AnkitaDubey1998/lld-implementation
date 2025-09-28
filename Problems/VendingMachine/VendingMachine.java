package Problems.VendingMachine;

import Problems.VendingMachine.machineState.IdleStateVending;
import Problems.VendingMachine.machineState.VendingMachineState;

import java.util.HashMap;

public class VendingMachine {
    private static volatile VendingMachine instance;
    private HashMap<String, Item> inventory;
    private VendingMachineState currentState;
    private Item selectedItem;

    private VendingMachine() {
        this.inventory = new HashMap<>();
        this.currentState = new IdleStateVending();
    }

    public static VendingMachine getInstance() {
        if(instance == null) {
            synchronized (VendingMachine.class) {
                if(instance == null) {
                    instance = new VendingMachine();
                }
            }
        }
        return instance;
    }

    public void setState(VendingMachineState state) {
        this.currentState = state;
    }

    public void addItem(Item item) {
        inventory.put(item.getItemCode(), item);
    }

    public void selectItem(String itemCode) {
        currentState.selectItem(this, itemCode);
        setSelectedItem(itemCode);
    }

    private void setSelectedItem(String selectedItem) {
        this.selectedItem = inventory.get(selectedItem);
    }

    public Item getSelectedItem() {
        return this.selectedItem;
    }

    public void reduceQuantity(String itemCode) {
        Item item = inventory.get(itemCode);
        if(item == null) {
            System.out.println("Item " + itemCode + " doesn't exists in inventory");
        } else {
            if(item.getItemQuantity() == 1) {
                System.out.println("Item : " + itemCode + " is OUT OF STOCK");
                inventory.remove(itemCode);
            } else {
                item.setItemQuantity(item.getItemQuantity() - 1);
            }
        }
    }

    public void resetMachine() {
        this.currentState = new IdleStateVending();
        this.selectedItem = null;
    }
}
