package com.jontxu.ProductionManagement.data;

import java.util.List;

public class Divider extends Machine {

    public Divider(int id, int maxWeight, List<Work> works) {
        super(id, works);
    }
}
