package leetcode;

import org.junit.Test;

public class RectangleArea {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int widthA = Math.abs(C - A);
        int heightA = Math.abs(D - B);

        int widthB = Math.abs(G - E);
        int heightB = Math.abs(H - F);

        int left = Math.max(A, E);
        int right = Math.min(G, C);
        int bottom = Math.max(F, B);
        int top = Math.min(D, H);

        int overlap = 0;
        if(right > left && top > bottom)
            overlap = (right - left) * (top - bottom);

        /*if (widthA == 0 || heightA == 0) {
            return widthB * heightB;
        } else if (widthB == 0 || heightB == 0) {
            return widthA * heightA;
        }

        int overlap = 0;
        if (A < G && E < A) {
            if (B < H) {
                overlap = (G - A) * (H - B);
            } else if (D > F) {
                overlap = (G - A) * (F - D);
            }
        } else if (C > E && A < E) {
            if (D > F) {
                overlap = (C - E) * (F - D);
            } else if (H > B) {
                overlap = (C - E) * (H - B);
            }
        }

        if (A == E && B == F && C == G && D == H) {
            return widthA * heightA;
        }*/


        return widthA * heightA + widthB * heightB - overlap;
    }

    @Test
    public void test() {
        System.out.println(computeArea(-2, -2, 2, 2, -2, -2, 2, 2));
    }
}
