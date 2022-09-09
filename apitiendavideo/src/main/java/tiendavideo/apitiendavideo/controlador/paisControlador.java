package tiendavideo.apitiendavideo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tiendavideo.apitiendavideo.repositorio.PaisRepositorio;

@RestController
@RequestMapping("/paises")
public class paisControlador {

    @Autowired
    private PaisRepositorio repositorio;

public List<Pais> listar

}
