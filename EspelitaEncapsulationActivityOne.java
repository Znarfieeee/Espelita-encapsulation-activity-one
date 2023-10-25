import java.util.*;

public class EspelitaEncapsulationActivityOne {
    
    public static void main(String[] args) {
          EspelitaEncapsulationActivityOne.Person person = new EspelitaEncapsulationActivityOne().new Person();
          Scanner scnr = new Scanner(System.in);
   
          System.out.println("=== Welcome to JAVA ENCAPSULATION PROGRAM! === ");
          System.out.printf("Please enter first name: ");
          String firstName = scnr.nextLine();
          person.setFName(firstName);
      
          System.out.printf("Please enter middle name: ");
          String middleName = scnr.nextLine();
          person.setMName(middleName);
      
          System.out.printf("Please enter last name: ");
          String lastName = scnr.nextLine();
          person.setLName(lastName);
      
          System.out.printf("Please enter age: ");
          int age = scnr.nextInt();
          person.setAge(age);
      
          scnr.nextLine(); // Consume the newline character
      
          System.out.printf("Please enter birthday[mm/dd/yy]: ");
          String birthday = scnr.nextLine();
          person.setBday(birthday);
      
          System.out.printf("Please enter address: ");
          String address = scnr.nextLine();
          person.setAddress(address);
      
          try{
          System.out.println("\n\nStored Information:");
          Thread.sleep(1000);
          System.out.println("First Name: " + person.getFName());
          Thread.sleep(1000);
          System.out.println("Middle Name: " + person.getMName());
          Thread.sleep(1000);
          System.out.println("Last Name: " + person.getLName());
          Thread.sleep(1000);
          System.out.println("Age: " + person.getAge());
          Thread.sleep(1000);
          System.out.println("Birthday: " + person.getBday());
          Thread.sleep(1000);
          System.out.println("Address: " + person.getAddress());
          }
          catch(InterruptedException e){
            System.out.println("Error Occured");
          }
    }

    class Person {
        private String fName;
        private String mName;
        private String lName;
        private int age;
        private String bday;
        private String address;
        // First Name
        public String getFName() {
            return fName;
        }

        public void setFName(String fName) {
            this.fName = fName;
        }

        // Middle Name
        public String getMName() {
            return mName;
        }

        public void setMName(String mName) {
            this.mName = mName;
        }

        // Last Name
        public String getLName() {
            return lName;
        }

        public void setLName(String lName) {
            this.lName = lName;
        }

        // Age
        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        // Birthday
        public String getBday() {
            return bday;
        }

        public void setBday(String bday) {
            this.bday = bday;
        }

        // Address
        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }
}
