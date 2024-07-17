// Import the ArrayList class
import java.util.ArrayList;
// Import the List interface
import java.util.List;

// Part 1 base class as per the request
public class AssignmentOne {

    // Health Professional base class
    public static class HealthProfessional {
        private int ID;
        private String name;
        private String department;

        // default constructor
        public HealthProfessional(){
            this.ID = 0;
            this.name = "default";
            this.department= "default";
        }

        //  second constructor that initialises all the instance variables
        public HealthProfessional(int ID, String name, String department){
            this.ID = ID;
            this.name = name;
            this.department = department;
        }

        // Getters and setters for validation inputs
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

        //method that print details
        public void printDetails() {
            System.out.println("ID: " + ID);
            System.out.println("Name: " + name);
            System.out.println("Department: " + department);
        }


    }

    // Part 2 - – Child classes
    public static class GeneralPractitioner extends HealthProfessional {

        // Additional variable
        private String clinicName;

        // Default constructor
        public GeneralPractitioner() {
            super();
            this.clinicName = "default Clinic";
        }

        // Parameterized constructor
        public GeneralPractitioner(int ID, String name, String department, String clinicName) {
            super(ID, name, department);
            this.clinicName = clinicName;
        }

        // Getter and setter
        public String getClinicName() {
            return clinicName;
        }

        public void setClinicName(String clinicName) {
            this.clinicName = clinicName;
        }

        // Overriding printDetails method from the super class HealthProfessional
        @Override
        public void printDetails() {
            System.out.println("--The doctor details are:--");
            super.printDetails();
            System.out.println("Health Professional Type: General Practitioner");
            System.out.println("Clinic Name: " + clinicName);
        }
    }

    // Cardiologist class
    public static class Cardiologist extends HealthProfessional {
        private String hospitalName;

        //default constructor
        public Cardiologist() {
            super();
            this.hospitalName = "default Hospital";
        }

        public Cardiologist(int ID, String name, String department, String hospitalName) {
            super(ID, name, department);
            this.hospitalName = hospitalName;
        }

        // Getters and setters
        public String getHospitalName() {
            return hospitalName;
        }

        public void setHospitalName(String hospitalName) {
            this.hospitalName = hospitalName;
        }

        // Overriding printDetails method from the super class HealthProfessional
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

        // constructor for appointments
        public Appointment(String patientName, String mobilePhone, String preferredTimeSlot, HealthProfessional selectedDoctor) {
            this.patientName = patientName;
            this.mobilePhone = mobilePhone;
            this.preferredTimeSlot = preferredTimeSlot;
            this.selectedDoctor = selectedDoctor;
        }

        // Getters and setters
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

        public String getPreferredTimeSlot() {
            return preferredTimeSlot;
        }

        public void setPreferredTimeSlot(String preferredTimeSlot) {
            this.preferredTimeSlot = preferredTimeSlot;
        }

        public HealthProfessional getSelectedDoctor() {
            return selectedDoctor;
        }

        public void setSelectedDoctor(HealthProfessional selectedDoctor) {
            this.selectedDoctor = selectedDoctor;
        }

        // Method to print details
        public void printDetails() {
            System.out.println("Patient Name: " + patientName);
            System.out.println("Mobile Phone: " + mobilePhone);
            System.out.println("Preferred Time: " + preferredTimeSlot);
            System.out.println("Selected Doctor:");
            if (selectedDoctor != null) {
                selectedDoctor.printDetails();
            } else {
                System.out.println("You haven't selected the doctor");
            }
        }


    }

    // Part 5 – Collection of appointments
    // Also, make sure all required information is
    //supplied when creating a new appointment. Otherwise, the appointment can not be created
    public static void createAppointment(List<Appointment> appointments, String patientName, String mobilePhone, String preferredTimeSlot, HealthProfessional doctor) {
        if (patientName != null && !patientName.isEmpty() && mobilePhone != null && !mobilePhone.isEmpty() && preferredTimeSlot != null && !preferredTimeSlot.isEmpty() && doctor != null) {
            Appointment appointment = new Appointment(patientName, mobilePhone, preferredTimeSlot, doctor);
            appointments.add(appointment);
        } else {
            System.out.println("Sorry! Appointment cannot be created. Please fill the missing information.");
        }
    }

    // printing existing appointments
    public static void printExistingAppointments(List<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("Sorry! No existing appointments.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printDetails();
                System.out.println("------------------------------");
            }
        }
    }

    // method to cancel a booking using mobile phone
    public static void cancelBooking(List<Appointment> appointments, String mobilePhone) {
        Appointment toRemove = null;
        for (Appointment appointment : appointments) {
            if (appointment.getMobilePhone().equals(mobilePhone)) {
                toRemove = appointment;
                break;
            }
        }
        if (toRemove != null) {
            appointments.remove(toRemove);
            System.out.println("Appointment cancelled for mobile phone: " + mobilePhone);
        } else {
            System.out.println("Sorry, No appointment found under mobile phone: " + mobilePhone);
        }
    }



    public static void main(String[] args) {

        // Part 3 – Using classes and objects

        // three objects of General Practitioners
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Ashly Young", "General Medicine", "Clayton Clinic");
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Lisa Collet", "General Medicine", "Ashburton Clinic");
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Dr. Annie Mel", "Family Medicine", "Springvales Clinic");

        // objects of Cardiologists
        Cardiologist c1 = new Cardiologist(201, "Dr. Vini Anderson", "Cardiology", "Monash Heart Hospital");
        Cardiologist c2 = new Cardiologist(202, "Dr. Emily Ross", "Cardiology", "Kingston Hospital");

        // print health professionals
        gp1.printDetails();
        System.out.println("------------------------------");
        gp2.printDetails();
        System.out.println("------------------------------");
        gp3.printDetails();
        System.out.println("------------------------------");

        c1.printDetails();
        System.out.println("------------------------------");
        c2.printDetails();
        System.out.println("------------------------------");


        // Part 5 – Collection of appointments
        // Declare an ArrayList to store objects Appointment class
        List<Appointment> appointments = new ArrayList<>();

        //Create new appointments

        //test
        createAppointment(appointments, "", "0451064234", "08:00", gp1);

        createAppointment(appointments, "Roshali Obris", "0451064234", "08:00", gp1);
        createAppointment(appointments, "Norma Fernando", "0452333143", "10:00", gp2);

        createAppointment(appointments, "Andrea Perera", "0456567413", "14:30", c1);
        createAppointment(appointments, "Michael Ester", "0454535769", "16:00", c2);


        // Print appointments
        System.out.println("--Existing Appointments:--");
        printExistingAppointments(appointments);

        // Cancel one of the existing appointments
        cancelBooking(appointments, "0452333143");

        // Print appointments again
        System.out.println("--Updated Appointments List:--");
        printExistingAppointments(appointments);


    }
}
