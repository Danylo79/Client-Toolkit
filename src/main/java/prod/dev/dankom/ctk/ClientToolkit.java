package prod.dev.dankom.ctk;

public class ClientToolkit {
    private static ClientToolkit instance;
    public static ClientToolkit getInstance() {
        if (instance == null) {
            instance = new ClientToolkit();
        }
        return instance;
    }

    public static final String MOD_ID = "ctk_test";

    public String NAME = "Client-Toolkit", VERSION = "B1", AUTHOR = "Dankom";

    public ClientToolkit() {

    }
}
