///ENVIAR UN PULL REQUEST

package org.example;

import org.example.models.CredentialsModel;
import org.example.models.ItemModel;
import org.example.models.PersonModel;
import org.example.utilities.DataProviders;
import org.example.utilities.MapParser;
import org.example.utilities.ReadExcel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ejemplo1();
        ejemplo2();
        //ejemplo3();
        //ejemplo4();
    }

    static void ejemplo1() {
        var readExcel = new ReadExcel();

        var credentialsList = readExcel.readCredentialsFromExcel();
        var itemsList = readExcel.readItemsFromExcel();

        for (CredentialsModel credentials : credentialsList) {
            var stringToPrint = String.format("The key is %s, the username is %s and the password is %s",
                    credentials.getKey(), credentials.getUsername(), credentials.getPassword());
            System.out.println(stringToPrint);
            System.out.println();
        }

        System.out.println();
        System.out.println("===================================");
        System.out.println("===================================");
        System.out.println();

        for (ItemModel item : itemsList) {
            System.out.println("id: " + item.getItemId());
            System.out.println("name: " + item.getItemName());
            System.out.println("key: " + item.getKey());
            System.out.println("price: " + item.getPrice());
            System.out.println("quantity: " + item.getQuantity());
            System.out.println();
        }
    }

    static void ejemplo2() {
        var mapParser = new MapParser();
        var itemMap = mapParser.getItemsMap();
        var credentialsMap = mapParser.getCredentialsMap();

        var scanner = new Scanner(System.in);

        System.out.print("Please enter the credentials key: ");
        var credentialsKey = scanner.nextLine();

        System.out.print("Please enter item key: ");
        var itemKey = scanner.nextLine();

        scanner.close();

        var credentials = credentialsMap.get(credentialsKey);
        var item = itemMap.get(itemKey);

        System.out.println(credentials.getUsername());
        System.out.println(item.getItemName());
    }

    static void ejemplo3() {
        var credentials = new DataProviders().getJeffersonCredentials();
        var stringToPrint = String.format("username: %s\n password: %s",
                credentials.getUsername(), credentials.getPassword());
        System.out.println(stringToPrint);
    }

    static void ejemplo4() {
        var person = new PersonModel();
        var stringToPrint = String.format("name: %s\nlastname1: %s\nlastname2: %s\nzipCode: %s\n" +
                        "email: %s\ncountry: %s",
                person.getName(), person.getLastName1(), person.getLastName2(), person.getZipCode(),
                person.getEmail(), person.getCountry());
        System.out.println(stringToPrint);
    }
}