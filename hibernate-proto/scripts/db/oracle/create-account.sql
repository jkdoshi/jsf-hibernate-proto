DROP USER proto CASCADE;
CREATE USER proto IDENTIFIED BY proto
DEFAULT TABLESPACE USERS
TEMPORARY TABLESPACE TEMP;
GRANT CONNECT TO proto;
GRANT RESOURCE TO proto;
GRANT CREATE VIEW  to proto;
GRANT CREATE SYNONYM  to proto;
