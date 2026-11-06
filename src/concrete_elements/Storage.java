package concrete_elements;

import interface_element.HardwareComponent;
import interface_visitor.HardwareVisitor;

public class Storage implements HardwareComponent {

    private String model;
    private String type;
    private int capacity;
    private int powerConsumption;

    public Storage(String model, String type, int capacity, int powerConsumption) {

        this.model = model;
        this.type = type;
        this.capacity = capacity;
        this.powerConsumption = powerConsumption;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    @Override
    public void accept(HardwareVisitor visitor) {
        visitor.visitStorage(this);
    }
}
