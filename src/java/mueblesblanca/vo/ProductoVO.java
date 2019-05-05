/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mueblesblanca.vo;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 *
 * @author Sergio AlfonsoG
 */

public class ProductoVO {

    private Integer idProducto;
    private String nombreProducto;
    private String DescripcionProducto;
    private String altoProducto;
    private String anchoProducto;
    private String colorProducto;
    private String materialProducto;
    private Integer garantiaMesesProducto;
    private BigDecimal valorUnitarioProducto;
    private ImagenVO idImagenProducto;
    private ModeloVO idModeloProducto;
    private CategoriaVO idCategoria;
    private Timestamp fechaCreacionProducto;
    private String usuarioCreacionProducto;
    private Timestamp fechaModificacionProducto;
    private String usuarioModificacionProducto;
    private Integer estadoProducto;
    
    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return DescripcionProducto;
    }

    public void setDescripcionProducto(String DescripcionProducto) {
        this.DescripcionProducto = DescripcionProducto;
    }

    public String getAltoProducto() {
        return altoProducto;
    }

    public void setAltoProducto(String altoProducto) {
        this.altoProducto = altoProducto;
    }

    public String getAnchoProducto() {
        return anchoProducto;
    }

    public void setAnchoProducto(String anchoProducto) {
        this.anchoProducto = anchoProducto;
    }

    public String getColorProducto() {
        return colorProducto;
    }

    public void setColorProducto(String colorProducto) {
        this.colorProducto = colorProducto;
    }

    public String getMaterialProducto() {
        return materialProducto;
    }

    public void setMaterialProducto(String materialProducto) {
        this.materialProducto = materialProducto;
    }

    public Integer getGarantiaMesesProducto() {
        return garantiaMesesProducto;
    }

    public void setGarantiaMesesProducto(Integer garantiaMesesProducto) {
        this.garantiaMesesProducto = garantiaMesesProducto;
    }

    public BigDecimal getValorUnitarioProducto() {
        return valorUnitarioProducto;
    }

    public void setValorUnitarioProducto(BigDecimal valorUnitarioProducto) {
        this.valorUnitarioProducto = valorUnitarioProducto;
    }

    public ImagenVO getIdImagenProducto() {
        return idImagenProducto;
    }

    public void setIdImagenProducto(ImagenVO idImagenProducto) {
        this.idImagenProducto = idImagenProducto;
    }

    public ModeloVO getIdModeloProducto() {
        return idModeloProducto;
    }

    public void setIdModeloProducto(ModeloVO idModeloProducto) {
        this.idModeloProducto = idModeloProducto;
    }

    public CategoriaVO getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(CategoriaVO idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Timestamp getFechaCreacionProducto() {
        return fechaCreacionProducto;
    }

    public void setFechaCreacionProducto(Timestamp fechaCreacionProducto) {
        this.fechaCreacionProducto = fechaCreacionProducto;
    }

    public String getUsuarioCreacionProducto() {
        return usuarioCreacionProducto;
    }

    public void setUsuarioCreacionProducto(String usuarioCreacionProducto) {
        this.usuarioCreacionProducto = usuarioCreacionProducto;
    }

    public Timestamp getFechaModificacionProducto() {
        return fechaModificacionProducto;
    }

    public void setFechaModificacionProducto(Timestamp fechaModificacionProducto) {
        this.fechaModificacionProducto = fechaModificacionProducto;
    }

    public String getUsuarioModificacionProducto() {
        return usuarioModificacionProducto;
    }

    public void setUsuarioModificacionProducto(String usuarioModificacionProducto) {
        this.usuarioModificacionProducto = usuarioModificacionProducto;
    }

    public Integer getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(Integer estadoProducto) {
        this.estadoProducto = estadoProducto;
    }
    
}