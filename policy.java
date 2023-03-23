
public class Policy {
    private int bmi;
    private int pNum;
    private int phAge;
    private String pName; 
    private String phFirstName;
    private String phLastName;
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


    // <----------------------------------<Setters>------------------------------>
    public void setPolicyNumber(int n) {
        pNum = n;
    }

    public void setProviderName(String pN) {
        pName = pN;
    }

    public void setPolicyHolderFirstName(String phFN) {
        phFirstName = phFN;
    }
    
    public void setPolicyHolderLastName(String phLN) {
        phLastName = phLN;
    }

    public void setPolicyHolderAge(int phA) {
        phAge = phA;
    }

    public void setPolicyHolderSmokingStatus(String phS) {
        phSmoking = phS;
    }

    public void setPolicyHolderHeight(double h) {
        height = h;
    }

    public void setPolicyHolderWeight(double w) {
        weight = w;
    }


    // <----------------------------------<Getters>------------------------------>
    public int getPolicyNumber() {
        return pNum;
    }

    public String getProviderName() {
        return pName;
    }

    public String getPolicyHolderFirstName() {
        return phFirstName;
    }
    
    public String getPolicyHolderLastName() {
        return phLastName;
    }

    public int getPolicyHolderAge() {
        return phAge;
    }

    public String getPolicyHolderSmokingStatus() {
        return phSmoking;
    }

    public double getPolicyHolderHeight() {
        return height;
    }

    public double getPolicyHolderWeight() {
        return weight;
    }

    public double getBmi() {
        return bmi;
    }


    public int insurancePolicyPrice(int bmi, int age, String smoker) {
        //returns the base fee of 600 + the aditional fee depending on the bmi, + 75 if the policy holder is over 50, and an extra 100 if the policy holder is a smoker
        return 600 + ((bmi-35)*20) + (age>50 ? 75:0) + (smoker.equalsIgnoreCase("smoker")?100:0);
    }
    
}

