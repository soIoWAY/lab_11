public class One {
    public One() {

    }

    public void exOne() {
        int nums[] = new int[5];
        try {
            nums[7] = 6;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Виняток - " + ex);
        } catch (Exception ex_2) {
            System.out.println("Виняток - " + ex_2);
        }
    }

    public void exTwo() {
        try {
            try {
                int res = 5 / 0;
                System.out.println(res);
            } catch (ArithmeticException ex_3) {
                System.out.println("Виняток - " + ex_3);
            } catch (NullPointerException ex_4) {
                System.out.println("Виняток - " + ex_4);
            }
        } catch (Exception ex_5) {
            System.out.println("Виняток - " + ex_5);
        }
    }

    public void exThree() {
        try {
            int[] nums = {1, 2, 3};
            System.out.println(nums[4]);
        } catch (ArrayIndexOutOfBoundsException ex_6) {
            System.out.println("Виняток - " + ex_6);
        } finally {
            System.out.println("///");
        }
    }
}
