// 2. The Tribonacci sequence Tn is defined as follows:

// T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.

// Given n, return the value of nth tribonacci number.

class Ques2 {
    public static int tribonacci(int n) {
        if (n < 3)
            return n == 0 ? 0 : 1;

        int[] res = new int[n + 1];
        res[0] = 0;
        res[1] = 1;
        res[2] = 1;
        for (int i = 3; i <= n; i++)
            res[i] = res[i - 1] + res[i - 2] + res[i - 3];

        return res[n];
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println("Nth tribonacci number is : " + tribonacci(n));
    }
}