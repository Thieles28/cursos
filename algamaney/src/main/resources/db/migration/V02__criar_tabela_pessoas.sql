CREATE TABLE pessoa(
    codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    logradouro VARCHAR(150),
    numero VARCHAR(20),
    complemento VARCHAR(200),
    bairro VARCHAR(100),
    cep VARCHAR(100),
    cidade VARCHAR(150),
    estado VARCHAR(120),
    ativo BOOLEAN NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO
    pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
values
    ('Rafael', true, 'Quadra 12 Conjunto 10', '09', 'casa', 'b3', '73355241', 'planaltina', 'Distrito Federal' );
INSERT INTO
    pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
    values
    ('Pedro', true, 'Quadra 12 Conjunto 10', '07', 'apartamento', 'b3', '73355341', 'planaltina', 'Distrito Federal');
INSERT INTO
    pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
    values
    ('Carlos', true, 'Quadra 13 Conjunto 12', '08', 'casa', 'b3', '73355242', 'Sobradinho', 'Distrito Federal');
INSERT INTO
    pessoa
    (nome, ativo,logradouro, numero, complemento, bairro, cep, cidade, estado)
    values ('Bianca', true, 'Quadra 11 Conjunto 09', '05', 'apartamento', 'b3', '73355241', 'planaltina', 'Distrito Federal');
INSERT INTO
    pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
    values
    ('Amanda', true, 'Quadra 07 Conjunto 11', '07', 'casa', 'b3', '73355221', 'sobradinho', 'Distrito Federal');
