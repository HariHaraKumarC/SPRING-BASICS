package hari.edu.spring.app;

import hari.edu.spring.pojo.*;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class CICollectionExample {
    public static final String SPRING_APPLICATION_CONTEXT_FILE="applicationContext.xml";
    private static final Logger logger=Logger.getLogger(CICollectionExample.class);
    public static void main(String[] args){
        logger.debug("Loading Bean Info from Spring Config File : "+ SPRING_APPLICATION_CONTEXT_FILE);
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(SPRING_APPLICATION_CONTEXT_FILE); //spring-context-support dependency
        logger.debug("Collection DI Example (Set) : Wallet Info");
        Wallet wallet=(Wallet) applicationContext.getBean("walletBean");
        logger.debug("Printing the wallet details...");
        logger.debug("Wallet size > "+wallet.getSize());
        logger.debug("Wallet Cards (Set) > "+wallet.getCards().toString());
        logger.debug("Collection DI Example (List) : Trally Info");
        Trally trally=(Trally) applicationContext.getBean("trallyBean");
        logger.debug("Printing the trally details...");
        logger.debug("Trally price > "+trally.getPrice());
        logger.debug("Trally maxKg > "+trally.getMaxKg());
        logger.debug("Trally Fruits (List) > "+trally.getFruits().toString());
        logger.debug("Collection DI Example (Map) : Commune Info");
        Commune commune=(Commune)applicationContext.getBean("communeBean");
        logger.debug("Printing the Commune details...");
        logger.debug("Commune Name > "+commune.getCommuneName());
        logger.debug("Commune Address > "+commune.getCommuneAddress());
        logger.debug("Printing the Resident Cards details of the Commune...");
        //Normal way of printing Map
        /*for(Map.Entry <ResidentCard, Resident> mapEntry: commune.getResidentDetails().entrySet()){
            logger.debug("Resident Card Number : "+mapEntry.getKey().getResidentCardNumber()+" ; "+mapEntry.getValue());
        }*/
        //Printing Map details using Java 8
        commune.getResidentDetails().forEach(((residentCard, resident) -> logger.debug("Resident Card Number : "+residentCard.getResidentCardNumber()+" ; "+resident)));
    }
}
