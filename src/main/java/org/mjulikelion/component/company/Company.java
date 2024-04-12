package org.mjulikelion.component.company;

import org.mjulikelion.component.*;

import java.util.List;

public enum Company {
//    COOLER_MASTER(List.of(Cooler.class)),
//    THERMALTAKE(List.of(Cooler.class)),


    INTEL(List.of(Cpu.class)),
    AMD(List.of(Cpu.class, GraphicsCard.class)),
    SAMSUNG(List.of(Ram.class, Monitor.class)),
    KINGSTON(List.of(Ram.class)),
    NVIDIA(List.of(GraphicsCard.class)),
    COOLER_MASTER(List.of(PowerSupplier.class, Cooler.class)),
    THERMALTAKE(List.of(PowerSupplier.class, Cooler.class)),
    LOGITECH(List.of(Mouse.class, KeyBoard.class)),
    RAZER(List.of(Mouse.class, KeyBoard.class)),
    LG(List.of(Monitor.class));

    private final List<Class<? extends ComponentPart>> ComponentpartList;   //enum에 각각의 회사타입마다 부품 목록을 저장할 수 있는 List생성,


    //생성자로 ComponentPart를 상속받는 클래스 리스트를 받아서 저장
    Company(List<Class<? extends ComponentPart>> componentpartList) {
        ComponentpartList = componentpartList;
    }
}
