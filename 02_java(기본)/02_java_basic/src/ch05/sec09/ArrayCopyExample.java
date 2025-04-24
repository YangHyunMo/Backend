package ch05.sec09;

public class ArrayCopyExample {
    public static void main(String[] args) {
        String[] oldStrArray = { "java", "array", "copy" };

        String[] newIntArray = new String[5];

        System.arraycopy(oldStrArray, 0, newIntArray, 0, oldStrArray.length);

        for (int i=0; i< newIntArray.length; i++) {
            System.out.print(newIntArray[i] + ", ");
        }
    }
}
