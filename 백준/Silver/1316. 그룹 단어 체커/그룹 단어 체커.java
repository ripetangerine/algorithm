import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        int testcase = in.nextInt();
        int answer = 0;
        String str[] = new String[testcase];
        
        // 테스트 케이스 입력
        for (int i = 0; i < testcase; i++) {
            str[i] = in.next();
        }
        
        // 각 문자열 처리
        for (int j = 0; j < str.length; j++) {
            boolean flag = true; // 각 문자열마다 플래그 초기화
            boolean[] seen = new boolean[26]; // 알파벳 등장 여부 확인
            
            for (int i = 0; i < str[j].length(); i++) {
                char currentChar = str[j].charAt(i);
                
                // 현재 문자가 이전에 등장했는지 확인
                if (seen[currentChar - 'a']) {
                    flag = false;
                    break;
                }
                
                // 다음 문자가 현재 문자와 다르면 현재 문자를 '본' 것으로 표시
                if (i < str[j].length() - 1 && currentChar != str[j].charAt(i + 1)) {
                    seen[currentChar - 'a'] = true;
                }
            }
            
            if (flag) {
                answer++;
            }
        }
        
        System.out.println(answer);
    }
}
