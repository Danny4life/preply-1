package verlaClasses.week4.classActivity3.model;

public class Devs {

    private String name;

    private boolean isFemale;

    private boolean isMale;

    public Devs(String name, boolean isFemale, boolean isMale) {
        this.name = name;
        this.isFemale = isFemale;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public boolean isMale() {
        return isMale;
    }
}
