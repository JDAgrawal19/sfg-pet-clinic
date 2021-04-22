package guru.springboot.sfgpetclinic.services;

import guru.springboot.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
        Owner findLastName(String lastName);
}
