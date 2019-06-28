USE `gradu_design_sys`;
/**
  *162015班  第11组
  *毕设信息管理系统--模块
  *@author：
  *date：2019-6-
  *主要功能说明：
/
/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `id` int(6) NOT NULL COMMENT '工号',
  `name` varchar(255) DEFAULT NULL COMMENT '姓名',
  `gender` varchar(2) DEFAULT NULL COMMENT '性别',
  `Birthday` datetime DEFAULT NULL COMMENT '出生年月',
  `Faculties` varchar(50) DEFAULT NULL COMMENT '院系',
  `employ_time` varchar(50) DEFAULT NULL COMMENT '任职时间',
  `Profession_title` varchar(20) DEFAULT NULL COMMENT '职称',
  `Telephone` varchar(11) DEFAULT NULL COMMENT '手机号',
  `IDcard_type` varchar(20) DEFAULT NULL COMMENT '证件类型',
  `IDcard_number` varchar(20) DEFAULT NULL COMMENT '证件号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `admin` */

/*Table structure for table `admin_group_oper` */

DROP TABLE IF EXISTS `admin_group_oper`;

CREATE TABLE `admin_group_oper` (
  `ano` int(6) NOT NULL COMMENT '管理员编号',
  `group_no` int(8) NOT NULL COMMENT '答辩小组编号',
  `operate_time` datetime DEFAULT NULL COMMENT '操作日期',
  `operate_type` varchar(20) DEFAULT NULL COMMENT '操作类型',
  PRIMARY KEY (`ano`,`group_no`),
  KEY `group_no` (`group_no`),
  CONSTRAINT `admin_group_oper_ibfk_1` FOREIGN KEY (`group_no`) REFERENCES `defense_group` (`id`),
  CONSTRAINT `admin_group_oper_ibfk_2` FOREIGN KEY (`ano`) REFERENCES `admin` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `admin_group_oper` */

/*Table structure for table `admin_stu_oper` */

DROP TABLE IF EXISTS `admin_stu_oper`;

CREATE TABLE `admin_stu_oper` (
  `ano` int(6) NOT NULL COMMENT '管理员编号',
  `sno` int(8) NOT NULL COMMENT '教师编号',
  `operate_time` datetime DEFAULT NULL COMMENT '操作日期',
  `operate_type` varchar(20) DEFAULT NULL COMMENT '操作类型',
  PRIMARY KEY (`ano`,`sno`),
  KEY `sno` (`sno`),
  CONSTRAINT `admin_stu_oper_ibfk_1` FOREIGN KEY (`ano`) REFERENCES `admin` (`id`),
  CONSTRAINT `admin_stu_oper_ibfk_2` FOREIGN KEY (`sno`) REFERENCES `student` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `admin_stu_oper` */

/*Table structure for table `admin_tea_oper` */

DROP TABLE IF EXISTS `admin_tea_oper`;

CREATE TABLE `admin_tea_oper` (
  `ano` int(6) NOT NULL COMMENT '管理员编号',
  `tno` int(8) NOT NULL COMMENT '教师编号',
  `operate_time` datetime DEFAULT NULL COMMENT '操作日期',
  `operate_type` varchar(20) DEFAULT NULL COMMENT '操作类型',
  PRIMARY KEY (`ano`,`tno`),
  KEY `tno` (`tno`),
  CONSTRAINT `admin_tea_oper_ibfk_1` FOREIGN KEY (`ano`) REFERENCES `admin` (`id`),
  CONSTRAINT `admin_tea_oper_ibfk_2` FOREIGN KEY (`tno`) REFERENCES `teacher` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `admin_tea_oper` */

/*Table structure for table `defense_group` */

DROP TABLE IF EXISTS `defense_group`;

CREATE TABLE `defense_group` (
  `id` int(6) NOT NULL COMMENT '答辩小组编号',
  `leader_id` int(6) DEFAULT NULL COMMENT '组长编号',
  `group_name` varchar(2) DEFAULT NULL COMMENT '小组名称',
  `people_num` int(11) DEFAULT NULL COMMENT '小组人数',
  `build_time` datetime DEFAULT NULL COMMENT '成立时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `defense_group` */

/*Table structure for table `file` */

DROP TABLE IF EXISTS `file`;

CREATE TABLE `file` (
  `file_num` int(11) NOT NULL COMMENT '文件编号',
  `file_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '文件名称',
  `path` varchar(255) DEFAULT NULL COMMENT '路径',
  `file_type` varchar(50) DEFAULT NULL COMMENT '文件类型',
  `task_no` int(10) DEFAULT NULL COMMENT '任务编号',
  `own_per_no` varchar(20) DEFAULT NULL COMMENT '文件所属人编号',
  PRIMARY KEY (`file_num`),
  KEY `task_no` (`task_no`),
  CONSTRAINT `file_ibfk_1` FOREIGN KEY (`task_no`) REFERENCES `task` (`task_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `file` */

/*Table structure for table `grade` */

DROP TABLE IF EXISTS `grade`;

CREATE TABLE `grade` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '成绩编号',
  `sno` int(8) DEFAULT NULL COMMENT '学号',
  `final_grade` decimal(10,0) DEFAULT NULL COMMENT '总成绩',
  `grade_level` varchar(10) DEFAULT NULL COMMENT '成绩等级',
  PRIMARY KEY (`id`),
  KEY `sno` (`sno`),
  CONSTRAINT `grade_ibfk_1` FOREIGN KEY (`sno`) REFERENCES `student` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `grade` */

/*Table structure for table `group_stu_defense` */

DROP TABLE IF EXISTS `group_stu_defense`;

CREATE TABLE `group_stu_defense` (
  `group_id` int(6) NOT NULL COMMENT '答辩小组编号',
  `sno` int(8) NOT NULL COMMENT '学号',
  `res_grade` decimal(10,0) DEFAULT NULL COMMENT '答辩成绩',
  PRIMARY KEY (`group_id`,`sno`),
  KEY `sno` (`sno`),
  CONSTRAINT `group_stu_defense_ibfk_1` FOREIGN KEY (`group_id`) REFERENCES `defense_group` (`id`),
  CONSTRAINT `group_stu_defense_ibfk_2` FOREIGN KEY (`sno`) REFERENCES `student` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `group_stu_defense` */

/*Table structure for table `group_tea_form` */

DROP TABLE IF EXISTS `group_tea_form`;

CREATE TABLE `group_tea_form` (
  `group_id` int(6) NOT NULL COMMENT '答辩小组编号',
  `tno` int(6) NOT NULL COMMENT '教师工号',
  PRIMARY KEY (`group_id`,`tno`),
  KEY `tno` (`tno`),
  CONSTRAINT `group_tea_form_ibfk_1` FOREIGN KEY (`group_id`) REFERENCES `defense_group` (`id`),
  CONSTRAINT `group_tea_form_ibfk_2` FOREIGN KEY (`tno`) REFERENCES `teacher` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `group_tea_form` */

/*Table structure for table `stu_subject_select` */

DROP TABLE IF EXISTS `stu_subject_select`;

CREATE TABLE `stu_subject_select` (
  `sno` int(8) NOT NULL COMMENT '学号',
  `cno` int(8) NOT NULL COMMENT '课题编号',
  `select_time` datetime DEFAULT NULL COMMENT '选题时间',
  PRIMARY KEY (`sno`,`cno`),
  KEY `cno` (`cno`),
  CONSTRAINT `stu_subject_select_ibfk_1` FOREIGN KEY (`sno`) REFERENCES `student` (`id`),
  CONSTRAINT `stu_subject_select_ibfk_2` FOREIGN KEY (`cno`) REFERENCES `subject` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `stu_subject_select` */

/*Table structure for table `stu_task_submit` */

DROP TABLE IF EXISTS `stu_task_submit`;

CREATE TABLE `stu_task_submit` (
  `sno` int(8) NOT NULL,
  `task_no` int(10) NOT NULL,
  `status` varchar(20) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `grade` decimal(10,0) DEFAULT NULL,
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `submit_time` datetime DEFAULT NULL,
  `is_submit` tinyint(1) DEFAULT NULL,
  `is_scored` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`sno`,`task_no`),
  KEY `task_no` (`task_no`),
  CONSTRAINT `stu_task_submit_ibfk_1` FOREIGN KEY (`sno`) REFERENCES `student` (`id`),
  CONSTRAINT `stu_task_submit_ibfk_2` FOREIGN KEY (`task_no`) REFERENCES `task` (`task_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `stu_task_submit` */

/*Table structure for table `stu_tea_both_choice` */

DROP TABLE IF EXISTS `stu_tea_both_choice`;

CREATE TABLE `stu_tea_both_choice` (
  `sno` int(8) NOT NULL COMMENT '学号',
  `tno` int(6) NOT NULL COMMENT '教师工号',
  `is_receive` tinyint(1) DEFAULT NULL COMMENT '接收意愿',
  PRIMARY KEY (`sno`,`tno`),
  KEY `tno` (`tno`),
  CONSTRAINT `stu_tea_both_choice_ibfk_1` FOREIGN KEY (`sno`) REFERENCES `student` (`id`),
  CONSTRAINT `stu_tea_both_choice_ibfk_2` FOREIGN KEY (`tno`) REFERENCES `teacher` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `stu_tea_both_choice` */

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` int(8) NOT NULL COMMENT '学号',
  `name` varchar(255) DEFAULT NULL COMMENT '姓名',
  `gender` varchar(2) DEFAULT NULL COMMENT '性别',
  `Birthday` datetime DEFAULT NULL COMMENT '出生年月',
  `Faculties` varchar(50) DEFAULT NULL COMMENT '院系',
  `Profession` varchar(50) DEFAULT NULL COMMENT '专业',
  `degree` varchar(50) DEFAULT NULL COMMENT '当前学历',
  `Class` varchar(20) DEFAULT NULL COMMENT '班级',
  `Telephone` varchar(11) DEFAULT NULL COMMENT '手机号',
  `IDcard_type` varchar(20) DEFAULT NULL COMMENT '证件类型',
  `IDcard_number` varchar(20) DEFAULT NULL COMMENT '证件号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `student` */

/*Table structure for table `subject` */

DROP TABLE IF EXISTS `subject`;

CREATE TABLE `subject` (
  `id` int(8) NOT NULL COMMENT '课题编号',
  `name` varchar(50) DEFAULT NULL COMMENT '课题名称',
  `Profession` varchar(50) DEFAULT NULL COMMENT '专业',
  `degree` varchar(10) DEFAULT NULL COMMENT '课题难度',
  `content` varchar(255) DEFAULT NULL COMMENT '课题内容',
  `file_number` int(10) DEFAULT NULL COMMENT '课题附件',
  `status` varchar(20) DEFAULT NULL COMMENT '课题生存状态',
  `advice` varchar(255) DEFAULT NULL COMMENT '审核意见',
  PRIMARY KEY (`id`),
  KEY `file_number` (`file_number`),
  CONSTRAINT `subject_ibfk_1` FOREIGN KEY (`file_number`) REFERENCES `file` (`file_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `subject` */

/*Table structure for table `task` */

DROP TABLE IF EXISTS `task`;

CREATE TABLE `task` (
  `task_no` int(10) NOT NULL COMMENT '任务编号',
  `task_name` varchar(50) DEFAULT NULL COMMENT '任务名称',
  `task_content` varchar(255) DEFAULT NULL COMMENT '任务内容',
  PRIMARY KEY (`task_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `task` */

/*Table structure for table `tea_subject_declare` */

DROP TABLE IF EXISTS `tea_subject_declare`;

CREATE TABLE `tea_subject_declare` (
  `tno` int(6) NOT NULL COMMENT '教师编号',
  `cno` int(8) NOT NULL COMMENT '课题编号',
  `status` varchar(20) DEFAULT NULL COMMENT '审核状态',
  PRIMARY KEY (`tno`,`cno`),
  KEY `cno` (`cno`),
  CONSTRAINT `tea_subject_declare_ibfk_1` FOREIGN KEY (`tno`) REFERENCES `teacher` (`id`),
  CONSTRAINT `tea_subject_declare_ibfk_2` FOREIGN KEY (`cno`) REFERENCES `defense_group` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tea_subject_declare` */

/*Table structure for table `tea_task_create` */

DROP TABLE IF EXISTS `tea_task_create`;

CREATE TABLE `tea_task_create` (
  `tno` int(6) NOT NULL COMMENT '教师工号',
  `task_no` int(10) NOT NULL COMMENT '任务编号',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `start_time` datetime DEFAULT NULL COMMENT '开始时间',
  `end_time` datetime DEFAULT NULL COMMENT '截止时间',
  PRIMARY KEY (`tno`,`task_no`),
  KEY `task_no` (`task_no`),
  CONSTRAINT `tea_task_create_ibfk_1` FOREIGN KEY (`tno`) REFERENCES `teacher` (`id`),
  CONSTRAINT `tea_task_create_ibfk_2` FOREIGN KEY (`task_no`) REFERENCES `task` (`task_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tea_task_create` */

/*Table structure for table `teacher` */

DROP TABLE IF EXISTS `teacher`;

CREATE TABLE `teacher` (
  `id` int(6) NOT NULL COMMENT '工号',
  `name` varchar(255) DEFAULT NULL COMMENT '姓名',
  `gender` varchar(2) DEFAULT NULL COMMENT '性别',
  `Birthday` datetime DEFAULT NULL COMMENT '出生年月',
  `Faculties` varchar(50) DEFAULT NULL COMMENT '院系',
  `Profession` varchar(50) DEFAULT NULL COMMENT '专业领域',
  `employ_time` varchar(50) DEFAULT NULL COMMENT '任教时间',
  `ofession_title` varchar(20) DEFAULT NULL COMMENT '职称',
  `Telephone` varchar(11) DEFAULT NULL COMMENT '手机号',
  `IDcard_type` varchar(20) DEFAULT NULL COMMENT '证件类型',
  `IDcard_number` varchar(20) DEFAULT NULL COMMENT '证件号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create view adminView
AS
select * from admin;

create view admin_group_operView
as
select * from admin_group_oper;

create view admin_stu_operview
as
select * from admin_stu_oper;

create view admin_tea_operview
as
select * from admin_tea_oper;

create view defense_groupview
as
select * from defense_group;

create view fileview
as
select * from file;

create view gradeview
as
select * from grade;

create view group_stu_defenseview
as
select * from group_stu_defense;

create view group_tea_formview
as
select * from group_tea_form;

create view stu_subject_selectview
as
select * from stu_subject_select;

create view stu_task_submitview
as
select * from stu_task_submit;

create view stu_tea_both_choiceview
as
select * from stu_tea_both_choice;

create view studentview
as
select * from student;

create view subjectview
as
select * from subject;

create view taskview
as
select * from task;

create view tea_subject_declareview
as
select * from tea_subject_declare;

create view tea_task_createview
as
select * from tea_task_create;

create view teacherview
as
select * from teacher;
