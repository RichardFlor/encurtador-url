package com.richard.encurtador_url.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.richard.encurtador_url.model.Url;

import java.util.Optional;

public interface UrlRepository extends JpaRepository<Url, Long> {

    Optional<Url> findByShortUrl(String shortUrl);

}
