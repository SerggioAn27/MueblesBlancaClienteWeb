/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mueblesblanca.service;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.util.ArrayList;
import mueblesblanca.dao.ProductoDAO;
import mueblesblanca.dao.ProductoDAOMS;
import mueblesblanca.util.ConvertirBytesABase64;
import mueblesblanca.vo.ProductoVO;

/**
 *
 * @author Sergio AlfonsoG
 */

public class ProductoService {

    private static ProductoDAO productoDAO;
    private ConvertirBytesABase64 convertir;

    public ProductoService() {
        productoDAO = new ProductoDAOMS();
        //se instancia objeto para convertir bytes a base 64
        convertir = new ConvertirBytesABase64();
    }


    public ArrayList<ProductoVO> listar() throws Exception {

        ArrayList<ProductoVO> lista = new ArrayList<ProductoVO>();
        /*ArrayList<ProductoVO> listaNueva = new ArrayList<ProductoVO>();*/
        try {
            lista = productoDAO.listar();

            /*for (ProductoVO p : lista) {
                InputStream in = new ByteArrayInputStream(p.getFoto());
                Blob blob = new javax.sql.rowset.serial.SerialBlob(p.getFoto());
                String imagenBase64 = convertir.convertirABase64(in, blob);
                p.setImagenProducto(imagenBase64);
                listaNueva.add(p);
                if (p.getImagenProducto() == null) {
                    listaNueva.remove(p);
                }
            }*/
        } catch (Exception e) {
            System.out.println("ProductoService: Se presento un error al "
                    + "listar la tabla: " + e.getMessage());
        } finally {
            return lista;
        }
    }

    public ProductoVO consultarPorId(long idProducto) throws Exception {
        ProductoVO productoVO = new ProductoVO();
        try {
            productoVO = productoDAO.consultarPorId(idProducto);
            /*InputStream in = new ByteArrayInputStream(productoVO.getFoto());
            Blob blob = new javax.sql.rowset.serial.SerialBlob(productoVO.getFoto());
            String imagenBase64 = convertir.convertirABase64(in, blob);
            productoVO.setImagenProducto(imagenBase64);*/

        } catch (Exception e) {
            System.out.println("ProductoService: Se presento un error al "
                    + "consultar por id en la tabla: " + e.getMessage());
        } finally {
            return productoVO;
        }
    }

}