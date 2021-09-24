package com.company.factories;

import com.company.chairs.Chair;
import com.company.sofas.Sofa;
import com.company.tables.Table;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    Table createTable();
}
