package ExpenseType;

public class ExpenseTypeProgram2 extends ExpenseTypeProgram
 {

	public static void main(String[] args)
	{

		
		int breakfast = ExpenseTypeProgram.breakfast(1000);
		int dinner = ExpenseTypeProgram.dinner(2000);
		int mealExpense = ExpenseTypeProgram.mealExpense(3000);
		int carRental = ExpenseTypeProgram.carRental(3000);
		int lunch = ExpenseTypeProgram.lunch(2000);
		System.out.println("The Meal expense is :" +(breakfast + dinner));
		System.out.println("The lunch is expense is : "+lunch);
		System.out.println("Total  Expense is : "+ (breakfast+dinner+carRental));

	}

}
