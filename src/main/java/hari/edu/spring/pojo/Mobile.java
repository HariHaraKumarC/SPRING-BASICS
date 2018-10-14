package hari.edu.spring.pojo;

import org.apache.log4j.Logger;

/** Singleton Class*/
public class Mobile {
    private static final Logger logger=Logger.getLogger(Mobile.class);
    private static Mobile singletonInstance =null;
    String brand;
    String model;

    private Mobile() {
        logger.debug("Inside Private Constructor");
    }

    public static Mobile getMobile(){
        if(singletonInstance == null){
            singletonInstance = new Mobile();
        }
        return singletonInstance;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
