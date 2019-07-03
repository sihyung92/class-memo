
/* Drop Tables */

DROP TABLE attendance CASCADE CONSTRAINTS;
DROP TABLE attendanceKind CASCADE CONSTRAINTS;
DROP TABLE bbsKind CASCADE CONSTRAINTS;
DROP TABLE career CASCADE CONSTRAINTS;
DROP TABLE userCert CASCADE CONSTRAINTS;
DROP TABLE certification CASCADE CONSTRAINTS;
DROP TABLE reply CASCADE CONSTRAINTS;
DROP TABLE lms_bbs CASCADE CONSTRAINTS;
DROP TABLE score CASCADE CONSTRAINTS;
DROP TABLE schedule CASCADE CONSTRAINTS;
DROP TABLE userData CASCADE CONSTRAINTS;
DROP TABLE lecture CASCADE CONSTRAINTS;
DROP TABLE userKind CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE attendance
(
	num number NOT NULL,
	day date NOT NULL,
	-- 0정상출석
	-- 1결석
	-- 2지각
	-- 3조퇴
	-- 
	type number NOT NULL,
	lecNum number NOT NULL,
	userNum number NOT NULL,
	-- 00 학생
	-- 01 강사
	-- 02 관리자
	kind number NOT NULL,
	startTime date,
	endTime date,
	PRIMARY KEY (num)
);


CREATE TABLE attendanceKind
(
	-- 0 정상출석
	-- 1 결석
	-- 2 지각
	-- 3 조퇴
	codeNum number NOT NULL,
	num number,
	PRIMARY KEY (codeNum)
);


CREATE TABLE bbsKind
(
	-- 00 공지사항
	-- 01 수업자료
	-- 02 과제
	-- 03 질문_질의
	codeNum number NOT NULL,
	-- 00 공지사항
	-- 01 수업자료
	-- 02 과제
	-- 03 질문_질의
	kind varchar2(50),
	PRIMARY KEY (codeNum)
);


CREATE TABLE career
(
	num number NOT NULL,
	startdate date,
	enddate date,
	company varchar2(100),
	userNum number NOT NULL,
	-- 00 학생
	-- 01 강사
	-- 02 관리자
	kind number NOT NULL,
	PRIMARY KEY (num)
);


CREATE TABLE certification
(
	codeNum number NOT NULL,
	kind varchar2(50),
	PRIMARY KEY (codeNum)
);


CREATE TABLE lecture
(
	num number NOT NULL,
	name varchar2(60),
	startdate date,
	enddate date,
	classroom varchar2(21),
	content varchar2(6000),
	attach varchar2(1000),
	PRIMARY KEY (num)
);


CREATE TABLE lms_bbs
(
	listNum number NOT NULL,
	-- 00 공지사항
	-- 01 수업자료
	-- 02 과제
	-- 03 질문_질의
	bbsNum number NOT NULL,
	num number NOT NULL,
	title varchar2(100),
	content varchar2(6000),
	id varchar2(50),
	nalja date,
	views number,
	attach varchar2(1000),
	PRIMARY KEY (listNum, bbsNum, num),
	CONSTRAINT bbs_key UNIQUE (listNum, bbsNum, num)
);


CREATE TABLE reply
(
	num number NOT NULL,
	listNum number NOT NULL,
	-- 00 공지사항
	-- 01 수업자료
	-- 02 과제
	-- 03 질문_질의
	bbsNum number NOT NULL,
	lecNum number NOT NULL,
	content varchar2(6000),
	nalja date,
	id varchar2(50),
	PRIMARY KEY (num)
);


CREATE TABLE schedule
(
	num number NOT NULL,
	startdate date,
	enddate date,
	category varchar2(20),
	title varchar2(100),
	content varchar2(6000),
	userNum number NOT NULL,
	-- 00 학생
	-- 01 강사
	-- 02 관리자
	kind number NOT NULL,
	PRIMARY KEY (num)
);


CREATE TABLE score
(
	scoreNum number NOT NULL,
	lecNum number NOT NULL,
	userNum number NOT NULL,
	-- 00 학생
	-- 01 강사
	-- 02 관리자
	kind number NOT NULL,
	firstTest varchar2(10),
	secondTest varchar2(10),
	thirdTest varchar2(10),
	PRIMARY KEY (scoreNum)
);


