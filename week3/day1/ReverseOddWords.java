package week3.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String test = "I am a software tester";
String[] split = test.split(" ");
for (int i=0; i<split.length; i++) {
	if(i % 2 == 1) {
		String outputString = "";
		for(int j=split[i].length()-1; j>=0; j--) {
			outputString = outputString+split[i].charAt(j);
		}
		System.out.print(outputString + " ");
	}
	else {
		System.out.print(split[i]+ " ");
	}
}
	}

}
