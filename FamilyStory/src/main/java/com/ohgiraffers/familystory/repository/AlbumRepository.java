package com.ohgiraffers.familystory.repository;

import com.ohgiraffers.familystory.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}
