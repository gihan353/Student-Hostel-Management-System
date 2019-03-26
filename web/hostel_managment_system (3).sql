-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Nov 03, 2017 at 07:15 AM
-- Server version: 5.7.19
-- PHP Version: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hostel_managment_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `assignstudent`
--

DROP TABLE IF EXISTS `assignstudent`;
CREATE TABLE IF NOT EXISTS `assignstudent` (
  `regno` varchar(25) NOT NULL,
  `userid` varchar(20) NOT NULL,
  `date` int(15) NOT NULL,
  `hostelid` varchar(25) NOT NULL,
  `roomno` int(8) NOT NULL,
  PRIMARY KEY (`regno`),
  UNIQUE KEY `userid` (`userid`),
  UNIQUE KEY `hostelid` (`hostelid`),
  UNIQUE KEY `roomno` (`roomno`),
  KEY `userid_2` (`userid`),
  KEY `hostelid_2` (`hostelid`),
  KEY `roomno_2` (`roomno`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `hostel`
--

DROP TABLE IF EXISTS `hostel`;
CREATE TABLE IF NOT EXISTS `hostel` (
  `hostelid` varchar(30) NOT NULL,
  `hostelname` varchar(20) NOT NULL,
  `addline1` varchar(10) NOT NULL,
  `addline2` varchar(10) NOT NULL,
  `addline3` varchar(10) NOT NULL,
  `userid` varchar(25) NOT NULL,
  `date` int(15) NOT NULL,
  UNIQUE KEY `userid` (`userid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `inventory`
--

DROP TABLE IF EXISTS `inventory`;
CREATE TABLE IF NOT EXISTS `inventory` (
  `invid` varchar(30) NOT NULL,
  `type` varchar(25) NOT NULL,
  `description` varchar(50) NOT NULL,
  `userid` varchar(25) NOT NULL,
  `roomno` int(8) NOT NULL,
  `date` varchar(11) NOT NULL,
  PRIMARY KEY (`invid`),
  UNIQUE KEY `userid` (`userid`),
  UNIQUE KEY `roomno` (`roomno`),
  KEY `userid_2` (`userid`),
  KEY `roomno_2` (`roomno`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `inventory`
--

INSERT INTO `inventory` (`invid`, `type`, `description`, `userid`, `roomno`, `date`) VALUES
('e323', 'Cupboard', '3ee3e3', 'e332e33', 34, 'null');

-- --------------------------------------------------------

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
CREATE TABLE IF NOT EXISTS `role` (
  `roleid` varchar(25) NOT NULL,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`roleid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
CREATE TABLE IF NOT EXISTS `room` (
  `roomno` int(8) NOT NULL,
  `hostelid` varchar(25) NOT NULL,
  PRIMARY KEY (`roomno`,`hostelid`),
  KEY `hostelid` (`hostelid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE IF NOT EXISTS `student` (
  `regno` varchar(15) NOT NULL,
  `name` varchar(50) NOT NULL,
  `nic` varchar(20) NOT NULL,
  `gender` char(1) NOT NULL,
  `acedemicyear` int(20) NOT NULL,
  `userid` varchar(15) NOT NULL,
  `roomno` int(8) NOT NULL,
  `date` varchar(20) NOT NULL,
  `addline1` varchar(10) NOT NULL,
  `addline2` varchar(10) NOT NULL,
  `addline3` varchar(10) NOT NULL,
  `landno` int(15) NOT NULL,
  `mobileno` int(12) NOT NULL,
  PRIMARY KEY (`regno`),
  UNIQUE KEY `userid` (`userid`),
  UNIQUE KEY `roomno` (`roomno`),
  KEY `userid_2` (`userid`),
  KEY `roomno_2` (`roomno`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `userid` varchar(20) NOT NULL,
  `fname` varchar(15) NOT NULL,
  `lname` varchar(15) NOT NULL,
  `gender` varchar(16) NOT NULL,
  `password` varchar(50) NOT NULL,
  `roleid` varchar(20) NOT NULL,
  `designation` varchar(25) NOT NULL,
  `landno` int(12) NOT NULL,
  `mobileno` int(12) NOT NULL,
  `email` varchar(30) NOT NULL,
  PRIMARY KEY (`roleid`),
  UNIQUE KEY `roleid` (`roleid`),
  KEY `roleid_2` (`roleid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`userid`, `fname`, `lname`, `gender`, `password`, `roleid`, `designation`, `landno`, `mobileno`, `email`) VALUES
('user1', 'dilan', 'weerasinghe', 'male', 'backtolife123', 'subwarden1', 'sub', 342260165, 712347020, 'dilanweerasinghe84@gmail.com'),
('gihan353', 'gihan', 'chathuranga', 'Male', 'gihan353', 'r003', 'SystemAdmin', 452270122, 717274611, 'gihan353@gmail.com');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
