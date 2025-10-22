package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    public void accerlerate_NormalSpeedChangeSpeedIncreased(){


    }


@Test
 public void brake_SpeedChangeGreaterThanActualSpeed_SpeedIsZero(){


} //Steps: Arrange, Act, and Arrange




@Test
public void accerlerate_should_increaseCarSpeed() {
    //arrange

    Car car = new Car("Rolls Royce", "Phantom");
    int speedchange = 15;
    int expectedSpeed = 15;

    //act

    car.accerlerate(speedchange);
    int actualSpeed = car.getSpeed();
    assertEquals(expectedSpeed, actualSpeed);
}}

