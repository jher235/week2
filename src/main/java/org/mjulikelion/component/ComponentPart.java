package org.mjulikelion.component;

import org.mjulikelion.component.company.Company;

public abstract class ComponentPart implements Switchable {
    public ComponentPart(String name, int price, Company company) {
        this.name = name;
        this.price = price;
    }

    private final String name;
    private final int price;


    protected String getName(){
        return this.name;
    }

    //필수적으로 run을 생성하도록 추상 메서드로 작성
    public abstract void run();



    @Override
    public void on() {

    }

    @Override
    public void off() {

    }
}
