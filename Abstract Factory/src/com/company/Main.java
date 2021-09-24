package com.company;

import com.company.app.Factory;
import com.company.factories.ClassicFactory;
import com.company.factories.DolceFactory;
import com.company.factories.ModernFactory;

public class Main {

    public enum CollectionType {
        CLASSIC, DOLCE, MODERN,
    }

    public static void main(String[] args) {
        Factory factory = makeFactory(CollectionType.DOLCE);
        factory.describe();
    }

    public static Factory makeFactory(CollectionType type) {
        switch (type) {
            case CLASSIC:
                return new Factory(new ClassicFactory());
            case DOLCE:
                return new Factory(new DolceFactory());
            case MODERN:
                return new Factory(new ModernFactory());
            default:
                throw new IllegalArgumentException("Collection not supported.");
        }
    }
}
