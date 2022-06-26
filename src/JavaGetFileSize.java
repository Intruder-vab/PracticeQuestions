import java.io.File;
import java.util.Scanner;

public class JavaGetFileSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp;
        inp = sc.next();
        File file = new File(inp);

        if(!file.exists() || file.isFile())
            return;
        System.out.println(getFsizebytes(file));
        System.out.println(getFsizekb(file));
        System.out.println(getFsizemb(file));
    }

    private static String getFsizebytes(File file)
    {
        return (double) file.length() + " bytes";
    }

    private static String getFsizekb(File file)
    {
        return (double) file.length()/1024 + " KB";
    }

    private static String getFsizemb(File file)
    {
        return (double) file.length()/(1024*1024) + "MB";
    }
}
