import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class fifoPageReplacement {
    static int pageFaults(int pages[], int n,int capacity){
        HashSet<Integer> set=new HashSet<>(capacity);
        Queue<Integer> q=new LinkedList<>();

        int page_faults=0;

        for(int i=0;i<n;i++){
            if(set.size()<capacity){
                if(!set.contains(pages[i])){
                    set.add(pages[i]);
                    q.add(pages[i]);
                    page_faults++;
                }
            }else{
                if(!set.contains(pages[i])){
                    int val=q.peek();
                    q.poll();
                    set.remove(val);

                    set.add(pages[i]);
                    q.add(pages[i]);

                    page_faults++;
                }
            }
        }

        return page_faults;

    }
    public static void main(String[] args) {
        int pages[] = {4,7,6,1,7,6,1,2,7,2};

int capacity = 3;

int miss_ration=pageFaults(pages, pages.length, capacity);
int hit_ratio=pages.length-miss_ration;
System.out.println("Hit Ratio : "+hit_ratio);
System.out.println("Miss Ratio : "+miss_ration);
    }
}

