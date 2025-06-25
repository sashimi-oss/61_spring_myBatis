/* DB作成 */
DROP DATABASE IF EXISTS mybatis_db;
CREATE DATABASE mybatis_db;

/* ユーザを作成 */
CREATE USER IF NOT EXISTS mybatisU IDENTIFIED BY 'mybatisP';

/* 権限付与 */
GRANT ALL PRIVILEGES ON mybatis_db.* TO mybatisU;

/* データベースを指定 */
USE mybatis_db;

/* テーブルの作成 */
create table user (
    user_id varchar(30) primary key,
    user_password varchar(20) not null
);