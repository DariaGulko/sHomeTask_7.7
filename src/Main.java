import java.util.Scanner;

/**
 * Created by Dariya on 21.10.2015.
 * В городе N проезд в трамвае осуществляется по бумажным отрывным билетам.
 * Каждую неделю трамвайное депо заказывает в местной типографии рулон билетов с номерами от 000001 до 999999.
 * «Счастливым» считается билетик у которого сумма первых трёх цифр номера равна сумме последних трёх цифр, как, например, в билетах с номерами 003102 или 567576.
 * Трамвайное депо решило подарить сувенир обладателю каждого счастливого билета и теперь раздумывает, как много сувениров потребуется.
 * С помощью программы подсчитайте сколько счастливых билетов в одном рулоне?
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ticket[] = new int[6];
        System.out.println("Enter the numbers of your ticket");
        for (int i = 0; i < ticket.length; i++) {
            ticket[i] = sc.nextInt();
        }
        for (int i = 0; i < ticket.length; i++) {
            System.out.print(ticket[i] + "");
        }
        if ((ticket[0] + ticket[1] + ticket[2]) == (ticket[3] + ticket[4] + ticket[5])) {
            System.out.println("\r\nThis ticket is happy");
        } else {
            System.out.println("\r\nDon't worry");
        }

    }
}
