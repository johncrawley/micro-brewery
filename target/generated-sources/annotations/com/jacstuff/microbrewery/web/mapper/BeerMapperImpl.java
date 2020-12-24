package com.jacstuff.microbrewery.web.mapper;

import com.jacstuff.microbrewery.domain.Beer;
import com.jacstuff.microbrewery.domain.Beer.BeerBuilder;
import com.jacstuff.microbrewery.web.model.BeerDto;
import com.jacstuff.microbrewery.web.model.BeerDto.BeerDtoBuilder;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-12-24T10:51:22+0000",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 1.3.1100.v20200828-0941, environment: Java 14.0.2 (Oracle Corporation)"
)
@Component
public class BeerMapperImpl implements BeerMapper {

    @Autowired
    private DateMapper dateMapper;

    @Override
    public BeerDto beerToBeerDto(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDtoBuilder beerDto = BeerDto.builder();

        beerDto.beerName( beer.getBeerName() );
        beerDto.beerStyle( beer.getBeerStyle() );
        beerDto.createdDate( dateMapper.asOffsetDateTime( beer.getCreatedDate() ) );
        beerDto.id( beer.getId() );
        beerDto.lastUpdatedDate( dateMapper.asOffsetDateTime( beer.getLastUpdatedDate() ) );
        beerDto.upc( beer.getUpc() );

        return beerDto.build();
    }

    @Override
    public Beer beerDtoToBeer(BeerDto beerDto) {
        if ( beerDto == null ) {
            return null;
        }

        BeerBuilder beer = Beer.builder();

        beer.beerName( beerDto.getBeerName() );
        beer.beerStyle( beerDto.getBeerStyle() );
        beer.createdDate( dateMapper.asTimeStamp( beerDto.getCreatedDate() ) );
        beer.id( beerDto.getId() );
        beer.lastUpdatedDate( dateMapper.asTimeStamp( beerDto.getLastUpdatedDate() ) );
        beer.upc( beerDto.getUpc() );

        return beer.build();
    }
}
