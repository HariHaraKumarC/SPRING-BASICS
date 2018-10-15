package hari.edu.spring.pojo;

import org.apache.log4j.Logger;

public class Customer {

    private static final Logger logger=Logger.getLogger(Customer.class);
    String name;
    int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void checkAge(){
        if(age < 18){
            logger.debug("Customer age is invalid");
            throw new IllegalArgumentException();
        }else{
            logger.debug("Customer age is valid");
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
