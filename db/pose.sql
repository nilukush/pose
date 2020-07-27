-- SQL dump generated using DBML (dbml-lang.org)
-- Database: MySQL
-- Generated at: 2020-07-26T09:44:08.671Z

CREATE TABLE `t_user` (
  `id` varchar(255) PRIMARY KEY,
  `username` varchar(255),
  `access_token` varchar(255),
  `created_at` datetime DEFAULT (now()),
  `created_by` varchar(255) DEFAULT "app",
  `updated_at` datetime DEFAULT (now()),
  `updated_by` varchar(255) DEFAULT "app"
);

CREATE TABLE `t_pocket_item` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `given_title` varchar(255),
  `given_url` varchar(255) UNIQUE NOT NULL,
  `status` varchar(255),
  `created_at` datetime DEFAULT (now()),
  `created_by` varchar(255) DEFAULT "app",
  `updated_at` datetime DEFAULT (now()),
  `updated_by` varchar(255) DEFAULT "app"
);

CREATE TABLE `t_user_pocket_item` (
  `user_id` varchar(255),
  `pocket_item_id` int,
  `created_at` datetime DEFAULT (now()),
  `created_by` varchar(255) DEFAULT "app",
  `updated_at` datetime DEFAULT (now()),
  `updated_by` varchar(255) DEFAULT "app"
);

ALTER TABLE `t_user_pocket_item` ADD FOREIGN KEY (`user_id`) REFERENCES `t_user` (`id`);

ALTER TABLE `t_user_pocket_item` ADD FOREIGN KEY (`pocket_item_id`) REFERENCES `t_pocket_item` (`id`);

CREATE UNIQUE INDEX `t_user_index_0` ON `t_user` (`id`);

CREATE INDEX `t_user_index_1` ON `t_user` (`username`);

CREATE UNIQUE INDEX `t_pocket_item_index_2` ON `t_pocket_item` (`given_url`);

CREATE UNIQUE INDEX `t_user_pocket_item_index_3` ON `t_user_pocket_item` (`user_id`);

ALTER TABLE `t_user` COMMENT = "User table to store authentication and user details like token, username";

ALTER TABLE `t_pocket_item` COMMENT = "Pocket item stores the structure of a item you saved in your Pocket account - url, title, status, tags";

ALTER TABLE `t_user_pocket_item` COMMENT = "This stores mapping between a user and his / her list of saved items in his / her Pocket account";
