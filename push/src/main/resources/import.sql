INSERT INTO grade(id, grade_info, grade_name) VALUES (1, 'VIP', '3개월간 구매횟수 15회이상')
INSERT INTO grade(id, grade_info, grade_name) VALUES (2, 'GOLD', '3개월간 구매횟수 10회이상')
INSERT INTO grade(id, grade_info, grade_name) VALUES (3, 'SILVER', '3개월간 구매횟수 5회이상')
INSERT INTO grade(id, grade_info, grade_name) VALUES (4, 'BRONZE', '3개월간 구매횟수 1회이상')
INSERT INTO grade(id, grade_info, grade_name) VALUES (5, 'FAMILY', '가입 후 구매이력 없는 회원')


INSERT INTO member(id, created_date, deleted_date, mem_id, mem_name, mem_pwd, mem_sex, noti_act, grade_idx) VALUES (1, now(), null, 'asd', '강정호', 'asd', 'male', 1, 1);
INSERT INTO member(id, created_date, deleted_date, mem_id, mem_name, mem_pwd, mem_sex, noti_act, grade_idx) VALUES (2, now(), null, 'asd1', '강정호', 'asd1', 'male', 1, 2);
INSERT INTO member(id, created_date, deleted_date, mem_id, mem_name, mem_pwd, mem_sex, noti_act, grade_idx) VALUES (3, now(), null, 'asd2', '강정호', 'asd2', 'male', 1, 3);
INSERT INTO member(id, created_date, deleted_date, mem_id, mem_name, mem_pwd, mem_sex, noti_act, grade_idx) VALUES (4, now(), null, 'asd3', '강정호', 'asd3', 'male', 1, 4);
INSERT INTO member(id, created_date, deleted_date, mem_id, mem_name, mem_pwd, mem_sex, noti_act, grade_idx) VALUES (5, now(), null, 'asd4', '강정호', 'asd4', 'male', 1, 5);
INSERT INTO member(id, created_date, deleted_date, mem_id, mem_name, mem_pwd, mem_sex, noti_act, grade_idx) VALUES (6, now(), null, 'asd5', '강정호', 'asd5', 'male', 1, 1);
INSERT INTO member(id, created_date, deleted_date, mem_id, mem_name, mem_pwd, mem_sex, noti_act, grade_idx) VALUES (7, now(), null, 'admin', '강정호', 'admin', 'male', 1, 1);


INSERT INTO notification(id, noti_content, noti_time, grade_idx) VALUES (1, '안녕하세요 VIP 고객님들. VIP회원 할일 50%를 진행하고 있으니 행사 참여 부탁드립니다.', now(), 1);
INSERT INTO notification(id, noti_content, noti_time, grade_idx) VALUES (2, '안녕하세요 GOLD 고객님들. 골드 회원 할일 30%를 진행하고 있으니 행사 참여 부탁드립니다.', now(), 2);
INSERT INTO notification(id, noti_content, noti_time, grade_idx) VALUES (3, '안녕하세요 SILVER 고객님들. 실버 회원 할일 20%를 진행하고 있으니 행사 참여 부탁드립니다.', now(), 3);
INSERT INTO notification(id, noti_content, noti_time, grade_idx) VALUES (4, '안녕하세요 BRONZE 고객님들. 브론즈 회원 할일 10%를 진행하고 있으니 행사 참여 부탁드립니다.', now(), 4);
INSERT INTO notification(id, noti_content, noti_time, grade_idx) VALUES (5, '안녕하세요 FAMILY 고객님들. 패밀리 회원 진행하고 있으니 행사 참여 부탁드립니다.', now(), 5);
