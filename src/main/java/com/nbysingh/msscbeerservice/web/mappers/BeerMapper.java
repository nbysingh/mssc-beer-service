package com.nbysingh.msscbeerservice.web.mappers;

import com.nbysingh.msscbeerservice.domain.Beer;
import com.nbysingh.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);
}
