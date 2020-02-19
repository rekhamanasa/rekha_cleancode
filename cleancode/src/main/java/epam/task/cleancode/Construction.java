package epam.task.cleancode;
import java.util.Scanner;

public class Construction {
	public void dimensions(){
		int standard = 1200;
		int abvstandard = 1500;
		int highstandard = 1800;
		int fullyautomated = 2500;
		float area ;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.format("%s", "Enter the area of the home to be constructed : ");
			area = sc.nextFloat();
			float total_cost;
			Boolean flag = true;
			while(flag) {
				System.out.format("%s", "Which type of home do you want to construct : ");
				System.out.format("%s", "\n1.Standard Material\n2.Above Standard Material\n3.High Standard Material\n4.High Standard and Automated Home\n");
				int ch = sc.nextInt();
				switch(ch) {
					case 1 : 
						System.out.format("%s", "-------Standard Material Home---------\n");
						System.out.format("%s", "The total construction of the house using Standard Material is :");
						total_cost = area*standard;
						System.out.format("%s", total_cost);
						System.out.println("\n\nDo you want to perform more operations?(y/n)");
        				ch=sc.next().charAt(0);
        				if(ch == 'y'||ch=='Y')
        					flag = true;
        				else {
        					flag = false;
        					System.out.format("%s","Exit");
        				}
        				break;
					case 2 : 
						System.out.format("%s", "-------Above Standard Material Home---------\n");
						System.out.format("%s", "The total construction of the house using Above Standard Material is : ");
						total_cost = area*abvstandard;
						System.out.format("%s", total_cost);
						System.out.println("\n\nDo you want to perform more operations?(y/n)");
        				ch=sc.next().charAt(0);
        				if(ch == 'y'||ch=='Y')
        					flag = true;
        				else {
        					flag = false;
        					System.out.format("%s","Exit");
        				}
        				break;
					case 3 : 
						System.out.format("%s", "-------High Standard Material Home---------\n");
						System.out.format("%s", "The total construction of the house using High Standard Material is : ");
						total_cost = area*highstandard;
						System.out.format("%s", total_cost);
						System.out.println("\n\nDo you want to perform more operations?(y/n)");
        				ch=sc.next().charAt(0);
        				if(ch == 'y'||ch=='Y')
        					flag = true;
        				else {
        					flag = false;
        					System.out.format("%s","Exit");
        				}
        				break;
					case 4 : 
						System.out.format("%s", "-------High Standard Material with Automated Home---------\n");
						System.out.format("%s", "The total construction of the house using High Standard Material with Automated Home : ");
						total_cost = area*fullyautomated;
						System.out.format("%s", total_cost);
						System.out.println("\n\nDo you want to perform more operations?(y/n)");
        				ch=sc.next().charAt(0);
        				if(ch == 'y'||ch=='Y')
        					flag = true;
        				else {
        					flag = false;
        					System.out.format("%s","Exit");
        				}
        				break;
				}
			}
		}
		catch(Exception e) {
			System.out.format("%s", "Given area is wrong");
		}
	}

}
