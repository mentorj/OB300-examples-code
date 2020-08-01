package serialization;

import java.io.Serializable;
import java.util.Objects;

public class Voiture implements Serializable {
    private String immat;
    private String color;
    // attribut inutile donc exclu de la serialisation
    private transient float currentSpeed;

    public Voiture(String immat, String color){
        this.color=color;
        this.immat=immat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voiture voiture = (Voiture) o;
        return Float.compare(voiture.currentSpeed, currentSpeed) == 0 &&
                immat.equals(voiture.immat) &&
                color.equals(voiture.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(immat, color, currentSpeed);
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "immat='" + immat + '\'' +
                ", color='" + color + '\'' +
                ", currentSpeed=" + currentSpeed +
                '}';
    }

    public String getImmat() {
        return immat;
    }

    public String getColor() {
        return color;
    }
}
