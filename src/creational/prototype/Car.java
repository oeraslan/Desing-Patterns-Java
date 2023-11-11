package creational.prototype;

public class Car implements Cloneable{
    private int id;
    private String name;
    private Engine engine;
    private Wheel wheel;

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

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", engine=" + engine +
                ",engine HashCode=" + engine.hashCode() +
                ", wheel=" + wheel +
                ",wheel HashCode="+ wheel.hashCode() +
                '}';
    }

    @Override
    public Car clone() {
        try {
            Car clone = (Car) super.clone();
            clone.setEngine(engine.clone());
            clone.setWheel(wheel.clone());
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
