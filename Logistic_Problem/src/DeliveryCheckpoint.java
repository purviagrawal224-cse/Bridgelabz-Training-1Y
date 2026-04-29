public class DeliveryCheckpoint extends Checkpoint {

    public DeliveryCheckpoint(String id, String loc, double d, int e, int a) {
        super(id, loc, d, e, a);
    }

    public boolean isCritical() { return true; }

    public String getType() { return "DeliveryCheckpoint"; }

    public double calculatePenalty() {
        return isDelayed() ? (actualDuration - expectedDuration) * 2 : 0;
    }
}