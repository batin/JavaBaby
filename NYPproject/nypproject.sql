-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: May 26, 2018 at 10:06 AM
-- Server version: 5.7.21-log
-- PHP Version: 7.1.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `nypproject`
--

-- --------------------------------------------------------

--
-- Table structure for table `accounts`
--

CREATE TABLE `accounts` (
  `Id` int(11) NOT NULL,
  `Name` varchar(25) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `Surname` varchar(25) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `BirthDate` date DEFAULT NULL,
  `Address` varchar(255) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `MailingAdress` varchar(255) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `Email` varchar(100) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `Password` varchar(100) COLLATE utf8mb4_turkish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Dumping data for table `accounts`
--

INSERT INTO `accounts` (`Id`, `Name`, `Surname`, `BirthDate`, `Address`, `MailingAdress`, `Email`, `Password`) VALUES
(2, 'Batin', 'Eryilmaz', '1996-01-18', 'denizli', 'denizli', 'btnbtn96@gmail.com', '123'),
(4, 'asd', 'asd', '2018-05-04', 'asd', 'asd', '1', '1'),
(5, 'tttttt', 'ttttt', '2018-05-09', '', '', 'tata', 'ta'),
(6, 'asd', 'asd', '0136-05-16', 'aasd', 'asd', 'asd', 'asd'),
(7, 'BATIN', 'ERYILMAZ', '1996-01-18', 'ASD', 'ASD', 'btnbtn96@gmail.com', '1'),
(8, 'qwe', 'qwe', '2018-05-02', 'qweqw', 'qweqw', 'wqe', 'qwe'),
(9, 'aasd', 'asd', '2018-05-08', 'asd', 'asd', 'btnbtn96@gmail.com', 'asdasd'),
(10, 'aasd', 'asd', '2018-05-08', 'asd', 'asd', 'btnbtn96@gmail.com', 'asdasd'),
(11, 'aasd', 'asd', '2018-05-08', 'asd', 'asd', 'btnbtn96@gmail.com', 'asdasd'),
(12, 'aasd', 'asd', '2018-05-08', 'asd', 'asd', 'btnbtn96@gmail.com', 'asdasd'),
(13, 'aasd', 'asd', '2018-05-08', 'asd', 'asd', 'btnbtn96@gmail.com', 'asdasd'),
(14, 'aasd', 'asd', '2018-05-08', 'asd', 'asd', 'btnbtn96@gmail.com', 'asdasd'),
(16, 'HASAN', 'TEZCAN', '2012-05-01', 'DENIZLI', 'DENIZLI', 'hsn', 'hsn'),
(17, 'batin', 'eryilmaz', '1996-01-18', 'asdasd', 'asdasd', 'btn', 'btn'),
(18, 'btn', 'btn', '2018-05-15', 'btn', 'btn', 'btnbtn96', '11');

-- --------------------------------------------------------

--
-- Table structure for table `cities`
--

CREATE TABLE `cities` (
  `Name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `Coordinates` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cities`
--

INSERT INTO `cities` (`Name`, `Coordinates`) VALUES
('DENIZLI', '45,50'),
('IZMIR', '15,5'),
('ADANA', '50,10'),
('BURSA', '20,30'),
('VAN', '100,45'),
('MUGLA', '0,0'),
('ANKARA', '35,25'),
('GAZIANTEP', '10,60'),
('CANAKKALE', '1,45'),
('BALIKESIR', '40,3'),
('KUTAHYA', '5,40'),
('ESKISEHIR', '20,35'),
('AFYON', '32,16'),
('RIZE', '80,80');

-- --------------------------------------------------------

--
-- Table structure for table `passengers`
--

CREATE TABLE `passengers` (
  `Name` varchar(20) COLLATE utf8mb4_turkish_ci NOT NULL,
  `Surname` varchar(20) COLLATE utf8mb4_turkish_ci NOT NULL,
  `Birthdate` varchar(20) COLLATE utf8mb4_turkish_ci NOT NULL,
  `Adress` varchar(255) COLLATE utf8mb4_turkish_ci NOT NULL,
  `MailingAdress` varchar(255) COLLATE utf8mb4_turkish_ci NOT NULL,
  `eMail` varchar(50) COLLATE utf8mb4_turkish_ci NOT NULL,
  `Plane` varchar(20) COLLATE utf8mb4_turkish_ci NOT NULL,
  `Seat` varchar(20) COLLATE utf8mb4_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Dumping data for table `passengers`
--

INSERT INTO `passengers` (`Name`, `Surname`, `Birthdate`, `Adress`, `MailingAdress`, `eMail`, `Plane`, `Seat`) VALUES
('asd', 'asd', '2018-05-10', 'asd', 'asd', 'asd', 'aslan', 'D1'),
('asd', 'asd', '2018-05-10', 'asd', 'asd', 'asd', 'aslan', 'C1'),
('asdasd', 'asdasd', '2018-05-03', 'asdasd', 'asdasd', 'asdasd', 'aslan', 'D2'),
('hasan', 'aaa', '2018-05-18', 'aaa', 'aaaa', 'aaa', 'aslan', 'C2'),
('asd', 'asd', '2018-05-09', 'asd', 'asd', 'asd', 'aslan', 'D3'),
('gggg', 'ggg', '2018-05-10', 'ggg', 'ggg', 'ggg', 'aslan', 'C3'),
('gh', 'gh', '2018-05-16', 'gh', 'gh', 'gh', 'aslan', 'D4'),
('oldu mu', 'asd', '2018-05-11', 'aasd', 'asd', 'asd', 'aslan', 'C4'),
('yyy', 'yyyy', '2018-05-10', 'yyy', 'yyyy', 'yyyy', 'aslan', 'A11'),
('asd', 'asd', '2018-05-10', 'asd', 'asd', 'asd', 'd1', 'C1'),
('asd', 'asd', '2018-05-10', 'asd', 'asd', 'asd', 'd1', 'C1'),
('asd', 'asd', '2018-05-10', 'asd', 'asd', 'asd', 'd1', 'C1'),
('asd', 'asd', '2018-05-23', 'asd', 'asd', 'asd', 'd1', 'D1'),
('asdd2', '2123', '2018-05-10', 'cf12', 'c123', 'c123', 'd1', 'D2'),
('asd', 'asd', '2018-05-24', 'asd', 'asd', 'asd', 'aslan', 'A1'),
('asd', 'asd', '2018-05-16', 'asd', 'asda', 'aasdds', 'aslan', 'A2'),
('asd', 'asd', '2018-05-15', 'asd', 'asd', 'asd', 'aslan', 'B3'),
('ASD', 'ASD', '2018-05-02', 'ASD', 'ASD', 'ASD', 'aslan', 'B8'),
('ASD', 'ASD', '2018-05-02', 'ASD', 'ASD', 'ASD', 'd1', 'B8'),
('asd', 'asd', '2018-05-09', 'asd', 'asd', 'asd', 'aslan', 'A8'),
('asd', 'asd', '2018-5-16', 'asd', 'asd', 'asd', 'batin', 'B3'),
('asd', 'asd', '2018-5-16', '123', 'weqw', '1', 'aslan', 'B9'),
('asd', 'asd', '2018-05-04', 'asd', 'asd', '1', 'batin', 'C2'),
('asd', 'asd', '2018-05-04', 'asd', 'asd', '1', 'batin', 'C1'),
('asd', 'asd', '2018-05-04', 'asd', 'asd', '1', 'batin', 'B2'),
('asd', 'asd', '2018-05-04', 'asd', 'asd', '1', 'batin', 'A2'),
('asd', 'asd', '2018-05-04', 'asd', 'asd', '1', 'batin', 'A3'),
('asd', 'asd', '2018-05-04', 'asd', 'asd', '1', 'batin', 'D3'),
('123', 'WD', '2018-5-15', 'ASD', 'ASD', 'AD', 'batin', 'D10'),
('BATIN', 'ERYILMAZ', '1996-01-18', 'ASD', 'ASD', 'btnbtn96@gmail.com', 'batin', 'A6'),
('BATIN', 'ERYILMAZ', '1996-01-18', 'ASD', 'ASD', 'btnbtn96@gmail.com', 'batin', 'D8'),
('BATIN', 'ERYILMAZ', '1996-01-18', 'ASD', 'ASD', 'btnbtn96@gmail.com', 'batin', 'D5'),
('BATIN', 'ERYILMAZ', '1996-01-18', 'ASD', 'ASD', 'btnbtn96@gmail.com', 'batin', 'D11'),
('BATIN', 'ERYILMAZ', '1996-01-18', 'ASD', 'ASD', 'btnbtn96@gmail.com', 'batin', 'D2'),
('BATIN', 'ERYILMAZ', '1996-01-18', 'ASD', 'ASD', 'btnbtn96@gmail.com', 'batin', 'C4'),
('asd', 'asd', '2018-05-04', 'asd', 'asd', '1', 'batin', 'D1'),
('HASAN', 'TEZCAN', '2012-05-01', 'DENIZLI', 'DENIZLI', 'hsn', 'batin', 'B11'),
('HASAN', 'TEZCAN', '2012-05-01', 'DENIZLI', 'DENIZLI', 'hsn', 'batin', 'C6'),
('batin', 'eryilmaz', '1996-01-18', 'asdasd', 'asdasd', 'btn', 'aslan', 'C6'),
('batin', 'eryilmaz', '1996-01-18', 'asdasd', 'asdasd', 'btn', 'aslan', 'B2'),
('BATIN', 'ERYILMAZ', '1996-01-18', 'ASD', 'ASD', 'btnbtn96@gmail.com', 'aslan', 'B5'),
('asd', 'asd', '2018-05-04', 'asd', 'asd', '1', 'btn12', 'D1'),
('asd', 'asd', '2018-05-04', 'asd', 'asd', '1', 'avb', 'C1'),
('asd', 'asd', '2018-05-04', 'asd', 'asd', '1', 'avb', 'D3'),
('BATIN', 'ERYILMAZ', '1996-01-18', 'ASD', 'ASD', 'btnbtn96@gmail.com', 'd1', 'C5'),
('BATIN', 'ERYILMAZ', '1996-01-18', 'ASD', 'ASD', 'btnbtn96@gmail.com', 'd1', 'B6');

-- --------------------------------------------------------

--
-- Table structure for table `planes`
--

CREATE TABLE `planes` (
  `Name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci NOT NULL,
  `Departure` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `Arrival` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `LandingTime` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `LiftOffTime` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `Date` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `planes`
--

INSERT INTO `planes` (`Name`, `Departure`, `Arrival`, `LandingTime`, `LiftOffTime`, `Date`) VALUES
('aaaa', 'DENIZLI', 'MUGLA', '3:30am', '1:00am', '2018-5-29'),
('akk', 'DENIZLI', 'AFYON', '3:00am', '1:00am', '2018-5-25'),
('Antik', 'IZMIR', 'VAN', '4:00am', '2:00am', '2018-5-24'),
('asd', 'DENIZLI', 'AFYON', '3:00am', '1:00am', '2018-5-23'),
('asdasd', 'DENIZLI', 'ESKISEHIR', '2:30am', '1:00am', '2018-5-23'),
('aslan', 'DENIZLI', 'VAN', '1:00am', '4:30am', '2018-5-11'),
('avb', 'DENIZLI', 'AFYON', '3:00am', '1:00am', '2018-5-24'),
('Aydin', 'VAN', 'IZMIR', '3:00am', '8:00am', '2018-5-25'),
('batin', 'DENIZLI', 'MUGLA', '12:30am', '1:00pm', '2018-5-16'),
('bbb', 'IZMIR', 'GAZIANTEP', '3:00am', '1:00am', '2018-5-25'),
('btn', 'DENIZLI', 'MUGLA', '3:30am', '1:00am', '2018-5-18'),
('btn12', 'DENIZLI', 'MUGLA', '3:30am', '1:00am', '2018-5-28'),
('btn1564', 'DENIZLI', 'MUGLA', '3:30am', '1:00am', '2018-5-25'),
('btn1654', 'DENIZLI', 'MUGLA', '3:30am', '1:00am', '2018-5-26'),
('d1', 'VAN', 'DENIZLI', '3:30am', '2:00am', '2018-5-12'),
('dddd', 'DENIZLI', 'ESKISEHIR', '2:30am', '1:00am', '2018-5-24'),
('ffff', 'DENIZLI', 'ESKISEHIR', '2:30am', '1:00am', '2018-5-25'),
('hasan', 'ADANA', 'DENIZLI', '1:00am', '2:30am', '2018-5-30'),
('kkk', 'IZMIR', 'GAZIANTEP', '3:00am', '1:00am', '2018-5-23'),
('lll', 'IZMIR', 'GAZIANTEP', '3:00am', '1:00am', '2018-5-24'),
('nnn', 'IZMIR', 'CANAKKALE', '3:00am', '1:00am', '2018-5-25'),
('salda', 'MUGLA', 'DENIZLI', '3:00am', '1:00am', '2018-5-25'),
('ttn', 'IZMIR', 'CANAKKALE', '3:00am', '1:00am', '2018-5-24');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `accounts`
--
ALTER TABLE `accounts`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `planes`
--
ALTER TABLE `planes`
  ADD PRIMARY KEY (`Name`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `accounts`
--
ALTER TABLE `accounts`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
