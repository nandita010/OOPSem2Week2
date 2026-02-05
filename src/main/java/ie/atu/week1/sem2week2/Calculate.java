package ie.atu.week1.sem2week2;

public class Calculate  {
    private String operation;
    private Double total;


    public Calculate(String operation, Double total){
        this.operation=operation;
        this.total= total;
    }
    public String getOperation(){
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Double getTotal(){
        return total;
    }

    public void setTotal(Double total){
        this.total= total;
    }
}
