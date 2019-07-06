
/* Drop Tables */

DROP TABLE attendance CASCADE CONSTRAINTS;
DROP TABLE attendanceKind CASCADE CONSTRAINTS;
DROP TABLE bbsKind CASCADE CONSTRAINTS;
DROP TABLE career CASCADE CONSTRAINTS;
DROP TABLE userCert CASCADE CONSTRAINTS;
DROP TABLE certification CASCADE CONSTRAINTS;
DROP TABLE reply CASCADE CONSTRAINTS;
DROP TABLE lmsBbs CASCADE CONSTRAINTS;
DROP TABLE score CASCADE CONSTRAINTS;
DROP TABLE schedule CASCADE CONSTRAINTS;
DROP TABLE userData CASCADE CONSTRAINTS;
DROP TABLE lecture CASCADE CONSTRAINTS;
DROP TABLE userKind CASCADE CONSTRAINTS;



/* Drop Sequences */

DROP SEQUENCE attendanceKind_seq;
DROP SEQUENCE attendance_seq;
DROP SEQUENCE bbsKind_seq;
DROP SEQUENCE career_seq;
DROP SEQUENCE certification_seq;
DROP SEQUENCE lecture_seq;
DROP SEQUENCE lmsBbs_0_seq;
DROP SEQUENCE lmsBbs_1_seq;
DROP SEQUENCE lmsBbs_2_seq;
DROP SEQUENCE lmsBbs_3_seq;
DROP SEQUENCE lmsBbs_4_seq;
DROP SEQUENCE reply_seq;
DROP SEQUENCE schedule_seq;
DROP SEQUENCE score_seq;
DROP SEQUENCE userData_0_seq;
DROP SEQUENCE userData_1_seq;
DROP SEQUENCE userData_2_seq;
DROP SEQUENCE userKind_seq;




/* Create Sequences */

CREATE SEQUENCE attendanceKind_seq START WITH 0;
CREATE SEQUENCE attendance_seq;
CREATE SEQUENCE bbsKind_seq START WITH 0;
CREATE SEQUENCE career_seq;
CREATE SEQUENCE certification_seq START WITH 0;
CREATE SEQUENCE lecture_seq;
CREATE SEQUENCE lmsBbs_0_seq;
CREATE SEQUENCE lmsBbs_1_seq;
CREATE SEQUENCE lmsBbs_2_seq;
CREATE SEQUENCE lmsBbs_3_seq;
CREATE SEQUENCE lmsBbs_4_seq;
CREATE SEQUENCE reply_seq;
CREATE SEQUENCE schedule_seq;
CREATE SEQUENCE score_seq;
CREATE SEQUENCE userData_0_seq;
CREATE SEQUENCE userData_1_seq;
CREATE SEQUENCE userData_2_seq;
CREATE SEQUENCE userKind_seq START WITH 0;



/* Create Tables */

CREATE TABLE attendance
(
	num number NOT NULL,
	day date NOT NULL,
	-- 0�����⼮
	-- 1�Ἦ
	-- 2����
	-- 3����
	-- 
	type number NOT NULL,
	lecNum number NOT NULL,
	startTime date,
	endTime date,
	userNum number NOT NULL,
	-- 00 �л�
	-- 01 ����
	-- 02 ������
	kind number NOT NULL,
	PRIMARY KEY (num)
);


CREATE TABLE attendanceKind
(
	-- 0 �����⼮
	-- 1 �Ἦ
	-- 2 ����
	-- 3 ����
	codeNum number NOT NULL,
	num number,
	PRIMARY KEY (codeNum)
);


CREATE TABLE bbsKind
(
	-- 00 ��������
	-- 01 �����ڷ�
	-- 02 ����
	-- 03 ����_����
	codeNum number NOT NULL,
	-- 00 ��������
	-- 01 �����ڷ�
	-- 02 ����
	-- 03 ����_����
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
	-- 00 �л�
	-- 01 ����
	-- 02 ������
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
	content varchar2(2000),
	attach varchar2(1000),
	PRIMARY KEY (num)
);


CREATE TABLE lmsBbs
(
	listNum number NOT NULL,
	-- 00 ��������
	-- 01 �����ڷ�
	-- 02 ����
	-- 03 ����_����
	bbsNum number NOT NULL,
	num number NOT NULL,
	title varchar2(100),
	content varchar2(2000),
	id varchar2(50),
	nalja date,
	views number,
	attach varchar2(1000),
	PRIMARY KEY (listNum, bbsNum, num)
);


CREATE TABLE reply
(
	num number NOT NULL,
	content varchar2(2000),
	nalja date,
	id varchar2(50),
	listNum number NOT NULL,
	-- 00 ��������
	-- 01 �����ڷ�
	-- 02 ����
	-- 03 ����_����
	bbsNum number NOT NULL,
	lecNum number NOT NULL,
	PRIMARY KEY (num)
);


CREATE TABLE schedule
(
	num number NOT NULL,
	startdate date,
	enddate date,
	category varchar2(20),
	title varchar2(100),
	content varchar2(2000),
	userNum number NOT NULL,
	-- 00 �л�
	-- 01 ����
	-- 02 ������
	kind number NOT NULL,
	PRIMARY KEY (num)
);


CREATE TABLE score
(
	scoreNum number NOT NULL,
	lecNum number NOT NULL,
	userNum number NOT NULL,
	-- 00 �л�
	-- 01 ����
	-- 02 ������
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
	-- 00 �л�
	-- 01 ����
	-- 02 ������
	kind number NOT NULL
);


CREATE TABLE userData
(
	userNum number NOT NULL,
	-- 00 �л�
	-- 01 ����
	-- 02 ������
	kind number NOT NULL,
	lecNum number,
	id varchar2(50) NOT NULL,
	pw varchar2(50) NOT NULL,
	name varchar2(30) NOT NULL,
	birth date,
	phone number,
	email varchar2(100),
	address varchar2(100),
	major varchar2(50),
	PRIMARY KEY (userNum, kind)
);


CREATE TABLE userKind
(
	-- 00 �л�
	-- 01 ����
	-- 02 ������
	codeNum number NOT NULL,
	-- 00 �л�
	-- 01 ����
	-- 02 ������
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


ALTER TABLE lmsBbs
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
	REFERENCES lmsBbs (listNum, bbsNum, num)
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



