package com.example.ticketingcatalog.service.interfaces;

import com.example.ticketingcatalog.dto.VenueDTO;
import java.util.List;
import java.util.Optional;

public interface IVenueService {

    List<VenueDTO> getAll();

    Optional<VenueDTO> getById(Long id);

    VenueDTO create(VenueDTO venue);

    Optional<VenueDTO> update(Long id, VenueDTO venue);

    boolean delete(Long id);
}
