import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten nguoi nop the: ");
        String name = sc.nextLine();

        System.out.print("Nhap vao tong thu nhap trong nam don vi trieu dong: ");
        float incomeYear = Float.parseFloat(sc.nextLine());

        System.out.print("Nhap vao so nguoi phu thuoc: ");
        int sumPerson = Integer.parseInt(sc.nextLine());


        float sumIncomePax = incomeYear - 4 - sumPerson * 1.6f;
        System.out.println("Tong thu nhap phai chiu thue la: " + sumIncomePax);

        System.out.println("So thue " + name + " phai nop la: " + sumIncomePaxPerson(sumIncomePax));
    }

    public static float sumIncomePaxPerson(float pax){
        float incomePax = 0;
        if(pax < 0){
            return 0;
        }

        if(pax <= 60){
            incomePax = pax * 0.05f;
        }else if(pax <= 120){
            incomePax = 60 * 0.05f + (pax - 60) * 0.1f;
        }else if(pax <= 210){
            incomePax = 60 * 0.05f + 60 * 0.1f + (pax - 120) *0.15f;
        }else if(pax <= 384){
            incomePax = 60 * 0.05f + 60 * 0.1f + 90 * 0.15f + (pax - 210) * 0.2f;
        }else if(pax <= 624){
            incomePax = 60 * 0.05f + 60 * 0.1f + 90 * 0.15f + 174 * 0.2f + (pax - 384) * 0.25f;
        }else if(pax <= 960){
            incomePax = 60 * 0.05f + 60 * 0.1f + 90 * 0.15f + 174 * 0.2f + 240 * 0.25f + (pax - 624) * 0.3f;
        }else{
            incomePax = 60 * 0.05f + 60 * 0.1f + 90 * 0.15f + 174 * 0.2f + 240 * 0.25f + 336 * 0.3f + (pax - 960) * 0.35f;
        }
        return incomePax;
    }
}