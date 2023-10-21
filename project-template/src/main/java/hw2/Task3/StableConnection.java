package hw2.Task3;

import java.util.logging.Logger;

public class StableConnection implements Connection {

    @Override
    public void execute(String command) {
        System.out.println(this.getClass() + " execute command: " + command);
    }

    @Override
    public void close() throws Exception {
        System.out.println(this.getClass() + " to close");
    }
}
