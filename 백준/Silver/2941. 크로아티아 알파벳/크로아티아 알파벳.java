import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String target = in.next();

        String[] croatianAlphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        int num = 0;

        for (int i = 0; i < target.length();) {
            boolean matched = false;

            for (String alphabet : croatianAlphabets) {
                // 현재 인덱스에서 패턴이 시작되는지 확인
                if (i + alphabet.length() <= target.length() && target.substring(i, i + alphabet.length()).equals(alphabet)) {
                    num++; // 패턴 하나 발견
                    i += alphabet.length(); // 패턴 길이만큼 인덱스 이동
                    matched = true;
                    break;
                }
            }

            if (!matched) {
                num++;
                i++;
            }
        }

        // 결과 출력
        System.out.println(num);
    }
}
