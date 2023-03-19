import org.testng.annotations.Test;

public class TestLettre {
    @Test
    void test01(){
        Lettre leVerte = new Lettre(2.0, "expresse", "", "A4");
        Lettre leJaune = new Lettre(4.0, "normal", "07 rue lucie aubrac, bondy", "A3");
        System.out.println(leVerte);
        System.out.println(leJaune);

    }
}
