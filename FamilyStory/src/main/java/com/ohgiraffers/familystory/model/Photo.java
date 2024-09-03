package com.ohgiraffers.familystory.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "photos")
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;
    private Long albumId;
    private Long uploadedBy;
    private LocalDateTime uploadedAt;

    // 기본 생성자
    public Photo() {
        this.uploadedAt = LocalDateTime.now(); // 업로드 시점 자동 설정
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    public Long getUploadedBy() {
        return uploadedBy;
    }

    public void setUploadedBy(Long uploadedBy) {
        this.uploadedBy = uploadedBy;
    }

    public LocalDateTime getUploadedAt() {
        return uploadedAt;
    }

    // uploadedAt은 생성 시점에 자동 설정되므로 Setter는 생략할 수 있습니다.

    @Override
    public String toString() {
        return "Photo{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", albumId=" + albumId +
                ", uploadedBy=" + uploadedBy +
                ", uploadedAt=" + uploadedAt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Photo)) return false;
        Photo photo = (Photo) o;
        return id != null && id.equals(photo.id);
    }

    @Override
    public int hashCode() {
        return 31;
    }
}
