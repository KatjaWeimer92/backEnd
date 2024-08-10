package de.ait;

import de.ait.app.controller.ProductController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("de.ait.app");

        ProductController controller = context.getBean(ProductController.class);

        System.out.println(controller.getAllProduct());
    }
}