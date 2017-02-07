package lesson_3.part3;

public class Task3_Happy_Manager {
	public boolean isStable(int passedNumberOfTestCases, int failedNumberOfTestCases,
			int completeNumberOfUnresolvedIssues, int numberOfUnresolveIssuesWithHighriority,
			int numberOfUnresolvedIssuesWithBlockerSeverity, int numberOfUnresolvedIssuesWithCriticalSeverity) {
		boolean result = true;
		if (failedNumberOfTestCases / (failedNumberOfTestCases + passedNumberOfTestCases) > .2) {
			System.out.println("Release has more than 20% failed TC");
			result = false;
		}
		if (numberOfUnresolveIssuesWithHighriority > 10)
				 {
			System.out.println("Release has more than 10 unresolved issues with HIGH priority ");
			result = false;
		}
		if ( numberOfUnresolvedIssuesWithBlockerSeverity + numberOfUnresolvedIssuesWithCriticalSeverity > 5) {
			System.out.println("Release has more than 5 unresolved issues with Blocker/Critical severity");
			result = false;
		}
		if (numberOfUnresolvedIssuesWithBlockerSeverity / completeNumberOfUnresolvedIssues > .05) {
			
			System.out.println("Release has more than 5% of unresolved Blocker issues");
			result = false;
		}

		return result;
	}
	public static void main(String[] args) {
		Task3_Happy_Manager myInstance=new Task3_Happy_Manager();
		//myInstance.isStable(passedNumberOfTestCases, 
		//failedNumberOfTestCases, 
		//completeNumberOfUnresolvedIssues, 
		//numberOfUnresolveIssuesWithHighriority, 
		//numberOfUnresolvedIssuesWithBlockerSeverity, 
		//numberOfUnresolvedIssuesWithCriticalSeverity)
    	System.out.println(myInstance.isStable(80, 10, 40, 10, 1, 1));
    	System.out.println("__________________________________________");
    	System.out.println(myInstance.isStable(80, 30, 40, 10, 1, 1));
    	System.out.println("__________________________________________");
    	System.out.println(myInstance.isStable(80, 10, 12, 10, 2, 4));
    	System.out.println("__________________________________________");
    	System.out.println(myInstance.isStable(80, 10, 40, 10, 15, 15));
    	System.out.println("__________________________________________");
    	System.out.println(myInstance.isStable(80, 10, 40, 10, 15, 15));
    	System.out.println("__________________________________________");
    	
    }
}

