package guru.springboot.sfgpetclinic.services;

import guru.springboot.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
        Owner findLastName(String lastName);
        Owner findById(Long id);
        Owner save(Owner owner);
        Set<Owner> findAll();
}
