package org.mjulikelion.component;

import org.mjulikelion.component.company.Company;

public class Monitor extends ComponentPart {
    private int size;



    public Monitor(String name, int price, Company company) {
        super(name, price, company);
        this.size = size;
    }

    public void display(){
        System.out.println(super.getName()+" 화면을 출력합니다.");
    }

    @Override
    public void on() {
        System.out.println("Monitor ON");
    }

    @Override
    public void off() {
        System.out.println("Monitor OFF");
    }
}
