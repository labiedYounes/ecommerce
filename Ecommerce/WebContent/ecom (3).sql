-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Serveur: localhost
-- Généré le : Lun 18 Mars 2013 à 12:03
-- Version du serveur: 5.5.8
-- Version de PHP: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `ecom`
--

-- --------------------------------------------------------

--
-- Structure de la table `categorie`
--

CREATE TABLE IF NOT EXISTS `categorie` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `nom` varchar(20) NOT NULL,
  `discription` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=24 ;

--
-- Contenu de la table `categorie`
--

INSERT INTO `categorie` (`id`, `nom`, `discription`) VALUES
(1, 'cat1', 'cat1Discription'),
(2, 'cat2', ''),
(3, 'cat3', ''),
(4, 'cat5', ''),
(23, 'cat6', '');

-- --------------------------------------------------------

--
-- Structure de la table `catproduit`
--

CREATE TABLE IF NOT EXISTS `catproduit` (
  `idC` int(10) NOT NULL,
  `idP` int(10) NOT NULL,
  PRIMARY KEY (`idC`,`idP`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `catproduit`
--

INSERT INTO `catproduit` (`idC`, `idP`) VALUES
(1, 2),
(1, 4),
(1, 6),
(1, 18),
(1, 19),
(1, 20),
(2, 1),
(2, 3),
(2, 4);

-- --------------------------------------------------------

--
-- Structure de la table `produit`
--

CREATE TABLE IF NOT EXISTS `produit` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `nom` varchar(20) NOT NULL,
  `qt` int(10) NOT NULL,
  `img` varchar(100) NOT NULL,
  `discription` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=21 ;

--
-- Contenu de la table `produit`
--

INSERT INTO `produit` (`id`, `nom`, `qt`, `img`, `discription`) VALUES
(1, 'p1', 23, '', 'dsfsd'),
(2, 'sdfsdf', 21, '', 'sdfsdfsd'),
(4, 'sdf123sdf', 21, '', 'sdfsdfsd'),
(6, 'sdfsdf', 41, '', 'sdfsdfsd'),
(18, 'prodazerty', 2, '', 's'),
(19, 'tatatata', 10000, '', 'zada'),
(20, 'testing', 2, '', 'qsd');

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

CREATE TABLE IF NOT EXISTS `utilisateur` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `login` varchar(20) NOT NULL,
  `pwd` varchar(20) NOT NULL,
  `type` varchar(20) NOT NULL,
  `email` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `login` (`login`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=17 ;

--
-- Contenu de la table `utilisateur`
--

INSERT INTO `utilisateur` (`id`, `login`, `pwd`, `type`, `email`) VALUES
(1, 'a', 'a', 'admin', 'adadadad'),
(2, 'c', 'c', 'client', 'cdcddcdc'),
(15, 'sdf', 'sdf', 'client', 'qsdf'),
(16, 'hqv', 'vcbw', 'client', 'vcxw');
