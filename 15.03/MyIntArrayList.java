class Kata{
  public static long sumTwoSmallestNumbers(long[] numbers) {
	for (int i = 0; i < 2; i++) { 
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[j] < numbers[i]) { 
          long temp = numbers[i];
          numbers[i] = numbers[j];
          numbers[j] = temp;
        }
      }
    }
	
    return numbers[0] + numbers[1]; 

  }             
}