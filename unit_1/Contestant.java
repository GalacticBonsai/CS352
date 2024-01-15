import java.util.ArrayList;

public class Contestant extends Person {
    private int position;
    private int totalPositions;
    private int roundsPlayed;

    public Contestant(String name) {
        super(name);
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
        totalPositions += position;
        roundsPlayed++;
    }

    public double getAveragePosition() {
        return (double) totalPositions / roundsPlayed;
    }
}

