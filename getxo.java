public static boolean getXO (String str) {
	  int countx = 0; 
	  int counto = 0;
	  for(int i=0; i<str.length(); i++) {
//		  System.out.println(input.charAt(i));
		  if(str.charAt(i) == 'x' || str.charAt(i)=='X') {
			  countx++;
		  }if(str.charAt(i) == 'o' || str.charAt(i)=='O') {
			  counto++;
		  }
	 }
	  if(countx == counto) {
		  return true;
	  }else {
		  return false;
	  }
    
    // Good Luck!! 
}