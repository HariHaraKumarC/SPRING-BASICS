package hari.edu.spring.pojo;

public class StaticPrinterFactory {
    Printer printer;
    public static Printer getPrinter(String message){
        return new Printer(message);
    }
}
