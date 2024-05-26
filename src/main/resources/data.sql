INSERT INTO CUSTOMER(id, name) values (1, 'João');
INSERT INTO CUSTOMER(id, name) values (2, 'Maria');
INSERT INTO CUSTOMER(id, name) values (3, 'Loja do Pedro');
INSERT INTO CUSTOMER(id, name) values (4, 'Loja do Paulo');

INSERT INTO CUSTOMER_PF(id, cpf) values (1, '1111111111');
INSERT INTO CUSTOMER_PF(id, cpf) values (2, '2222222222');

INSERT INTO CUSTOMER_PJ(id, cnpj) values (3, '00000000000-0003');
INSERT INTO CUSTOMER_PJ(id, cnpj) values (4, '00000000000-0004');

INSERT INTO DEBT(customer_id, id, amount_debt, expiration_date, current_status) values (1, 1, 1000, '2024-11-01', 'OPEN');
INSERT INTO DEBT(customer_id, id, amount_debt, expiration_date, current_status) values (1, 2, 500, '2024-10-01', 'CANCELED');




