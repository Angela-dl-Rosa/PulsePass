package com.pulsepass.pulsepass.dto.request;

import com.pulsepass.pulsepass.entity.TicketType;

public record PurchaseTicketRequest(
        String userEmail,
        String eventCode,
        TicketType type
) {}
