package day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {

        String browser = "edge";
        String result = "";

        boolean validbrowser = browser == "chrome" || browser == "firefox" || browser == "opera" || browser == "Safari" ||
                browser == "edge";

        if (validbrowser) {
            if (browser == "chrome") {
                result = "chrome browser";
            } else if (browser == "opera") {
                result = "opera browser";
            } else if (browser == "edge") {
                result = "edge browser";
            } else if (browser == "firefox") {
                result = "firefox browser";
            } else {
                result = "firefox browser";
            }

        }else {
            result = "invalid browser name";

           }
        System.out.println(result);
}
}
