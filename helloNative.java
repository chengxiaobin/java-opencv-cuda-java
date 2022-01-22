package main.java;

public class helloNative {
    public static native void hello();
    public static native int printfnum(int width,int precision,double x);
    public static native String arraytest(String imageName,int imageNameLength);
}
