package concrete_visitors;

import concrete_elements.CPU;
import concrete_elements.GPU;
import concrete_elements.RAM;
import concrete_elements.Storage;
import interface_visitor.HardwareVisitor;

public class PowerConsumptionVisitor implements HardwareVisitor {

    private int totalPowerConsumption = 0;

    @Override
    public void visitCPU(CPU cpu) {
        int power = cpu.getPowerConsumption();
        totalPowerConsumption += power;

        System.out.println("CPU power consumption: " + power + " W");
    }

    @Override
    public void visitGPU(GPU gpu) {
        int power = gpu.getPowerConsumption();
        totalPowerConsumption += power;

        System.out.println("GPU power consumption: " + power + " W");

    }

    @Override
    public void visitRAM(RAM ram) {
        int power = ram.getPowerConsumption();
        totalPowerConsumption += power;

        System.out.println("RAM power consumption: " + power + " W");
    }

    @Override
    public void visitStorage(Storage storage) {
        int power = storage.getPowerConsumption();
        totalPowerConsumption += power;

        System.out.println("Storage power consuption: " + power + " W");
    }

    public int getTotalPowerConsumption() {
        return totalPowerConsumption;
    }

}
