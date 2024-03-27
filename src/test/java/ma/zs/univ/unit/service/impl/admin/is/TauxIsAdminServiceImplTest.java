package ma.zs.univ.unit.service.impl.admin.is;

import ma.zs.univ.bean.core.is.TauxIs;
import ma.zs.univ.dao.facade.core.is.TauxIsDao;
import ma.zs.univ.service.impl.admin.is.TauxIsAdminServiceImpl;

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
class TauxIsAdminServiceImplTest {

    @Mock
    private TauxIsDao repository;
    private AutoCloseable autoCloseable;
    private TauxIsAdminServiceImpl underTest;



    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        underTest = new TauxIsAdminServiceImpl(repository);
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void canGetAllTauxIs() {
         //when
        underTest.findAll();
        verify(repository).findAll();
    }

    @Test
    void itShouldSaveTauxIs() {
        // Given
        TauxIs toSave = constructSample(1);
        when(repository.save(toSave)).thenReturn(toSave);

        // When
        underTest.create(toSave);

        // Then
        verify(repository).save(toSave);
    }

    @Test
    void itShouldDeleteTauxIs() {
        // Given
        Long idToDelete = 1L;
        when(repository.existsById(idToDelete)).thenReturn(true);

        // When
        underTest.deleteById(idToDelete);

        // Then
        verify(repository).deleteById(idToDelete);
    }
    @Test
    void itShouldGetTauxIsById() {
        // Given
        Long idToRetrieve = 1L; // Example TauxIs ID to retrieve
        TauxIs expected = new TauxIs(); // You need to replace TauxIs with your actual class
        expected.setId(idToRetrieve);
        when(repository.findById(idToRetrieve)).thenReturn(java.util.Optional.of(expected));

        // When
        TauxIs result = underTest.findById(idToRetrieve);

        // Then
        assertEquals(expected, result);
    }
	
	private TauxIs constructSample(int i) {
		TauxIs given = new TauxIs();
        given.setId(id);
        given.setCode("code-"+i);
        given.setCode(code);
        given.setMontantMin(BigDecimal.TEN);
        given.setMontantMin(montantMin);
        given.setMontantMax(BigDecimal.TEN);
        given.setMontantMax(montantMax);
        given.setPourcentage(BigDecimal.TEN);
        given.setPourcentage(pourcentage);
        given.setDateMin(LocalDateTime.now());
        given.setDateMin(dateMin);
        given.setDateMax(LocalDateTime.now());
        given.setDateMax(dateMax);
        given.setDateApplicationMin(LocalDateTime.now());
        given.setDateApplicationMin(dateApplicationMin);
        given.setDateApplicationMax(LocalDateTime.now());
        given.setDateApplicationMax(dateApplicationMax);
        given.setMontantRetard(BigDecimal.TEN);
        given.setMontantRetard(montantRetard);
        return given;
    }

}
