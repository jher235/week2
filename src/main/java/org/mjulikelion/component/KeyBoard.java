package org.mjulikelion.component;

import org.mjulikelion.component.company.Company;
import org.mjulikelion.component.type.KeyBoardType;

public class KeyBoard extends ComponentPart  {
    private KeyBoardType type;


    public KeyBoard(String name, int price, Company company, KeyBoardType type) {
        super(name, price, company);
        this.type = type;
    }

    @Override
    public void run() {
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
