package com.mzacky.client_data;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Main {


    /**
     * Retrieves user details from input and returns a GetUserDetail object.
     *
     * @param  user     the user object to be updated with input details
     * @param  scanner  the scanner object to read user input
     * @return          the GetUserDetail object containing user details and period
     */
    private static GetUserDetail getUserDetail(User user, Scanner scanner) {
        System.out.println("Masukkan nama Anda: ");
        user.name = scanner.nextLine();
        System.out.println("Masukkan Jenis kelamin (L/P): ");
        String genderInput = scanner.nextLine();
        user.sex = genderInput.equalsIgnoreCase("p") ? "Perempuan" : "Laki Laki";
        System.out.println("Masukkan tanggal lahir (format: YYYY-MM-DD): ");
        user.birthDate = LocalDate.parse(scanner.nextLine());
        Period age = Period.between(user.birthDate, LocalDate.now());
        int years = age.getYears();
        int months = age.getMonths();
        GetUserDetail userDetail = new GetUserDetail();
        userDetail.period = age;
        userDetail.user = user;

        return userDetail;
    }

    /**
     * A description of the entire Java function.
     *
     * @param  args	description of parameter
     * @return       description of return value
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User customer = new User();

        GetUserDetail userDetail = getUserDetail(customer, scanner);
        System.out.printf("Nama: %s\nJenis Kelamin: %s\nUsia: %d tahun\n", customer.name, customer.sex, userDetail.period.getYears());
    }
}