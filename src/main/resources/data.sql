INSERT INTO CUSTOMER(id, name, type) values
(1, 'João', 'PF'),
(2, 'Maria', 'PF'),
(3, 'Loja do Pedro', 'PJ'),
(4, 'Loja do Paulo', 'PJ');

INSERT INTO CUSTOMER_PF(id, cpf) values
(1, '1111111111'),
(2, '2222222222');

INSERT INTO CUSTOMER_PJ(id, cnpj) values
(3, '00000000000-0003'),
(4, '00000000000-0004');

INSERT INTO DEBT(customer_id, id, amount_debt, expiration_date, current_status) values
(1, 1, 1000, '2024-11-01', 'OPEN'),
(2, 2, 500, '2024-10-01', 'CANCELED'),
(3, 3, 100000, '2020-10-01', 'EXPIRED'),
(4, 4, 30000, '2005-10-01', 'EXPIRED'),
(1, 5, 1000, '2024-11-01', 'OPEN'),
(2, 6, 500, '2024-10-01', 'CANCELED'),
(3, 7, 100000, '2020-10-01', 'EXPIRED'),
(4, 8, 30000, '2005-10-01', 'EXPIRED'),
(1, 9, 1000, '2024-11-01', 'OPEN'),
(2, 10, 500, '2024-10-01', 'CANCELED'),
(3, 11, 100000, '2020-10-01', 'EXPIRED'),
(4, 12, 30000, '2005-10-01', 'EXPIRED'),
(1, 13, 1000, '2024-11-01', 'OPEN'),
(2, 14, 500, '2024-10-01', 'CANCELED'),
(3, 15, 100000, '2020-10-01', 'EXPIRED'),
(4, 16, 30000, '2005-10-01', 'EXPIRED');




