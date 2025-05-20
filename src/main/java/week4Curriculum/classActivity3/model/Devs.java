package week4Curriculum.classActivity3.model;

public class Devs {
    private String name;

    private boolean isFemale;

    private boolean isMale;



    public Devs(String name, boolean isMale, boolean isFemale) {
        this.name = name;
        this.isMale = isMale;
        this.isFemale = isFemale;
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
        return isMale;
    }

    public boolean isFemale() {
        return isFemale;
    }
}
