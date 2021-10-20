public class ProjectTest {


    public static void main(String args[]){

        Project testerJuan= new Project();
        Project testerMarco= new Project();
        Portfolio testing= new Portfolio();
        testerMarco.setName("Marco");
        testerMarco.setDescription("this is a description for Marco");
        testerMarco.setinitialCost(20.5565466);
        testing.setPortfolio(testerMarco);
        testerJuan.setName("Juan");
        testerJuan.setDescription("this is a description for Juan");
        testerJuan.setinitialCost(40.32255);
        testing.setPortfolio(testerJuan);

        //String fullName=testerMarco.elevatorPitch();
        //System.out.println(fullName);
        
 
        testing.ShowPortfolio();
        testing.totalCostPortfolio();







    }
    
}
