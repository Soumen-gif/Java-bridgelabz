class empwage{
     int IS_PART_TIME=1; 
	 int IS_FULL_TIME=2;
	 String company;
	 int empRatePerHour; 
	 int maxHoursPerMonth; 
	 int numOfWorkingDays;

	 EmployeWage(String company, int empRatePerHour, int maxHoursPerMonth, int numOfWorkingDays)
        {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.maxHoursPerMonth = maxHoursPerMonth;
		this.numOfWorkingDays = numOfWorkingDays;
	}

          int computeEmpWage() 
          {
		int empHrs=0, totalEmpHrs=0,totalWorkingDays=0;
		while(totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays)
                {
			 totalWorkingDays++; 
			 int attendance=(int)(Math.random()*3); 
			 switch(attendance) 
			 { 
			 case IS_FULL_TIME:empHrs=8;
			 break; 
			 case IS_PART_TIME:empHrs=4;
			 break;
			 default:empHrs=0; 
			 break; 
			 } 
			 totalEmpHrs=(totalEmpHrs+empHrs); 
			 System.out.println("Days= "+ totalWorkingDays+ " Emp Hr: "+empHrs);
		}
		return totalEmpHrs*empRatePerHour;
	}
			public static void main(String[] args)
        	{ 
			empwage  e1=new empwage("big bazar",20,2,10);
			System.out.println("Total Employee Wage for Company "+ dmart.company+" is: "+dmart.computeEmpWage()); 
	        empwage  e2=new empwage("peter england",15,2,20);
			System.out.println("Total Employee Wage for Company "+ reliance.company+" is: "+reliance.computeEmpWage());
			}
}
