package concrete_elements;

import interface_element.HardwareComponent;
import interface_visitor.HardwareVisitor;

public class GPU implements HardwareComponent {
    private String model;
    private int vram;
    private int powerConsumption;

    public GPU(String model, int vram, int powerConsumption) {
        this.model = model;
        this.vram = vram;
        this.powerConsumption = powerConsumption;
    }

    public String getModel() {
        return model;
    }

    public int getVram() {
        return vram;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    @Override
    public void accept(HardwareVisitor visitor) {
        visitor.visitGPU(this);
    }




}
