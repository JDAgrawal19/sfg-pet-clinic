package guru.springboot.sfgpetclinic.bootstrap;

import guru.springboot.sfgpetclinic.model.Owner;
import guru.springboot.sfgpetclinic.model.PetType;
import guru.springboot.sfgpetclinic.model.Vet;
import guru.springboot.sfgpetclinic.services.OwnerService;
import guru.springboot.sfgpetclinic.services.PetTypeService;
import guru.springboot.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {


        PetType dog  = new PetType();
        dog.setName("Dog");
        PetType savedDogType = petTypeService.save(dog);

        PetType cat  = new PetType();
        dog.setName("Cat");
        PetType savedCatType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Keaton");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Flora");

        ownerService.save(owner2);

        System.out.println("Loaded Owners ...........");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Hunt");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessica");
        vet2.setLastName("Pearson");

        vetService.save(vet2);

        System.out.println("Vet Loaded .........");


    }
}
