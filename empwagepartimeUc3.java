class empwagepartimeUc3
{
public static void main(String[] args) {
      System.out.println("Welcome to the Employee wage computation");
   int IS_PRESENT=1;
            int wagePerHour=20;
            int fullDay=8;
            int halfDay=4;
            int empWage;
            double empCheck=Math.floor(Math.random() * 10 ) %2;
            if (empCheck==IS_PRESENT){
            int IS_FULLTIME=1;
            double fullTimeCheck=Math.floor(Math.random()*10)%2;
            System.out.println("Employee is present");

            if (fullTimeCheck==IS_FULLTIME){
            empWage=wagePerHour*fullDay;
            System.out.println("Employee works fulltime and Employee wage is: "+ empWage);
            }
            else {
            empWage=wagePerHour*halfDay;
                                System.out.println("Employee works parttime and Employee wage is: "+ empWage);
            }
         }

      else{
         System.out.println("Employee is absent");
      }
   }
}


