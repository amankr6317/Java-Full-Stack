/*
SQLyog Community v13.1.9 (64 bit)
MySQL - 8.0.28 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `ptm_user` (
	`create_at` datetime ,
	`full_name` varchar (765),
	`password` varchar (765),
	`update_at` datetime ,
	`username` varchar (765)
); 
insert into `ptm_user` (`create_at`, `full_name`, `password`, `update_at`, `username`) values('2022-07-12 00:17:13.000000','Aman Kumar','$2a$10$muEFEWnGBRIrbw7ooxpGau7riPRakm4nrcaAvnirkx/kZcBfBYUfK',NULL,'kumar.aman@yash.com');
insert into `ptm_user` (`create_at`, `full_name`, `password`, `update_at`, `username`) values('2022-07-12 15:40:09.032000','Test User','$2a$10$u4l1MQzuEHxi05vRLZHc3.fIfSlMKm5tTiGg.obQy9YXIbp9hv07i',NULL,'test@yash.com');
insert into `ptm_user` (`create_at`, `full_name`, `password`, `update_at`, `username`) values('2022-07-19 15:01:16.981000','testUser','$2a$10$naX04hpKmupKON0FzTGq3uwqCn3o/7x.nCg8Iyz61A79VyR7C7ovG',NULL,'testUser@yash.com');

create table `ptm_project` (
	`created_at` datetime ,
	`description` varchar (765),
	`end_date` datetime ,
	`project_identifier` varchar (15),
	`project_leader` varchar (765),
	`project_name` varchar (765),
	`start_date` datetime ,
	`updated_at` datetime ,
	`user_id` bigint (20)
); 
insert into `ptm_project` (`created_at`, `description`, `end_date`, `project_identifier`, `project_leader`, `project_name`, `start_date`, `updated_at`, `user_id`) values('2022-07-15 10:58:38.339000','This is a comprehensive, modular, enterprise wide Project Management System that automates and integrates all the project and project task of an organizations such as similar to jira, zenhub. ','2022-01-17 05:37:00.000000','YT001','kumar.aman@yash.com','JAVA Project (Project Task Management)','2022-01-01 05:37:00.000000','2022-07-15 18:53:19.544000','1');
insert into `ptm_project` (`created_at`, `description`, `end_date`, `project_identifier`, `project_leader`, `project_name`, `start_date`, `updated_at`, `user_id`) values('2022-07-17 02:04:51.836000','This is a Test Project','2022-01-24 05:37:00.000000','TP001','test@yash.com','Test Project','2022-01-17 05:37:00.000000',NULL,'2');

create table `ptm_project_task` (
	`acceptance_criteria` varchar (765),
	`create_at` datetime ,
	`due_date` datetime ,
	`priority` int (11),
	`project_identifier` varchar (765),
	`project_task_identifier` varchar (765),
	`status` varchar (765),
	`summary` varchar (765),
	`update_at` datetime ,
	`project_id` bigint (20)
); 
insert into `ptm_project_task` (`acceptance_criteria`, `create_at`, `due_date`, `priority`, `project_identifier`, `project_task_identifier`, `status`, `summary`, `update_at`, `project_id`) values('Spring Boot','2022-07-16 18:13:54.983000','2022-01-16 05:37:00.000000','1','YT001','YT001_1','IN_PROGRESS','Backend',NULL,'1');
insert into `ptm_project_task` (`acceptance_criteria`, `create_at`, `due_date`, `priority`, `project_identifier`, `project_task_identifier`, `status`, `summary`, `update_at`, `project_id`) values('React JS','2022-07-16 18:17:28.201000','2022-01-18 05:37:00.000000','2','YT001','YT001_2','IN_PROGRESS','Frontend',NULL,'1');
insert into `ptm_project_task` (`acceptance_criteria`, `create_at`, `due_date`, `priority`, `project_identifier`, `project_task_identifier`, `status`, `summary`, `update_at`, `project_id`) values('Spring Security','2022-07-17 00:36:58.255000','2022-01-16 05:37:00.000000','3','YT001','YT001_3','TO_DO','Authentication',NULL,'1');
insert into `ptm_project_task` (`acceptance_criteria`, `create_at`, `due_date`, `priority`, `project_identifier`, `project_task_identifier`, `status`, `summary`, `update_at`, `project_id`) values('React JS','2022-07-17 00:41:01.032000','2022-01-15 05:37:00.000000','3','YT001','YT001_4','DONE','Form Creation',NULL,'1');
insert into `ptm_project_task` (`acceptance_criteria`, `create_at`, `due_date`, `priority`, `project_identifier`, `project_task_identifier`, `status`, `summary`, `update_at`, `project_id`) values('NA',NULL,'2022-01-16 05:37:00.000000','3','TP001','TP001_1','TO_DO','TEST','2022-07-17 14:51:22.809000','3');