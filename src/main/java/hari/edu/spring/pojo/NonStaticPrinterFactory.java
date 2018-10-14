package hari.edu.spring.pojo;

public class NonStaticPrinterFactory {
    Printer printer;
    public Printer getPrinter(String message){
        return new Printer(message);
    }
}
