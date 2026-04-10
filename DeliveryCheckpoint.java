class DeliveryCheckpoint extends Checkpoint {
    public DeliveryCheckpoint(String id, String loc, double dist, int exp, int act) {
        super(id, loc, dist, exp, act);
    }
    @Override double calculatePenalty() { return getDelay() * 2.0; }
    @Override boolean isCritical() { return true; }
    @Override String getType() { return "DeliveryCheckpoint"; }
}

class FuelCheckpoint extends Checkpoint {
    public FuelCheckpoint(String id, String loc, double dist, int exp, int act) {
        super(id, loc, dist, exp, act);
    }
    @Override double calculatePenalty() { return isDelayed() ? 10.0 : 0.0; }
    @Override boolean isCritical() { return true; }
    @Override String getType() { return "FuelCheckpoint"; }
}

class RestCheckpoint extends Checkpoint {
    public RestCheckpoint(String id, String loc, double dist, int exp, int act) {
        super(id, loc, dist, exp, act);
    }
    @Override double calculatePenalty() { return (getDelay() > 30) ? getDelay() * 0.5 : 0.0; }
    @Override boolean isCritical() { return false; }
    @Override String getType() { return "RestCheckpoint"; }
}