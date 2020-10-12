public class test {

    public static class Base{
        private void test() {

            String aStr = "? One? ";
            String bStr = aStr;
            aStr.toUpperCase();
            aStr.trim();
            System.out.println("[" + aStr + "," + bStr + "]");
        }
    }
    public static void main(String[] args) {

        String s = new String("hello");
        String t = new String("hello");
        char c [ ] = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(s.equals(t));
        System.out.println(t.equals(c));
        System.out.println(s==t);
        System.out.println(t.equals (new String("hello")));;
    }
}
