package tech.lokum.parkinglot.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tech.lokum.parkinglot.dto.ParkingLotDto;
import tech.lokum.parkinglot.entity.ParkingLot;
import tech.lokum.parkinglot.repository.ParkingLotRepository;

@Service
@RequiredArgsConstructor
public class ParkingLotService {

    private final ParkingLotRepository repository;

    public ParkingLot create(ParkingLotDto request) {

        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setName(request.getName());
        parkingLot.setAddress(request.getAddress());
        parkingLot.setOperator(request.getOperator());


        return repository.save(parkingLot);
    }
}