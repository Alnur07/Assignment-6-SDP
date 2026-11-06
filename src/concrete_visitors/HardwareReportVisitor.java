package concrete_visitors;

import concrete_elements.CPU;
import concrete_elements.GPU;
import concrete_elements.RAM;
import concrete_elements.Storage;
import interface_visitor.HardwareVisitor;

public class HardwareReportVisitor implements HardwareVisitor {

    @Override
    public void visitCPU(CPU cpu) {
        System.out.println("CPU:");
        System.out.println(" Model: " + cpu.getModel());
        System.out.println(" Cores: " + cpu.getCores());
        System.out.println(" Clock Speed: " + cpu.getClockSpeed() + " GHz");
        System.out.println();
    }

    @Override
    public void visitGPU(GPU gpu) {
        System.out.println("GPU:");
        System.out.println(" Model: " + gpu.getModel());
        System.out.println(" VRAM: " + gpu.getVram() + " GB");
        System.out.println();
    }

    @Override
    public void visitRAM(RAM ram) {
        System.out.println("RAM:");
        System.out.println(" Model: " + ram.getModel());
        System.out.println(" Capacity:" + ram.getCapacity() + " GB");
        System.out.println(" Frequency: " + ram.getFrequency() + " Mhz");
        System.out.println();
    }

    @Override
    public void visitStorage(Storage storage) {
        System.out.println("Storage:");
        System.out.println(" Model: " + storage.getModel());
        System.out.println(" Type: " + storage.getType());
        System.out.println(" Capacity: " + storage.getCapacity() + " GB");
        System.out.println();
    }
}
