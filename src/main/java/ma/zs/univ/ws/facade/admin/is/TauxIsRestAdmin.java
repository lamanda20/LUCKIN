package  ma.zs.univ.ws.facade.admin.is;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import ma.zs.univ.bean.core.is.TauxIs;
import ma.zs.univ.dao.criteria.core.is.TauxIsCriteria;
import ma.zs.univ.service.facade.admin.is.TauxIsAdminService;
import ma.zs.univ.ws.converter.is.TauxIsConverter;
import ma.zs.univ.ws.dto.is.TauxIsDto;
import ma.zs.univ.zynerator.controller.AbstractController;
import ma.zs.univ.zynerator.dto.AuditEntityDto;
import ma.zs.univ.zynerator.util.PaginatedList;


import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.zs.univ.zynerator.process.Result;


import org.springframework.web.multipart.MultipartFile;
import ma.zs.univ.zynerator.dto.FileTempDto;

@RestController
@RequestMapping("/api/admin/tauxIs/")
public class TauxIsRestAdmin  extends AbstractController<TauxIs, TauxIsDto, TauxIsCriteria, TauxIsAdminService, TauxIsConverter> {



    @Operation(summary = "upload one tauxIs")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @Operation(summary = "upload multiple tauxIss")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @Operation(summary = "Finds a list of all tauxIss")
    @GetMapping("")
    public ResponseEntity<List<TauxIsDto>> findAll() throws Exception {
        return super.findAll();
    }

    @Operation(summary = "Finds an optimized list of all tauxIss")
    @GetMapping("optimized")
    public ResponseEntity<List<TauxIsDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @Operation(summary = "Finds a tauxIs by code")
    @GetMapping("code/{code}")
    public ResponseEntity<TauxIsDto> findByCode(@PathVariable String code) {
        return super.findByReferenceEntity(new TauxIs(code));
    }

    @Operation(summary = "Saves the specified  tauxIs")
    @PostMapping("")
    public ResponseEntity<TauxIsDto> save(@RequestBody TauxIsDto dto) throws Exception {
        return super.save(dto);
    }

    @Operation(summary = "Updates the specified  tauxIs")
    @PutMapping("")
    public ResponseEntity<TauxIsDto> update(@RequestBody TauxIsDto dto) throws Exception {
        return super.update(dto);
    }

    @Operation(summary = "Delete list of tauxIs")
    @PostMapping("multiple")
    public ResponseEntity<List<TauxIsDto>> delete(@RequestBody List<TauxIsDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @Operation(summary = "Delete the specified tauxIs")
    @DeleteMapping("")
    public ResponseEntity<TauxIsDto> delete(@RequestBody TauxIsDto dto) throws Exception {
            return super.delete(dto);
    }

    @Operation(summary = "Delete the specified tauxIs")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @Operation(summary = "Delete multiple tauxIss by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }



    @Operation(summary = "Finds a tauxIs and associated list by id")
    @GetMapping("id/{id}")
    public ResponseEntity<TauxIsDto> findById(@PathVariable Long id) {
        return super.findById(id);
    }

    @Operation(summary = "Finds tauxIss by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<TauxIsDto>> findByCriteria(@RequestBody TauxIsCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated tauxIss by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TauxIsCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports tauxIss by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody TauxIsCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets tauxIs data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody TauxIsCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }



    public TauxIsRestAdmin (TauxIsAdminService service, TauxIsConverter converter) {
        super(service, converter);
    }




}
