 public static String bingo(int[] numberArray){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numberArray.length; i++) {
            list.add(numberArray[i]);
        }
        if(list.contains(2) && list.contains(9) && list.contains(14) && list.contains(7) && list.contains(15)){
          return "WIN";
        }
        return "LOSE";
    }