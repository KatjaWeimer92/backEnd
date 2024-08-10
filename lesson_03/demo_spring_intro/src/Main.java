import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import staff.administration.Director;

public class Main {
    public static void main(String[] args) {
       /* MachineOperator machineOperator = new MachineOperator();
        Storekeeper storekeeper = new Storekeeper();
        SalesManager salesManager = new SalesManager();
        Merchandiser merchandiser = new Merchandiser();

        ProductionChief productionChief = new ProductionChief();
        productionChief.setMachineOperator(machineOperator);
        productionChief.setStorekeeper(storekeeper);

        SalesChief salesChief = new SalesChief();
        salesChief.setSalesManager(salesManager);
        salesChief.setMerchandiser(merchandiser);

        Director director = new Director();
        director.setSalesChief(salesChief);
        director.setProductionChief(productionChief);
*/

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(".configuration");
        Director director = context.getBean(Director.class);
        director.manageCompany();
    }
}