// import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertThat;

import org.junit.Test;

class VehicleTest {

    @Test
    public void test(){
        // тест №1 проверка экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof)
        Vehicle type = new Car("AvtoVAZ","vaz 2106",1992,4,180);
        if(type instanceof Vehicle)
            System.out.println("it's working!");
        // тест №2 проверка объект Car создается с 4-мя колесами.
        Car object1 = new Car("AvtoVAZ","vaz 2106",1992,4,180);
        if(object1.getNumWheels() == 4)
            System.out.println("Car have 4 wheels");
        // тест №3 проверка объект Motorcycle создается с 2-мя колесами.
        Motorcycle object2 = new Motorcycle("IMZ","ural",2012,2,130);
        if(object2.getNumWheels() == 2)
            System.out.println("Motorcycle have 2 wheels");
        // тест №4 проверка объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
        Car object3 = new Car("UAZ","Hunter",2022,4,130);
        object3.testDrive();
        if(object3.getSpeed() == 60)
            System.out.println("Correct");
        // тест №5 проверка объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
        Motorcycle object4 = new Motorcycle("IZHMASH","Izh",2005,2,120);
        object4.testDrive();
        if(object4.getSpeed() == 75)
            System.out.println("Correct");
        // тест №6 проверка в режиме парковки (сначала testDrive, потом park, 
        // т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
        Car object5 = new Car("UAZ","Hunter",2022,4,130);
        object5.testDrive();
        object5.park();
        if(object5.getSpeed() == 0)
            System.out.println("The car stopped!");
        // тест №7 проверка в режиме парковки (сначала testDrive, потом park, 
        // т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
        Motorcycle object6 = new Motorcycle("IZHMASH","Izh",2005,2,120);
        object6.testDrive();
        object6.park();
        if(object6.getSpeed() == 0)
            System.out.println("The motorcycle stopped!");
    }
}