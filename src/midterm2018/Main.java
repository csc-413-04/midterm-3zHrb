package midterm2018;


import javax.swing.*;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
//import org.apache.http.NameValuePair;
//import org.apache.http.message.BasicNameValuePair;
//import org.omg.CORBA.NameValuePair;


import java.net.URL;
import java.util.*;
import java.util.regex.*;
import java.net.*;
import java.net.InetAddress.*;
//package java.net;

public class Main {


    private static String query;

    public static void main(String[] args) {
        String question1and2 = "GET /add?a=3&b=4 HTTP/1.1\n"
                + "Host: localhost:1298\n"
                + "Connection: keep-alive\n"
                + "User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.106 Safari/537.36\n"
                + "Accept: image/webp,image/apng,image/*,*/*;q=0.8\n"
                + "Referer: http://localhost:1298/\n"
                + "Accept-Encoding: gzip, deflate, br\n"
                + "Accept-Language: en-US,en;q=0.9,es;q=0.8\n";

        String question3 = "{\n"
                + "    “task” : “inc”,\n"
                + "    “num” : 3\n"
                + "}\n";

        String question4and5 = "To opt out, you’ll need to enter the Settings menu by clicking the three vertical dots, all the way in the upper right corner of the browser. From there, you’ll need to enter the Advanced settings at the very bottom and find the “Allow Chrome sign in” toggle, then turn it to off. Doing so lets you sign into Google services like Gmail and Maps without signing into the Chrome browser itself.";
String url = "GET /add?a=3&b=4 HTTP/1.1\n";

        System.out.println(question1and2);
        System.out.println(question3);
        System.out.println(question4and5);

        // print each answer at the end

        // Question 1
        // Return the Host
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();

            System.out.println("IP Address:- " + inetAddress.getHostAddress());
            System.out.println("Host Name:- " + inetAddress.getHostName());

        } catch (Exception e) {

            System.out.println("getLocalHost Error");

        }
        System.out.println("========================");
        // Question 2
        // return sum of a and b



        /* public static Map<String, String> getQueryMap(String query)
        {
            String[] params = query.split("&");
            Map<String, String> map = new HashMap<String, String>();
            for (String param : params)
            {
                String name = param.split("=")[0];
                String value = param.split("=")[1];
                map.put(name, value);
            }
            return map;
        }*/

        System.out.println("========================");
        // Question 3
        // convert to java object, increment num, convert back to json and return

      

System.out.println(" For Question 3: I did the parsing class and named it FromToJson in my project, it should work but for whatever reason, it's not importing the gson library, so I just commented the whole class");


        System.out.println("========================");
        // Question 4
        // return unique words

        int sum = 0;
        Set<String> myset = new HashSet<>();
        String s[] = question4and5.split(" ");

        for (int i = 1; i < s.length; i++) {

            myset.add(s[i]);

        }

        for (String sss : myset) {

            System.out.println(sss);
            sum = sum + 1;

        }

        System.out.println("The number of unique words is: " + sum);
        System.out.println("========================");

        // Question 5
        // return 2nd most common word

        String[] words = question4and5.split("\\s+");
        HashMap<String, Integer> occurrences = new HashMap<>();
        int mostFreq = -1;
        String mostFreqWord = null;

        for (String word : words) {
            int value = 0;
            if (occurrences.containsKey(word)) {
                value = occurrences.get(word);
            }
            occurrences.put(word, value + 1);

            if (value > mostFreq) {
                mostFreq = value;
                mostFreqWord = word;
            }
        }

        System.out.println("Most Frequent Word is: " + mostFreqWord);


        System.out.println("========================");

        /*public List<String> getMostRepeatedWords (String s){
            Map<String, Integer> map = new HashMap<>();
            String[] words = s.question4and5("\\s+");
            for (String word : words)
                map.put(word, map.containsKey(word) ? map.get(word) + 1 : 0);

            List<Entry<String, Integer>> tmp = new ArrayList<>(map.entrySet());
            Collections.sort(tmp, (e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()));

            return tmp.stream().map(e -> e.getKey()).collect(Collectors.toList());*/
        }


    }

