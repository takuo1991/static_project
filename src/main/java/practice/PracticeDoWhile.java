package practice;
public class PracticeDoWhile{

        public static void main(String[] args) {
                int num = 100; // 初期値設定

                do {
                        System.out.println(num); // 変数numを表示

                        num = num -1; // 2の累乗
                } while (num >= 0); // numが256以下の場合、ブロック内の処理が繰り返される
        }

}