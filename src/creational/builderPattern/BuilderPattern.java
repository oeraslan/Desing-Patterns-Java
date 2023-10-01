package creational.builderPattern;

public class BuilderPattern {

    private int room;
    private int chicken;
    private int bedroom;
    private String address;
    private String city;
    private String town;
    private Boolean isPool;
    private Boolean isGarden;

    public static BuilderPattern startBuild() {
        return new BuilderPattern();
    }

    public Home build(){
        Home home = new Home();

        home.setRoom(room);
        home.setChicken(chicken);
        home.setBedroom(bedroom);
        home.setCity(city);
        home.setTown(town);
        home.setAddress(address);
        home.setPool(isPool);
        home.setGarden(isGarden);

        return home;
    }

    public BuilderPattern setRoom(int room) {
        this.room = room;
        return this;
    }

    public BuilderPattern setChicken(int chicken) {
        this.chicken = chicken;
        return this;
    }

    public BuilderPattern setBedroom(int bedroom) {
        this.bedroom = bedroom;
        return this;
    }

    public BuilderPattern setAddress(String address) {
        this.address = address;
        return this;
    }

    public BuilderPattern setCity(String city) {
        this.city = city;
        return this;
    }

    public BuilderPattern setTown(String town) {
        this.town = town;
        return this;
    }

    public BuilderPattern setPool(Boolean pool) {
        isPool = pool;
        return this;
    }

    public BuilderPattern setGarden(Boolean garden) {
        isGarden = garden;
        return this;
    }


}
