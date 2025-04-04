import java.util.Scanner;

public class Main { // ← "switch" は予約語なので別の名前に！
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1以上12以下の半角数字を入力してください。月の名前が英語で出力されます。");

        if(sc.hasNextInt()){
            int Month = sc.nextInt();

            if (Month >= 1 && Month <= 12){
                switch(Month){
                    case 1:  System.out.println("1月はJanuaryです。"); break;
                    case 2:  System.out.println("2月はFebruaryです。"); break;
                    case 3:  System.out.println("3月はMarchです。"); break;
                    case 4:  System.out.println("4月はAprilです。"); break;
                    case 5:  System.out.println("5月はMayです。"); break;
                    case 6:  System.out.println("6月はJuneです。"); break;
                    case 7:  System.out.println("7月はJulyです."); break;
                    case 8:  System.out.println("8月はAugustです。"); break;
                    case 9:  System.out.println("9月はSeptemberです。"); break;
                    case 10: System.out.println("10月はOctoberです。"); break;
                    case 11: System.out.println("11月はNovemberです。"); break;
                    case 12: System.out.println("12月はDecemberです。"); break;
                }
            } else {
                System.out.println("入力エラーです。1~12の数値を入力してください。");
            }
        } else {
            System.out.println("数字が入力されていません。");
        }
    }
}
