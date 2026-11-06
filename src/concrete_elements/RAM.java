package concrete_elements;

import interface_element.HardwareComponent;
import interface_visitor.HardwareVisitor;

public class RAM implements HardwareComponent {

    private String model;
    private int capacity;
    private int frequency;
    private int powerConsumption;

    public RAM(String model, int capacity, int frequency, int powerConsumption) {
        this.model = model;
        this.capacity = capacity;
        this.frequency = frequency;
        this.powerConsumption = powerConsumption;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    @Override
    public void accept(HardwareVisitor visitor){
        visitor.visitRAM(this);
    }

}
