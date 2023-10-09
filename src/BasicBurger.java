class BasicBurger implements Burger {
    @Override
    public String getDescription() {
        return "Basic Burger";
    }

    @Override
    public double getCost() {
        return 1500;
    }
}
