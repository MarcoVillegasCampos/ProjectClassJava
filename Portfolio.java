
import java.util.ArrayList;

public class Portfolio {
    
    ArrayList<Project> projects= new ArrayList<Project>();


    public Portfolio(){

        this.projects= new ArrayList<Project>();



    }

    public String getPortfolio(){
        return projects.toString();
    }
    public void setPortfolio(Project project){
        projects.add(project);

    }

    public double totalCostPortfolio(){
        double totalCost=0;
        for (Project project: projects){
            totalCost+=project.getInitialCost();


        }
        System.out.println(String.format("The total cost of portfolio is: %.2f", totalCost));
        return totalCost;

        


    }


    public void ShowPortfolio(){
        for (Project project: projects){
            System.out.println(project.elevatorPitch());

        }



    }


}
