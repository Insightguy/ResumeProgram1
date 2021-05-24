package DemoPackage;

import java.io.IOException;

import Utlity.Reader;

public class Fibonachi {

	public static void main(String[] args)
		throws IOException{
			
			int lengthoffibonachhi = Reader.readInt("Enter a number between 1 to 20: ");
			if (lengthoffibonachhi >= 1 && lengthoffibonachhi <= 20) {
				System.out.print("Fibonachi sequence with the length of " + String.valueOf(lengthoffibonachhi) + ".\n");
				String fullLength = "";
				int FibA = 0;
				int FibB = 1;
				int hold = 0;
				for(int i=1; i <= lengthoffibonachhi; i++) {
					if (i == 1) {
						fullLength = fullLength + String.valueOf(FibA);
					} else if (i == 2) {
						fullLength = fullLength + '-' + String.valueOf(FibB);
					} else {
						fullLength = fullLength + '-' + String.valueOf(FibA +FibB);
						hold = FibA +FibB;
						FibA = FibB;
						FibB = hold;
					}
				}
				System.out.print(fullLength);
				
			}
			else
				System.out.print("Invalid number, please enter a number between 1 to 20");
		}


}
