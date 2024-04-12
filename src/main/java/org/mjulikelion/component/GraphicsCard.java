package org.mjulikelion.component;


import org.mjulikelion.component.company.Company;
import org.mjulikelion.component.type.GraphicsCardType;

public class GraphicsCard extends ComponentPart {

    private GraphicsCardType type;

    public GraphicsCard(String name, int price, Company company, GraphicsCardType type) {
        super(name, price, company);
        this.type = type;
    }

    @Override
    public void run() {
        System.out.println(super.getName()+" 화면을 렌더링합니다.");
    }

    @Override
    public void on() {
        System.out.println("Graphics Card ON");
    }

    @Override
    public void off() {
        System.out.println("Graphics Card OFF");
    }
}
