# Computer Hardware Diagnostics System

## Project Overview

Computer Hardware Diagnostics System is a Java application that demonstrates the **Visitor Design Pattern**.

The application simulates a computer hardware diagnostics system. It analyzes different hardware components and performs multiple operations without modifying their classes.

The system supports four hardware components:
- CPU (Central Processing Unit)
- GPU (Graphics Processing Unit)
- RAM (Random Access Memory)
- Storage Device (SSD or HDD)

## Design Pattern

This project implements the **Visitor Design Pattern**, a behavioral design pattern that allows new operations to be added to existing object structures without modifying their classes.

The pattern is implemented using two main interfaces:

- `HardwareComponent` — defines the `accept()` method.
- `HardwareVisitor` — declares separate visitor methods for each hardware component.

The project uses Double Dispatch to determine which visitor operation should be executed for each hardware component.

## Project Features

The application provides two main operations:

### 1. Hardware Report

Implemented by `HardwareReportVisitor`.

Generates a technical report containing hardware information, including:
- CPU model, number of cores, and clock speed.
- GPU model and VRAM capacity.
- RAM model, capacity, and speed.
- Storage model, type, and capacity.

### 2. Power Consumption Analysis

Implemented by `PowerConsumptionVisitor`.

Calculates the estimated power consumption of all hardware components and displays the total system consumption in watts (W).

*Note: Power consumption values are predefined educational estimates, not real-time measurements.*

## Project Structure

```text
ComputerHardwareDiagnostics/
│
├── src/
│   ├── HardwareComponent.java
│   ├── HardwareVisitor.java
│   │
│   ├── CPU.java
│   ├── GPU.java
│   ├── RAM.java
│   ├── StorageDevice.java
│   │
│   ├── HardwareReportVisitor.java
│   ├── PowerConsumptionVisitor.java
│   │
│   └── Main.java
│
└── README.md
```

## Class Responsibilities

| Class / Interface | Responsibility |
|---|---|
| `HardwareComponent` | Defines the `accept()` method for hardware elements. |
| `HardwareVisitor` | Declares visitor methods for all hardware component types. |
| `CPU` | Represents the computer processor. |
| `GPU` | Represents the graphics card. |
| `RAM` | Represents the system memory. |
| `StorageDevice` | Represents an SSD or HDD. |
| `HardwareReportVisitor` | Generates a technical hardware report. |
| `PowerConsumptionVisitor` | Calculates total estimated power consumption. |
| `Main` | Creates the hardware components and executes the visitors. |

## Clean Code Principles

The project demonstrates the following Clean Code principles:

1. **Meaningful Names:** Classes, methods, and variables have descriptive names that clearly communicate their responsibilities.
2. **Single Responsibility Principle:** Each visitor performs one specific operation across all hardware components.
3. **Encapsulation:** Hardware fields are private and accessed through getter methods.
4. **No instanceof Checks:** Double Dispatch replaces manual type checking when selecting visitor operations.
5. **Open/Closed Principle:** New visitor operations can be introduced without modifying existing hardware component classes.

## How to Run

1. Clone or download the project repository.
2. Open the project in IntelliJ IDEA.
3. Make sure a Java JDK is configured.
4. Open `src/Main.java`.
5. Run the `main()` method.

## Example Output

```text
COMPUTER HARDWARE DIAGNOSTICS

========== HARDWARE REPORT ==========

CPU:
  Model: AMD Ryzen 7 7800X3D
  Cores: 8
  Clock Speed: 4.2 GHz

GPU:
  Model: NVIDIA RTX 4070
  VRAM: 12 GB

RAM:
  Model: Kingston Fury DDR5
  Capacity: 32 GB
  Speed: 6000 MHz

Storage:
  Model: Samsung 990 PRO
  Type: NVMe SSD
  Capacity: 1000 GB

======= POWER CONSUMPTION =======

CPU power consumption: 120 W
GPU power consumption: 200 W
RAM power consumption: 10 W
Storage power consumption: 5 W

Total estimated power consumption: 335W

DIAGNOSTICS COMPLETED
```

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Visitor Design Pattern
- IntelliJ IDEA

## Author

Software Design Patterns — Assignment #6

**Topic:** Computer Hardware Diagnostics System  
**Design Pattern:** Visitor Pattern
