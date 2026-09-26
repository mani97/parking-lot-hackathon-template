package tech.lokum.parkinglot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ParkingSpot {

    @Id
    @GeneratedValue
    private Long id;

    private String spotNumber;

    @Enumerated(EnumType.STRING)
    private SpotType type;

    @ManyToOne
    private ParkingLot parkingLot;

    private boolean active;
}