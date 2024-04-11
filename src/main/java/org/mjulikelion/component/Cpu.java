package org.mjulikelion.component;


import org.mjulikelion.component.company.CpuCompany;
import org.mjulikelion.component.type.CpuType;

public class Cpu extends ComponentPart {
    private int speed;
    private CpuType type;
    private CpuCompany company;

    public Cpu(String name, int price, CpuCompany company, int speed, CpuType type) {
        super(name, price);
        this.speed = speed;
        this.type = type;
        this.company = company;
    }



    public void processInstruction(){
         System.out.println(super.getName()+" 명령어를 처리합니다.");
    };

    @Override
    public void on() {
        System.out.println("CPU ON");
    }

    @Override
    public void off() {
        System.out.println("CPU OFF");
    }

}