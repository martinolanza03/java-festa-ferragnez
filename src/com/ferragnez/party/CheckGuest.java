package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        String[] guestList = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        Scanner input = new Scanner(System.in);

        System.out.println("Come ti chiami? Sei nella lista degli invitati? ");

        String name = input.nextLine();
        String formattedName = name.toLowerCase().replaceAll("\\s", "").replace("-", "");

        System.out.println("Il nome inserito è : " + formattedName);

        boolean isOnTheList = false;

        for (int i = 0; i < guestList.length; i++) {

            String guestListSelected = guestList[i].toLowerCase().replaceAll("\\s", "").replace("-", "");

            if (formattedName.equals(guestListSelected)) {
                isOnTheList = true;
                break;
            }
        }

        if (isOnTheList) {
            System.out.println(name + " sei nella lista degli invitati");
        } else {
            System.out.println(name + " non sei nella lista degli invitati");
        }

        input.close();
    }
}
