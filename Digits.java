public class Digits {

  public static void main(String[] args) {

    int count = 0, num = 0003452;

    while (num != 0) {
      

      num /= 10;
      count+=1;
    }

    System.out.println("Number of digits: " + count);
  }
}