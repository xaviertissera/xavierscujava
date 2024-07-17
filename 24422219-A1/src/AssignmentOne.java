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
            System.out.println("--The doctor details are:--");
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
            System.out.println("--The doctor details are:--");
            super.printDetails();
            System.out.println("Health Professional Type: Cardiologist");
            System.out.println("Hospital Name: " + hospitalName);
        }



    }

    //part 4 - appointment class
    public static class Appointment {
        private String patientName;
        private String mobilePhone;
        private String preferredTimeSlot;
        private HealthProfessional selectedDoctor;

        public Appointment() {
            this.patientName = "default";
            this.mobilePhone = "default";
            this.preferredTimeSlot = "00:00";
            this.selectedDoctor = null;
        }

        public String getPatientName() {
            return patientName;
        }

        public void setPatientName(String patientName) {
            this.patientName = patientName;
        }

        public String getMobilePhone() {
            return mobilePhone;
        }

        public void setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
        }








    }



    public static void main(String[] args) {

        // Part 3 – Using classes and objects

        // three objects of General Practitioners
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Ashly Young", "General Medicine", "Clayton Clinic");

        // objects of Cardiologists
        Cardiologist c1 = new Cardiologist(201, "Dr. Vini Anderson", "Cardiology", "Monash Heart Hospital");
        // print health professionals
        gp1.printDetails();
        System.out.println("------------------------------");

        c1.printDetails();
        System.out.println("------------------------------");




    }
}
