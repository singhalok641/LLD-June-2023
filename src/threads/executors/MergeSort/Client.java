package threads.executors.MergeSort;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) {
        List<Integer> list = List.of(7, 3, 4, 1, 9, 8, 2, 6);

        MergeSorter mergeSorter = new MergeSorter(list);

        ExecutorService executorService =
                Executors.newFixedThreadPool(10);

        Future<List<Integer>> sortedListFuture = executorService.submit(mergeSorter);


//        System.out.println(sortedArray);
    }
}
