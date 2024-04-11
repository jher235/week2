package org.mjulikelion.component;

import org.mjulikelion.component.company.KeyboardAndMouseCompany;

public class Mouse extends ComponentPart {

    private KeyboardAndMouseCompany company;

    public Mouse(String name, int price, KeyboardAndMouseCompany company) {
        super(name, price);
        this.company = company;
    }

    public void click(){
        System.out.println(super.getName()+" 클릭합니다.");
    }

    @Override
    public void on() {
        System.out.println("마우스 ON");
    }

    @Override
    public void off() {
        System.out.println("마우스 OFF");
    }
}
