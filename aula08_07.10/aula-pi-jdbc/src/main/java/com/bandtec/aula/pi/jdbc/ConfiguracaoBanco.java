package com.bandtec.aula.pi.jdbc;

import org.apache.commons.dbcp2.BasicDataSource;

public class ConfiguracaoBanco {
    
    private BasicDataSource bancoDeDados​;
    
    public ConfiguracaoBanco(){
        
    this.bancoDeDados = new BasicDataSource();
    
    // Configura o Driver do h2 (Banco feito em java)
    bancoDeDados​.setDriverClassName("org.h2.Driver");
    
    // Busca um banco através de uma URL
    bancoDeDados​.setUrl("jdbc:h2:file:./meu_banco");
    
    // Username do banco
    bancoDeDados​.setUsername("sa");
    
    // Password do banco
    bancoDeDados​.setPassword("");
        
    
    // NOTA: Da ára ser usado como configuração para o azure
    }

    public BasicDataSource getBancoDeDados() {
    
        return bancoDeDados;
    
    }
    
    
    
}
