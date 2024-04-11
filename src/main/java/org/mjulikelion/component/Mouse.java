package org.mjulikelion.component;

import org.mjulikelion.component.company.Company;

public class Mouse extends ComponentPart {


    public Mouse(String name, int price, Company company) {
        super(name, price, company);

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
