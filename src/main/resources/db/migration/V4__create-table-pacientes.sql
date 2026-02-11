CREATE TABLE pacientes (
                           id BIGINT NOT NULL AUTO_INCREMENT,
                           nome VARCHAR(100) NOT NULL,
                           email VARCHAR(100) NOT NULL,
                           cpf VARCHAR(14) NOT NULL,
                           telefone VARCHAR(20) NOT NULL,
                           ativo TINYINT NOT NULL,

                           PRIMARY KEY (id)
);
