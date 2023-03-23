
public class policy {
    private int pNum;
    private String pName; 
    private String phFirstName;
    private String phLastName;
    private int phAge;
    private String phSmoking;
    private double height;
    private double weight;

    public void policy() {
        pNum = 0;
        pName = "";
        phFirstName = "";
        phLastName = "";
        phAge = 0;
        phSmoking = "";
        height = 0;
        weight = 0;
        
    }

    public void policy(int n, String pN, String phFN, String phLN, String phA, String phS, double h, double w ) {
        pNum = n;
        pName = pN;
        phFirstName = phFN;
        phLastName = phLN;
        phAge = phA;
        phSmoking = phS;
        height = h;
        weight = w;
        
    }

    public int insurancePolicy(int bmi, int age, String smoker) {
        //returns the base fee of 600 + the aditional fee depending on the bmi, + 75 if the policy holder is over 50, and an extra 100 if the policy holder is a smoker
        return 600 + ((bmi-35)*20) + (age>50 ? 75:0) + (smoker.equalsIgnoreCase("smoker")?100:0);
    }
    
}

