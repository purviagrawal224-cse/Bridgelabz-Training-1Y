import java.util.ArrayList;
import java.util.List;

abstract class Checkpoint {
    String checkpointId;
    String locationName;
    double distanceFromLast;
    int expectedDuration;
    int actualDuration;


    public Checkpoint(String checkpointId, String locationName, double distanceFromLast, int expectedDuration, int actualDuration) {
        this.checkpointId = checkpointId;
        this.locationName = locationName;
        this.distanceFromLast = distanceFromLast;
        this.expectedDuration = expectedDuration;
        this.actualDuration = actualDuration;
    }

    public boolean isDelayed() {
        return actualDuration > expectedDuration;
    }

    public int getDelay() {
        return Math.max(0, actualDuration - expectedDuration);
    }

    abstract double calculatePenalty();
    abstract boolean isCritical();
    abstract String getType();

    @Override
    public String toString() {
        String status = isDelayed() ? "Delayed" : "On Time";
        return String.format("%s – %s – %s – Penalty: %.1f", getType(), locationName, status, calculatePenalty());
    }
}
