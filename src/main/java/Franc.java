class Franc extends Money {
    Franc(int amount) {
        this.amount = amount;
        this.currency = "CHF";
    }
    @Override
    String currency() {
        return currency;
    }
}