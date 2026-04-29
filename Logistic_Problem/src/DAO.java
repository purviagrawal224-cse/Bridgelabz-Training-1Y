import java.sql.*;

public class DAO {
    public static void saveDriver(Driver d) {
        try (Connection con = DBConnection.getConnection()) {

            String sql = "INSERT IGNORE INTO drivers VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, d.driverId);
            ps.setString(2, d.name);

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void saveCheckpoint(String driverId, Checkpoint cp) {
        try (Connection con = DBConnection.getConnection()) {

            String sql = "INSERT INTO checkpoints " +
                    "(checkpoint_id, driver_id, type, location_name, distance, expected_duration, actual_duration) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, cp.checkpointId);
            ps.setString(2, driverId);
            ps.setString(3, cp.getType());
            ps.setString(4, cp.locationName);
            ps.setDouble(5, cp.distanceFromLast);
            ps.setInt(6, cp.expectedDuration);
            ps.setInt(7, cp.actualDuration);

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static RouteLinkedList<Checkpoint> loadRoute(String driverId) {

        RouteLinkedList<Checkpoint> list = new RouteLinkedList<>();

        try (Connection con = DBConnection.getConnection()) {

            String sql = "SELECT * FROM checkpoints WHERE driver_id=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, driverId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                String type = rs.getString("type");
                Checkpoint cp = null;

                if (type.equals("DeliveryCheckpoint")) {
                    cp = new DeliveryCheckpoint(
                            rs.getString("checkpoint_id"),
                            rs.getString("location_name"),
                            rs.getDouble("distance"),
                            rs.getInt("expected_duration"),
                            rs.getInt("actual_duration")
                    );
                }
                else if (type.equals("FuelCheckpoint")) {
                    cp = new FuelCheckpoint(
                            rs.getString("checkpoint_id"),
                            rs.getString("location_name"),
                            rs.getDouble("distance"),
                            rs.getInt("expected_duration"),
                            rs.getInt("actual_duration")
                    );
                }
                else if (type.equals("RestCheckpoint")) {
                    cp = new RestCheckpoint(
                            rs.getString("checkpoint_id"),
                            rs.getString("location_name"),
                            rs.getDouble("distance"),
                            rs.getInt("expected_duration"),
                            rs.getInt("actual_duration")
                    );
                }

                if (cp != null) {
                    list.addCheckpoint(cp);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    public static void clearData() {
        try (Connection con = DBConnection.getConnection()) {

            Statement st = con.createStatement();

            st.executeUpdate("DELETE FROM checkpoints");
            st.executeUpdate("DELETE FROM drivers");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}