package SortingAndSearching;

public class BinarySearchOnAnswer {

    static double sqrt(int x) {
        int start = 1;
        int end = x;
        double ans = 0;
        if (x == 0) return 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid > x / mid) {
                end = mid - 1;
            } else {
                ans = mid;
                start = mid + 1;
            }
        }

        double fact = 1;
        int precision = 3;
//        for (int i=1;i<=precision;i++){
//            fact=fact/10;
//            while (ans*ans!=x){
//            double newans=ans+fact;
//                if (ans*ans<x){
//                    ans=newans;
//                }else {
//                    break;
//                }
//            }
//        }
//double EPS=1e-9;
//        for (int i = 1; i <= precision; i++) {
//            fact = fact / 10;
//            for (int j = 1; j < 10; j++) {
//                double newans = ans + fact;
//
//                if (Math.abs(newans * newans - x) < EPS) {
//                    return newans;
//                } else if (newans * newans < x) {
//                    ans = newans;
//                } else {
//                    break;
//                }
//            }
//        }

        double low = 0.0;
        double high = 1.0;

        while (high - low > 1e-6) {
            double mid = low + (high - low) / 2;

            double value = ans + mid;

            if (value * value > x) {
                high = mid;
            } else {
                low = mid;
            }
        }

        return ans + low;


//        return Math.round(ans*1000.0)/1000.0;
//        return ans;
    }


    static void main() {
        System.out.println(sqrt(56));
    }
}
