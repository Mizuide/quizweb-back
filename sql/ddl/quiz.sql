CREATE TABLE quiz (id BIGINT AUTO_INCREMENT PRIMARY KEY,
create_userid BIGINT,
title varchar(100),
description varchar(300),
thumbnail varchar(300),
answerer_num int,
avarage_correct float,
publish BOOLEAN
) AUTO_INCREMENT = 20;
