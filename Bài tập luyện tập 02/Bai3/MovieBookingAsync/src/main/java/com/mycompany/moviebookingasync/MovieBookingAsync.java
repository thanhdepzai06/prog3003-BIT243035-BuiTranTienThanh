package com.mycompany.moviebookingasync;

import java.util.concurrent.CompletableFuture;

public class MovieBookingAsync {

    public static void main(String[] args) {

        CompletableFuture<String> validateCustomer =
                CompletableFuture.supplyAsync(() -> {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Khach hang da duoc xac thuc");
                    return "Customer OK";
                });

        CompletableFuture<String> issueTicket =
                CompletableFuture.supplyAsync(() -> {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Ve xem phim da duoc xuat");
                    return "Ticket OK";
                });

        CompletableFuture<String> bookingResult =
                validateCustomer.thenCombine(issueTicket,
                        (customer, ticket) -> {
                            return "Dat ve hoan tat!";
                        });

        bookingResult.thenAccept(result -> {
            System.out.println(result);
        });

        bookingResult.join();
    }
}