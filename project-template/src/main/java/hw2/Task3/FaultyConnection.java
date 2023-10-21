package hw2.Task3;

import java.util.Random;

public class FaultyConnection implements Connection {
    @Override
    public void execute(String command) {
        if(new Random().nextInt(3) == 0)
            throw new ConnectionException();
        System.out.println(this.getClass() + " execute command: " + command);
    }

    @Override
    public void close() throws Exception {
        System.out.println(this.getClass() + " to close");
    }
}
