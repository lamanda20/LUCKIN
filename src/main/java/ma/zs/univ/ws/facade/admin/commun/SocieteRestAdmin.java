package  ma.zs.univ.ws.facade.admin.commun;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import ma.zs.univ.bean.core.commun.Societe;
import ma.zs.univ.dao.criteria.core.commun.SocieteCriteria;
import ma.zs.univ.service.facade.admin.commun.SocieteAdminService;
import ma.zs.univ.ws.converter.commun.SocieteConverter;
import ma.zs.univ.ws.dto.commun.SocieteDto;
import ma.zs.univ.zynerator.controller.AbstractController;
import ma.zs.univ.zynerator.dto.AuditEntityDto;
import ma.zs.univ.zynerator.util.PaginatedList;


import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.zs.univ.zynerator.process.Result;


import org.springframework.web.multipart.MultipartFile;
import ma.zs.univ.zynerator.dto.FileTempDto;

@RestController
@RequestMapping("/api/admin/societe/")
public class SocieteRestAdmin  extends AbstractController<Societe, SocieteDto, SocieteCriteria, SocieteAdminService, SocieteConverter> {

    private @Autowired SocieteAdminService societeAdminService;


    @Operation(summary = "upload one societe")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @Operation(summary = "upload multiple societes")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @Operation(summary = "Finds a list of all societes")
    @GetMapping("")
    public ResponseEntity<List<SocieteDto>> findAll() throws Exception {
        return super.findAll();
    }

    @Operation(summary = "Finds an optimized list of all societes")
    @GetMapping("optimized")
    public ResponseEntity<List<SocieteDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @Operation(summary = "Finds a societe by rc")
    @GetMapping("rc/{rc}")
    public ResponseEntity<SocieteDto> findByRc(@PathVariable String rc) {
        return super.findByReferenceEntity(new Societe(rc));
    }

    @Operation(summary = "Saves the specified  societe")
    @PostMapping("")
    public ResponseEntity<SocieteDto> save(@RequestBody SocieteDto dto) throws Exception {
        if(dto!=null){
            converter.init(true);
            Societe myT = converter.toItem(dto);
            Societe t = societeAdminService.saveSociete(myT);
            if (t == null) {
                return new ResponseEntity<>(null, HttpStatus.IM_USED);
            }else{
                SocieteDto myDto = converter.toDto(myT);
                return new ResponseEntity<>(myDto, HttpStatus.CREATED);
            }
        }else {
            return new ResponseEntity<>(dto, HttpStatus.NO_CONTENT);
        }
    }
     /* public ResponseEntity<SocieteDto> save(@RequestBody SocieteDto dto) throws Exception {
        return super.save(dto);
    }*/



    @Operation(summary = "Updates the specified  societe")
    @PutMapping("")
    public ResponseEntity<SocieteDto> update(@RequestBody SocieteDto dto) throws Exception {
        return super.update(dto);
    }

    @Operation(summary = "Delete list of societe")
    @PostMapping("multiple")
    public ResponseEntity<List<SocieteDto>> delete(@RequestBody List<SocieteDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @Operation(summary = "Delete the specified societe")
    @DeleteMapping("")
    public ResponseEntity<SocieteDto> delete(@RequestBody SocieteDto dto) throws Exception {
            return super.delete(dto);
    }

    @Operation(summary = "Delete the specified societe")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @Operation(summary = "Delete multiple societes by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @Operation(summary = "find by ville id")
    @GetMapping("ville/id/{id}")
    public List<SocieteDto> findByVilleId(@PathVariable Long id){
        return findDtos(service.findByVilleId(id));
    }
    @Operation(summary = "delete by ville id")
    @DeleteMapping("ville/id/{id}")
    public int deleteByVilleId(@PathVariable Long id){
        return service.deleteByVilleId(id);
    }

    @Operation(summary = "Finds a societe and associated list by id")
    @GetMapping("id/{id}")
    public ResponseEntity<SocieteDto> findById(@PathVariable Long id) {
        return super.findById(id);
    }

    @Operation(summary = "Finds societes by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<SocieteDto>> findByCriteria(@RequestBody SocieteCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated societes by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody SocieteCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports societes by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody SocieteCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets societe data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody SocieteCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }



    public SocieteRestAdmin (SocieteAdminService service, SocieteConverter converter) {
        super(service, converter);
    }




}
