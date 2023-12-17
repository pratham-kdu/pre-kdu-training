import static java.lang.System.out;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.io.BufferedReader;
import java.util.Map;
import java.util.PriorityQueue;

class Exercise3_FileOperations {
    public static void main(String[] args) throws IOException{
        FileReader fw;
        Map<String,Integer> hmp = new HashMap<>();
        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>(Comparator.comparing(Map.Entry<String,Integer>::getValue));
        try {
            fw = new FileReader("replace with csv file absolute path");		//IMPORTANT
            BufferedReader br = new BufferedReader(fw);
            String line;
            while((line=br.readLine()) != null) {
                String [] arr= line.split(",");
                for(String str : arr) {
                    hmp.put(str,hmp.get(str)==null ? 1 : hmp.get(str)+1);
                }
            }

            // for(Map.Entry<String,Integer> e : tmp.entrySet()) {
            //     out.println(e.getKey()+" : "+e.getValue());
            // }

            for(Map.Entry<String,Integer> e : hmp.entrySet()) {
                pq.add(e);
                if(pq.size()>3) pq.poll();
            }

            while(pq.size()>0) {
                out.println(pq.poll().getKey());
            }

            br.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}


/*
test_file.csv
pratham,ram,shyam,pratham,ram,shyam,pratham,ram,shyam,pratham,ram,shyam,pratham,ram,shyam,pratham,ram,shyam,madan,pankaj,pratham,ram,shyam,shyam,pratham

OUTPUT
ram
shyam
pratham
*/
