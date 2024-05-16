/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rei_do_gadoBD;

import com.mycompany.reidogadoclasses.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pichau
 */
public class ClienteDao {

    static String url = "jdbc:mysql://localhost:3306/baseReiDoGado";
    static String login = "root";
    static String senha = "admin";

    public static boolean salvar(Cliente novoCliente) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conexao = DriverManager.getConnection(url, login, senha);
            comandoSQL = conexao.prepareStatement("INSERT INTO CLIENTE (nome, sexo, telefone, email, cpf, endereco, cep, estadoCivil) "
                    + "Values (?,?,?,?,?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            comandoSQL.setString(1, novoCliente.getNome());
            comandoSQL.setString(2, novoCliente.getSexo());
            comandoSQL.setString(3, novoCliente.getTelefone());
            comandoSQL.setString(4, novoCliente.getEmail());
            comandoSQL.setString(5, novoCliente.getCpf());
            comandoSQL.setString(6, novoCliente.getEndereco());
            comandoSQL.setString(7, novoCliente.getCep());
            comandoSQL.setString(8, novoCliente.getEstadoCivil());

            int linhasAfetadas = comandoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;

                rs = comandoSQL.getGeneratedKeys();

                if (rs != null) {
                    while (rs.next()) {
                        int idGerado = rs.getInt(1);
                    }
                }

            }

        } catch (ClassNotFoundException ex) {
            retorno = false;
        } catch (SQLException ex) {
            retorno = false;
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return retorno;

    }// fim do salvar

    public static ArrayList<Cliente> listar() {

        ArrayList<Cliente> lista = new ArrayList<>();

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conexao = DriverManager.getConnection(url, login, senha);

            comandoSQL = conexao.prepareStatement("SELECT * FROM Cliente");

            rs = comandoSQL.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Cliente item = new Cliente();
                    item.setId(rs.getInt("id_Cli"));
                    item.setNome(rs.getString("nome"));
                    item.setEndereco(rs.getString("endereco"));
                    item.setCep(rs.getString("cep"));
                    item.setcpf(rs.getString("cpf"));
                    item.setEmail(rs.getString("email"));
                    item.setTelefone(rs.getString("telefone"));
                    item.setSexo(rs.getString("sexo"));
                    item.setEstadoCivil(rs.getString("estadoCivil"));

                    lista.add(item);
                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }

        return lista;
    }//fim do listar

    public static boolean alterar(Cliente novoCliente) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conexao = DriverManager.getConnection(url, login, senha);
            comandoSQL = conexao.prepareStatement("UPDATE CLIENTE SET nome =?, sexo =?, telefone =?, email=? , cpf=? , endereco=? , cep=? , estadoCivil=? WHERE id_Cli =? ");
            comandoSQL.setString(1, novoCliente.getNome());
            comandoSQL.setString(2, novoCliente.getSexo());
            comandoSQL.setString(3, novoCliente.getTelefone());
            comandoSQL.setString(4, novoCliente.getEmail());
            comandoSQL.setString(5, novoCliente.getCpf());
            comandoSQL.setString(6, novoCliente.getEndereco());
            comandoSQL.setString(7, novoCliente.getCep());
            comandoSQL.setString(8, novoCliente.getEstadoCivil());
            comandoSQL.setInt(9, novoCliente.getId());

            int linhasAfetadas = comandoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            }

        } catch (ClassNotFoundException ex) {
            retorno = false;
        } catch (SQLException ex) {
            retorno = false;
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return retorno;

    }// fim do alterar

    public static boolean excluir(int idEcluir) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conexao = DriverManager.getConnection(url, login, senha);
            comandoSQL = conexao.prepareStatement("DELETE FROM Cliente WHERE id_Cli =? ");
            comandoSQL.setInt(1, idEcluir);

            int linhasAfetadas = comandoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            }

        } catch (ClassNotFoundException ex) {
            retorno = false;
        } catch (SQLException ex) {
            retorno = false;
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return retorno;

    }// fim do excluir

    public static ArrayList<Cliente> buscarCliente(String textoPesquisa) {
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        ArrayList<Cliente> lista = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url, login, senha);
            comandoSQL = conexao.prepareStatement("SELECT * FROM Cliente WHERE LOWER(nome) LIKE ?");
            comandoSQL.setString(1, "%" + textoPesquisa.toLowerCase() + "%"); // Utiliza o texto da pesquisa em minúsculas

            rs = comandoSQL.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id_Cli");
                String nome = rs.getString("nome");
                String endereco = rs.getString("endereco");
                String cep = rs.getString("cep");
                String cpf = rs.getString("cpf");
                String email = rs.getString("email");
                String telefone = rs.getString("telefone");
                String sexo = rs.getString("sexo");
                String estadoCivil = rs.getString("estadoCivil");

                // Criar objeto Cliente com todos os campos recuperados
                Cliente cliente = new Cliente(id, nome);
                cliente.setEndereco(endereco);
                cliente.setCep(cep);
                cliente.setcpf(cpf);
                cliente.setEmail(email);
                cliente.setTelefone(telefone);
                cliente.setSexo(sexo);
                cliente.setEstadoCivil(estadoCivil);

                lista.add(cliente);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return lista;
    }

    public static ArrayList<Cliente> buscarClientePorCPF(String cpf) {
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        ArrayList<Cliente> lista = new ArrayList<>();

        try {
            // Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Passo 2 - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);

            // Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("SELECT * FROM Cliente WHERE cpf = ?");
            comandoSQL.setString(1, cpf);

            // Passo 4 - Executar o comando SQL
            rs = comandoSQL.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    int id = rs.getInt("id_Cli");
                    String nome = rs.getString("nome");
                    // Outros campos do cliente que você pode precisar
                    Cliente cliente = new Cliente(id, nome);
                    lista.add(cliente);
                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return lista;
    }

    public static boolean temVendasAssociadas(int idCliente) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(url, login, senha);

            // Consulta para verificar se existem vendas associadas ao cliente
            String sql = "SELECT COUNT(*) FROM Vendas WHERE id_Cli = ?";

            try (PreparedStatement comandoSQL = conexao.prepareStatement(sql)) {
                comandoSQL.setInt(1, idCliente);

                try (ResultSet resultado = comandoSQL.executeQuery()) {
                    if (resultado.next()) {
                        int quantidadeVendas = resultado.getInt(1);

                        // Se houver pelo menos uma venda, retorna true
                        return quantidadeVendas > 0;
                    }
                }
            }

            conexao.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        // Em caso de erro, retorna false por padrão
        return false;
    }
}
