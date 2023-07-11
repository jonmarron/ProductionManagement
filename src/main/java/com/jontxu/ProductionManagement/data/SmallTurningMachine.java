package com.jontxu.ProductionManagement.data;

import java.util.List;

public class SmallTurningMachine extends Machine {
    private final TurningMachineType machineType;
    public SmallTurningMachine(int id, List<Work> works, TurningMachineType machineType) {
        super(id, works);
        this.machineType = machineType;
    }
}
