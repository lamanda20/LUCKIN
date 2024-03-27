package ma.zs.univ.unit.ws.facade.admin.is;

import ma.zs.univ.bean.core.is.TauxIs;
import ma.zs.univ.service.impl.admin.is.TauxIsAdminServiceImpl;
import ma.zs.univ.ws.converter.is.TauxIsConverter;
import ma.zs.univ.ws.dto.is.TauxIsDto;
import ma.zs.univ.ws.facade.admin.is.TauxIsRestAdmin;
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
public class TauxIsRestAdmin {

    private MockMvc mockMvc;

    @Mock
    private TauxIsAdminServiceImpl service;
    @Mock
    private TauxIsConverter converter;

    @InjectMocks
    private TauxIsRestAdmin controller;

    @Before("")
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }


    @Test
    public void itShouldFindAllTauxIsTest() throws Exception {
        // Mock the service to return an empty list
        when(service.findAll()).thenReturn(Collections.emptyList());
        when(converter.toDto(Collections.emptyList())).thenReturn(Collections.emptyList());

        // Call the controller method
        ResponseEntity<List<TauxIsDto>> result = controller.findAll();

        // Verify the result
        assertEquals(HttpStatus.NO_CONTENT, result.getStatusCode());

        // Response body should be empty list
        List<TauxIsDto> responseBody = result.getBody();
        assertNotNull(responseBody);
        assertEquals(0, responseBody.size());
    }

    @Test
    public void itShouldSaveTauxIsTest() throws Exception {
        // Mock data
        TauxIsDto requestDto = new TauxIsDto();
        TauxIs entity = new TauxIs();
        TauxIs saved = new TauxIs();
        TauxIsDto savedDto = new TauxIsDto();

        // Mock the converter to return the tauxIs object when converting from DTO
        when(converter.toItem(requestDto)).thenReturn(entity);

        // Mock the service to return the saved client
        when(service.create(entity)).thenReturn(saved);

        // Mock the converter to return the saved tauxIs DTO
        when(converter.toDto(saved)).thenReturn(savedDto);

        // Call the controller method
        ResponseEntity<TauxIsDto> result = controller.save(requestDto);

        // Verify the result
        assertEquals(HttpStatus.CREATED, result.getStatusCode());

        // Verify the response body
        TauxIsDto responseBody = result.getBody();
        assertNotNull(responseBody);

        // Add assertions to compare the response body with the saved tauxIs DTO
        assertEquals(savedDto.getCode(), responseBody.getCode());
        assertEquals(savedDto.getMontantMin(), responseBody.getMontantMin());
        assertEquals(savedDto.getMontantMax(), responseBody.getMontantMax());
        assertEquals(savedDto.getPourcentage(), responseBody.getPourcentage());
        assertEquals(savedDto.getDateMin(), responseBody.getDateMin());
        assertEquals(savedDto.getDateMax(), responseBody.getDateMax());
        assertEquals(savedDto.getDateApplicationMin(), responseBody.getDateApplicationMin());
        assertEquals(savedDto.getDateApplicationMax(), responseBody.getDateApplicationMax());
        assertEquals(savedDto.getMontantRetard(), responseBody.getMontantRetard());
    }

}
