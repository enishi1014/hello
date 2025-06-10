import java.util.Scanner;

public class Kazuate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 答えの数を設定（2桁の正の整数：10〜99）
        int seikai = 42; // プログラマが設定する数
        
        System.out.println("数あてゲームを開始します！");
        System.out.println("2桁の正の整数を予想してください（10〜99）");
        System.out.println("5回まで挑戦できます。");
        
        // 最大5回の挑戦
        for (int kaisu = 1; kaisu <= 5; kaisu++) {
            System.out.print(kaisu + "回目の予想: ");
            int yosou = scanner.nextInt();
            
            // 入力値が2桁の正の整数かチェック
            if (yosou < 10 || yosou > 99) {
                System.out.println("2桁の正の整数を入力してください（10〜99）");
                kaisu--; // カウントしない
                continue;
            }
            
            // 当たりの判定
            if (yosou == seikai) {
                System.out.println("当たり！");
                System.out.println("正解は " + seikai + " でした。おめでとうございます！");
                break;
            } else {
                // 差を計算
                int sa = Math.abs(yosou - seikai);
                
                // 大きいか小さいかを表示
                if (yosou > seikai) {
                    System.out.print("設定された数より大きいです。");
                } else {
                    System.out.print("設定された数より小さいです。");
                }
                
                // 20以上差があるかチェック
                if (sa >= 20) {
                    System.out.println(" 20以上の差があります。");
                } else {
                    System.out.println();
                }
                
                // 最後の挑戦で外れた場合
                if (kaisu == 5) {
                    System.out.println("残念！5回の挑戦が終了しました。");
                    System.out.println("正解は " + seikai + " でした。");
                } else {
                    System.out.println("残り " + (5 - kaisu) + " 回です。");
                }
            }
        }
        
        scanner.close();
        System.out.println("ゲーム終了です。");
    }
}