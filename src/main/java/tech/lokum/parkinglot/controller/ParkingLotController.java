package tech.lokum.parkinglot.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.lokum.parkinglot.dto.ParkingLotDto;
import tech.lokum.parkinglot.entity.ParkingLot;
import tech.lokum.parkinglot.service.ParkingLotService;

@RestController
@RequestMapping("/api/parking-lots")
@RequiredArgsConstructor
public class ParkingLotController {

    private final ParkingLotService parkingLotService;

    @PostMapping
    public ResponseEntity<ParkingLot> createParkingLot(
            @RequestBody ParkingLotDto request) {

        ParkingLot parkingLot = parkingLotService.create(request);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(parkingLot);
    }
}
