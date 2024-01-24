package Ex6;

public class Laptop {
    private String model;
    private int RAM;
    private int hard_drive;
    private String operational_system;
    private String color;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getHard_drive() {
        return hard_drive;
    }

    public void setHard_drive(int hard_drive) {
        this.hard_drive = hard_drive;
    }

    public String getOperational_system() {
        return operational_system;
    }

    public void setOperational_system(String operational_system) {
        this.operational_system = operational_system;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "model: " + model + ", RAM: " + RAM + ", hard_drive: " + hard_drive + ", operational_system: " + operational_system+ ", color: " + color;
    }
}
