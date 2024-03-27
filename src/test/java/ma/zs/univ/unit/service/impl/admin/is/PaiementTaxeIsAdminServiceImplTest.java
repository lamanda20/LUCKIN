package ma.zs.univ.unit.service.impl.admin.is;

import ma.zs.univ.bean.core.is.PaiementTaxeIs;
import ma.zs.univ.dao.facade.core.is.PaiementTaxeIsDao;
import ma.zs.univ.service.impl.admin.is.PaiementTaxeIsAdminServiceImpl;

import ma.zs.univ.bean.core.commun.Societe ;
import ma.zs.univ.bean.core.is.TauxIs ;
import java.util.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.time.LocalDateTime;



import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@SpringBootTest
class PaiementTaxeIsAdminServiceImplTest {

    @Mock
    private PaiementTaxeIsDao repository;
    private AutoCloseable autoCloseable;
    private PaiementTaxeIsAdminServiceImpl underTest;



    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        underTest = new PaiementTaxeIsAdminServiceImpl(repository);
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void canGetAllPaiementTaxeIs() {
         //when
        underTest.findAll();
        verify(repository).findAll();
    }

    @Test
    void itShouldSavePaiementTaxeIs() {
        // Given
        PaiementTaxeIs toSave = constructSample(1);
        when(repository.save(toSave)).thenReturn(toSave);

        // When
        underTest.create(toSave);

        // Then
        verify(repository).save(toSave);
    }

    @Test
    void itShouldDeletePaiementTaxeIs() {
        // Given
        Long idToDelete = 1L;
        when(repository.existsById(idToDelete)).thenReturn(true);

        // When
        underTest.deleteById(idToDelete);

        // Then
        verify(repository).deleteById(idToDelete);
    }
    @Test
    void itShouldGetPaiementTaxeIsById() {
        // Given
        Long idToRetrieve = 1L; // Example PaiementTaxeIs ID to retrieve
        PaiementTaxeIs expected = new PaiementTaxeIs(); // You need to replace PaiementTaxeIs with your actual class
        expected.setId(idToRetrieve);
        when(repository.findById(idToRetrieve)).thenReturn(java.util.Optional.of(expected));

        // When
        PaiementTaxeIs result = underTest.findById(idToRetrieve);

        // Then
        assertEquals(expected, result);
    }
	
	private PaiementTaxeIs constructSample(int i) {
		PaiementTaxeIs given = new PaiementTaxeIs();
        given.setId(id);
        given.setCode("code-"+i);
        given.setCode(code);
        given.setAnnee(i);
        given.setAnnee(annee);
        given.setTotalCharge(BigDecimal.TEN);
        given.setTotalCharge(totalCharge);
        given.setTotalProduit(BigDecimal.TEN);
        given.setTotalProduit(totalProduit);
        given.setResAvantImpo(BigDecimal.TEN);
        given.setResAvantImpo(resAvantImpo);
        given.setResApreImpot(BigDecimal.TEN);
        given.setResApreImpot(resApreImpot);
        given.setMontantIs(BigDecimal.TEN);
        given.setMontantIs(montantIs);
        given.setDatePresentation(LocalDateTime.now());
        given.setDatePresentation(datePresentation);
        given.setSociete(new Societe(1L));
        given.setSociete(societe);
        given.setTauxIs(new TauxIs(1L));
        given.setTauxIs(tauxIs);
        return given;
    }

}
