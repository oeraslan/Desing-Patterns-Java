package creational.builderPattern;

public class Home {
    private int room;
    private int chicken;
    private int bedroom;
    private String address;
    private String city;
    private String town;
    private Boolean isPool;
    private Boolean isGarden;

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getChicken() {
        return chicken;
    }

    public void setChicken(int chicken) {
        this.chicken = chicken;
    }

    public int getBedroom() {
        return bedroom;
    }

    public void setBedroom(int bedroom) {
        this.bedroom = bedroom;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public Boolean getPool() {
        return isPool;
    }

    public void setPool(Boolean pool) {
        isPool = pool;
    }

    public Boolean getGarden() {
        return isGarden;
    }

    public void setGarden(Boolean garden) {
        isGarden = garden;
    }

    @Override
    public String toString() {
        return "Home{" +
                "room=" + room +
                ", chicken=" + chicken +
                ", bedroom=" + bedroom +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", town='" + town + '\'' +
                ", isPool=" + isPool +
                ", isGarden=" + isGarden +
                '}';
    }
}
