USE [TruongCongPhi_1251TT1481]
GO
/****** Object:  Table [dbo].[HocPhan]    Script Date: 1/15/2015 9:18:17 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[HocPhan](
	[MaHP] [varchar](20) NOT NULL,
	[TenHP] [nchar](100) NULL,
	[SoTC] [int] NULL,
	[SoTietLT] [int] NULL,
	[SoTietTH] [int] NULL,
 CONSTRAINT [PK_HocPhan] PRIMARY KEY CLUSTERED 
(
	[MaHP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[HocPhan] ([MaHP], [TenHP], [SoTC], [SoTietLT], [SoTietTH]) VALUES (N'aaa', N'saas                                                                                                ', 3, 3, 3)
INSERT [dbo].[HocPhan] ([MaHP], [TenHP], [SoTC], [SoTietLT], [SoTietTH]) VALUES (N'aaa1', N'f                                                                                                   ', 45, 45, 54)
INSERT [dbo].[HocPhan] ([MaHP], [TenHP], [SoTC], [SoTietLT], [SoTietTH]) VALUES (N'df', N'dfg                                                                                                 ', 4, 4, 4)
INSERT [dbo].[HocPhan] ([MaHP], [TenHP], [SoTC], [SoTietLT], [SoTietTH]) VALUES (N'dsa', N'sdf                                                                                                 ', 5, 5, 5)
INSERT [dbo].[HocPhan] ([MaHP], [TenHP], [SoTC], [SoTietLT], [SoTietTH]) VALUES (N'fgd', N'gd                                                                                                  ', 54, 54, 45)
INSERT [dbo].[HocPhan] ([MaHP], [TenHP], [SoTC], [SoTietLT], [SoTietTH]) VALUES (N's', N's                                                                                                   ', 3, 3, 3)
INSERT [dbo].[HocPhan] ([MaHP], [TenHP], [SoTC], [SoTietLT], [SoTietTH]) VALUES (N'sd', N'ds                                                                                                  ', 4, 4, 4)
