package week3.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String text = "We learn java basics as part of java sessions in java week1";
     String[] text1 = text.split(" ");
     for (int i=0; i<text1.length; i++) {
    	 for (int j=i+1; j<text1.length; j++) {
    		 if (text1[i].equals(text1[j])) {
    			 text1[j]="";
    					
    		 }
    	 }
    	 {
    		 System.out.print(" " + text1[i]);
    	 }
     }
     
     
	}

}
