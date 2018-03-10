package basics;

public class cities {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String[] cities = {"New York","London","Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		*/
		
		String[] states = new String[3];
		states[0] = "cal";
		states[1] = "ohio";
		states[2] = "billy";
		
		int i=0;
		do {	
			System.out.println(states[i]);
			i=i+1;
		} while (i<3);
		
		int n=0;
		while (n < 3) {
			System.out.println(states[n]);
			n++;
		}
		
		for (int x = 0; x < 3; x++) {
			System.out.println(states[x]);
		}
			
		
		
	}

}
