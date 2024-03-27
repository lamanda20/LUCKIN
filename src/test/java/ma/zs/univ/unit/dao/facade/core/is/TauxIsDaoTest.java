package ma.zs.univ.unit.dao.facade.core.is;

import ma.zs.univ.bean.core.is.TauxIs;
import ma.zs.univ.dao.facade.core.is.TauxIsDao;

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
public class TauxIsDaoTest {

@Autowired
    private TauxIsDao underTest;

    @Test
    void shouldFindByCode(){
        String code = "code-1";
        TauxIs entity = new TauxIs();
        entity.setCode(code);
        underTest.save(entity);
        TauxIs loaded = underTest.findByCode(code);
        assertThat(loaded.getCode()).isEqualTo(code);
    }

    @Test
    void shouldDeleteByCode() {
        String code = "code-1";
        TauxIs entity = new TauxIs();
        entity.setCode(code);
        underTest.save(entity);

        int result = underTest.deleteByCode(code);

        TauxIs loaded = underTest.findByCode(code);
        assertThat(loaded).isNull();
        assertThat(result).isEqualTo(1);
    }

    @Test
    void shouldFindById(){
        Long id = 1L;
        TauxIs entity = new TauxIs();
        entity.setId(id);
        underTest.save(entity);
        TauxIs loaded = underTest.findById(id).get();
        assertThat(loaded.getId()).isEqualTo(id);
    }

    @Test
    void shoulDeleteById() {
        Long id = 1L;
        TauxIs entity = new TauxIs();
        entity.setId(id);
        underTest.save(entity);

        underTest.deleteById(id);

        TauxIs loaded = underTest.findById(id).get();
        assertThat(loaded).isNull();
    }


    @Test
    void shouldFindAll() {
        // Given
        List<TauxIs> items = IntStream.rangeClosed(1, 10).mapToObj(i->constructSample(i)).collect(Collectors.toList());

        // Init
        items.forEach(underTest::save);

        // When
        List<TauxIs> loadedItems = underTest.findAll();

        // Then
        assertThat(loadedItems).isNotNull();
        assertThat(loadedItems.size()).isEqualTo(10);
    }
    @Test
    void shouldSave(){
        TauxIs given = constructSample(1);
        TauxIs saved = underTest.save(given);
        assertThat(saved.getId()).isNotNull();
    }

    private TauxIs constructSample(int i) {
		TauxIs given = new TauxIs();
        given.setCode("code-"+i);
        given.setMontantMin(BigDecimal.TEN);
        given.setMontantMax(BigDecimal.TEN);
        given.setPourcentage(BigDecimal.TEN);
        given.setDateMin(LocalDateTime.now());
        given.setDateMax(LocalDateTime.now());
        given.setDateApplicationMin(LocalDateTime.now());
        given.setDateApplicationMax(LocalDateTime.now());
        given.setMontantRetard(BigDecimal.TEN);
        return given;
    }

}
