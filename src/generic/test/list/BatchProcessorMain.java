package generic.test.list;

public class BatchProcessorMain {

    public static void main(String[] args) {
        LinkedListTest<Integer> list = new LinkedListTest<>();

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(1_000_000);
    }
}
