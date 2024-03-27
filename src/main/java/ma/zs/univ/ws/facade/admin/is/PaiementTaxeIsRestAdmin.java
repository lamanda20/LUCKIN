package  ma.zs.univ.ws.facade.admin.is;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import ma.zs.univ.bean.core.is.PaiementTaxeIs;
import ma.zs.univ.dao.criteria.core.is.PaiementTaxeIsCriteria;
import ma.zs.univ.service.facade.admin.is.PaiementTaxeIsAdminService;
import ma.zs.univ.ws.converter.is.PaiementTaxeIsConverter;
import ma.zs.univ.ws.dto.is.PaiementTaxeIsDto;
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
@RequestMapping("/api/admin/paiementTaxeIs/")
public class PaiementTaxeIsRestAdmin  extends AbstractController<PaiementTaxeIs, PaiementTaxeIsDto, PaiementTaxeIsCriteria, PaiementTaxeIsAdminService, PaiementTaxeIsConverter> {



    @Operation(summary = "upload one paiementTaxeIs")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @Operation(summary = "upload multiple paiementTaxeIss")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @Operation(summary = "Finds a list of all paiementTaxeIss")
    @GetMapping("")
    public ResponseEntity<List<PaiementTaxeIsDto>> findAll() throws Exception {
        return super.findAll();
    }

    @Operation(summary = "Finds an optimized list of all paiementTaxeIss")
    @GetMapping("optimized")
    public ResponseEntity<List<PaiementTaxeIsDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @Operation(summary = "Finds a paiementTaxeIs by code")
    @GetMapping("code/{code}")
    public ResponseEntity<PaiementTaxeIsDto> findByCode(@PathVariable String code) {
        return super.findByReferenceEntity(new PaiementTaxeIs(code));
    }

    @Operation(summary = "Saves the specified  paiementTaxeIs")
    @PostMapping("")
    public ResponseEntity<PaiementTaxeIsDto> save(@RequestBody PaiementTaxeIsDto dto) throws Exception {
        return super.save(dto);
    }

    @Operation(summary = "Updates the specified  paiementTaxeIs")
    @PutMapping("")
    public ResponseEntity<PaiementTaxeIsDto> update(@RequestBody PaiementTaxeIsDto dto) throws Exception {
        return super.update(dto);
    }

    @Operation(summary = "Delete list of paiementTaxeIs")
    @PostMapping("multiple")
    public ResponseEntity<List<PaiementTaxeIsDto>> delete(@RequestBody List<PaiementTaxeIsDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @Operation(summary = "Delete the specified paiementTaxeIs")
    @DeleteMapping("")
    public ResponseEntity<PaiementTaxeIsDto> delete(@RequestBody PaiementTaxeIsDto dto) throws Exception {
            return super.delete(dto);
    }

    @Operation(summary = "Delete the specified paiementTaxeIs")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @Operation(summary = "Delete multiple paiementTaxeIss by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @Operation(summary = "find by societe id")
    @GetMapping("societe/id/{id}")
    public List<PaiementTaxeIsDto> findBySocieteId(@PathVariable Long id){
        return findDtos(service.findBySocieteId(id));
    }
    @Operation(summary = "delete by societe id")
    @DeleteMapping("societe/id/{id}")
    public int deleteBySocieteId(@PathVariable Long id){
        return service.deleteBySocieteId(id);
    }
    @Operation(summary = "find by tauxIs id")
    @GetMapping("tauxIs/id/{id}")
    public List<PaiementTaxeIsDto> findByTauxIsId(@PathVariable Long id){
        return findDtos(service.findByTauxIsId(id));
    }
    @Operation(summary = "delete by tauxIs id")
    @DeleteMapping("tauxIs/id/{id}")
    public int deleteByTauxIsId(@PathVariable Long id){
        return service.deleteByTauxIsId(id);
    }

    @Operation(summary = "Finds a paiementTaxeIs and associated list by id")
    @GetMapping("id/{id}")
    public ResponseEntity<PaiementTaxeIsDto> findById(@PathVariable Long id) {
        return super.findById(id);
    }

    @Operation(summary = "Finds paiementTaxeIss by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<PaiementTaxeIsDto>> findByCriteria(@RequestBody PaiementTaxeIsCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated paiementTaxeIss by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PaiementTaxeIsCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports paiementTaxeIss by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody PaiementTaxeIsCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets paiementTaxeIs data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody PaiementTaxeIsCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }



    public PaiementTaxeIsRestAdmin (PaiementTaxeIsAdminService service, PaiementTaxeIsConverter converter) {
        super(service, converter);
    }




}
