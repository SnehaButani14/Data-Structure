// Source code is decompiled from a .class file using FernFlower decompiler.
public class Recognize39 {
   public Recognize39() {
   }

   public static void main(String[] args) {
      StackDemo var1 = new StackDemo(5);
      var1.push(99);
      String var2 = "abcba";
      int var3 = 0;
      char var4 = var2.charAt(var3);

      while(var4 != 'c') {
         if (var3 == var2.length() - 1) {
            System.out.println("Invalid");
         } else {
            var1.push(var4);
            ++var3;
            var3 = var2.charAt(var3);
         }
      }

   }
}
