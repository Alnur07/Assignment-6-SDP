package interface_visitor;

import concrete_elements.CPU;

public interface HardwareVisitor {

    void visitCPU(CPU cpu);

    void visitGPU(GPU gpu);

    void visitRAM(RAM ram);

    void visitStorage(Storage storage);

}
