package com.Bus.Bus;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "bus")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Buses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int busNo;
    private String busType;
    private String busRoute;
}
