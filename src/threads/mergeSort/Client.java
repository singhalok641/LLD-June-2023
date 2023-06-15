package threads.mergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = List.of(7, 3, 4, 1, 9, 8, 2, 6);

        ExecutorService executorService = Executors.newCachedThreadPool();

        MergeSorter mergeSorter = new MergeSorter(list, executorService);

        Future<List<Integer>> sortedListFuture = executorService.submit(mergeSorter);

        List<Integer> sortedArray = sortedListFuture.get();

        System.out.println(sortedArray);
    }
}
