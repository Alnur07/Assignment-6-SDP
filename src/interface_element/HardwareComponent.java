package interface_element;

import interface_visitor.HardwareVisitor;

public interface HardwareComponent {

    void accept(HardwareVisitor visitor);

}
