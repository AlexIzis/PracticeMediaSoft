public class Admission {
    private final int id;
    private final String DoctorName;
    private final String PatientName;
    private String status;
    private final String date;

    public Admission(int id, String Doctor, String Patient, String status, String date) {
        this.id = id;
        this.DoctorName = Doctor;
        this.PatientName = Patient;
        this.status = status;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public String getPatientName() {
        return PatientName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }
}
