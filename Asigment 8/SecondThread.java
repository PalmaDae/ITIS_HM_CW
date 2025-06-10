public class SecondThread extends Thread{
    int[] array;
    int firstIndex;
    int secondIndex;
    int max;

    public SecondThread(int[] array, int firstIndex, int secondIndex) {
        this.array = array;
        this.firstIndex = firstIndex;
        this.secondIndex = secondIndex;
    }

    @Override
    public void run() {
        max = array[0];
        for (int i = firstIndex; i < secondIndex; i++) {
            if (array[i] >= max) {
                max = array[i];
            }
        }
    }

    public int returnMax() {
        return max;
    }
}
