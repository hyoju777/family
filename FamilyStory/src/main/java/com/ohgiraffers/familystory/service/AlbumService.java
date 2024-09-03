package com.ohgiraffers.familystory.service;

import com.ohgiraffers.familystory.model.Album;
import com.ohgiraffers.familystory.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlbumService {
    @Autowired
    private AlbumRepository albumRepository;

    public Album createAlbum(Album album) {
        return albumRepository.save(album);
    }

    public List<Album> getAllAlbums() {
        return albumRepository.findAll();
    }

    public Album updateAlbum(Long id, Album updatedAlbum) {
        Optional<Album> existingAlbum = albumRepository.findById(id);
        if (existingAlbum.isPresent()) {
            updatedAlbum.setId(id);
            return albumRepository.save(updatedAlbum);
        } else {
            throw new RuntimeException("앨범을 찾을 수 없습니다.");
        }
    }

    public void deleteAlbum(Long id) {
        albumRepository.deleteById(id);
    }
}
