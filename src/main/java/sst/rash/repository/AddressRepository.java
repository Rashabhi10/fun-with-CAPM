package sst.rash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sst.rash.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
