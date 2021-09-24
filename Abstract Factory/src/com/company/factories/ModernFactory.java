package com.company.factories;

import com.company.chairs.Chair;
import com.company.chairs.ModernChair;
import com.company.sofas.ModernSofa;
import com.company.sofas.Sofa;
import com.company.tables.ModernTable;
import com.company.tables.Table;

public class ModernFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
