import org.testng.annotations.Test;

public class TestColis {
    @Test
    public void test01() {
        Colis colis1 = new Colis(4, "normal", "", 2);
        Colis colis2 = new Colis(15, "express", "07 rue lucie aubrac bondy", 5.5);
        Colis colis3 = new Colis(15, "express", "07 rue lucie aubrac bondy", 51);

        System.out.println(colis1);
        System.out.println(colis2);
        System.out.println(colis3);

    }
}
