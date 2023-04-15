CREATE TABLE question (id BIGINT AUTO_INCREMENT PRIMARY KEY,
quiz_id BIGINT,
num int,
name varchar(1000),
content text,
comment text,
choiceType text,
create_userid BIGINT
) AUTO_INCREMENT = 20;
INSERT INTO question (id,quiz_id,num,content,comment,choiceType) VALUES (1,1,1,"エレンが巨人になった時の身長は何m？","16m","single");
INSERT INTO question (id,quiz_id,num,content,choiceType) VALUES (2,1,2,"ミカサの巻いているマフラーの色は？","single");
INSERT INTO question (id,quiz_id,num,content,choiceType) VALUES (3,2,1,"ユミルが食べた顎の巨人の継承者の名前は？","single");
INSERT INTO question (id,quiz_id,num,content,choiceType) VALUES (4,2,2,"先代獣の巨人の継承者の名前は？","single");