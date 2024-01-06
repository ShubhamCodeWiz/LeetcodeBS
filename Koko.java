package LeetcodeBS;

public class Koko {
    public static void main(String[] args) {
        int[] arr = {2,12,8};
        int h = 10;
        System.out.println(minEatingSpeed(arr,h));
    }
    static int minEatingSpeed(int[] piles, int h) {
        int start = 1, end = 0;
        for (int i = 0; i < piles.length; i++) {
            end = Math.max(end, piles[i]);
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int time=0;
            for(int i =0;i<piles.length;i++){
                time+=(int) Math.ceil(piles[i]/(double)mid);
            }
            if(time<=h)
                end=mid-1;
            else
                start=mid+1;
        }
        return start;
    }
}

