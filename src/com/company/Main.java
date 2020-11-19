package com.company;

public class Main {

    public static void main(String[] args) {
	    Car opel = new Car();
        System.out.println(opel.getColor());
	   // opel.setColor("Red");
	   // opel.setName("Opel");
	   // System.out.println(opel.wheels);
        Car bmw = new Car("BMW",900,200,"Red");
        String color = bmw.getColor();

        ElectroCar tesla = new ElectroCar();
        // tesla.getColor();

        //Animal cat = new Animal();

        Cat barsik = new Cat();

        //Switchable s = new Switchable();

        TV samsung = new TV();
        // samsung.power

        //TV.power++;


        Computable devider = new Computable() {

            @Override
            public void calc(int a, int b) {

            }

            @Override
            public void calc222() {

            }
        };
        devider.calc(5,6);
        int x = Computable.COMP;

        Switchable bbb = new TV();
        bbb.switchOn();
        bbb.switchOff();
    }
}
