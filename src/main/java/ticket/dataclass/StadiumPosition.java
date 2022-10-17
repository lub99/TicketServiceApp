package ticket.dataclass;

public class StadiumPosition {
    private String side;
    private String sector;
    private int row;
    private int column;

    public StadiumPosition(String side, String sector, int row, int column) {
        this.side = side;
        this.sector = sector;
        this.row = row;
        this.column = column;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return "StadiumPosition{" +
                "side='" + side + '\'' +
                ", sector='" + sector + '\'' +
                ", row=" + row +
                ", column=" + column +
                '}';
    }
}