CREATE TABLE userCert
(
	codeNum number NOT NULL,
	userNum number NOT NULL,
	-- 00 학생
	-- 01 강사
	-- 02 관리자
	kind number NOT NULL
);


CREATE TABLE userData
(
	userNum number NOT NULL,
	-- 00 학생
	-- 01 강사
	-- 02 관리자
	kind number NOT NULL,
	lecNum number,
	id varchar2(50) NOT NULL,
	pw number NOT NULL,
	name varchar2(30) NOT NULL,
	birth date,
	phone number,
	email varchar2(100),
	address varchar2(100),
	major varchar2(50),
	PRIMARY KEY (userNum, kind),
	UNIQUE (userNum, kind)
);


CREATE TABLE userKind
(
	-- 00 학생
	-- 01 강사
	-- 02 관리자
	codeNum number NOT NULL,
	-- 00 학생
	-- 01 강사
	-- 02 관리자
	kind varchar2(50),
	PRIMARY KEY (codeNum)
);



/* Create Foreign Keys */

ALTER TABLE userCert
	ADD FOREIGN KEY (codeNum)
	REFERENCES certification (codeNum)
;


ALTER TABLE attendance
	ADD FOREIGN KEY (lecNum)
	REFERENCES lecture (num)
;


ALTER TABLE lms_bbs
	ADD FOREIGN KEY (num)
	REFERENCES lecture (num)
;


ALTER TABLE score
	ADD FOREIGN KEY (lecNum)
	REFERENCES lecture (num)
;


ALTER TABLE userData
	ADD FOREIGN KEY (lecNum)
	REFERENCES lecture (num)
;


ALTER TABLE reply
	ADD FOREIGN KEY (listNum, bbsNum, lecNum)
	REFERENCES lms_bbs (listNum, bbsNum, num)
;


ALTER TABLE attendance
	ADD FOREIGN KEY (userNum, kind)
	REFERENCES userData (userNum, kind)
;


ALTER TABLE career
	ADD FOREIGN KEY (userNum, kind)
	REFERENCES userData (userNum, kind)
;


ALTER TABLE schedule
	ADD FOREIGN KEY (userNum, kind)
	REFERENCES userData (userNum, kind)
;


ALTER TABLE score
	ADD FOREIGN KEY (userNum, kind)
	REFERENCES userData (userNum, kind)
;


ALTER TABLE userCert
	ADD FOREIGN KEY (userNum, kind)
	REFERENCES userData (userNum, kind)
;



/* Comments */

COMMENT ON COLUMN attendance.type IS '0정상출석
1결석
2지각
3조퇴
';
COMMENT ON COLUMN attendance.kind IS '00 학생
01 강사
02 관리자';
COMMENT ON COLUMN attendanceKind.codeNum IS '0 정상출석
1 결석
2 지각
3 조퇴';
COMMENT ON COLUMN bbsKind.codeNum IS '00 공지사항
01 수업자료
02 과제
03 질문_질의';
COMMENT ON COLUMN bbsKind.kind IS '00 공지사항
01 수업자료
02 과제
03 질문_질의';
COMMENT ON COLUMN career.kind IS '00 학생
01 강사
02 관리자';
COMMENT ON COLUMN lms_bbs.bbsNum IS '00 공지사항
01 수업자료
02 과제
03 질문_질의';
COMMENT ON COLUMN reply.bbsNum IS '00 공지사항
01 수업자료
02 과제
03 질문_질의';
COMMENT ON COLUMN schedule.kind IS '00 학생
01 강사
02 관리자';
COMMENT ON COLUMN score.kind IS '00 학생
01 강사
02 관리자';
COMMENT ON COLUMN userCert.kind IS '00 학생
01 강사
02 관리자';
COMMENT ON COLUMN userData.kind IS '00 학생
01 강사
02 관리자';
COMMENT ON COLUMN userKind.codeNum IS '00 학생
01 강사
02 관리자';
COMMENT ON COLUMN userKind.kind IS '00 학생
01 강사
02 관리자';



