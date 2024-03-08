package dev.bram.withoutjpa.user;

import org.springframework.context.annotation.ComponentScan;

import java.time.Instant;
import java.util.UUID;

public record User(
        UUID id,
        String firstName,
        String lastName,
        Instant birthDate
) {
}
