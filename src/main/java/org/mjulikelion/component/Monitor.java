package org.mjulikelion.component;

import org.mjulikelion.component.company.MonitorCompany;

public class Monitor extends ComponentPart {
    private int size;

    private MonitorCompany company;

    public Monitor(String name, int price, MonitorCompany company) {
        super(name, price);
        this.size = size;
        this.company = company;
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
