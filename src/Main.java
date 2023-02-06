public class Main {

    public static void main(String[] args) {
	double fallCost = 100;
	double winterCost = 150;
	double springCost = 300;
	double summerCost = 50;
	double yearlyCost = 0;
	yearlyCost = fallCost + winterCost + springCost + summerCost; // calculates the yearly cost by adding all the seasonal costs together
	System.out.println("The seasonal costs are $" + fallCost + ", $" + winterCost + ", $" + springCost + ", $" + summerCost + ". " + "The total yearly maintenance cost is $" + yearlyCost); //  outputs the seasonal costs and the total yearly cost
    }
}
