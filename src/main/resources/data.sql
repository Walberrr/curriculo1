-- Inserindo um usuário
INSERT INTO usuario (id, nome, email) VALUES (1, 'Seu Nome', 'seuemail@exemplo.com');

-- Inserindo um currículo
INSERT INTO curriculo (id, titulo, usuario_id) VALUES (1, 'Currículo de Seu Nome', 1);

-- Inserindo experiências
INSERT INTO experiencia (id, cargo, empresa, descricao, periodo, curriculo_id) VALUES 
(1, 'Desenvolvedor de Software', 'Empresa Exemplo', 'Desenvolvimento de aplicações web.', '2020-2025', 1);

-- Inserindo educação
INSERT INTO educacao (id, instituicao, curso, periodo, curriculo_id) VALUES 
(1, 'Universidade Exemplo', 'Ciência da Computação', '2016-2020', 1);

-- Inserindo habilidades
INSERT INTO habilidade (id, nome, nivel, curriculo_id) VALUES 
(1, 'Java', 'Avançado', 1),
(2, 'Spring Boot', 'Intermediário', 1),
(3, 'PostgreSQL', 'Intermediário', 1);