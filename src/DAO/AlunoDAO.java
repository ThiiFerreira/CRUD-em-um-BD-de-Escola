
package DAO;

import DTO.AlunoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AlunoDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<AlunoDTO> lista = new ArrayList<>();

    public void cadastrarAluno(AlunoDTO objalunodto) {

        String sql = "insert into student (ID, name, dept_name) values (?,?,?)";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objalunodto.getMatricula());
            pstm.setString(2, objalunodto.getNome());
            pstm.setString(3, objalunodto.getNomeDepartamento());

            pstm.execute();
            JOptionPane.showMessageDialog(null, "ALUNO MATRICULADO");

            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ALUNODAO Cadastrar" + erro);
        }

    }

    public ArrayList<AlunoDTO> procurarAluno(AlunoDTO objalunodto) {

        String sql = "select * from student where id = ?";
        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objalunodto.getMatricula());
            rs = pstm.executeQuery();

            while (rs.next()) {
                objalunodto.setNome(rs.getString("name"));
                objalunodto.setNomeDepartamento(rs.getString("dept_name"));
                lista.add(objalunodto);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ALUNODAO procurar" + erro);
        }
        return lista;

    }

    public AlunoDTO retornaAluno(AlunoDTO objalunodto) {
        String sql = "select * from student where id = ?";
        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objalunodto.getMatricula());
            rs = pstm.executeQuery();

            while (rs.next()) {
                objalunodto.setNome(rs.getString("name"));
                objalunodto.setNomeDepartamento(rs.getString("dept_name"));
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ALUNODAO procurar" + erro);
        }

        return objalunodto;
    }

    public void deletarAluno(AlunoDTO objalunodto) {
        String sql = "delete from student where id = ?";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objalunodto.getMatricula());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "ALUNO DELETADO");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ALUNODAO deletar" + erro);
        }

    }

    public void alterarAluno(AlunoDTO objalunodto) {
        String sql = "select id,name, dept_name from student where id = ?";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objalunodto.getMatricula());
            rs = pstm.executeQuery(); // esse bloco de codigo é pra trazer o aluno que vai ser alterado
            
            // if para verificar se os dados que ta sendo inserido é igual aos que já estão no banco
            rs.next();
            if (objalunodto.getNome().equals(rs.getString("name")) && objalunodto.getNomeDepartamento().equals(rs.getString("dept_name"))) {
                JOptionPane.showMessageDialog(null, "Por favor fazer alguma alteração nos dados");
            }else{
                
                // vai seguir com a alteração normal dos dados
                try {
                    sql = "update student set name = ?, dept_name = ? where ID = ?";
                    pstm = conn.prepareStatement(sql);
                    pstm.setString(1, objalunodto.getNome());
                    pstm.setString(2, objalunodto.getNomeDepartamento());
                    pstm.setString(3, objalunodto.getMatricula());
                    pstm.execute();
                    JOptionPane.showMessageDialog(null, "DADOS DO ALUNO ALTERADOS");
                    pstm.close();

                } catch (SQLException erro) {
                    JOptionPane.showMessageDialog(null, "ALUNODAO alterar" + erro);
                }
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ALUNODAO veficar/alterar" + erro);
        }

    }

    public double calcularMedia(AlunoDTO objalunodto) {
        String sql = "select id,points from takes natural join grade_points where id = ?";
        conn = new ConexaoDAO().conectaBD();
        double media = 0;

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objalunodto.getMatricula());
            rs = pstm.executeQuery();
            double somaNota = 0;
            int cont = 0;
            while (rs.next()) {
                somaNota += (rs.getDouble("points"));
                cont++;
            }
            media = somaNota / cont;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ALUNODAO calcular media" + erro);
        }
        return media;
    }

}
