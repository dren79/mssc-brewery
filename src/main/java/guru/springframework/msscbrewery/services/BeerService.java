package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 * Cloned by DR
 */
public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
