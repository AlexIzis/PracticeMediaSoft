import java.time.Instant;

public class Patient {
    private final int id;
    private String name;
    private final String registrationDate;

    public Patient(int id, String name) {
        this.id = id;
        this.name = name;
        this.registrationDate = Instant.now().toString().substring(0,10);;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }
}
