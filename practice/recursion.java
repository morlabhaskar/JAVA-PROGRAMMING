public class Main {
    public static void main(String[] args){
        int res = sum(5);
        System.out.println(res);

    }
    public static int sum(int k){
        if(k > 0){
            return k + sum(k-1);
        }
        else {
            return 0;
        }
    }
}

//  5 + sum(4)
//  5 + 4 + sum(3)
// 5 + 4 + 3 + sum(2) 
// 5 + 4 + 3 + 2 + sum(1) 
// 5 + 4 + 3 + 2 + 1 + sum(0) 
// 5 + 4 + 3 + 2 + 1 + 0 = 15
