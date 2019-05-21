DROP TABLE IF EXISTS `frame_users`;
CREATE TABLE `frame_users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `account` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) NULL,
  `mobile` varchar(255)  NULL,
  `details`  JSON NULL,
  `role_id` varchar(255) NULL,
  `description` varchar(255) NULL,
  `using_flag` integer(1) DEFAULT 1,
  `salt` varchar(6) NOT NULL,
  
  
  `version_num` integer(50) DEFAULT 1,
  `delete_flag` integer(1) DEFAULT 0,
  `create_user` varchar(32) DEFAULT NULL,
  `create_date` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  `update_user` varchar(32) DEFAULT NULL,
  `update_date` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `frame_roles`;
CREATE TABLE `frame_roles` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `version_num` integer(50) DEFAULT 1,
  `delete_flag` integer(1) DEFAULT 0,
  `create_user` varchar(32) DEFAULT NULL,
  `create_date` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  `update_user` varchar(32) DEFAULT NULL,
  `update_date` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `frame_permissions`;
CREATE TABLE `frame_permissions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `version_num` integer(50) DEFAULT 1,
  `delete_flag` integer(1) DEFAULT 0,
  `create_user` varchar(32) DEFAULT NULL,
  `create_date` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  `update_user` varchar(32) DEFAULT NULL,
  `update_date` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `frame_roles_permissions`;
CREATE TABLE `frame_roles_permissions` (
  `role_id` int(11) NOT NULL,
  `permission_id` varchar(255) NOT NULL,
  PRIMARY KEY (`role_id`,`permission_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO frame_users(name,account,password,role_id,salt) VALUES ('admin','admin','8c7904789282730e283fd614a6a41f3a',1,'k2oB4E')
