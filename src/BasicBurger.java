class BasicBurger implements Burger {
    private static BasicBurger instance;
    private BasicBurger() {
    }
    public static BasicBurger getInstance() {
        if (instance == null) {
            instance = new BasicBurger();
        }
        return instance;
    }
    @Override
    public String getDescription() {
        return "Basic Burger";
    }
    @Override
    public double getCost() {
        return 1500;
    }
}
