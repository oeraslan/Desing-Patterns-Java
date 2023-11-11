package creational.prototype;

public class Wheel implements Cloneable{
    private int id;
    private String name;

    public Wheel(int id,String name) {
        this.id=id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public Wheel clone() {
        try {
            Wheel clone = (Wheel) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
