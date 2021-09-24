package com.company.factories;

import com.company.chairs.Chair;
import com.company.chairs.ClassicChair;
import com.company.sofas.ClassicSofa;
import com.company.sofas.Sofa;
import com.company.tables.ClassicTable;
import com.company.tables.Table;

public class ClassicFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Sofa createSofa() {
        return new ClassicSofa();
    }

    @Override
    public Table createTable() {
        return new ClassicTable();
    }
}
