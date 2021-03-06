package com.br.nossas.ideias.endpoint;


import com.br.nossas.ideias.repository.CategoriaRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/categorias")
public class CategoriaEndpoint {

    private final CategoriaRepository categoriaRepositoryDAO;

    public CategoriaEndpoint(CategoriaRepository categoriaRepositoryDAO) {
        this.categoriaRepositoryDAO = categoriaRepositoryDAO;
    }

    @GetMapping
    public ResponseEntity<?> listAll(Pageable pageable) {
        return new ResponseEntity<>(categoriaRepositoryDAO.findAll(pageable),HttpStatus.OK);
    }

}