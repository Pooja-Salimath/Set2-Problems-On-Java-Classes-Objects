class EmployeeWageForCompany
{
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	public static void main(String[] args)
	{
		ComputeEmpWage("DMart",20,2,10);
		ComputeEmpWage("Reliance",10,4,20);
	}
	public static int ComputeEmpWage(String Company, int empRatePerHour, int NumOfWorkingDays,int MaxHoursPerMonth)
	{
		int empHrs = 0;
		int empWage = 0;
		int totalWorkingDays = 0;
		int totalWage = 0;
		int totalWorkingHrs = 0;

		System.out.println("-----: Welcome to Employee Wage Computation :----");
		while(totalWorkingHrs <= MaxHoursPerMonth && totalWorkingDays < NumOfWorkingDays)
		{
			totalWorkingDays++;
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
			
			totalWorkingHrs += empHrs;
			System.out.println("Day# :" +totalWorkingDays+ " Emp Hrs:" +empHrs);
		}
		int TotalempWage= totalWorkingHrs  * empRatePerHour ;
		System.out.println("Total Monthly Employee Wage for Company: " +Company+ " is:" +TotalempWage);
		return TotalempWage;
	}
}
