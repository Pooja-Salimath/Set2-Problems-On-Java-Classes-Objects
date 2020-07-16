class EmployeeWageForCompany
{
	public static void main(String[] args)
	{
		int IS_FULL_TIME = 1;
		int RATE_PER_HOUR = 20;
		int empHrs = 0;
		int empWage = 0;
		System.out.println("-----: Welcome to Employee Wage Computation :----");
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME)
		{
			empHrs = 8;
			empWage = empHrs * RATE_PER_HOUR;
			System.out.println("Employee is Present");
			System.out.println("Employee Wage:" +empWage);
		}
		else
		{
		       System.out.println("Employee is Absent");
		}
	}
}
