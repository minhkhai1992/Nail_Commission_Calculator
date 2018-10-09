import java.io.*;
import java.util.*;

public class Nail_Driver_inFile {

	public static void main(String[] args) throws FileNotFoundException
	{
		int workDay;
		String fileName;
		double total = 0.0;
		double totalTip = 0.0;
		
		Scanner input = new Scanner (System.in);
		PrintWriter inFile;
		Nail_Commission nail = new Nail_Commission();
		
		
		
		System.out.println("Enter the txt file name (contain .txt at the end): ");
		fileName = input.nextLine();
		
		inFile = new PrintWriter(fileName);
		
		
			do {
				System.out.println("How many days you worked ?");
				workDay = input.nextInt();				
			}while(workDay < 0 || workDay > 7);
			
			
			double[] myWorkDay = new double[workDay];
			double[] myTipDay = new double[workDay];
			for (int i = 0; i < myWorkDay.length; i++)
			{
				do {
				System.out.print("Enter money you make day " + (i+1) + ": ");
				myWorkDay[i] = input.nextDouble();
				}while(myWorkDay[i] < 0);
				
				do {
				System.out.print("Enter total Tip day " + (i+1) + ": ");
				myTipDay[i] = input.nextDouble();
				}while(myTipDay[i] < 0);
				
				inFile.println("The day "+ (i+1)+ " you make: " + myWorkDay[i]);
				inFile.println("The tip day " + (i+1) + "you make: " + myTipDay[i]);
				total += myWorkDay[i];
				totalTip += myTipDay[i];
			}
			
			nail.setCommission(total);
			nail.setTip(totalTip);
			nail.commissionCal(nail.getCommission(),totalTip);
			System.out.println("\nYou worked " + workDay + " Days");
			System.out.println("You made " + nail.getCommission() + " in this week!!!\n");
			System.out.println(nail.toString());
			
		inFile.close();
		System.out.println("The File created !!!");
	}
	
	
	
}// end class
