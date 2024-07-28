package programmerzamannow.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
// belajar singleton
public class DatabaseTest {
    @Test
    void testSingleton() {

        var database1 = Database.getInstance();
        var database2 = Database.getInstance();

        Assertions.assertSame(database1,database2);

    }
}
