package com.sefanebi.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
