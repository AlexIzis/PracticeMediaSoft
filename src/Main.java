import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Patient> patients = new LinkedList<>();
        LinkedList<Doctor> doctors = new LinkedList<>();
        LinkedList<Admission> admissions = new LinkedList<>();

        int code = Authentication.authenticate();
        if (code == 1){
            System.out.println("Greetings to the user!");
            Scanner sc = new Scanner(System.in);
            String choice;
            boolean flag = true;
            while (flag){
                System.out.println("""
                        Select an action:
                        1-Display a list of all patients in the console
                        2-Add a patient to the list
                        3-Delete patient data
                        4-Editing the patient's full name
                        5-Display a list of all doctors in the console
                        6-Add a doctor to the list
                        7-Display a list of all patient's admissions in the console
                        8-Add a admission to the list
                        9-Change the admission status
                        10-Exiting the program""");
                choice = sc.nextLine();
                switch (choice) {
                    case "1" -> {
                        if (patients.size() == 0){
                            System.out.println("There are no patients on the list\n");
                        } else {
                            for (Patient str : patients) {
                                int i = str.getId();
                                System.out.println("Patient's id: " + i);
                                String fn = str.getName();
                                System.out.println("Patient's Full Name: " + fn);
                                String d = str.getRegistrationDate();
                                System.out.println("Date of patient registration: " + d + "\n");
                            }
                        }
                    }
                    case "2" -> {
                        System.out.println("Enter the patient's full name: ");
                        String name = sc.nextLine();
                        int id = patients.size() + 1;
                        patients.add(new Patient(id, name));
                        System.out.println("The patient has been successfully added\n");
                    }
                    case "3" -> {
                        System.out.println("Enter the patient's full name: ");
                        String name = sc.nextLine();
                        for (Patient str: patients){
                            if (str.getName().equals(name)){
                                patients.remove(str);
                                break;
                            }
                        }
                        System.out.println("The patient has been successfully removed\n");
                    }
                    case "4" -> {
                        System.out.println("Enter the patient's full name: ");
                        String name = sc.nextLine();
                        System.out.println("Enter new data: ");
                        String newName = sc.nextLine();
                        for (Patient str: patients){
                            if (str.getName().equals(name)){
                                str.setName(newName);
                                break;
                            }
                        }
                        System.out.println("The patient's data has been successfully changed\n");
                    }
                    case "5" -> {
                        if (doctors.size() == 0) {
                            System.out.println("There are no doctors on the list\n");
                        } else {
                            for (Doctor str : doctors) {
                                int i = str.getId();
                                System.out.println("Doctor's id: " + i);
                                String fn = str.getName();
                                System.out.println("Doctor's Full Name: " + fn);
                                String s = str.getSpecialization();
                                System.out.println("Doctor's Specialization: " + s);
                                int c = str.getCabinetNumber();
                                System.out.println("Number of cabinet: " + c + "\n");
                            }
                        }
                    }
                    case "6" -> {
                        System.out.println("Enter the doctor's full name: ");
                        String name = sc.nextLine();
                        System.out.println("Enter the doctor's specialization: ");
                        String sp = sc.nextLine();
                        System.out.println("Enter the doctor's number of cabinet: ");
                        int num = Integer.parseInt(sc.nextLine());
                        int id = doctors.size() + 1;
                        doctors.add(new Doctor(id, name, sp, num));
                        System.out.println("The doctor has been successfully added\n");
                    }
                    case "7" -> {
                        System.out.println("Enter the patient's full name: ");
                        String name = sc.nextLine();
                        for (Admission str: admissions){
                            if (str.getPatientName().equals(name)){
                                int id = str.getId();
                                System.out.println("Admission's id: " + id);
                                String dn = str.getDoctorName();
                                System.out.println("Doctor's Full Name: " + dn);
                                String st = str.getStatus();
                                System.out.println("Status of admission: " + st);
                                String d = str.getDate();
                                System.out.println("Date of admission: " + d + "\n");
                            }
                        }
                    }
                    case "8" -> {
                        System.out.println("Enter the doctor's full name: ");
                        String nameD = sc.nextLine();
                        System.out.println("Enter the patient's full name: ");
                        String nameP = sc.nextLine();
                        System.out.println("Specify the status of admission(you need to choose from the following items:"
                                + "new, in progress, canceled, awaiting payment, completed)");
                        String status = sc.nextLine();
                        System.out.println("Enter the date (in the format mm-dd): ");
                        String date = sc.nextLine();
                        int id = admissions.size() + 1;
                        admissions.add(new Admission(id, nameD, nameP, status, date));
                        System.out.println("The admission has been successfully added\n");
                    }
                    case  "9" -> {
                        System.out.println("Enter the patient's full name: ");
                        String name = sc.nextLine();
                        System.out.println("Enter the admission's id: ");
                        int id = Integer.parseInt(sc.nextLine());
                        System.out.println("Enter a new status(you need to choose from the following items:"
                                + "new, in progress, canceled, awaiting payment, completed)");
                        String st = sc.nextLine();
                        for (Admission str: admissions){
                            if (str.getPatientName().equals(name) && str.getId()==id){
                                str.setStatus(st);
                                break;
                            }
                        }
                        System.out.println("The admission's status has been successfully changed\n");
                    }
                    case "10" -> flag = false;
                }
            }
        } else {
            System.out.println("Login or password entered incorrectly");
        }
    }
}
