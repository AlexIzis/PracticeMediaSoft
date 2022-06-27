public class Doctor {
    private final int id;
    private final String name;
    private String specialization;
    private int cabinetNumber;

    public Doctor(int id, String name, String specialization, int cabinetNumber) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.cabinetNumber = cabinetNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getCabinetNumber() {
        return cabinetNumber;
    }

    public void setCabinetNumber(int cabinetNumber) {
        this.cabinetNumber = cabinetNumber;
    }
}
