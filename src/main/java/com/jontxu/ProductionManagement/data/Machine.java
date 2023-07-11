package com.jontxu.ProductionManagement.data;

import java.util.List;

public abstract class Machine {
    private final int id;
    private final int maxWeight;
    private final List<Work> works;

    public Machine(int id, List<Work> works) {
        this.id = id;
        this.maxWeight = maxWeight;
        this.works = works;
    }

    public int getId() {
        return id;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public List<Work> getWorks() {
        return works;
    }
}
