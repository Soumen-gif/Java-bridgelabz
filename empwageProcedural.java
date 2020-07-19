class empwageProcedural{
 private static final int IS_PART_TIME=1; 
   private static final int IS_FULL_TIME=2; 
   private static final int MAX_HRS_IN_MONTH=10; 
   private static final int EMP_RATE_PER_HR=20; 
   private  static final int NUM_WORKING_DAYS=20;

	public static int caclEmpWageForCompany(String company,int empRate,int numOfDays,int maxHrs) {

     int empHrs=0, totalEmpHrs=0,totalWorkingDays=0;
     while(totalEmpHrs <= maxHrs && totalWorkingDays < numOfDays) {
          totalWorkingDays++; 
          int attendance=(int)(Math.random()*3); 
          switch(attendance) 
          { case IS_FULL_TIME:
            System.out.println("FUll TIME EMPLOYEE");
            empHrs=8;
          break; 
          case IS_PART_TIME:
           System.out.println("PART TIME EMPLOYEE");
          empHrs=4;
          break;
          default:empHrs=0; 
          break; 
		 totalEmpHrs=(totalEmpHrs+empHrs); 
          System.out.println("Days= "+ totalWorkingDays+ " Emp Hr: "+empHrs);
      }
          int totalEmpWage=(totalEmpHrs*empRate);
           System.out.println("Total Emp Wage for Company "+company+" is ="+totalEmpWage );
              return totalEmpWage;

		          while(totalEmpHr <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_WORKING_DAYS)
      {
         totalWorkingDays++; 
         int attendance=(int)(Math.random()*3); 
         int empHrs=0;
         switch(attendance) 
         { case 1:
            empHrs=8; 
            break; 
         case 2:
            empHrs=4;
            break;
         default:
            empHrs=0;
            break; 
         } 
         totalEmpHr=(totalEmpHr+empHrs);
      System.out.println("Company: "+company+"No of days worked  "+totalWorkingDays+"No of hours worked  "+empHrs+"Salary for the month: "+totalEmpWage);
   }
      public static void main(String []args){
       calculateEmpWageForCompany("Big bazar", 20, 8, 28);
      calculateEmpWageForCompany("v-mart", 30, 8, 28);
     calculateEmpWageForCompany("max", 10, 8, 28);
   }
}
}
