package com.fordsworth.life.business.party;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fordsworth.life.business.party.entity.Party;

import io.quarkus.runtime.StartupEvent;

@Path("/api/party")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
@ApplicationScoped
public class PartyResource {

    @GET
    public List<Party> hello() {
      List<Party> parties = new ArrayList<>();
      parties.add(new Party("John", "Doe"));
      parties.add(new Party("Java", "Champion"));
      parties.add(new Party("Jerry", "Tom"));

      return parties;
    }



}
