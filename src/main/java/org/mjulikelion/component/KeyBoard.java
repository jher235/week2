package org.mjulikelion.component;

import org.mjulikelion.component.company.KeyboardAndMouseCompany;
import org.mjulikelion.component.type.KeyBoardType;

public class KeyBoard extends ComponentPart  {
    private KeyBoardType type;

    private KeyboardAndMouseCompany company;
    public KeyBoard(String name, int price, KeyboardAndMouseCompany company, KeyBoardType type) {
        super(name, price);
        this.type = type;
        this.company = company;
    }

    public void type(){
        System.out.println(super.getName()+" 타이핑합니다.");
    }

    @Override
    public void on() {
        System.out.println("키보드 ON");
    }

    @Override
    public void off() {
        System.out.println("키보드 ON");
    }
}
