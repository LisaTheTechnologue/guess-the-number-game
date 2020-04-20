package org.springlearning;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    private static final Logger log = LoggerFactory.getLogger(AppMain.class);
    private static final String CONFIG_LOCATION = "beans.xml";

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
        NumberGenerator numberGenerator = context.getBean("numberGenerator", NumberGenerator.class);
        int number = numberGenerator.next();
        context.close();

    }
}
