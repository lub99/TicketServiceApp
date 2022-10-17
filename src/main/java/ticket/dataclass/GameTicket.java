package ticket.dataclass;

public class GameTicket {
    private User owner;
    private StadiumPosition position;
    private int price;

    public GameTicket(User owner, StadiumPosition position, int price) {
        this.owner = owner;
        this.position = position;
        this.price = price;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public StadiumPosition getPosition() {
        return position;
    }

    public void setPosition(StadiumPosition position) {
        this.position = position;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "GameTicket{" +
                "owner=" + owner +
                ", position=" + position +
                ", price=" + price +
                '}';
    }
}
