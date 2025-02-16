SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS `tags`;
DROP TABLE IF EXISTS `likes`;
DROP TABLE IF EXISTS `posts_hashtags`;
DROP TABLE IF EXISTS `notifications`;
DROP TABLE IF EXISTS `follows`;
DROP TABLE IF EXISTS `hashtags`;
DROP TABLE IF EXISTS `users`;
DROP TABLE IF EXISTS `comments`;
DROP TABLE IF EXISTS `posts`;
SET FOREIGN_KEY_CHECKS = 1;

CREATE TABLE `tags` (
    `id` SERIAL INTEGER,
    `idUserTagged` INTEGER NOT NULL,
    `idUserTagger` INTEGER NOT NULL,
    `idComment` INTEGER NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `likes` (
    `id` SERIAL INTEGER,
    `idPost` INTEGER NOT NULL,
    `idUser` INTEGER NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `posts_hashtags` (
    `id` SERIAL INTEGER,
    `idPost` INTEGER NOT NULL,
    `idHashtag` INTEGER NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `notifications` (
    `id` SERIAL INTEGER,
    `idUserNotificated` INTEGER NOT NULL,
    `idUserAction` INTEGER NOT NULL,
    `idLike` INTEGER,
    `idFollow` INTEGER,
    `idTag` INTEGER,
    `idComment` INTEGER,
    `createdAt` TIMESTAMP NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `follows` (
    `id` SERIAL SERIAL INTEGER,
    `idUserFollowed` INTEGER NOT NULL,
    `idUserFollower` INTEGER NOT NULL,
    `followDate` DATE NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `hashtags` (
    `id` SERIAL INTEGER,
    `name` VARCHAR(30) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE (`name`)
);

CREATE TABLE `users` (
    `id` SERIAL INTEGER,
    `userName` VARCHAR(70) NOT NULL,
    `email` VARCHAR(70) NOT NULL,
    `fullName` VARCHAR(70) NOT NULL,
    `birthDate` DATE NOT NULL,
    `phone` INTEGER NOT NULL,
    `password` VARCHAR(170) NOT NULL,
    `profilePhotoURI` TEXT,
    `biography` VARCHAR(255),
    PRIMARY KEY (`id`),
    UNIQUE (`userName`, `email`)
);

CREATE TABLE `comments` (
    `id` SERIAL INTEGER,
    `idUser` INTEGER NOT NULL,
    `idPost` INTEGER NOT NULL,
    `content` VARCHAR(200) NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `posts` (
    `id` SERIAL INTEGER,
    `idUser` INTEGER NOT NULL,
    `content` TEXT(500) NOT NULL,
    `imageAttached` TEXT,
    `uploadDate` DATE NOT NULL,
    PRIMARY KEY (`id`)
);
