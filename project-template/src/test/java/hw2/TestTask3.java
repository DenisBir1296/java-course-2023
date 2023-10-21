package hw2;

import hw2.Task3.FaultyConnectionManager;
import hw2.Task3.PopularCommandExecutor;
import org.junit.jupiter.api.Test;

public class TestTask3 {

    @Test
    void TestPopularCommandExecutor() {
        // ConnectionException бросается с вероятностью 1/3
        // Вероятность возврата проблемного соединения из DefaultConnectionManager равна 1/2
        PopularCommandExecutor cl = new PopularCommandExecutor(new FaultyConnectionManager(), 3);
        try {
            cl.updatePackages();
        } catch (Exception e) {
            System.out.println("Update Package failed");
        }

    }
}
