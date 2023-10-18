public class Test {
    public static void main(String[] args) {
        int a[][]={{1,2},{1,3},{3,1},{1,-1},{-2,0}};
        int maxl = a[0][0];
        int minl = a[0][0];
        int maxr = a[0][1];
        int minr = a[0][1];
        for (int i = 0; i<a.length; i++) {
            maxl = Math.max(a[i][0], maxl);
            minl = Math.min(a[i][0], minl);

            maxr = Math.max(a[i][1], maxr);
            minr = Math.min(a[i][1], minr);
        }
        System.out.println(Math.min(maxl-minl, maxr-minr));
    }≥
        
}