import java.util.Scanner;

public class ProcessingToolbox {
    public static void main(String[] args) {

        Scanner inScan = new Scanner(System.in);

        // main interface
        System.out.println("Welcome to the Big Data Processing Application");
        System.out.println("Please type the number that corresponds to which application you would like to run: ");
        System.out.println("1. Apache Hadoop\n2. Apache Spark\n3. Jupyter Notebook\n4. SonarQube and SonarScanner\n");
        System.out.println("Type the number here (or invalid number to quit) >");
        int choice = inScan.nextInt();
        inScan.nextLine();

        if(choice == 1) { // Apache Hadoop
            System.out.println("Apache Hadoop");
        } else if(choice == 2) { // Apache Spark
            System.out.println("Apache Spark");
        } else if(choice == 3) { // Jupyter Notebook
            System.out.println("Jupyter Notebook");
        } else if(choice == 4) { // SonarQube and SonarScanner
            System.out.println("SonarQube and SonarScanner");
        } else {
            System.out.println("Quitting...");
        }

        inScan.close();
       
    }
}
