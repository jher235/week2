package org.mjulikelion.component;

import org.mjulikelion.component.company.RamCompany;

public class Ram extends ComponentPart {

    private int capacity;
    private RamCompany company;

    public Ram(String name, int price, RamCompany company, int capacity) {
        super(name, price);
        this.capacity = capacity;
        this.company = company;
    }

    public void readData(){
        System.out.println(super.getName()+ " 데이터를 읽습니다.");
    }

    @Override
    public void on() {
        System.out.println("Ram ON");
    }

    @Override
    public void off() {
        System.out.println("Ram OFF");
    }
}
