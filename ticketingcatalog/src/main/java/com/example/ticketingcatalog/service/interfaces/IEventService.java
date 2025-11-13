package com.example.ticketingcatalog.service.interfaces;

import com.example.ticketingcatalog.dto.EventDTO;
import java.util.List;
import java.util.Optional;

public interface IEventService {

    List<EventDTO> getAll();

    Optional<EventDTO> getById(Long id);

    EventDTO create(EventDTO event);

    Optional<EventDTO> update(Long id, EventDTO event);

    boolean delete(Long id);
}
