
public class DomesticDivision extends Division {
    String state;

    public DomesticDivision(String divisionName, int accountNum, String state) {
        super(divisionName, accountNum);
        this.state = state;
    }

    public void display(){
        System.out.println(toString() + "State: " + state + ".");
    }

}
