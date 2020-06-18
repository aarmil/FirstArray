public class Homework {
    public static void main(String[] args) {
        int massiveLenght = 0;
        for (int i = 100; i <= 1000; i++) {
            massiveLenght++;
        }
        int[] forwardCount = new int[massiveLenght];
        for (int i = 0; i < forwardCount.length; i++) {
            forwardCount[i] = 100 + i;
        }
        int[] backCount = new int[forwardCount.length];
        for (int i = 0, j = forwardCount.length - 1; i < backCount.length; i++, j--) {
            backCount[i] = forwardCount[j];
        }
        for (int i : backCount) {
            System.out.println(i);
        }
    }
}
