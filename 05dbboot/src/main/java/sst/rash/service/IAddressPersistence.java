package sst.rash.service;

import org.springframework.data.jpa.repository.JpaRepository;

import sst.rash.entities.address;


public interface IAddressPersistence extends JpaRepository<address, String> {

}