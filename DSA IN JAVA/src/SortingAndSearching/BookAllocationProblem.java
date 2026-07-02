package SortingAndSearching;

public class BookAllocationProblem {
    static boolean isValid(int [] arr, int k,int maxPages){

        /* first we are assigning pages to student 1 and checking if it is
        less than or equal to maxpage,

        is pages becomes greated than maxpages then we start assigning
        pages to student 2 so we assigned one pages to student 2 then again
       this --> if(pages+arr[i]<=maxPages) block runs ans checks is pages + arr[i] less than
       equal to maxpages

       when condition became false new student created and it is student value is greater
       than k is yes then return false


        */

        int student=1;
        int pages=0;
        for(int i=0;i<arr.length;i++){

            /*
            How does this loop runs and it checks validity of mid

            let us understand this with an example
            assume we have 2 students and have books array of {10,20,30,40,50} (its min max value is 90)

            so at starting we will assign pages to student 1;

            student=1;
            and pages =0;
            maxPage=75;

            for loop is running
            for(int i=0;i<arr.length;i++)

            if(pages+arr[i]<=maxPages)
            For student 1{
    iteration->1. (i=0, pages=0, arr[i]=arr[0]=10,maxPage=75;)
            pages+arr[i] < maxpages
            pages = 10;

    iteration->2. (i=1, pages=10, arr[i]=arr[1]=20,maxPage=75;)
            pages+arr[i] < maxpages
            pages = 30;
            }
    iteration->3. (i=2, pages=30, arr[i]=arr[2]=30,maxPage=75;)
            pages+arr[i] < maxpages
            pages = 60;
            }

    iteration->4. (i=3, pages=60, arr[i]=arr[3]=40,maxPage=75;)
            pages+arr[i] > maxpages (if condition became false, else block will run)

            pages = 60;
            }

            else:
             For student 2{

    iteration->4. first check is student value is greater than k ? return false:move ahead
             pages =0
             pages = 0+arr[3]
             pages=0+40=40


    iteration->5. check this  if(pages+arr[i]<=maxPages):
             pages+arr[4]>maxpages
             40+50=90>75;
             condition false again else block will run

             else:
             student++;
             student =3;
             student become greater then K so, return false;
             }



            * */

            if(pages+arr[i]<=maxPages){

                pages=pages+arr[i];
            }else{
                student++;
                if(student>k || arr[i]>maxPages ) {
                    return false;

                }else{
                    pages=0;
                    pages=pages+arr[i];
                }
            }
        }
        return true;
    }

    static int findPages(int[] arr, int k) {
        // code here
        // we will solve this problem with binary search.
        // the starting point will be 1
        // ending point will be sum of all element in input array
        int n= arr.length;
        int start=1;
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        int end=sum;
        int ans=-1;
        // we will check the mid if mid is maximum number of pages and consists
        // every pages the we will consider it as potential solution and sotre
        // it in ans variable


        if(k>n) return -1;

        while(start<=end){
            int mid= start+(end-start)/2;
            if(isValid(arr,k,mid)){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }

        }


        return ans;
    }


    static void main() {
        int [] arr={90,89,97,100,67,99};
        int k=3;
        System.out.println(findPages(arr,k));
    }
}
