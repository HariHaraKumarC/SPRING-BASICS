package hari.edu.spring.pojo;

import org.apache.log4j.Logger;

public class Printer {

    private static final Logger logger=Logger.getLogger(Printer.class);

    String printMessage;

    public Printer(String printMessage) {
        this.printMessage = printMessage;
    }

    public String getPrintMessage() {
        return printMessage;
    }

    public void setPrintMessage(String printMessage) {
        this.printMessage = printMessage;
    }

    public void write(){
        logger.debug(printMessage);
    }
}
