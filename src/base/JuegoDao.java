package base;

/**
 *
 * @author EFGK
 */

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JuegoDao implements metodos<Juego>{

    private static final String SQL_INSERT ="INSERT INTO usuario (puntaje, arma1, arma2, vida, ataque, curacion) VALUES (?,?,?,?,?,?)";
    private static final String SQL_UPDATE ="UPDATE usuario SET puntaje =?, arma1=?, arma2= ?,vida= ?, ataque=?, curacion=? WHERE id=?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id=?";
    private static final String SQL_READ = "SELECT * FROM usuario WHERE id=?";
    private static final String SQL_READALL ="SELECT * FROM usuario";
    private static final String SQL_TOP = "SELECT TOP(1) id FROM usuario ORDER BY id DESC";
    private static final String SQL_UPDATE_P = "UPDATE usuario SET puntaje =? WHERE id=?";
    private static final String SQL_UPDATE_A1 = "UPDATE usuario SET arma1 =? WHERE id=?";
    private static final String SQL_UPDATE_A2 = "UPDATE usuario SET arma2 =? WHERE id=?";
    private static final String SQL_UPDATE_V = "UPDATE usuario SET vida =? WHERE id=?";
    private static final String SQL_UPDATE_AT = "UPDATE usuario SET ataque =? WHERE id=?";
    private static final String SQL_UPDATE_CU = "UPDATE usuario SET cuaracion =? WHERE id=?";

    private static final Conexion con=Conexion.conectar();
    
    @Override
    public boolean create(Juego g) {
        
        PreparedStatement ps;
        try{

            ps= con.getCnx().prepareStatement(SQL_INSERT);

            ps.setInt(1, g.getPuntaje());

            ps.setBoolean(2, true);

            ps.setBoolean(3, true);

            ps.setBoolean(4, true);

            ps.setBoolean(5, true);

            ps.setBoolean(6, true);

            if(ps.executeUpdate()>0){
                return true;
            }
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
            Logger.getLogger(JuegoDao.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            con.cerrarConexion();
        }
        return false;
    }



    @Override

    public boolean delete(Object key) {

        PreparedStatement ps;

        try{

            ps= con.getCnx().prepareStatement(SQL_DELETE);

            ps.setString(1, key.toString());

            if(ps.executeUpdate()>0){

                return true;

            }

        }catch (SQLException ex){
            System.out.println(ex.getMessage());
            Logger.getLogger(JuegoDao.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            con.cerrarConexion();
        }
        return false;
    }



    @Override

    public boolean update(Juego c) {

        PreparedStatement ps;
        try{

            ps= con.getCnx().prepareStatement(SQL_UPDATE);

            ps.setInt(1, c.getPuntaje());

            ps.setBoolean(2, c.getArma1());
            
            ps.setBoolean(3, c.getArma2());

            ps.setBoolean(4, c.getVida());

            ps.setBoolean(5, c.getAtaque());

            ps.setBoolean(6, c.getCuracion());            

            if(ps.executeUpdate()>0){
                return true;
            }

        }catch (SQLException ex){
            System.out.println(ex.getMessage());
            Logger.getLogger(JuegoDao.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            con.cerrarConexion();
        }
        return false;
    }



    @Override

    public Juego read(Object key) {

        Juego f = null;

        PreparedStatement ps;
        ResultSet rs;
        try{

            ps= con.getCnx().prepareStatement(SQL_READ);

            ps.setString(1, key.toString());

            rs = ps.executeQuery();

            while(rs.next()){
                f = new Juego(rs.getInt(1),rs.getBoolean(2),rs.getBoolean(3),rs.getBoolean(4),rs.getBoolean(5),rs.getBoolean(6));
            }

        }catch (SQLException ex){
            System.out.println(ex.getMessage());
            Logger.getLogger(JuegoDao.class.getName()).log(Level.SEVERE,null,ex);

        }finally{
            con.cerrarConexion();
        }

        return f;
    }



    @Override
    public ArrayList<Juego> readAll() {

        ArrayList<Juego> all = new ArrayList();
        Statement s;
        ResultSet rs;

        try{

            s = con.getCnx().prepareStatement(SQL_READALL);

            rs = s.executeQuery(SQL_READALL);

            while(rs.next()){
                all.add(new Juego(rs.getInt("puntaje"),rs.getBoolean("arma1"),rs.getBoolean("arma2"),rs.getBoolean("vida"),rs.getBoolean("ataque"),rs.getBoolean("curacion")));
            }
            rs.close();
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
            Logger.getLogger(Juego.class.getName()).log(Level.SEVERE,null,ex);
        }
        return all;
    }

}
