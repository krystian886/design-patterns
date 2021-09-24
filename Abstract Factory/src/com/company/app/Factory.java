package com.company.app;

import com.company.chairs.Chair;
import com.company.factories.FurnitureFactory;
import com.company.sofas.Sofa;
import com.company.tables.Table;

public class Factory {
    private final Chair chair;
    private final Sofa sofa;
    private final Table table;

    public Factory(FurnitureFactory furnitureFactory) {
        chair = furnitureFactory.createChair();
        sofa = furnitureFactory.createSofa();
        table = furnitureFactory.createTable();
    }

    public void describe() {
        chair.describe();
        sofa.describe();
        table.describe();
    }
}
