import org.testng.annotations.Test;

public class TestPublicite {
    @Test
    public void test01() {
        Publicite pub1 = new Publicite(1.5, "normal", "");
        Publicite pub2 = new Publicite(5, "express", "106 rue du vieux pont 78955 CSP");

        System.out.println(pub1);
        System.out.println(pub2);
    }
}
