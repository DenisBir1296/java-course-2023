package hw2;

import hw2.Task3.FaultyConnectionManager;
import hw2.Task3.PopularCommandExecutor;
import org.junit.jupiter.api.Test;

public class TestTask3 {

    @Test
    void TestPopularCommandExecutor() {
        // с некоторой вероятностью происходят ошибки
        PopularCommandExecutor cl = new PopularCommandExecutor(new FaultyConnectionManager(), 3);
        try {
            cl.updatePackages();
        } catch (Exception e) {
            System.out.println("Update Package failed");
        }

    }
}
