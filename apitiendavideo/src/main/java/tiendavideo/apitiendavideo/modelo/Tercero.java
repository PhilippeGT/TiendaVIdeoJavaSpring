package tiendavideo.apitiendavideo.modelo;
import javax.persistence.*;

@Entity
@Table(name = "tercero")
public class Tercero {
    public Tercero(long id, TipoDocumento tipoDocumento, Ciudad ciudad, String direccion, String telefono, String movil,
            String correo, String nombre, String documento) {
        this.id = id;
        this.tipoDocumento = tipoDocumento;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.movil = movil;
        this.correo = correo;
        this.nombre = nombre;
        this.documento = documento;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "idtipodocumento", referencedColumnName = "id")
    private TipoDocumento tipoDocumento;

    @ManyToOne
    @JoinColumn(name = "idciudad", referencedColumnName = "id")
    private Ciudad ciudad;

    @Column(name = "tipopersona")
    private TipoPersona tipopersona;

    @Column(name = "direccion", nullable = true, length = 100)
    private String direccion;

    @Column(name = "telefono", nullable = true, length = 20)
    private String telefono;

    @Column(name = "movil", nullable = true, length = 20)
    private String movil;

    @Column(name = "correo", nullable = true, length = 100)
    private String correo;

    @Column(name = "nombre", nullable = true, length = 100)
    private String nombre;

    @Column(name = "documento", nullable = true, length = 50)
    private String documento;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public TipoPersona getTipopersona() {
        return tipopersona;
    }

    public void setTipopersona(TipoPersona tipopersona) {
        this.tipopersona = tipopersona;
    }

    public boolean obligadoIva() {
        switch (this.tipopersona){
            case NATURAL:
                return false;
            case JURIDICA:
                return true;
            case PUBLICA:
                return false;
            case RELIGIOSA:
                return false;
        }
        return false;

    }

}