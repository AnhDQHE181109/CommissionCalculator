package com.wuangsoft;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /*
    productType can be either of the 3:
    ** neither : 0
    ** standard : 1
    ** bonus : 2

    customerType can be either:
    ** true : regular customer
    ** false : non-regular customer

    salesPersonType can be either:
    ** true : salaried employee
    ** false : non-salaried employee

     */
    public String CalculateCommission(Boolean salesPersonType, String productType, float productPrice, Boolean customerType) {
        if (customerType) {
            return "$0";
        }
        if (productType.equalsIgnoreCase("standard")) {
            return "$0";
        }
        if (salesPersonType && productType.equalsIgnoreCase("neither")) {
            return "$0";
        }

        if (salesPersonType) {
            if (productPrice > 1000) {
                return "$25";
            } else {
                return "5% commission of <= $1.000";
            }
        } else {
            if (productType.equalsIgnoreCase("bonus")) {
                if (productPrice > 1000) {
                    return "$75";
                } else {
                    return "10% commission of <= $1.000";
                }
            } else {
                if (productPrice > 10000) {
                    return "5% commission of <= $10.000";
                } else {
                    return "10% commission of <= $10.000";
                }
            }
        }


    }
}