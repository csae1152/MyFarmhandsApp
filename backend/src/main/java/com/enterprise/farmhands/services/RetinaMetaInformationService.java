package com.enterprise.farmhands.services;

import com.enterprise.farmhands.entities.Retinametainformation;
import com.enterprise.farmhands.repositories.RetinaMetaInformationRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class RetinaMetaInformationService {
  @Autowired
  private RetinaMetaInformationRepo retinaMetaInformationRepo;
  Iterable<Retinametainformation> retinaMetaInformations = retinaMetaInformationRepo.findAll();


}
