import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    static List<String> lines;

    public static void main(String[] args) {

        File testFile = new File("test.txt");
        lines = new ArrayList<String>();
        //GetContents(testFile);
       // write("out.txt", lines);

    }
}
