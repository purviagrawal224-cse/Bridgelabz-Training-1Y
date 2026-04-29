class RouteLinkedList<T extends Checkpoint> {
    private class Node {
        T data;
        Node next;
        Node(T data) { this.data = data; }
    }

    private Node head = null;

    public void addCheckpoint(T checkpoint) {
        Node newNode = new Node(checkpoint);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) current = current.next;
            current.next = newNode;
        }
    }
    public boolean removeCheckpoint(String checkpointId) {
        if (head == null) return false;
        if (head.data.checkpointId.equals(checkpointId)) {
            head = head.next;
            return true;
        }
        Node current = head;
        while (current.next != null && !current.next.data.checkpointId.equals(checkpointId)) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
            return true;
        }
        return false;
    }

    public T findCheckpoint(String checkpointId) {
        Node current = head;
        while (current != null) {
            if (current.data.checkpointId.equals(checkpointId)) return current.data;
            current = current.next;
        }
        return null;
    }

    public double computeTotalDistance() {
        double total = 0;
        Node current = head;
        while (current != null) {
            total += current.data.distanceFromLast;
            current = current.next;
        }
        return total;
    }

    public double computeTotalPenalty() {
        double total = 0;
        Node current = head;
        while (current != null) {
            total += current.data.calculatePenalty();
            current = current.next;
        }
        return total;
    }

    public void printRoute() {
        Node current = head;
        int count = 1;
        while (current != null) {
            System.out.println(count + ". " + current.data.toString());
            current = current.next;
            count++;
        }
    }

    public boolean checkCriticalPoints() {
        Node current = head;
        while (current != null) {
            if (current.data.isCritical() && current.data.actualDuration == 0) {
                return false;
            }
            current = current.next;
        }
        return true;
    }
}
