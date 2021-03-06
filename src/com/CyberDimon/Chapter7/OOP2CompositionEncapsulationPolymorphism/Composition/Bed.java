package com.CyberDimon.Chapter7.OOP2CompositionEncapsulationPolymorphism.Composition;

public class Bed {
    private Dimension dimension;
    private String softness;

    public Bed(Dimension dimension, String softness) {
        this.dimension = dimension;
        this.softness = softness;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public String getSoftness() {
        return softness;
    }
}
