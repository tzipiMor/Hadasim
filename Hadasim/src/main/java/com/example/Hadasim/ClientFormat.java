package com.example.Hadasim;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class ClientFormat {

    @Bean
    CommandLineRunner commandLineRunner(ClientRepo client){
        return args -> {
            Client clientNumberOne = new Client(
                        "Tzipi",
                        "Mor",
                        322638347L,
                        "TLV",
                        "Ramot",
                        20,
                        "2000, AUGUST, 17",
                        "0583290705",
                        "0549930705",
                        "2020, MARCH,15",
                        "phyther",
                       "2019,AUGUST,22",
                       "2019, SEPTEMBER,6"
                );
            Client clientNumberTwo = new Client(
                    "Tzvi",
                    "Mor",
                    345638347L,
                    "TLV",
                    "Ramot",
                    20,
                    "1997, AUGUST, 16",
                    "0583290705",
                    "0549930705",
                    "2020, MARCH,15",
                    "phyther",
                    "2019,AUGUST,22",
                    "2019, SEPTEMBER,6"
            );

            client.saveAll(
                    List.of(clientNumberOne, clientNumberTwo));
        };
    }
}
