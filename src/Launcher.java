/**
 * Created by jankroon on 17-03-15.
 */
public class Launcher {
    public static void main(String[] args) {
        System.out.println("Launching app 'TranspaBank'");

        ClientDashboard cd = new ClientDashboard();
        cd.setUpUI();
    }
}
