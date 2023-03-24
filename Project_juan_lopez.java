import java.util.*;

public class Project_juan_lopez {
    public static void main(String[] args) {
        //declaring objects
        Policy p = new Policy();
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the Policy Number:");
        p.setPolicyNumber(sc.nextInt());

        sc.nextLine();//Reseting scanner
        
        System.out.print("Please enter the Provider Name:");
        p.setProviderName(sc.nextLine());

        System.out.print("Please enter the Policyholder’s First Name:");
        p.setPolicyHolderFirstName(sc.nextLine());

        System.out.print("Please enter the Policyholder’s Last Name:");
        p.setPolicyHolderLastName(sc.nextLine());

        System.out.print("Please enter the Policyholder’s Age:");
        p.setPolicyHolderAge(sc.nextInt());

        sc.nextLine();//Reseting scanner
        
        System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker):");
        p.setPolicyHolderSmokingStatus(sc.nextLine());

        System.out.print("Please enter the Policyholder’s Height (in inches):");
        p.setPolicyHolderHeight(sc.nextFloat());

        System.out.print("Please enter the Policyholder’s Weight (in pounds):");
        p.setPolicyHolderWeight(sc.nextFloat());

        p.Display();
    }
}



/**
 * 
 * 
Please enter the Policy Number: 1234

Please enter the Provider Name: State Farm

Please enter the Policyholder’s First Name: John

Please enter the Policyholder’s Last Name: Doe

Please enter the Policyholder’s Age: 24

Please enter the Policyholder’s Smoking Status (smoker/non-smoker): non-smoker

Please enter the Policyholder’s Height (in inches): 62.0

Please enter the Policyholder’s Weight (in pounds): 250.5
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */