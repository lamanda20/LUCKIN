package ma.zs.univ.unit.dao.facade.core.commun;

import ma.zs.univ.bean.core.commun.Ville;
import ma.zs.univ.dao.facade.core.commun.VilleDao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.IntStream;
import java.time.LocalDateTime;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class VilleDaoTest {

@Autowired
    private VilleDao underTest;

    @Test
    void shouldFindByCode(){
        String code = "code-1";
        Ville entity = new Ville();
        entity.setCode(code);
        underTest.save(entity);
        Ville loaded = underTest.findByCode(code);
        assertThat(loaded.getCode()).isEqualTo(code);
    }

    @Test
    void shouldDeleteByCode() {
        String code = "code-1";
        Ville entity = new Ville();
        entity.setCode(code);
        underTest.save(entity);

        int result = underTest.deleteByCode(code);

        Ville loaded = underTest.findByCode(code);
        assertThat(loaded).isNull();
        assertThat(result).isEqualTo(1);
    }

    @Test
    void shouldFindById(){
        Long id = 1L;
        Ville entity = new Ville();
        entity.setId(id);
        underTest.save(entity);
        Ville loaded = underTest.findById(id).get();
        assertThat(loaded.getId()).isEqualTo(id);
    }

    @Test
    void shoulDeleteById() {
        Long id = 1L;
        Ville entity = new Ville();
        entity.setId(id);
        underTest.save(entity);

        underTest.deleteById(id);

        Ville loaded = underTest.findById(id).get();
        assertThat(loaded).isNull();
    }


    @Test
    void shouldFindAll() {
        // Given
        List<Ville> items = IntStream.rangeClosed(1, 10).mapToObj(i->constructSample(i)).collect(Collectors.toList());

        // Init
        items.forEach(underTest::save);

        // When
        List<Ville> loadedItems = underTest.findAll();

        // Then
        assertThat(loadedItems).isNotNull();
        assertThat(loadedItems.size()).isEqualTo(10);
    }
    @Test
    void shouldSave(){
        Ville given = constructSample(1);
        Ville saved = underTest.save(given);
        assertThat(saved.getId()).isNotNull();
    }

    private Ville constructSample(int i) {
		Ville given = new Ville();
        given.setCode("code-"+i);
        given.setLibelle("libelle-"+i);
        return given;
    }

}
