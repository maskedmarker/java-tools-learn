package org.example.learn.marshall.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

public class Demo {

    private ObjectMapper objectMapper;

    public static void main(String[] args) {
        Demo demo = new Demo();
        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
//        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.LOWER_CAMEL_CASE);
//        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.UPPER_CAMEL_CASE);
        demo.setObjectMapper(objectMapper);
        demo.demoMarshall();
    }

    public void demoUnMarshall() {
        String carJson ="{ \"brand\" : \"Mercedes\", \"doors\" : 5 }";
        try {
            Car car = objectMapper.readValue(carJson, Car.class);
            System.out.println("car brand = " + car.getBrand());
            System.out.println("car doors = " + car.getDoors());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void demoMarshall() {
        Car car = new Car();
        car.setBrand("Mercedes");
        car.setDoors(5);
        car.setManufacturerName("上汽");

        try {
            String json = objectMapper.writeValueAsString(car);
            System.out.println("json = " + json);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    public void setObjectMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }
}
