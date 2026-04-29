public class RouteLinkedList<T extends Checkpoint> {

    public class Node {
        T data;
        Node next;

        Node(T d) { data = d; }
    }

    public Node head;

    public void addCheckpoint(T cp) {
        Node n = new Node(cp);
        if (head == null) head = n;
        else {
            Node t = head;
            while (t.next != null) t = t.next;
            t.next = n;
        }
    }

    public boolean removeCheckpoint(String id) {
        if (head == null) return false;

        if (head.data.checkpointId.equals(id)) {
            head = head.next;
            return true;
        }

        Node t = head;
        while (t.next != null) {
            if (t.next.data.checkpointId.equals(id)) {
                t.next = t.next.next;
                return true;
            }
            t = t.next;
        }
        return false;
    }

    public T findCheckpoint(String id) {
        Node t = head;
        while (t != null) {
            if (t.data.checkpointId.equals(id)) return t.data;
            t = t.next;
        }
        return null;
    }

    public double computeTotalDistance() {
        double sum = 0;
        Node t = head;
        while (t != null) {
            sum += t.data.distanceFromLast;
            t = t.next;
        }
        return sum;
    }

    public double computeTotalPenalty() {
        double sum = 0;
        Node t = head;
        while (t != null) {
            sum += t.data.calculatePenalty();
            t = t.next;
        }
        return sum;
    }

    public boolean checkCritical() {
        boolean d = false, f = false;
        Node t = head;

        while (t != null) {
            if (t.data instanceof DeliveryCheckpoint) d = true;
            if (t.data instanceof FuelCheckpoint) f = true;
            t = t.next;
        }
        return d && f;
    }

    public void printRoute() {
        Node t = head;
        int i = 1;

        while (t != null) {
            Checkpoint cp = t.data;
            String status = cp.isDelayed() ? "Delayed" : "On Time";

            System.out.println(i + ". " + cp.getType() + " – " +
                    cp.locationName + " – " + status +
                    " – Penalty: " + cp.calculatePenalty());

            t = t.next;
            i++;
        }
    }
}