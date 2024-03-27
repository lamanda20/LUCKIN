package ma.zs.univ.unit.dao.facade.core.is;

import ma.zs.univ.bean.core.is.PaiementTaxeIs;
import ma.zs.univ.dao.facade.core.is.PaiementTaxeIsDao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.IntStream;
import java.time.LocalDateTime;

import ma.zs.univ.bean.core.commun.Societe ;
import ma.zs.univ.bean.core.is.TauxIs ;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class PaiementTaxeIsDaoTest {

@Autowired
    private PaiementTaxeIsDao underTest;

    @Test
    void shouldFindByCode(){
        String code = "code-1";
        PaiementTaxeIs entity = new PaiementTaxeIs();
        entity.setCode(code);
        underTest.save(entity);
        PaiementTaxeIs loaded = underTest.findByCode(code);
        assertThat(loaded.getCode()).isEqualTo(code);
    }

    @Test
    void shouldDeleteByCode() {
        String code = "code-1";
        PaiementTaxeIs entity = new PaiementTaxeIs();
        entity.setCode(code);
        underTest.save(entity);

        int result = underTest.deleteByCode(code);

        PaiementTaxeIs loaded = underTest.findByCode(code);
        assertThat(loaded).isNull();
        assertThat(result).isEqualTo(1);
    }

    @Test
    void shouldFindById(){
        Long id = 1L;
        PaiementTaxeIs entity = new PaiementTaxeIs();
        entity.setId(id);
        underTest.save(entity);
        PaiementTaxeIs loaded = underTest.findById(id).get();
        assertThat(loaded.getId()).isEqualTo(id);
    }

    @Test
    void shoulDeleteById() {
        Long id = 1L;
        PaiementTaxeIs entity = new PaiementTaxeIs();
        entity.setId(id);
        underTest.save(entity);

        underTest.deleteById(id);

        PaiementTaxeIs loaded = underTest.findById(id).get();
        assertThat(loaded).isNull();
    }


    @Test
    void shouldFindAll() {
        // Given
        List<PaiementTaxeIs> items = IntStream.rangeClosed(1, 10).mapToObj(i->constructSample(i)).collect(Collectors.toList());

        // Init
        items.forEach(underTest::save);

        // When
        List<PaiementTaxeIs> loadedItems = underTest.findAll();

        // Then
        assertThat(loadedItems).isNotNull();
        assertThat(loadedItems.size()).isEqualTo(10);
    }
    @Test
    void shouldSave(){
        PaiementTaxeIs given = constructSample(1);
        PaiementTaxeIs saved = underTest.save(given);
        assertThat(saved.getId()).isNotNull();
    }

    private PaiementTaxeIs constructSample(int i) {
		PaiementTaxeIs given = new PaiementTaxeIs();
        given.setCode("code-"+i);
        given.setAnnee(i);
        given.setTotalCharge(BigDecimal.TEN);
        given.setTotalProduit(BigDecimal.TEN);
        given.setResAvantImpo(BigDecimal.TEN);
        given.setResApreImpot(BigDecimal.TEN);
        given.setMontantIs(BigDecimal.TEN);
        given.setDatePresentation(LocalDateTime.now());
        given.setSociete(new Societe(1L));
        given.setTauxIs(new TauxIs(1L));
        return given;
    }

}
