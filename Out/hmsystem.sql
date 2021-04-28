-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 28, 2021 at 03:10 AM
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
('10707284', 'Jabbar Azhar Mujeeb', '21', '0754567113', 'O+', 'allergies', '2021-04-28', '00:00:16'),
('10707351', 'Disini', '21', '0771231234', 'AB+', 'diarrhea', '2021-04-28', '00:00:19');

-- --------------------------------------------------------

--
-- Table structure for table `billing`
--

CREATE TABLE `billing` (
  `daysstayed` varchar(225) NOT NULL,
  `typeofroom` varchar(225) NOT NULL,
  `medicinefees` varchar(225) NOT NULL,
  `patientname` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `billing`
--

INSERT INTO `billing` (`daysstayed`, `typeofroom`, `medicinefees`, `patientname`) VALUES
('3', 'VIP Room', '200', 'Mujeeb');

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
  `dateofbirth` varchar(225) NOT NULL,
  `qualification` varchar(225) NOT NULL,
  `datajoined` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`fullname`, `loginid`, `password`, `address`, `age`, `mobilenumber`, `gender`, `martialstatus`, `dateofbirth`, `qualification`, `datajoined`) VALUES
('M D A Medhavi', '10707000', 'Dewni1234', 'India', '22', '+9412312341', 'Female', 'Married', '1999-01-03', 'Dentist', '2021-03-20'),
('I N Samarawickrame', '10707001', 'Irusha1234', 'Sri Lanka', '19', '0771234567', 'Male', 'Single', '2002-04-29', 'SE', '2021-03-25'),
('Irusha', '10707284', 'Irusha1234', '43/1, Ampara Road, Paddiyadipitty, Akkaraipattu', '21', '0754567113', 'O+', 'Single', 'Male', 'SE', '0000-00-00'),
('G M D D Ratnayake', '10707351', 'Disini1234', 'Katunayake, Sri Lanka', '18', '0760534989', 'Female', 'Single', '2003-01-03', 'Doctor', '2021-04-20');

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

--
-- Dumping data for table `feedback`
--

INSERT INTO `feedback` (`name`, `email`, `phone`, `comments`) VALUES
('Smith', 'smith123@gmail.com', '0771231234', 'Hello');

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
  `dateofbirth` varchar(225) NOT NULL,
  `deceased` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`fullname`, `loginid`, `password`, `address`, `age`, `mobilenumber`, `bloodgroup`, `martialstatus`, `gender`, `dateofbirth`, `deceased`) VALUES
('Mujeeb', '10026155', 'a251', 'sri lanka', '21', '075467113', 'O+', 'S', 'M', '', ''),
('Silham', 'psilham', 'silham1234', 'Sri Lanka', '24', '0756123802', 'AB+', 'Single', 'Male', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `patientname` varchar(225) NOT NULL,
  `doctorname` varchar(225) NOT NULL,
  `typeofsickness` varchar(225) NOT NULL,
  `typeofroom` varchar(225) NOT NULL,
  `roomjoined` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`patientname`, `doctorname`, `typeofsickness`, `typeofroom`, `roomjoined`) VALUES
('Silham', 'I N Samarawickrame', 'conjuctivitis', 'normal', '2021-04-20');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `appointment`
--
ALTER TABLE `appointment`
  ADD PRIMARY KEY (`loginid`);

--
-- Indexes for table `billing`
--
ALTER TABLE `billing`
  ADD PRIMARY KEY (`patientname`);

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
