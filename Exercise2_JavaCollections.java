import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static java.lang.System.out;

class Exercise2_JavaCollections {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arr = new ArrayList<>();
        HashSet<String> hst = new HashSet<>();
        HashMap<String, Integer> hmp = new HashMap<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String str = br.readLine();
            arr.add(str);
            hst.add(str);
            hmp.put(str, hmp.get(str) == null ? 1 : hmp.get(str) + 1);
        }
        out.println("List Contains:");
        for (String i : arr)
            out.println(i);
        out.println("\nSet Contains:");
        for (String i : hst)
            out.println(i);
        out.println("\nFrequency of the words:");
        for (Map.Entry<String, Integer> ent : hmp.entrySet())
            out.println("Word = " + ent.getKey() + ", Frequency = " + ent.getValue());
        br.close();
    }
}
