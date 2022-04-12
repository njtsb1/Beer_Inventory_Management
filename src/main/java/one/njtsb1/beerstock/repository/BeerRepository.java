package one.njtsb1.beerstock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import one.njtsb1.beerstock.entity.Beer;

import java.util.Optional;

public interface BeerRepository extends JpaRepository<Beer, Long> {

    Optional<Beer> findByName(String name);
}
