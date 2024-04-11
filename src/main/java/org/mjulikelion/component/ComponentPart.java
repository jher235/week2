package org.mjulikelion.component;

public class ComponentPart implements Switchable {
    public ComponentPart(String name, int price) {
        this.name = name;
        this.price = price;
//        this.company = company;
    }

    private String name;
    private int price;
//    private String company;

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
