USE [master]
GO
/****** Object:  Database [hotel_management_system]    Script Date: 11/11/2014 12:17:35 AM ******/
CREATE DATABASE [hotel_management_system]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'hotel_management_system', FILENAME = N'C:\Program Files (x86)\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\hotel_management_system.mdf' , SIZE = 3072KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'hotel_management_system_log', FILENAME = N'C:\Program Files (x86)\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\hotel_management_system_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [hotel_management_system] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [hotel_management_system].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [hotel_management_system] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [hotel_management_system] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [hotel_management_system] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [hotel_management_system] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [hotel_management_system] SET ARITHABORT OFF 
GO
ALTER DATABASE [hotel_management_system] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [hotel_management_system] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [hotel_management_system] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [hotel_management_system] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [hotel_management_system] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [hotel_management_system] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [hotel_management_system] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [hotel_management_system] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [hotel_management_system] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [hotel_management_system] SET  DISABLE_BROKER 
GO
ALTER DATABASE [hotel_management_system] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [hotel_management_system] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [hotel_management_system] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [hotel_management_system] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [hotel_management_system] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [hotel_management_system] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [hotel_management_system] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [hotel_management_system] SET RECOVERY FULL 
GO
ALTER DATABASE [hotel_management_system] SET  MULTI_USER 
GO
ALTER DATABASE [hotel_management_system] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [hotel_management_system] SET DB_CHAINING OFF 
GO
ALTER DATABASE [hotel_management_system] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [hotel_management_system] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [hotel_management_system] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'hotel_management_system', N'ON'
GO
USE [hotel_management_system]
GO
/****** Object:  Table [dbo].[add_employee]    Script Date: 11/11/2014 12:17:36 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[add_employee](
	[id] [int] NOT NULL,
	[name] [varchar](50) NULL,
	[designation] [varchar](50) NULL,
	[address] [varchar](50) NULL,
	[email] [varchar](50) NULL,
	[password] [varchar](50) NULL,
	[account_no] [varchar](15) NULL,
	[contact_no] [varchar](15) NULL,
	[salary] [varchar](15) NULL,
	[log_on_to] [varchar](15) NULL,
 CONSTRAINT [PK_add_employee] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[booking_records]    Script Date: 11/11/2014 12:17:36 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[booking_records](
	[reservation] [int] NOT NULL,
	[contact] [varchar](20) NULL,
	[first_name] [varchar](50) NULL,
	[last_name] [varchar](50) NULL,
	[address] [varchar](50) NULL,
	[country] [varchar](50) NULL,
	[company] [varchar](50) NULL,
	[id_type] [varchar](50) NULL,
	[id_no] [varchar](15) NULL,
	[vehical_make] [varchar](50) NULL,
	[model] [int] NULL,
	[registration_no] [varchar](50) NULL,
	[room_no] [int] NULL,
	[date_in] [date] NULL,
	[date_out] [date] NULL,
	[rate_type] [varchar](50) NULL,
	[rate] [int] NULL,
	[no_of_days] [int] NULL,
	[no_of_adults] [int] NULL,
	[no_of_childerns] [int] NULL,
	[lunch] [int] NULL,
	[tea] [int] NULL,
	[dinner] [int] NULL,
	[other_charges] [int] NULL,
	[sub_total] [int] NULL,
	[discount] [int] NULL,
	[total] [int] NULL,
	[amount_paid] [int] NULL,
	[balance] [int] NULL,
	[note] [varchar](50) NULL,
 CONSTRAINT [PK_booking_records] PRIMARY KEY CLUSTERED 
(
	[reservation] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[check_in]    Script Date: 11/11/2014 12:17:36 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[check_in](
	[reservation] [int] NOT NULL,
	[contact] [varchar](20) NULL,
	[first_name] [varchar](50) NULL,
	[last_name] [varchar](50) NULL,
	[address] [varchar](50) NULL,
	[country] [varchar](50) NULL,
	[company] [varchar](50) NULL,
	[id_type] [varchar](50) NULL,
	[id_no] [varchar](15) NULL,
	[vehical_make] [varchar](50) NULL,
	[model] [int] NULL,
	[registration_no] [varchar](50) NULL,
	[room_no] [int] NULL,
	[date_in] [date] NULL,
	[date_out] [date] NULL,
	[rate_type] [varchar](50) NULL,
	[rate] [int] NULL,
	[no_of_days] [int] NULL,
	[no_of_adults] [int] NULL,
	[no_of_childerns] [int] NULL,
	[lunch] [int] NULL,
	[tea] [int] NULL,
	[dinner] [int] NULL,
	[other_charges] [int] NULL,
	[sub_total] [int] NULL,
	[discount] [int] NULL,
	[total] [int] NULL,
	[amount_paid] [int] NULL,
	[balance] [int] NULL,
	[note] [varchar](50) NULL,
 CONSTRAINT [PK_check_in] PRIMARY KEY CLUSTERED 
(
	[reservation] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[checkout]    Script Date: 11/11/2014 12:17:36 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[checkout](
	[reservation] [bigint] NULL,
	[room_no] [bigint] NULL,
	[date_in] [date] NULL,
	[date_out] [date] NULL,
	[rate_type] [varchar](50) NULL,
	[no_of_days] [bigint] NULL,
	[no_of_adults] [bigint] NULL,
	[no_of_childerns] [bigint] NULL,
	[rate] [bigint] NULL,
	[other_charges] [bigint] NULL,
	[sub_total] [bigint] NULL,
	[discount] [bigint] NULL,
	[total] [bigint] NULL,
	[amount_paid] [bigint] NULL,
	[balance] [bigint] NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[log_on_to]    Script Date: 11/11/2014 12:17:36 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[log_on_to](
	[user_id] [int] NULL,
	[password] [varchar](50) NULL,
	[log_on_to] [varchar](50) NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
USE [master]
GO
ALTER DATABASE [hotel_management_system] SET  READ_WRITE 
GO
