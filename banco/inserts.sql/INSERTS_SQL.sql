
INSERT INTO fornecedor (nome, cnpjCpf, telefone, email, endereco) VALUES
('Comercial Alfa LTDA', '12.345.678/0001-90', '(11) 4002-8922', 'contato@alfa.com', 'Rua das Indústrias, 150 - São Paulo'),
('Metalúrgica Orion', '98.765.432/0001-21', '(11) 99888-5544', 'vendas@orionmetal.com', 'Avenida Forte, 820 - Santo André'),
('TechPower Componentes', '45.789.123/0001-33', '(21) 3222-1100', 'suporte@techpower.com', 'Rua Tecnológica, 451 - Rio de Janeiro'),
('Distribuidora Delta', '22.555.777/0001-66', '(31) 98844-2211', 'comercial@deltadistribuidora.com', 'Av. Minas Gerais, 1002 - Belo Horizonte'),
('EletroVale Peças', '67.123.456/0001-10', '(47) 3344-9988', 'contato@eletrovale.com', 'Rua das Máquinas, 87 - Joinville'),
('MasterTec Industrial', '32.999.888/0001-55', '(51) 98080-2525', 'vendas@mastertec.com', 'Avenida Industrial, 2220 - Porto Alegre'),
('Eletrônica Nova Era', '11.888.444/0001-99', '(85) 3333-4444', 'atendimento@novaeraeletronica.com', 'Rua Alvorada, 56 - Fortaleza'),
('HidroLuz Soluções', '55.666.777/0001-12', '(41) 99912-8877', 'contato@hidroluz.com', 'Av. Curitiba, 190 - Curitiba');

INSERT INTO produto (nome, descricao, quantidade) VALUES
('Contator 9A', 'Contator elétrico industrial modelo 9A', 55),
('Contator 12A', 'Contator para comandos elétricos 12A', 38),
('Relé Térmico 1-1.6A', 'Relé de proteção para motores', 22),
('Relé Térmico 4-6A', 'Relé para sobrecarga de motores', 18),
('Disjuntor 10A', 'Disjuntor monopolar curva C', 75),
('Disjuntor 16A', 'Disjuntor monopolar curva C', 60),
('Disjuntor 20A', 'Disjuntor bipolar para proteção geral', 40),
('Chave Seccionadora 32A', 'Chave seccionadora para painéis elétricos', 12),
('Chave Seccionadora 63A', 'Seccionadora industrial reforçada', 8),
('Fusível NH 63A', 'Fusível de proteção tipo NH', 95),
('Fusível NH 100A', 'Fusível NH para proteção de circuitos', 67),
('Cabo PP 2x1.5mm', 'Cabo flexível para instalações elétricas', 200),
('Cabo PP 4x2.5mm', 'Cabo flexível industrial de 4 vias', 150),
('Sensor Indutivo PNP', 'Sensor indutivo de proximidade modelo PNP', 32),
('Sensor Indutivo NPN', 'Sensor indutivo industrial NPN', 29),
('Fonte 24V 5A', 'Fonte chaveada de 24V 5A para painéis', 14),
('Fonte 24V 10A', 'Fonte industrial 24V 10A', 9),
('Botão de Emergência', 'Botão de parada de emergência com trava', 45),
('Botão Verde Liga', 'Botão pulsador verde para comando', 70),
('Botão Vermelho Desliga', 'Botão pulsador vermelho', 68),
('Mini Disjuntor 6A', 'Disjuntor monofásico curva C', 40),
('Mini Disjuntor 32A', 'Disjuntor industrial curva C', 22),
('Contato Auxiliar', 'Contato auxiliar para contator', 80);


select * from produto;
select * from fornecedor;
select * from usuario;

