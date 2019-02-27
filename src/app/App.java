package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");

        SuperConfig cfg = new SuperConfig();

        cfg.DoItInInfra(cfg);
    }
}