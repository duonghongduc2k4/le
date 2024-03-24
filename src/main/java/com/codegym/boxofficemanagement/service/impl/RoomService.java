package com.codegym.boxofficemanagement.service.impl;

import com.codegym.boxofficemanagement.model.Room;
import com.codegym.boxofficemanagement.repository.IRoomRepository;
import com.codegym.boxofficemanagement.service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoomService implements IRoomService {
    @Autowired
    private IRoomRepository iRoomRepository;
    @Override
    public Iterable<Room> findAll() {
        return iRoomRepository.findAll();
    }

    @Override
    public void save(Room room) {
        iRoomRepository.save(room);
    }

    @Override
    public Optional<Room> findById(Long id) {
        return iRoomRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        iRoomRepository.deleteById(id);
    }
}
