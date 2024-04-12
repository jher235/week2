package org.mjulikelion.component;

import org.mjulikelion.component.company.Company;

public class Ram extends ComponentPart {

    private int capacity;

    public Ram(String name, int price, Company company, int capacity) {
        super(name, price, company);
        this.capacity = capacity;
    }

    @Override
    public void run() {
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