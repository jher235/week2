package org.mjulikelion;

import org.mjulikelion.component.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Computer {
//    private Cpu cpu;
//    private Ram ram;
//    private GraphicsCard graphicsCard;
//    private PowerSupplier powerSupplier;
//    private Cooler cooler;
//    private Mouse mouse;
//    private KeyBoard keyBoard;
//    private Monitor monitor;

    private List<ComponentPart> primaryParts;

    private List<ComponentPart> subParts;

    //생성자에 필수 부품들을 파라미터로 받아와서 primaryParts 초기화할 때 넣어줬습니다. 또한 생성자로 생성할 때 subParts도 LinkedList로 초기화 했습니다.
    public Computer(Cpu cpu, Ram ram, GraphicsCard graphicsCard, PowerSupplier powerSupplier, Cooler cooler) {
        this.primaryParts = new LinkedList<>(Arrays.asList(cpu,ram,graphicsCard,powerSupplier,cooler));
        this.subParts = new LinkedList<>();
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

            if (this.mouse!=null) computer.subParts.add(this.mouse);
            if (this.keyBoard!=null) computer.subParts.add(this.keyBoard);
            if (this.monitor != null) computer.subParts.add(this.monitor);

            return computer;
        }

    }

    public void boot(){
        System.out.println("컴퓨터 부팅합니다.");

        primaryParts.stream().forEach(i->i.on());

        subParts.stream().forEach(i->i.on());

    }

    public void shutDown(){

        System.out.println("컴퓨터 종료합니다.");

        primaryParts.stream().forEach(i->i.off());

        subParts.stream().forEach(i->i.off());

    }


    public void run(){
        System.out.println("컴퓨터의 기능을 전부 실행합니다.");
        primaryParts.stream().forEach(i->i.run());

        subParts.stream().forEach(i->i.run());
    }



}
