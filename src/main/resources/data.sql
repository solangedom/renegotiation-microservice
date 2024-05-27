INSERT INTO CUSTOMER(id, name, type) values (1, 'João', 'PF');
INSERT INTO CUSTOMER(id, name, type) values (2, 'Maria', 'PF');
INSERT INTO CUSTOMER(id, name, type) values (3, 'Loja do Pedro', 'PJ');
INSERT INTO CUSTOMER(id, name, type) values (4, 'Loja do Paulo', 'PJ');

INSERT INTO CUSTOMER_PF(id, cpf) values (1, '1111111111');
INSERT INTO CUSTOMER_PF(id, cpf) values (2, '2222222222');

INSERT INTO CUSTOMER_PJ(id, cnpj) values (3, '00000000000-0003');
INSERT INTO CUSTOMER_PJ(id, cnpj) values (4, '00000000000-0004');

INSERT INTO DEBT(customer_id, id, amount_debt, expiration_date, current_status) values (1, 1, 1000, '2024-11-01', 'OPEN');
INSERT INTO DEBT(customer_id, id, amount_debt, expiration_date, current_status) values (2, 2, 500, '2024-10-01', 'CANCELED');
INSERT INTO DEBT(customer_id, id, amount_debt, expiration_date, current_status) values (3, 3, 100000, '2020-10-01', 'EXPIRED');
INSERT INTO DEBT(customer_id, id, amount_debt, expiration_date, current_status) values (4, 4, 30000, '2005-10-01', 'EXPIRED');




