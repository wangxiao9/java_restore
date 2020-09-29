public class Recurrence{
     public static void main(String[] args) {
          System.out.println(F2(3));
     }

     public static int F(int num) {
          if (num==1 || num==2) {
               return 1;
          } else {
               return F(num-1) + F(num-2);
          }
     }

     public static long F2(int index) {
          if (index == 1 || index ==2) {
               return 1;
          } 

          long f1 = 1L;
          long f2 = 1L;
          long f = 0;

          for (int i=0; i<=index-2; i++) {
               f = f1 + f2;
               f1 = f2;
               f2 = f;
          }

          return f;
     }
}