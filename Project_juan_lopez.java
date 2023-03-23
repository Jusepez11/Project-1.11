
public class Project_juan_lopez {
    public static void main(String[] args) {
        
    }

    public static int insurancePolicy(int bmi, int age, String smoker) {
        //returns the base fee of 600 + the aditional fee depending on the bmi, + 75 if the policy holder is over 50, and an extra 100 if the policy holder is a smoker
        return 600 + ((bmi-35)*20) + (age>50 ? 75:0) + (smoker.equalsIgnoreCase("smoker")?100:0);
    }
    
}

