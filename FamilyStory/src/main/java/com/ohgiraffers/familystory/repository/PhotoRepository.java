package com.ohgiraffers.familystory.repository;

import com.ohgiraffers.familystory.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoRepository extends JpaRepository<Photo, Long> {
}


