package org.mjulikelion.component;

import org.mjulikelion.component.company.Company;

public class ComponentPart implements Switchable {
    public ComponentPart(String name, int price, Company company) {
        this.name = name;
        this.price = price;
    }

    private final String name;
    private final int price;


    protected String getName(){
        return this.name;
    }


    @Override
    public void on() {

    }

    @Override
    public void off() {

    }
}
