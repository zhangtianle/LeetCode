package codingInterviews;

public class FirstCharacterInStream {

    int[] ints = new int[256];
    int index = 0;

    public FirstCharacterInStream() {
        for (int i = 0; i < ints.length; i++) {
            ints[i] = -1;
        }
    }

    //Insert one char from stringstream
    public void Insert(char ch) {
        if (ints[ch] == -1) {
            ints[ch] = index;
        } else if (ints[ch] >= 0) {
            ints[ch] = -2;
        }
        index++;
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        int min = Integer.MAX_VALUE;
        char c = '#';
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] >= 0 && ints[i] < min) {
                c = (char)i;
                min = ints[i];
            }
        }
        return c;
    }
}
