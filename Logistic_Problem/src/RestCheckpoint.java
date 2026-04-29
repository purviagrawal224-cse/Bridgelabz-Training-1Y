public class RestCheckpoint extends Checkpoint {

    public RestCheckpoint(String id, String loc, double d, int e, int a) {
        super(id, loc, d, e, a);
    }

    public boolean isCritical() { return false; }

    public String getType() { return "RestCheckpoint"; }

    public double calculatePenalty() {
        int delay = actualDuration - expectedDuration;
        return (delay > 30) ? delay * 0.5 : 0;
    }
}