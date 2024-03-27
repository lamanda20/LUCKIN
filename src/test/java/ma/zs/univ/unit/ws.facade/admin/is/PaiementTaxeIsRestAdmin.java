package ma.zs.univ.unit.ws.facade.admin.is;

import ma.zs.univ.bean.core.is.PaiementTaxeIs;
import ma.zs.univ.service.impl.admin.is.PaiementTaxeIsAdminServiceImpl;
import ma.zs.univ.ws.converter.is.PaiementTaxeIsConverter;
import ma.zs.univ.ws.dto.is.PaiementTaxeIsDto;
import ma.zs.univ.ws.facade.admin.is.PaiementTaxeIsRestAdmin;
import org.aspectj.lang.annotation.Before;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PaiementTaxeIsRestAdmin {

    private MockMvc mockMvc;

    @Mock
    private PaiementTaxeIsAdminServiceImpl service;
    @Mock
    private PaiementTaxeIsConverter converter;

    @InjectMocks
    private PaiementTaxeIsRestAdmin controller;

    @Before("")
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }


    @Test
    public void itShouldFindAllPaiementTaxeIsTest() throws Exception {
        // Mock the service to return an empty list
        when(service.findAll()).thenReturn(Collections.emptyList());
        when(converter.toDto(Collections.emptyList())).thenReturn(Collections.emptyList());

        // Call the controller method
        ResponseEntity<List<PaiementTaxeIsDto>> result = controller.findAll();

        // Verify the result
        assertEquals(HttpStatus.NO_CONTENT, result.getStatusCode());

        // Response body should be empty list
        List<PaiementTaxeIsDto> responseBody = result.getBody();
        assertNotNull(responseBody);
        assertEquals(0, responseBody.size());
    }

    @Test
    public void itShouldSavePaiementTaxeIsTest() throws Exception {
        // Mock data
        PaiementTaxeIsDto requestDto = new PaiementTaxeIsDto();
        PaiementTaxeIs entity = new PaiementTaxeIs();
        PaiementTaxeIs saved = new PaiementTaxeIs();
        PaiementTaxeIsDto savedDto = new PaiementTaxeIsDto();

        // Mock the converter to return the paiementTaxeIs object when converting from DTO
        when(converter.toItem(requestDto)).thenReturn(entity);

        // Mock the service to return the saved client
        when(service.create(entity)).thenReturn(saved);

        // Mock the converter to return the saved paiementTaxeIs DTO
        when(converter.toDto(saved)).thenReturn(savedDto);

        // Call the controller method
        ResponseEntity<PaiementTaxeIsDto> result = controller.save(requestDto);

        // Verify the result
        assertEquals(HttpStatus.CREATED, result.getStatusCode());

        // Verify the response body
        PaiementTaxeIsDto responseBody = result.getBody();
        assertNotNull(responseBody);

        // Add assertions to compare the response body with the saved paiementTaxeIs DTO
        assertEquals(savedDto.getCode(), responseBody.getCode());
        assertEquals(savedDto.getAnnee(), responseBody.getAnnee());
        assertEquals(savedDto.getTotalCharge(), responseBody.getTotalCharge());
        assertEquals(savedDto.getTotalProduit(), responseBody.getTotalProduit());
        assertEquals(savedDto.getResAvantImpo(), responseBody.getResAvantImpo());
        assertEquals(savedDto.getResApreImpot(), responseBody.getResApreImpot());
        assertEquals(savedDto.getMontantIs(), responseBody.getMontantIs());
        assertEquals(savedDto.getDatePresentation(), responseBody.getDatePresentation());
    }

}
