package src.referenceVars;

public class University {
    String name;
    String country;
    int zipCode;
    boolean isInTop100;

    public University(String name) {
        this.name = name;
    }

    public University(String name, String country, int zipCode, boolean isInTop100) {
        this.name = name;
        this.country = country;
        this.zipCode = zipCode;
        this.isInTop100 = isInTop100;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", zipCode=" + zipCode +
                ", isInTop100=" + isInTop100 +
                '}';
    }


}

