package com.nbysigh.msscbeerservice.web.mappers;

import com.nbysigh.msscbeerservice.domain.Beer;
import com.nbysigh.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);
}
