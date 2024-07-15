public class AssignmentOne {

    public static class HealthProfessional {
        private int ID;
        private String name;
        private String department;

        public HealthProfessional(){
            this.ID = 0;
            this.name = "default";
            this.department= "default";
        }

        public HealthProfessional(int ID, String name, String department){
            this.ID = ID;
            this.name = name;
            this.department = department;
        }

        // Getters and setters
        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }


        public void printDetails() {
            System.out.println("ID: " + ID);
            System.out.println("Name: " + name);
            System.out.println("Department: " + department);
        }


    }

    // Part 2
    public static class GeneralPractitioner extends HealthProfessional {
        private String clinicName;

        // Default constructor
        public GeneralPractitioner() {
            super();
            this.clinicName = "default Clinic";
        }

        public GeneralPractitioner(int ID, String name, String department, String clinicName) {
            super(ID, name, department);
            this.clinicName = clinicName;
        }

        @Override
        public void printDetails() {
            System.out.println("The doctor details are:");
            super.printDetails();
            System.out.println("Health Professional Type: General Practitioner");
            System.out.println("Clinic Name: " + clinicName);
        }
    }

    public static class Cardiologist extends HealthProfessional {
        private String hospitalName;

        public Cardiologist() {
            super();
            this.hospitalName = "default Hospital";
        }

        public Cardiologist(int ID, String name, String department, String hospitalName) {
            super(ID, name, department);
            this.hospitalName = hospitalName;
        }

        public String getHospitalName() {
            return hospitalName;
        }

        public void setHospitalName(String hospitalName) {
            this.hospitalName = hospitalName;
        }

        @Override
        public void printDetails() {
            System.out.println("The doctor details are:");
            super.printDetails();
            System.out.println("Health Professional Type: Cardiologist");
            System.out.println("Hospital Name: " + hospitalName);
        }







    }



    public static void main(String[] args) {
        HealthProfessional hp1 = new HealthProfessional();
        hp1.printDetails();

        HealthProfessional hp2 = new HealthProfessional(244233, "Dr. Xavier Tissera", "Cardiology");
        hp2.printDetails();

        GeneralPractitioner gp1 = new GeneralPractitioner();
        gp1.printDetails();

        GeneralPractitioner gp2 = new GeneralPractitioner(244567, "Dr. Xavier T", "General Medicine", "Clayton Clinic");
        gp2.printDetails();

        Cardiologist c1 = new Cardiologist();
        c1.printDetails();



    }
}
