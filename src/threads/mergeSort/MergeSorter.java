package threads.mergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MergeSorter implements Callable<List<Integer>> {
    List<Integer> arrayToSort;
    ExecutorService executorService;

    public MergeSorter(List<Integer> arrayToSort, ExecutorService executorService){
        this.arrayToSort = arrayToSort;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws ExecutionException, InterruptedException {
        // Base Condition
        if(arrayToSort.size() <= 1){
            return arrayToSort;
        }

        // Main Logic
        int mid = arrayToSort.size() / 2;

        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        for(int i=0; i<mid ;i++){
            leftArray.add(arrayToSort.get(i));
        }

        for(int i=mid;i<arrayToSort.size();i++){
            rightArray.add(arrayToSort.get(i));
        }

//        ExecutorService executorService = Executors.newCachedThreadPool();

        MergeSorter leftMergeSorter = new MergeSorter(leftArray, executorService);
        MergeSorter rightMergeSorter = new MergeSorter(rightArray, executorService);

        Future<List<Integer>> leftSortedFuture = executorService.submit(
                leftMergeSorter);
        Future<List<Integer>> rightSortedFuture = executorService.submit(
                rightMergeSorter);

        List<Integer> leftSortedArray = leftSortedFuture.get();
        List<Integer> rightSortedArray = rightSortedFuture.get();

        // Merge them
        List<Integer> sortedArray = new ArrayList<>();

        int i=0,j=0;
        while(i < leftSortedArray.size() && j < rightSortedArray.size()){
            if(leftSortedArray.get(i) < rightSortedArray.get(j)){
                sortedArray.add(leftSortedArray.get(i));
                i++;
            }
            else{
                sortedArray.add(rightSortedArray.get(j));
                j++;
            }
        }

        // Pick the remaining elements
        while(i < leftSortedArray.size()){
            sortedArray.add(leftSortedArray.get(i));
            i++;
        }

        while(j < rightSortedArray.size()){
            sortedArray.add(rightSortedArray.get(j));
            j++;
        }

        return sortedArray;
    }
}
