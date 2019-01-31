import org.junit.Test;

import static org.junit.Assert.*;

public class ConnectTest {

    @Test
    public void connection() {
       Connect connect=Connect.getInstance();
       connect.connection();

    }
}