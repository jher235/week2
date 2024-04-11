package org.mjulikelion.component;


import org.mjulikelion.component.company.GrapichsCardCompany;
import org.mjulikelion.component.type.GraphicsCardType;

public class GraphicsCard extends ComponentPart {

    private GraphicsCardType type;

    private GrapichsCardCompany company;
    public GraphicsCard(String name, int price, GrapichsCardCompany company, GraphicsCardType type) {
        super(name, price);
        this.type = type;
        this.company = company;
    }

    public void render(){
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
