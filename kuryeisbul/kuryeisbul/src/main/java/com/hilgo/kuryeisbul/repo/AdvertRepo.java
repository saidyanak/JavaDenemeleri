package com.hilgo.kuryeisbul.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hilgo.kuryeisbul.entity.Advert;

@Repository
public interface AdvertRepo extends JpaRepository<Advert, Long>{

}
