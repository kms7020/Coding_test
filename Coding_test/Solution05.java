/*
자릿수 구하기기
문제 설명
자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

제한사항
N의 범위 : 100,000,000 이하의 자연수
입출력 예
N	answer
123	6
987	24
입출력 예 설명
입출력 예 #1
문제의 예시와 같습니다.

입출력 예 #2
9 + 8 + 7 = 24이므로 24를 return 하면 됩니다. */

public class Solution05 {
    public int Solution(int n) {
        int sum = 0;
        // n이 0보다 클 동안 반복 (즉, 모든 자릿수를 처리할 때까지)
        while (n>0) {
            // n을 10으로 나눈 나머지 → 현재 자릿수 (일의 자리)
            sum += n%10;
            // n을 10으로 나눈 몫을 다시 n에 저장 → 자릿수를 한 칸 줄임
            n/=10;
        }
        // 모든 자릿수의 합 반환
        return sum;
    }
    
    // 확인용 main 메서드
    public static void main (String[] args) {
        Solution05 sol = new Solution05();
        System.err.println("N\tanswer");
        System.out.println("123\t"+sol.Solution(123)); // 1 + 2 + 3 = 6
        System.out.println("987\t"+sol.Solution(987)); // 9 + 8 + 7 = 24
        
    }
}
