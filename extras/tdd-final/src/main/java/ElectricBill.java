public class ElectricBill {

    /*
    Customers with renewable energy can put electricity back into the grid.
    Each customer's net usage (units used - units returned)
    is calculated so that Tech Electric can determine what discounts to apply
    and whether the customer should receive money back.

    - The first 100 units are $0.20 per unit.
    - Anything more than 100 units is calculated at a cost of $0.25 per unit.
    - Any customer who puts electricity back into the grid receives a 5% discount on any owed charges.
    - If a customer returns more energy than they've used, they receive a credit of $0.20
        per unit for each returned unit in excess of the usage. Their credit does not include the 5% discount.

    Implement the logic to calculate a customer's bill when provided with a number of units used and units returned.

    Examples:
    calculateElectricBill(50, 0) ➔ 10.0
    calculateElectricBill(50, 4) ➔ 8.74
    calculateElectricBill(50, 60) ➔ -2.0
    calculateElectricBill(110, 6) ➔ 19.95
    calculateElectricBill(110, 20) ➔ 17.1
    calculateElectricBill(110, 120) ➔ -2.0
     */
    public double calc(double unitsUsed, double unitsReturned) {
        final double NORMAL_RATE = 0.2;
        final double NORMAL_THRESHOLD = 100;
        final double OVERAGE_RATE = 0.25;
        final double DISCOUNT_FACTOR = 0.95;

        double netUsed = unitsUsed - unitsReturned;
        double cost = 0;
        if (netUsed > NORMAL_THRESHOLD) {
            double overage = netUsed - 100;
            cost = (NORMAL_THRESHOLD * NORMAL_RATE) + (overage * OVERAGE_RATE);
        } else {
            cost = netUsed * NORMAL_RATE;
        }

        if (unitsReturned > 0 && cost > 0) {
            cost *= DISCOUNT_FACTOR;
        }

        return cost;
    }

}
