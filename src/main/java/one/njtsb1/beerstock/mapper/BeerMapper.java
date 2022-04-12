package one.njtsb1.beerstock.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import one.njtsb1.beerstock.dto.BeerDTO;
import one.njtsb1.beerstock.entity.Beer;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
