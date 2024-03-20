package com.example.spring_security_core.repo;

import com.example.spring_security_core.entity.Translate;
import com.example.spring_security_core.entity.TranslateProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TranslateRepo extends JpaRepository<Translate,Long> {


    @Query(value = "SELECT t.id as id , t.text as text , t.from_lenguage_id as fromLanguageId , t.to_lenguage_id as toLanguageId  FROM translate t WHERE  t.from_lenguage_id =:fromLanguageId AND t.to_lenguage_id =:toLanguageId", nativeQuery = true)
    List<TranslateProjection> getTranslate(Long fromLanguageId, Long toLanguageId);


    @Query(value = "SELECT t.id, t.text, t.from_lenguage_id, t.to_lenguage_id FROM translate t WHERE LOWER(t.text) = LOWER(:text)", nativeQuery = true)
    List<Translate> getTextIgnoreCase(String text);

}
