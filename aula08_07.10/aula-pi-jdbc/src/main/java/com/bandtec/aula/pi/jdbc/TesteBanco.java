package com.bandtec.aula.pi.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class TesteBanco {
    
    public static void main(String[] args) {
    
        ConfiguracaoBanco config = new ConfiguracaoBanco();
        
        JdbcTemplate ass = new JdbcTemplate(config.getBancoDeDados());
        
        // -Cria uma TABLE, e executa usando "execute"
        // -É bom comentar depois para não tentar criar a TABLE dnv
        // -pois vai dar erro
//        String create = "CREATE TABLE aluno (" +
//             "id INT NOT NULL AUTO_INCREMENT," +
//             "nome VARCHAR(256)," +
//             "idade INT," +
//             "PRIMARY KEY (id)" +
//             ");";
//        
//        ass.execute(create);
  
        // -Usar o "update" para Inserir, atualizar ou deletar algo no banco
        // -Nos "VALUES", passa interrogação que será substituido depois pelos
        // -dados que serão informados depois da vírgula, na ordem
        ass.update("INSERT INTO aluno VALUES (?,?,?)", null, "Jão", 17);

        // -Dentro dos aspas do queryForList você executa um select
        System.out.println(ass.queryForList("Select * from aluno"));
            
        // -Ele guarda esses dados no arquivo que foi criado na raiz da pasta.
        
        // Abrir a interface do h2
        
        // 1 Passo, guarda o caminho da raiz do seu projeto
        // 2 Passo, Entre no caminho "C:/Usuario/aluno/.m2/repository/
        //          com/h2database/h2/1.4.200
        //3 Passo, execute o arquivo "h2-1.4.200.jar"
        //         ou o comando "java -jar h2-1.4.200.jar" no linux
        
    }
}
