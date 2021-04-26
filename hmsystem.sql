-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 25, 2021 at 01:18 PM
-- Server version: 10.4.10-MariaDB
-- PHP Version: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hmsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `appointment`
--

CREATE TABLE `appointment` (
  `loginid` varchar(225) NOT NULL,
  `fullname` varchar(225) NOT NULL,
  `age` varchar(225) NOT NULL,
  `mobilenumber` varchar(225) NOT NULL,
  `bloodgroup` varchar(225) NOT NULL,
  `typeofsickness` varchar(225) NOT NULL,
  `appointmentdate` date NOT NULL,
  `appointmnettime` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `appointment`
--

INSERT INTO `appointment` (`loginid`, `fullname`, `age`, `mobilenumber`, `bloodgroup`, `typeofsickness`, `appointmentdate`, `appointmnettime`) VALUES
('10707284', 'Mujeeb', '21', '0770833300', 'O+', 'Cold', '2021-04-29', '20:09:00'),
('10707351', 'Disini', '18', '0771231234', 'AB+', 'Flu', '2021-04-27', '18:08:00');

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `fullname` varchar(225) NOT NULL,
  `loginid` varchar(20) NOT NULL,
  `password` varchar(225) NOT NULL,
  `address` varchar(225) NOT NULL,
  `age` varchar(225) NOT NULL,
  `mobilenumber` varchar(225) NOT NULL,
  `gender` varchar(225) NOT NULL,
  `martialstatus` varchar(225) NOT NULL,
  `dateofbirth` date NOT NULL,
  `qualification` varchar(225) NOT NULL,
  `datajoined` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`fullname`, `loginid`, `password`, `address`, `age`, `mobilenumber`, `gender`, `martialstatus`, `dateofbirth`, `qualification`, `datajoined`) VALUES
('Mujeeb', '10026155', 'Azhar1234', 'Kuwait', '21', '0770833300', 'Male', 'Single', '2021-04-06', 'SE', '2021-04-13');

-- --------------------------------------------------------

--
-- Table structure for table `feedback`
--

CREATE TABLE `feedback` (
  `name` varchar(225) NOT NULL,
  `email` varchar(225) NOT NULL,
  `phone` varchar(225) NOT NULL,
  `comments` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `fullname` varchar(225) NOT NULL,
  `loginid` varchar(20) NOT NULL,
  `password` varchar(225) NOT NULL,
  `address` varchar(225) NOT NULL,
  `age` varchar(225) NOT NULL,
  `mobilenumber` varchar(225) NOT NULL,
  `bloodgroup` varchar(225) NOT NULL,
  `martialstatus` varchar(225) NOT NULL,
  `gender` varchar(225) NOT NULL,
  `dateofbirth` date NOT NULL,
  `deceased` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `patientname` varchar(225) NOT NULL,
  `doctorname` varchar(225) NOT NULL,
  `typeofsickness` varchar(225) NOT NULL,
  `typeofroom` varchar(225) NOT NULL,
  `roomjoined` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `appointment`
--
ALTER TABLE `appointment`
  ADD PRIMARY KEY (`loginid`);

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`loginid`);

--
-- Indexes for table `feedback`
--
ALTER TABLE `feedback`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`loginid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
