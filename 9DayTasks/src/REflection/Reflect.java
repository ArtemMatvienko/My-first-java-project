package REflection;

import java.lang.reflect.Field;

public class Reflect {
    public static void main(String[] args) {
        Class<Car> carClass = Car.class;
        try {
            Field horsepowerField = carClass.getDeclaredField("horsepower");
            System.out.println(horsepowerField);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    class Car {
        private int horsepower;
        public final String serialNumber;

        public Car() {
            serialNumber = "";
        }

        public Car(int horsepower, String serialNumber) {
            this.horsepower = horsepower;
            this.serialNumber = serialNumber;
        }

        public int getHorsepower() {
            return horsepower;
        }

        void setHorsepower(int horsepower) {
            this.horsepower = horsepower;
        }

        protected void printSerialNumber() {
            System.out.println(serialNumber);
        }
    }
}
