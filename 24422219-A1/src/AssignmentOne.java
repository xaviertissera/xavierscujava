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

        public void printDetails() {
            System.out.println("ID: " + ID);
            System.out.println("Name: " + name);
            System.out.println("Department: " + department);
        }

        public int getID() {
            return ID;
        }
    }

    public static void main(String[] args) {
        HealthProfessional hp1 = new HealthProfessional();
        hp1.printDetails();

        HealthProfessional hp2 = new HealthProfessional(244233, "Dr. Xavier Tissera", "Cardiology");
        hp2.printDetails();

    }
}
