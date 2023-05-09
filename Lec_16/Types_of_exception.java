package Lec_16;

public class Types_of_exception {
    public static void main(String[] args) {
        int arr[]=new int[4];
        String c=null;
        try{
//            int a=10/0;
//            arr[6]=6;
            System.out.println(c.length());
        }

        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
