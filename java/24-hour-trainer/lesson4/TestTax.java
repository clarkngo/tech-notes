class TestTax{
  public static void main(String[] args){
    double grossIncome; // local variables
    String state;
    int dependents;

    grossIncome= 50000;
    dependents= 2;
    state= "NJ";

    Tax t = new Tax(grossIncome, state, dependents);
    Tax t2 = new Tax(65000, "TX", 4 );

    double yourTax = t.calcTax(); //calculating tax
    double hisTax = t2.calcTax();
    double yourTaxEuros = t.euroTax(); //calculating tax
    double hisTaxEuros  = t2.euroTax();

    // Printing the result
    System.out.println("Your tax is " + yourTax);
    System.out.println("Your tax in Euros is " + yourTaxEuros);
    System.out.println("His tax is " + hisTax);
    System.out.println("His tax in Euros is " + hisTaxEuros);
  }
}
