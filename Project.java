
public class Project {

    String name;
    String description;
    double initialCost;

    public Project() {

    }

    public Project(String name) {
        this.name = name;

    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;

    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;

    }

    public String getDescription(){
        return description;

    }
    public void setDescription(String description){
        this.description=description;

    }

    public double getInitialCost(){
        return initialCost;
    }
    public void setinitialCost(Double initialCost){
        this.initialCost=initialCost;

    }


    public String elevatorPitch() {

        String name = this.name;
        String description = this.description;
        double initialCost=this.initialCost;


        return String.format("%s (%.2f) %s",name,initialCost,description);


    }

}