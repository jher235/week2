package org.mjulikelion.component;

import org.mjulikelion.component.company.Company;

public class PowerSupplier extends ComponentPart {

    private int power;

    public PowerSupplier(String name, int price, Company company, int power) {
        super(name,price, company);
        this.power = power;
    }

    @Override
    public void run() {
        System.out.println(super.getName()+" 전원을 공급합니다.");
    }

    @Override
    public void on() {
        System.out.println("POWER Supplier ON");
    }

    @Override
    public void off() {
        System.out.println("POWER Supplier OFF");
    }
}
