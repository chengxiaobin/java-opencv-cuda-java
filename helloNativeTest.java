package main.java;

import java.lang.annotation.Native;

public class helloNativeTest {
    public static void main(String[] args){
        helloNative.hello();
        int count = helloNative.printfnum(15, 12, 3.14);
        count += helloNative.printfnum(15, 12, count);
        System.out.println();
        for (int i = 0; i < count; i++)
            System.out.print("-");
        System.out.println();
        String filename = "D:/extra/022.jpg";
        String result = helloNative.arraytest(filename,filename.length());
        System.out.println(result);

    }
    static {
        System.loadLibrary("helloMethodProject");
    }
}
