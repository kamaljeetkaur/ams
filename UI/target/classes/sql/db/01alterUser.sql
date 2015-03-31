alter table user add 
column username varchar(255) after id;

alter table user add 
column password varchar(255) after username ;

insert into user values(1,'kamal','12345','lotus','kamal','asr','asr');
insert into user values(2,'arvind','12345','arv','gupta','del','del');

