import java.util.Scanner;

/**
 * Created by Dariya on 21.10.2015.
 * � ������ N ������ � ������� �������������� �� �������� �������� �������.
 * ������ ������ ���������� ���� ���������� � ������� ���������� ����� ������� � �������� �� 000001 �� 999999.
 * ����������� ��������� ������� � �������� ����� ������ ��� ���� ������ ����� ����� ��������� ��� ����, ���, ��������, � ������� � �������� 003102 ��� 567576.
 * ���������� ���� ������ �������� ������� ���������� ������� ����������� ������ � ������ �����������, ��� ����� ��������� �����������.
 * � ������� ��������� ����������� ������� ���������� ������� � ����� ������?
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
