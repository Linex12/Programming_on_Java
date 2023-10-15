package Practice14;

public class Test {
    public static void main(String[] args) {
        WaitList<Integer> waitList = new BoundedWaitList<Integer>(3);
        waitList.add(1);
        waitList.add(5);
        waitList.add(3);
        waitList.add(4);
        System.out.println(waitList);
        UnfairWaitList<Integer> unfairwaitList = new UnfairWaitList<Integer>();
        unfairwaitList.add(1);
        unfairwaitList.add(5);
        unfairwaitList.add(3);
        unfairwaitList.add(4);
        unfairwaitList.moveToBack(3);
        System.out.println(unfairwaitList);
    }
}
