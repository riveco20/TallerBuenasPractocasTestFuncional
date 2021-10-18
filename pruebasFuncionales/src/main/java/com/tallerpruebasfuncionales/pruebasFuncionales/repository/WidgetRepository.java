package com.tallerpruebasfuncionales.pruebasFuncionales.repository;

import com.tallerpruebasfuncionales.pruebasFuncionales.model.Widget;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WidgetRepository extends MongoRepository<Widget, Long> {
}