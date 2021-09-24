package com.company.factories;

import com.company.chairs.Chair;
import com.company.chairs.DolceChair;
import com.company.sofas.DolceSofa;
import com.company.sofas.Sofa;
import com.company.tables.DolceTable;
import com.company.tables.Table;

public class DolceFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new DolceChair();
    }

    @Override
    public Sofa createSofa() {
        return new DolceSofa();
    }

    @Override
    public Table createTable() {
        return new DolceTable();
    }
}
