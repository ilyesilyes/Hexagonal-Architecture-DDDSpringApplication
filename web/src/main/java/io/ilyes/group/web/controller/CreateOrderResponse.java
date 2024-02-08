package io.ilyes.group.web.controller;

import java.util.UUID;

public class CreateOrderResponse {
    public String status;
    public UUID id;

    public CreateOrderResponse(UUID id) {
        this.id = id;
    }
}
