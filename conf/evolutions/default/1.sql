# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table task (
  task_id                   integer auto_increment not null,
  task_name                 varchar(255),
  constraint pk_task primary key (task_id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table task;

SET FOREIGN_KEY_CHECKS=1;

