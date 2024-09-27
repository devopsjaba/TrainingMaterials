package com.kosta.hboot.repository;

import com.kosta.hboot.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<Member, Long> {
}

//public class EntityManager implements HouseRepository {
//
//}
