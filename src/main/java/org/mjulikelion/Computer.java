package org.mjulikelion;

import org.mjulikelion.component.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Computer {
    private Cpu cpu;
    private Ram ram;
    private GraphicsCard graphicsCard;
    private PowerSupplier powerSupplier;
    private Cooler cooler;
    private Mouse mouse;
    private KeyBoard keyBoard;
    private Monitor monitor;




    //생성자를 설정할 때 필수적인 요소들은 전부 넣도록 작성
    public Computer(Cpu cpu, Ram ram, GraphicsCard graphicsCard, PowerSupplier powerSupplier, Cooler cooler) {
        this.cpu = cpu;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.powerSupplier = powerSupplier;
        this.cooler = cooler;
    }

    //Builder패턴을 위한 ComputerBuilder
    public static class ComputerBuilder {
        private Cpu cpu;
        private Ram ram;
        private GraphicsCard graphicsCard;
        private PowerSupplier powerSupplier;
        private Cooler cooler;

        private Mouse mouse;
        private KeyBoard keyBoard;
        private Monitor monitor;

        public ComputerBuilder cpu(Cpu cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder ram(Ram ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder graphicsCard(GraphicsCard graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public ComputerBuilder powerSupplier(PowerSupplier powerSupplier) {
            this.powerSupplier = powerSupplier;
            return this;
        }

        public ComputerBuilder cooler(Cooler cooler) {
            this.cooler = cooler;
            return this;
        }

        public ComputerBuilder mouse(Mouse mouse){
            this.mouse = mouse;
            return this;
        }

        public ComputerBuilder keyBoard(KeyBoard keyBoard){
            this.keyBoard = keyBoard;
            return this;
        }

        public ComputerBuilder monitor(Monitor monitor){
            this.monitor = monitor;
            return this;
        }

        public Computer build(){
            Computer computer = new Computer(cpu,ram,graphicsCard,powerSupplier,cooler); //생성자를 통해 필수 요소들은 한번에 처리 -> 필수요소 누락 시 오류 발생
            computer.mouse = this.mouse;
            computer.keyBoard = this.keyBoard;
            computer.monitor = this.monitor;

            return computer;
        }

    }

    public void boot(){
        System.out.println("컴퓨터 부팅합니다.");

        List<ComponentPart> primaryCoponentPars = new ArrayList<>(Arrays.asList(cpu, ram, graphicsCard, powerSupplier, cooler));

        primaryCoponentPars.stream().forEach(i->i.on());


        List<ComponentPart> subComponentParts = new ArrayList<ComponentPart>(Arrays.asList(mouse, keyBoard, monitor)) ;

        subComponentParts = checkSubComponentPart(subComponentParts);

        subComponentParts.stream().forEach(i->i.on());

//        if(mouse!=null) mouse.on();
//        if(keyBoard!=null) keyBoard.on();
//        if(monitor!=null) monitor.on();
    }

    public void shutDown(){

        System.out.println("컴퓨터 종료합니다.");

        List<ComponentPart> primaryCoponentPars = new ArrayList<>(Arrays.asList(cpu, ram, graphicsCard, powerSupplier, cooler));

        primaryCoponentPars.stream().forEach(i->i.off());


        List<ComponentPart> subComponentParts = new ArrayList<ComponentPart>(Arrays.asList(mouse, keyBoard, monitor)) ;

        subComponentParts = checkSubComponentPart(subComponentParts);

        subComponentParts.stream().forEach(i->off(i));

//        cpu.off();
//        ram.off();
//        graphicsCard.off();
//        powerSupplier.off();
//        cooler.off();
//        if(mouse!=null) mouse.off();
//        if(keyBoard!=null) keyBoard.off();
//        if(monitor!=null) monitor.off();
    }

    //인터페이스를 통한 다형성 이용... 살짝 억지지만 다형성을 적용하기 위해 추가
    private void off(Switchable aSwitch){
        aSwitch.off();
    }

    public void run(){
        System.out.println("컴퓨터의 기능을 전부 실행합니다.");
        cpu.processInstruction();
        ram.readData();
        graphicsCard.render();
        powerSupplier.supplyPower();
        cooler.cool();


        if(mouse!=null) mouse.click();
        if(keyBoard!=null) keyBoard.type();
        if(monitor!=null) monitor.display();
    }

    public List checkSubComponentPart(List<ComponentPart> subComponentParts){
//        ComponentPart[] existComponentParts = new ComponentPart[subComponentParts.length];

        List<ComponentPart> existComponentParts = subComponentParts.stream().filter(i->i!=null).collect(Collectors.toList());

        return existComponentParts;
    }


}
