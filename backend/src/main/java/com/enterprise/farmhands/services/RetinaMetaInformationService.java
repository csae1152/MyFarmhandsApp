package com.enterprise.farmhands.services;

import com.enterprise.farmhands.entities.RetinaMetaInformation;
import com.enterprise.farmhands.repositories.RetinaMetaInformationRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class RetinaMetaInformationService extends RecursiveAction {
  @Autowired
  private RetinaMetaInformationRepo retinaMetaInformationRepo;
  Iterable<RetinaMetaInformation> retinaMetaInformations = retinaMetaInformationRepo.findAll();
  Iterable<String> test = Collections.singleton("here");
  private static List<String> list = new ArrayList<>();

  private static List<String> getList() {

    return list;
  }

  protected void readList() {
    getList();
  }

  ForkJoinPool commonPool = ForkJoinPool.commonPool();
  public static ForkJoinPool forkJoinPool = new ForkJoinPool(2);

  @Override
  protected void compute() {

  }
}
