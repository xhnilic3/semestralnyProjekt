package com.jakubhnilica;

public class CarProvider implements AbstractFactory <AbstractFactory> {
    public static enum typesOfCar {
        UP_TO_3POINT5,
        ABOVE_3POINT5,
        MOTOCYCLES,
        BUS,
        ATV
    }
    @Override
    public AbstractFactory create(Enum typesOfCar ) {
        if (typesOfCar == this.typesOfCar.ABOVE_3POINT5)
            return ;

        return null;
    }
}
