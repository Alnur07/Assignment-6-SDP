package concrete_elements;

import interface_element.HardwareComponent;
import interface_visitor.HardwareVisitor;

public class CPU implements HardwareComponent {

    private String model;
    private int cores;
    private double clockSpeed;
    private int powerConsumption;

    public CPU(String model, int cores, double clockSpeed, int powerConsumption) {
        this.model = model;
        this.cores = cores;
        this.clockSpeed = clockSpeed;
        this.powerConsumption = powerConsumption;
    }

    public String getModel() {
        return model;
    }

    public int getCores() {
        return cores;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    @Override
    public void accept(HardwareVisitor visitor) {
        visitor.visitCPU(this);
    }


}
