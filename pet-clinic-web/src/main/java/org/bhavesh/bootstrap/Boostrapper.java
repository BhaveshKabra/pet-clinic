package org.bhavesh.bootstrap;

import org.bhavesh.model.Owner;
import org.bhavesh.model.Vet;
import org.bhavesh.readresource.FakeDBPropertyReader;
import org.bhavesh.readresource.PropertiesConfiguration;
import org.bhavesh.readresource.FakeJMSPropertyReader;
import org.bhavesh.service.OwnerService;
import org.bhavesh.service.PetService;
import org.bhavesh.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Boostrapper implements CommandLineRunner{

	private final OwnerService ownerService;
	private final PetService petService;
	private final VetService vetService;
	private final PropertiesConfiguration config;
	private final FakeJMSPropertyReader jmsread;
	private final FakeDBPropertyReader fakeread;
	
	public Boostrapper(OwnerService ownerService, PetService petService, VetService vetService,PropertiesConfiguration config) {
		super();
		this.ownerService = ownerService;
		this.petService = petService;
		this.vetService = vetService;
		this.config=config;
		jmsread=config.jmsPropertyRead();
		fakeread=config.fakePropertyRead();
	}

	@Override
	public void run(String... args) throws Exception {
	
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLirstName("Weston");
        ownerService.save(owner1);
        
        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLirstName("Glenanne");
        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vetService.save(vet2);

        System.out.println("JMS: Username: "+jmsread.getUsername()+" Password: "+jmsread.getPassword()+" Url: "+jmsread.getUrl());
        System.out.println("DB: Username: "+fakeread.getUsername()+" Password: "+fakeread.getPassword()+" Url: "+fakeread.getUrl());
	}

}
