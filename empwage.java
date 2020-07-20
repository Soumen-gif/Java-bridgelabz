class empwage{
public static void main(String [] args){
    int IS_PRESENT=1;
		int wagePerHour=20;
		int fullDay=8;	
		int empWage;
		double empCheck=Math.floor(Math.random() * 10 ) %2;
		

		if (empCheck==IS_PRESENT){
			System.out.println("Employee is present");
			empWage=wagePerHour*fullDay;
			System.out.println("Employee wage is: "+ empWage);
		}
		else{
			System.out.println("Employee is absent");
		}
	}
}

