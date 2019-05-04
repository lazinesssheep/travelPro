package com.lazinesssheep.travel;


import com.greedystar.generator.invoker.SingleInvoker;
import com.greedystar.generator.invoker.base.Invoker;

public class Test {
    public static void main(String[] args) {

        Invoker invoker = new SingleInvoker.Builder()
                .setTableName("t_user")
                .setClassName("User")
                .build();
        invoker.execute();
        invoker = new SingleInvoker.Builder()
                .setTableName("t_manager")
                .setClassName("Manager")
                .build();
        invoker.execute();

        invoker = new SingleInvoker.Builder()
                .setTableName("t_good")
                .setClassName("Good")
                .build();
        invoker.execute();

        invoker = new SingleInvoker.Builder()
                .setTableName("t_good_gallery")
                .setClassName("GoodGallery")
                .build();
        invoker.execute();


        invoker = new SingleInvoker.Builder()
                .setTableName("t_good_itinerary")
                .setClassName("GoodItinerary")
                .build();
        invoker.execute();
        invoker = new SingleInvoker.Builder()
                .setTableName("t_good_itinerary_day")
                .setClassName("GoodItineraryDay")
                .build();
        invoker.execute();
        invoker = new SingleInvoker.Builder()
                .setTableName("t_good_included")
                .setClassName("GoodIncluded")
                .build();
        invoker.execute();

        invoker = new SingleInvoker.Builder()
                .setTableName("t_good_reviews")
                .setClassName("GoodReviews")
                .build();
        invoker.execute();
        invoker = new SingleInvoker.Builder()
                .setTableName("t_good_order")
                .setClassName("GoodOrder")
                .build();
        invoker.execute();
        invoker = new SingleInvoker.Builder()
                .setTableName("t_order")
                .setClassName("Order")
                .build();
        invoker.execute();


        invoker = new SingleInvoker.Builder()
                .setTableName("t_order_payinfo")
                .setClassName("Orderayinfo")
                .build();
        invoker.execute();

        invoker = new SingleInvoker.Builder()
                .setTableName("t_order_traveller")
                .setClassName("OrderTraveller")
                .build();
        invoker.execute();

        invoker = new SingleInvoker.Builder()
                .setTableName("t_accommodation")
                .setClassName("Accommodation")
                .build();
        invoker.execute();
    }
}
