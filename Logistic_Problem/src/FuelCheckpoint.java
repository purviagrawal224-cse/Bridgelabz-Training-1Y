public class FuelCheckpoint extends Checkpoint {

    public FuelCheckpoint(String id, String loc, double d, int e, int a) {
        super(id, loc, d, e, a);
    }

    public boolean isCritical() { return true; }

    public String getType() { return "FuelCheckpoint"; }

    public double calculatePenalty() {
        return isDelayed() ? 10 : 0;
    }
}