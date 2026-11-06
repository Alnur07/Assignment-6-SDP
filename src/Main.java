import concrete_elements.CPU;
import concrete_elements.GPU;
import concrete_elements.RAM;
import concrete_elements.Storage;
import concrete_visitors.HardwareReportVisitor;
import concrete_visitors.PowerConsumptionVisitor;
import interface_element.HardwareComponent;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("   COMPUTER HARDWARE DIAGNOSTICS");
        System.out.println("====================================\n");

        // Create hardware components
        CPU cpu = new CPU(
                "AMD Ryzen 7 7800X3D",
                8,
                4.2,
                120
        );

        GPU gpu = new GPU(
                "NVIDIA RTX 5070 ti",
                16,
                300
        );

        RAM ram = new RAM(
                "Kingston Fury DDR5",
                32,
                6000,
                10
        );

        Storage storage = new Storage(
                "Samsung 990 PRO",
                "NVMe SSD",
                1000,
                5
        );

        // Create object structure
        List<HardwareComponent> components = new ArrayList<>();

        components.add(cpu);
        components.add(gpu);
        components.add(ram);
        components.add(storage);

        // First Visitor: Hardware Report
        System.out.println("========== HARDWARE REPORT ==========\n");

        HardwareReportVisitor reportVisitor =
                new HardwareReportVisitor();

        for (HardwareComponent component : components) {
            component.accept(reportVisitor);
        }

        // Second Visitor: Power Consumption
        System.out.println("======= POWER CONSUMPTION =======\n");

        PowerConsumptionVisitor powerVisitor =
                new PowerConsumptionVisitor();

        for (HardwareComponent component : components) {
            component.accept(powerVisitor);
        }

        System.out.println("\nTotal estimated power consumption: "
                + powerVisitor.getTotalPowerConsumption() + " W");

        System.out.println("\n====================================");
        System.out.println("       DIAGNOSTICS COMPLETED");
        System.out.println("====================================");
    }
}
