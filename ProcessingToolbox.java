import java.util.Scanner;

public class ProcessingToolbox {
    public static void main(String[] args) {

        Scanner inScan = new Scanner(System.in);

        // main interface
        System.out.println("Welcome to the Big Data Processing Application");
        int choice = 0;

        do {
            System.out.println("Please type the number that corresponds to which application you would like to run: ");
            System.out.println("1. Apache Hadoop\n2. Apache Spark\n3. Jupyter Notebook\n4. SonarQube and SonarScanner\n");
            System.out.println("Type the number here (or invalid number to quit) >");
            choice = inScan.nextInt();

            if(choice == 1) { // Apache Hadoop
                System.out.println("Apache Hadoop:");
                System.out.println("Go to http://35.223.167.177:9870/dfshealth.html#tab-overview\n");
            } else if(choice == 2) { // Apache Spark
                System.out.println("Apache Spark");
            } else if(choice == 3) { // Jupyter Notebook
                System.out.println("Jupyter Notebook");
                System.out.println("Go to https://30baf23784064eb6-dot-us-west1.notebooks.googleusercontent.com/lab/tree/Untitled.ipynb\n");
            } else if(choice == 4) { // SonarQube and SonarScanner
                System.out.println("SonarQube and SonarScanner");
                System.out.println("Go to http://34.75.153.182/sessions/new?return_to=%2F\n");
            } else {
                System.out.println("Quitting...");
            }
            inScan.nextLine();
        } while(choice == 1 || choice == 2 || choice == 3 || choice == 4);

        inScan.close();
       
    }
}
