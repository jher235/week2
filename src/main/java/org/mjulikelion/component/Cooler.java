package org.mjulikelion.component;


import org.mjulikelion.component.company.CoolerAndPowerCompany;
import org.mjulikelion.component.type.CoolerType;

public class Cooler extends ComponentPart {
    private CoolerType type;
    private CoolerAndPowerCompany company;

    public Cooler(String name, int price, CoolerAndPowerCompany company, CoolerType type) {
        super(name,price);
        this.type = type;
        this.company = company;
    }

    public void cool(){
        System.out.println(super.getName()+" 냉각합니다");
    }

    @Override
    public void on() {
        System.out.println("Cooler ON");
    }

    @Override
    public void off() {
        System.out.println("Cooler OFF");
    }
}
