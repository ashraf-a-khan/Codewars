public static long findNextSquare(long sq) {
      long root = (long) Math.sqrt(sq);
      if(Math.sqrt(sq) % 2 == 0 || Math.sqrt(sq) % 2 == 1){
		  return (root+1)*(root+1);
      }
      return -1; 
  }