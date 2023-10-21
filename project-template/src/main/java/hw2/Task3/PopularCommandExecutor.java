package hw2.Task3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class PopularCommandExecutor {
    private final ConnectionManager manager;
    private final int maxAttempts;

    private final static Logger PopularCommandExecutorLogger = LogManager.getLogger();

    public PopularCommandExecutor(ConnectionManager manager, int maxAttempts) {
        PopularCommandExecutorLogger.info("Create PopularCommandExecutor");
        this.manager = manager;
        this.maxAttempts = maxAttempts;
    }

    public void updatePackages() throws Exception {
        tryExecute("apt update && apt upgrade -y");
    }

    void tryExecute(String command) throws Exception {
        Connection conn = manager.getConnection();
        int localMaxAttempts = maxAttempts;
        while (true) {

            try {
                conn.execute(command);
                PopularCommandExecutorLogger.info("Command execute");
                break;
            } catch (ConnectionException e) {
                PopularCommandExecutorLogger.warn("Attempt of execution failed", e);
                localMaxAttempts--;
                if (localMaxAttempts < 0) {
                    PopularCommandExecutorLogger.error("Execution fully failed", e);
                    throw e;
                }
            }
        }
        conn.close();
        PopularCommandExecutorLogger.info("Connection close");
    }
}
