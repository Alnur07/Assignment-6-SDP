package interface_visitor;

import concrete_elements.CPU;
import concrete_elements.GPU;
import concrete_elements.RAM;
import concrete_elements.Storage;

public interface HardwareVisitor {

    void visitCPU(CPU cpu);

    void visitGPU(GPU gpu);

    void visitRAM(RAM ram);

    void visitStorage(Storage storage);

}
