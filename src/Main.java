import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float armut=2.14F ,elma=3.67F  , domates=1.11F , muz=0.95F , patlican=5.00F;
        System.out.println("Armut kaç kilo ?");
        float kg1=input.nextFloat();
        System.out.println("Elma kaç kilo ?");
        float kg2= input.nextFloat();
        System.out.println("Domates kaç kilo");
        float kg3= input.nextFloat();
        System.out.println("Muz kaç kilo ?");
        float kg4= input.nextFloat();
        System.out.println("Patlıcan kaç kilo");
        float kg5= input.nextFloat();
        float toplam_ucret= (armut*kg1)+(elma*kg2)+(domates*kg3)+(muz*kg4)+(patlican*kg5);
        System.out.println("Toplam ücret:" + toplam_ucret);
    }
}