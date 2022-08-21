package Gun39.Ornek2;

public abstract class Sekil {
    private String name;

    public abstract double alan();
    public abstract double cevre();

    public void ciz(){
        System.out.println(this.name +" isimli şekil çizildi.");
    }

    @Override
    public String toString() {
        return "Sekil{" +
                "name='" + name + '\'' +
                "alan='" + Math.round(alan()) + '\'' +
                "cevre='" + Math.round(cevre()) + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
