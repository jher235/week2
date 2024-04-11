package org.mjulikelion.component;

import org.mjulikelion.component.company.CoolerAndPowerCompany;

public class PowerSupplier extends ComponentPart {

    private int power;
    private CoolerAndPowerCompany company;

    public PowerSupplier(String name, int price, CoolerAndPowerCompany company, int power) {
        super(name,price);
        this.power = power;
        this.company = company;
    }

    public void supplyPower(){
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
