class EmployeeWageForCompany
{
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 2;

	public static void main(String[] args)
	{
		
		int empHrs = 0;
		int empWage = 0;
		int totalWorkingDays = 0;
		int totalWage = 0;

		System.out.println("-----: Welcome to Employee Wage Computation :----");
		for (int days = 0; days < NUM_OF_WORKING_DAYS; days++)
		{
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck)
			{
				case IS_FULL_TIME:
				empHrs = 8;
				break;
				case IS_PART_TIME:
				empHrs = 4;
				break;
				default : empHrs = 0;
			}
			empWage = empHrs * RATE_PER_HOUR;
			totalWage += empWage;
			System.out.println("Employee Wage:" +empWage);
		}
		System.out.println("Total Monthly Employee Wage:" +totalWage);
	}
}
