public class TestContinue {
     public static void main(String[] args) {
          int skip = 4;
          for (int i=0;i<10;i++) {
               if (i==skip) continue;
               System.out.println(i);
          }
     }
}