-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 16, 2014 at 10:46 AM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `webphp`
--

-- --------------------------------------------------------

--
-- Table structure for table `authors`
--

CREATE TABLE IF NOT EXISTS `authors` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `thumb` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=6 ;

--
-- Dumping data for table `authors`
--

INSERT INTO `authors` (`id`, `name`, `thumb`) VALUES
(1, 'admin', ''),
(2, 'mod', ''),
(3, 'kep', ''),
(4, 'kata', ''),
(5, 'alesk', '');

-- --------------------------------------------------------

--
-- Table structure for table `blog`
--

CREATE TABLE IF NOT EXISTS `blog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `overview` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `description` text COLLATE utf8_unicode_ci NOT NULL,
  `thumb` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created` int(11) DEFAULT NULL,
  `id_category` int(11) DEFAULT NULL,
  `id_author` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=19 ;

--
-- Dumping data for table `blog`
--

INSERT INTO `blog` (`id`, `name`, `overview`, `description`, `thumb`, `created`, `id_category`, `id_author`) VALUES
(1, 'KCRW Music Blog', 'KCRW Music News updates, a steady flow of new music discovery of "Artists You Should Know" including streaming mp3s and video from our own Morning Becomes Eclectic in-studio sessions.', 'A tried and true tenured artist throughout DFA’s history, Black Dice has also arguably always been it’s most left-field. A truly one of a kind outfit, they’ve pretty much always done things their way without regard for trends or what is “cool.”', '61.jpg', 1409208047, 1, 1),
(2, 'KCRW''s Rhythm Planet', 'A blog by KCRW DJ and resident World Music Expert, Tom Schnabel''s stories span his 30-plus years at KCRW and illustrate his penchant for identifying historical music phenomena.', 'A tried and true tenured artist throughout DFA’s history, Black Dice has also arguably always been it’s most left-field. A truly one of a kind outfit, they’ve pretty much always done things their way without regard for trends or what is “cool.”', '62.jpg', 1409208054, 2, 2),
(3, 'KEXP Blog', 'MP3s, video, exclusive live performances, editorial content, news, links, and more. Updated daily with a TON of exclusive content.', 'A tried and true tenured artist throughout DFA’s history, Black Dice has also arguably always been it’s most left-field. A truly one of a kind outfit, they’ve pretty much always done things their way without regard for trends or what is “cool.”', '63.jpg', 1409208061, 4, 4),
(4, 'Classical Music on WKSU', 'Classical Music continues to make its presence known. Find tidbits, news, video and more spotlighting your favorite music and the people who make it.', 'A tried and true tenured artist throughout DFA’s history, Black Dice has also arguably always been it’s most left-field. A truly one of a kind outfit, they’ve pretty much always done things their way without regard for trends or what is “cool.”', '64.jpg', 1409208067, 1, 1),
(5, 'WFUV.org', 'We love music - and face it, we''re talkers', 'A tried and true tenured artist throughout DFA’s history, Black Dice has also arguably always been it’s most left-field. A truly one of a kind outfit, they’ve pretty much always done things their way without regard for trends or what is “cool.”', '65.jpg', 1409208074, 1, 2),
(6, 'The Alternate Side', 'Old and new indie favorites - not just rock, but electronica, world, dance, hip hop and whatever makes us smile.', 'A tried and true tenured artist throughout DFA’s history, Black Dice has also arguably always been it’s most left-field. A truly one of a kind outfit, they’ve pretty much always done things their way without regard for trends or what is “cool.”', '66.jpg', 1409208081, 2, 3),
(7, 'The XPN All About the Music Blog', 'Blog for the on-air and programming staff of WXPN 88.5 FM - Philadelphia.', 'A tried and true tenured artist throughout DFA’s history, Black Dice has also arguably always been it’s most left-field. A truly one of a kind outfit, they’ve pretty much always done things their way without regard for trends or what is “cool.”', '67.jpg', 1409208095, 4, 4),
(8, 'The Current Music Blog', 'Your daily note for good music, news, and pop culture. With attempted jokes', 'A tried and true tenured artist throughout DFA’s history, Black Dice has also arguably always been it’s most left-field. A truly one of a kind outfit, they’ve pretty much always done things their way without regard for trends or what is “cool.”', '68.jpg', 1409208113, 1, 2),
(9, 'Fredlines', 'From Performance Today host Fred Child, musings on the world and news of classical music.', 'A tried and true tenured artist throughout DFA’s history, Black Dice has also arguably always been it’s most left-field. A truly one of a kind outfit, they’ve pretty much always done things their way without regard for trends or what is “cool.”', '69.jpg', 1409208120, 1, 1),
(10, 'Groove Notes From Jazz24', 'Groove Notes delves into all things jazz, including the music''s personalities, recordings, trends, history and news about live jazz events.', 'A tried and true tenured artist throughout DFA’s history, Black Dice has also arguably always been it’s most left-field. A truly one of a kind outfit, they’ve pretty much always done things their way without regard for trends or what is “cool.”', '70.jpg', 1409208301, 2, 1),
(11, 'Classical Notes from MPR', 'Minnesota Public Radio''s Classical music weblog', 'A tried and true tenured artist throughout DFA’s history, Black Dice has also arguably always been it’s most left-field. A truly one of a kind outfit, they’ve pretty much always done things their way without regard for trends or what is “cool.”', '71.jpg', 1409246804, 4, 3),
(12, 'The WBGO Blog -- Jazz and Beyond', 'WBGO catapults Jazz into the blogosphere with exclusive interviews and live performances, reviews, editorial, music and culture news, and unique content.', 'A tried and true tenured artist throughout DFA’s history, Black Dice has also arguably always been it’s most left-field. A truly one of a kind outfit, they’ve pretty much always done things their way without regard for trends or what is “cool.”', '72.jpg', 1409246813, 3, 2),
(13, 'New England Public Radio Jazz Blog', 'Frequently updated by Tom Reney, host of New England Public Radio''s "Jazz à la Mode."', 'A tried and true tenured artist throughout DFA’s history, Black Dice has also arguably always been it’s most left-field. A truly one of a kind outfit, they’ve pretty much always done things their way without regard for trends or what is “cool.”', '73.jpg', 1409246821, 3, 1),
(14, 'The Mountain Stage Blog', 'News and notes from the two-hour live performance program produced by West Virginia Public Broadcasting.', 'A tried and true tenured artist throughout DFA’s history, Black Dice has also arguably always been it’s most left-field. A truly one of a kind outfit, they’ve pretty much always done things their way without regard for trends or what is “cool.”', '74.jpg', 1409246831, 1, 1),
(15, 'Unleashed from KUT', 'Join John Aielli online for more of his singular, always entertaining look at the world of music: interviews with musicians, artists, writers, actors, and scholars . . . plus commercial recordings and one-of-a-kind performances from Studio 1A', 'A tried and true tenured artist throughout DFA’s history, Black Dice has also arguably always been it’s most left-field. A truly one of a kind outfit, they’ve pretty much always done things their way without regard for trends or what is “cool.”', '75.jpg', 1409246839, 2, 3),
(16, 'Blue Monday from KUT', 'Blue Monday makes it feel real good to feel so bad. Larry Monroe wraps up Monday night with a cathartic dose of the blues.', 'A tried and true tenured artist throughout DFA’s history, Black Dice has also arguably always been it’s most left-field. A truly one of a kind outfit, they’ve pretty much always done things their way without regard for trends or what is “cool.”', '76.jpg', 1409246846, 3, 3),
(17, 'Radio Without Borders from KUT', 'Radio Without Borders re-broadcasts some of the best tracks recorded live in Studio 1A . . . and reminds you why Austin is the live music capital of the world.', 'A tried and true tenured artist throughout DFA’s history, Black Dice has also arguably always been it’s most left-field. A truly one of a kind outfit, they’ve pretty much always done things their way without regard for trends or what is “cool.”', '77.jpg', 1409246855, 2, 1),
(18, 'Song of the Day from KUT', 'Every weekday, Texas Music Matters'' Song Of The Day highlights a great song captured live at KUT''s studios. It’s a no-frills showcase for some of the great music that comes through the "live music capital of the world."', 'A tried and true tenured artist throughout DFA’s history, Black Dice has also arguably always been it’s most left-field. A truly one of a kind outfit, they’ve pretty much always done things their way without regard for trends or what is “cool.”', '78.jpg', 1409246863, 1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `categories`
--

CREATE TABLE IF NOT EXISTS `categories` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=6 ;

--
-- Dumping data for table `categories`
--

INSERT INTO `categories` (`id`, `name`) VALUES
(1, 'Sport'),
(2, 'Music'),
(3, 'Fashion'),
(4, 'IT'),
(5, 'Phone');

-- --------------------------------------------------------

--
-- Table structure for table `comments`
--

CREATE TABLE IF NOT EXISTS `comments` (
  `id` int(11) NOT NULL,
  `content` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `id_blog` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `contacts`
--

CREATE TABLE IF NOT EXISTS `contacts` (
  `id` int(11) NOT NULL,
  `name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `subject` text COLLATE utf8_unicode_ci NOT NULL,
  `category` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `hots`
--

CREATE TABLE IF NOT EXISTS `hots` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `overview` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `description` text COLLATE utf8_unicode_ci NOT NULL,
  `thumb` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=8 ;

--
-- Dumping data for table `hots`
--

INSERT INTO `hots` (`id`, `title`, `overview`, `description`, `thumb`) VALUES
(1, 'One of the world’s leading building materials companies', 'From steel in the 19th century, to electrical distribution and automation in the 20th and energy management in the 21st, Schneider Electric has always been driven by an international, innovative and responsible mindset to shape the transformation of the i', 'Holcim is one of the world’s leading building materials companies and has a presence on all continents. With its solutions based on innovative products and services and a commitment to sustainable construction, Holcim is contributing to the success of its customers around the world – as a trusted partner for more than 100 years.', 'com-1.jpg'),
(2, 'Humanizing the Digital World', 'Between energy generation and its usage, Schneider Electric provides technology and integrated solutions to optimise energy usage in markets like energy & infrastructure, industry, data centres, buildings and residential. With a unique portfolio in electr', 'Our innovative technology is licensed by ARM Partners who have shipped more than 50 billion Systems on Chip (SoCs) containing our intellectual property since the company began in 1990. Together with our Connected Community, we are breaking down barriers to innovation for developers, designers and engineers, ensuring a fast, reliable route to market for leading electronics companies.', 'com-2.png'),
(3, 'Providing Energy for Human Progress', 'With more than 130,000 employees in over 100 countries, Schneider Electric leverages its people diversity as a strength to understand its customers and the world we are living in. In 2011, 39% of Schneider Electric’s sales were in new economies such as Br', 'Holcim is one of the world’s leading building materials companies and has a presence on all continents. With its solutions based on innovative products and services and a commitment to sustainable construction, Holcim is contributing to the success of its customers around the world – as a trusted partner for more than 100 years.', 'com-3.png'),
(4, 'Make a Powerful Impact', 'If you have just launched a new business and are looking to make a great first impression on prospective customers, then it is essential to create an powerful company profile. A well-written company profile is an effective way to introduce the business to', 'To create business or company profiles, one needs to carefully develop a strategy and map out the characteristics to be highlighted and how to assimilate the unique offerings of the business in a concise yet attractive manner. A great profile is crucial for any business but it should not be the only promotional tool; one needs to create the right marketing mix to reach out to customers and get them interested in your brand. You can take this amazing course to learn more about creating a powerful brand for yourself and your business.', 'com-4.jpg'),
(5, 'Helping people make the most of their energy ', 'Schneider Electric evolves in an industry tackling the most exciting challenge of our time: the energy & climate change challenge. Since 2004, the Group has created a unique business portfolio and doubled its size in terms of revenue and people, both by a', 'Our innovative technology is licensed by ARM Partners who have shipped more than 50 billion Systems on Chip (SoCs) containing our intellectual property since the company began in 1990. Together with our Connected Community, we are breaking down barriers to innovation for developers, designers and engineers, ensuring a fast, reliable route to market for leading electronics companies.', 'com-5.png'),
(6, 'A global mindset', 'Schneider Electric devotes 5% of its sales every year to Research and development with over 7,500 R&D engineers in centres worldwide. The company sees innovation as a way to make its solutions greener, simpler and easier to integrate into the daily enviro', 'Our innovative technology is licensed by ARM Partners who have shipped more than 50 billion Systems on Chip (SoCs) containing our intellectual property since the company began in 1990. Together with our Connected Community, we are breaking down barriers to innovation for developers, designers and engineers, ensuring a fast, reliable route to market for leading electronics companies.', 'com-6.jpg'),
(7, 'Geared to a sustainable growth', 'Schneider Electric is committed to putting sustainable development at the heart of its strategy. Not because it is fashionable, but because we care and it makes good business sense. We have been measuring our sustainability performance since 2005 with a u', 'Our innovative technology is licensed by ARM Partners who have shipped more than 50 billion Systems on Chip (SoCs) containing our intellectual property since the company began in 1990. Together with our Connected Community, we are breaking down barriers to innovation for developers, designers and engineers, ensuring a fast, reliable route to market for leading electronics companies.', 'com-7.gif');

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE IF NOT EXISTS `products` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `overview` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `description` text COLLATE utf8_unicode_ci NOT NULL,
  `id_category` int(11) NOT NULL,
  `id_author` int(11) NOT NULL,
  `created` int(11) NOT NULL,
  `viewer` int(11) NOT NULL,
  `thumb` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=58 ;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`id`, `name`, `overview`, `description`, `id_category`, `id_author`, `created`, `viewer`, `thumb`) VALUES
(1, 'STATS', 'For turning jocks into nerds. This data company''s SportVU cameras track and quantify everything during a game and have quickly gone from a geeky extra to a necessity: As of this season, every NBA arena uses the $100,000-a-year system—up from half last yea', 'This data company''s SportVU cameras track and quantify everything during a game and have quickly gone from a geeky bonus to a necessity: As of this season, every NBA arena uses the $100,000-a-year system (up from half last year). Teams are incorporating more and more advanced metrics into their game plans—tracking how their opponents move the ball, who defends pick-and-rolls best, and how to attack the lane with a huge rim protector in the way. "It''s not just about getting all 30 teams, but exposing game data on NBA.com and NBA TV," says Brian Kopp, an SVP at STATS. "There are now SportVU stats for every game." While teams may have their own ways of looking at the stats, the everyday NBA fan can get a taste of the behind-the-scenes strategizing on their own by looking at them online as well. That only creates more demand. Soccer''s UEFA Champions League uses SportVU to track player movement and goal-scoring opportunities, and Duke basketball became the first college adopter in October. Next up, STATS hopes: ice hockey.', 1, 1, 1409208047, 10, '1.jpg'),
(2, ' ROC NATION SPORTS', 'For breaking into the business. After selling his stake in the Brooklyn Nets to open his own sports agency, Jay-Z promptly snatched former Yankee superstar/$240 million Seattle Mariner Robinson Cano from superagent Scott Boras. Jay-Z may be new to the spo', 'For breaking into the business. After selling his stake in the Brooklyn Nets to open his own sports agency, Jay-Z promptly snatched former Yankee superstar/$240 million Seattle Mariner Robinson Cano from superagent Scott Boras. Jay-Z may be new to the sports rep game, but he has a deep bench of athlete buddies and fans of his marketing prowess in locker rooms throughout sports. His relationships with major brands are something other agents can''t touch. (New clients CC Sabathia, Kevin Durant, and Victor Cruz are counting on it.)', 1, 1, 1409208054, 12, '2.jpg'),
(3, 'REPLAY TECHNOLOGIES', 'For bringing Matrix-like frames to sports highlights. Using two dozen high-speed cameras to capture the on-field action, Replay turns sports highlights into jaw-dropping 360-degree clips. Think Keanu Reeves''s bullet-dodging moves in the sci-fi trilogy. Re', 'For bringing Matrix-like frames to sports highlights. Using two dozen high-speed cameras to capture the on-field action, Replay turns sports highlights into jaw-dropping 360-degree clips. Think Keanu Reeves''s bullet-dodging moves in the sci-fi trilogy. Replay''s "freeD" video made its NFL debut at the Dallas Cowboys'' AT&T Stadium this season, and the YES Network brought it to baseball at Yankee Stadium.', 1, 1, 1409208061, 123, '3.png'),
(4, 'ESPN', 'For stealing Nate Silver from the New York Times. Getting the best-known stathead in sports (or politics, or…) and giving him a bigger platform elevated ESPN''s data game. Rich, creative statistical analysis will certainly deepen fans'' understanding of gam', 'For stealing Nate Silver from the New York Times. Getting the best-known stathead in sports (or politics, or…) and giving him a bigger platform elevated ESPN''s data game. Rich, creative statistical analysis will certainly deepen fans'' understanding of games and change the sports conversation, much as Silver has done in politics. Like Grantland, Bill Simmons''s online magazine that covers pop culture as well as sports, Silver''s site—which will be free of paywalls or subscriptions—is set to launch early this year and will use sports as a jumping-off point to politics and other topics, pulling a broader audience into ESPN''s ever-expanding sports empire.', 1, 1, 1409208067, 9, '4.jpg'),
(5, 'WEINSTEIN CARNEGIE PHILANTHROPIC GROUP', 'For managing athletes'' softer sides. Image-savvy (and genuinely caring) athletes can raise tons of money for good causes—but how do they actually do it? This agency works with charities, brands, and celebrities, particularly in sports and entertainment, t', 'For managing athletes'' softer sides. Image-savvy (and genuinely caring) athletes can raise tons of money for good causes—but how do they actually do it? This agency works with charities, brands, and celebrities, particularly in sports and entertainment, to market good causes. In 2013, it managed tennis pro James Blake''s charity, helping raise $1 million through a tennis exhibition and other events. It also partnered Yankee CC Sabathia''s foundation with multiple multibillion-dollar corporations.', 1, 1, 1409208074, 6, '5.png'),
(6, 'NORTHWESTERN UNIVERSITY', 'For redefining ticket sales. Under the direction of two in-house economists, the university is testing out a new ticket-selling system for some of its games. It''s called "Purple Pricing"—like a Dutch auction, but with a twist: Prices start high and drop u', 'For redefining ticket sales. Under the direction of two in-house economists, the university is testing out a new ticket-selling system for some of its games. It''s called "Purple Pricing"—like a Dutch auction, but with a twist: Prices start high and drop until tickets sell out, and fans buy whenever a price is appealing. There''s no risk of overpaying (like, say, on StubHub, where prices fluctuate) because everyone pays the final price. So if a fan buys at $50 but the price drops to $40, the fan is refunded $10. The system gives the school precise data about the market value of its tickets, ensuring more revenue and less scalping, and presenting a new path for a messy ticketing industry.', 1, 1, 1409208081, 45, '6.png'),
(7, 'UNCHARTED PLAY', 'For lighting it up. With their unique product, Soccket, Uncharted Play founders Jessica Matthews and Julia Silverman tapped into the global popularity of soccer in hopes of providing a clever and much-needed source of renewable energy for the estimated 1.', 'For lighting it up. With their unique product, Soccket, Uncharted Play founders Jessica Matthews and Julia Silverman tapped into the global popularity of soccer in hopes of providing a clever and much-needed source of renewable energy for the estimated 1.4 billion people worldwide without access to electricity. Soccket, which was kicked around by President Obama at the White House last summer, is essentially a soccer ball that is equipped with an internal generator: A half hour of play produces about three hours of power. Uncharted Play provides a ball to a community, which shares the energy to power LED lamps provided by the company. In December, the company launched its latest innovation: Pulse, a jump rope that can generate five times the electricity of the Soccket.', 1, 1, 1409208095, 2, '7.jpg'),
(8, 'MLB ADVANCED MEDIA', 'For making more multisport moves. Baseball''s in-house tech powerhouse has a busy year on tap. Already the largest provider of live streaming content—of any content, not just baseball games—MLBAM will begin powering what Sony is calling its "cloud-based TV', 'For making more multisport moves. Baseball''s in-house tech powerhouse has a busy year on tap. Already the largest provider of live streaming content—of any content, not just baseball games—MLBAM will begin powering what Sony is calling its "cloud-based TV service" and WWE''s new 24/7 online channel. Both will feature live and on-demand content, creating an alternative to cable. During baseball season, MLBAM will provide the game''s newly expanded instant replay review, which includes managers'' challenges. Umpires in the Replay Command Center at the company''s headquarters in New York will monitor live feeds and rule on disputed plays at ballparks around the country. MLBAM, whose At Bat app is the highest-grossing sports app in iTunes for five straight years, is also adding to its product line. It''s reviving and updating R.B.I. Baseball, a beloved video game from the ''80s, for today''s consoles and mobile devices.', 1, 1, 1409208113, 23, '8.jpg'),
(9, 'SAN FRANCISCO 49ERS', 'For building a stadium worthy of Silicon Valley. The 49ers are constructing a facility to rival the ultimate man cave. Levi''s Stadium, scheduled to open for the 2014 season, will be the most tech-embedded facility in sports. It will have HD video boards s', 'For building a stadium worthy of Silicon Valley. The 49ers are constructing a facility to rival the ultimate man cave. Levi''s Stadium, scheduled to open for the 2014 season, will be the most tech-embedded facility in sports. It will have HD video boards stretching more than 13,000 square feet, Wi-Fi for NFL RedZone streaming from your seat, and an in-stadium app that helps you find the shortest beer and bathroom lines.', 1, 1, 1409208120, 233, '9.gif'),
(10, 'XIAOMI', 'The upstart consumer-electronics company, just three years old, is a neophyte no more. Xiaomi released four new smartphones last year and sold almost 19 million, up more than 150% from 2012. It''s staking out a significant piece of the Chinese market with ', 'The upstart consumer-electronics company, just three years old, is a neophyte no more. Xiaomi released four new smartphones last year and sold almost 19 million, up more than 150% from 2012. It''s staking out a significant piece of the Chinese market with its low-cost, feature-rich devices. One model sold out its initial run—100,000 units—in less than two minutes.', 1, 1, 1409208301, 23, '10.jpg'),
(11, 'NETFLIX', 'What does it mean to be an innovator? Our editors debated many companies—and and throughout the list, we''re running some of their discussions. This is how we settled on Netflix.', 'NAY: I get it—Netflix shows are good. So? HBO has been making good shows for years.', 1, 1, 1409246804, 23, '11.gif'),
(12, ' SHAZAM', 'For naming that tune. All the time. The "Pop-up Video" for everyday life, Shazam has become the de facto method to identify that song on the tip of your tongue. In 2013, it introduced Auto Shazam, an opt-in feature that keeps a diary of your day’s playlis', '', 2, 1, 1409246813, 12, '12.jpg'),
(13, 'YY', 'For reclaiming karaoke and taking it online. While YY started in 2005 as a hub for hardcore gamers, it’s evolved into a karaoke haven and cash cow with $198 million in revenue. Vocalists perform for thousands of viewers live, and popularity leads to rewar', '', 2, 1, 1409246821, 234, '13.png'),
(14, 'COLUMBIA RECORDS', 'For staying up all night. A label more closely identified with the old-school music business made two strategic bets in 2013. Without any previous promotion, Beyonce''s surprise self-titled release dropped at midnight on December 13th and sparked a downloa', '', 2, 1, 1409246831, 1231, '14.png'),
(15, 'SPOTIFY', 'For saving the music industry, one stream at a time. Spotify’s influence can hardly be overstated. The company has essentially trained roughly 25 million people to pay for streaming music rather than pirate it for free. And more than 6 million of them are', '', 2, 1, 1409246839, 234, '15.jpg'),
(16, 'MAD DECENT', 'For shaking up how music goes mainstream. The Harlem Shake meme defined the early part of 2013. And it was all because of how Mad Decent, the record label behind the artist Baauer, deftly reached the masses. The viral sensation sold more than one million ', '', 2, 1, 1409246846, 1, '16.jpg'),
(17, 'VEVO', 'For mastering the magic of music videos. Once inextricably linked with YouTube, the music video portal took steps toward becoming a standalone musical monolith in 2013. Now, 40% of its streams come outside of YouTube and half of its 5 billion monthly view', '', 2, 1, 1409246855, 123, '17.jpg'),
(18, 'MACKLEMORE LLC', 'For leveraging major label power intelligently. Macklemore and Ryan Lewis''s "Thrift Shop" received major radio play in 2013, holding court at No. 1 on the Billboard Hot 100 for six weeks and selling more than 10 million copies since its 2012 release. But ', '', 2, 1, 1409246863, 54, '18.jpg'),
(19, 'SOUNDCLOUD', 'For going pro properly. The audio platform expanded its reach with a new way for creators to bolster their presence on the site. Partnering with acts like Snoop Lion and The-Dream as well as The Guardian, Blue Bottle Coffee, Red Bull and the Nerdist netwo', '', 2, 1, 1409246872, 234, '19.jpg'),
(20, 'ULTRA MUSIC FESTIVAL', 'For bringing the world’s music to the rest of the world. In 2013, the Miami-based dance music festival expanded to two weekends (though it''s scaling back to one weekend in 2014), which saw a spike in ticket sales and continued its global expansion to Sant', '', 2, 1, 1409246879, 123, '20.jpg'),
(21, 'YOUTUBE', 'For growing up. YouTube held its first annual awards show in 2013 to recognize the best acts in music videos. Live-streamed and often chaotic, the event was directed by Academy Award winner Spike Jonze and hosted by Jason Schwartzmann and Reggie Watts—a m', '', 2, 1, 1409246889, 64, '21.png'),
(22, 'LUKE WALKER ', 'Very sadly misleading. Of course it''s written from the tech world perspective instead of the music industry perspective. I''ll just quote the great words of Mr. DEAN KAY, which more accurately connotes what''s happening then any Silicon Valley magazine', 'Very sadly misleading. Of course it''s written from the tech world perspective instead of the music industry perspective. I''ll just quote the great words of Mr. DEAN KAY, which more accurately connotes what''s happening then any Silicon Valley magazine:', 2, 1, 1409246896, 54, '22.jpg'),
(23, 'Coco Chanel', 'Born Gabrielle“Coco” Bonheur Chanel, she is a excellent French fashion designer, founder of the well known Chanel brand, whose modernist thought, practical design, and pursuit of expensive simplicity made her an important and influential figure in 20th-ce', '', 3, 1, 1409246903, 2365, '23.jpg'),
(24, 'Donna Karan', 'Born in 1942 in New York, Klein also capitalized on his own charisma and lean good looks. Throughout the decades, rumors about his own sexual orientation seemed to fuel the ongoing mystique and appeal of this designer.', '', 3, 1, 1409246922, 23, '24.jpg'),
(25, 'Giorgio Armani', 'She is the sister of Gianni Versace, and she has proven to be no lesser sibling. After the murder of Gianni in 1997, Donatella took over and has taken the Versace name to new heights. She made sure that Versace shops would cater to the different fashion c', '', 3, 1, 1409246929, 23, '25.png'),
(26, 'Calvin Klein', 'Ralph Lauren is worth $7.5 billion, and he got it all because of his fashion sense. In 1970, the first Polo logo was seen in Lauren’s line of women’s suits that was designed in the classic men’s style. Two years later, the famous short sleeve shirt with t', '', 3, 1, 1409246937, 6, '26.png'),
(27, 'Donatella Versace', 'Born in January of 1905, this French designer was best known for his distinctive “New Look” silhouette. First shown in 1947; his suits and dresses revolutionized the way women dressed after the Second World War. Today, talented designer John Galliano carr', '', 3, 1, 1409246944, 8, '27.jpg'),
(28, ' Ralph Lauren', 'Born in January of 1905, this French designer was best known for his distinctive “New Look” silhouette. First shown in 1947; his suits and dresses revolutionized the way women dressed after the Second World War. Today, talented designer John Galliano carr', '', 3, 1, 0, 4, '28.jpg'),
(29, 'Christian Dior', 'Tom Ford, counted among the most famous designers today, whose portfolio includes serving as a creative director for both Yves Saint Laurent and Gucci, wanted to be actor when he was growing up. He was born in Texas and even took training to be an actor. ', '', 3, 1, 0, 34, '29.png'),
(30, 'Tom Ford', 'The Italian-born Frenchman is lauded for his 20th century pieces that looked as though they were from the 25th century. As Cardin rose to fame in the age of the space race, his creations took on an air of futurism. His so-called bubble dresses had all the', '', 3, 1, 1409504653, 3246, '30.png'),
(31, 'Pierre Cardin', 'Yves Saint Laurent became popular in fashion circles due to his creativity in redesigning the clothes considered to be masculine into beautiful, feminine wardrobe for women. Perhaps, one of the most famous fashion designers in France, Yves was the first o', '', 3, 1, 1409504660, 8, '31.jpg'),
(32, 'Yves Saint Laurent', 'Christian Louboutin, the master fashion designer of shoes, along with the well-known actress Black Lively at the 24th Annual Footwear News Achievement Awards.', '', 3, 1, 1409504667, 3, '32.gif'),
(33, 'Christian Louboutin', 'Chloe, Fendi, and Chanel have all notably been touched by the hands and soul of the notorious Karl Lagerfeld. - See more at: http://www.bykoket.com/blog/top-50-fashion-designers/#sthash.3VRXdf1P.dpuf', '', 3, 1, 1409504674, 2, '33.png'),
(34, 'Karl Lagarfeld', '“I keep making dreams. Every one of us needs to dream. We must keep on dreaming.” Roberto Cavalli', '', 3, 1, 1409504680, 8, '34.png'),
(35, 'Roberto Cavalli', 'With a number of prestigious awards under his belt from the Parsons School of Design, Jacobs moved onto working for Perry Ellis, but was let go from the label after infamously designing a “grunge” collection. - See more at: http://www.bykoket.com/blog/top', '', 3, 1, 1409571018, 34, '35.jpg'),
(36, 'Betsey Johnson', 'Designer Betsey Johnson walks on the runway after her Fall/Winter 2011 collection show during New York Fashion Week February 14, 2011', '', 3, 1, 1409588736, 32, '36.gif'),
(37, 'Sandy Powell', 'Sandy Powell poses with her best costume design Oscar for “The Young Victoria” with presenter Tom Ford at the the 82nd Academy Awards in Hollywood March 7, 2010. - See more at: http://www.bykoket.com/blog/top-50-fashion-designers/#sthash.3VRXdf1P.dpuf', '', 3, 1, 1409590670, 1, '37.png'),
(38, 'Domenico Dolce (R) and Stefano Gabbana', 'British model Naomi Campbell (C) smiles next to Italian designers Domenico Dolce (R) and Stefano Gabbana during a party marking the 25th anniversary of her career in downtown Shanghai October 28, 2010.', '', 3, 1, 1409796154, 8, '38.png'),
(39, 'Alexander McQueen', 'Kate Middleton’s wedding dress was designed by Alexander McQueen’s Sarah Burton, ending months of fevered speculation in the fashion world over who would create one of the most talked-about outfits of the decade. - See more at: http://www.bykoket.com/blog', '', 3, 1, 1409796171, 4, '39.jpg'),
(40, 'Valentino Garavani', 'Within a range of 45 years of career in the world of fashion, he decides to create a collection of dresses in the different shades of the color red, which he names “ Rojo Valentino”, designed in a fan of shades of fire red to the simple red, that only an ', '', 3, 1, 1409877594, 234, '40.png'),
(41, 'Miuccia Prada', 'Miuccia Prada, in full Miuccia Bianchi Prada, original name Maria Bianchi   (born May 10, 1949, Milan, Italy), Italian fashion designer best known as the head designer at the Prada fashion house. She is renowned for utilizing minimalist designs to achieve', '', 3, 1, 1410510333, 457, '41.jpg'),
(42, 'Tommy Hilfiger', 'American fashion designer Tommy Hilfiger developed a line of clothes that has become incredibly popular among the masses', '', 3, 1, 1411719350, 67, '42.jpg'),
(43, 'Fitocracy', 'For those without serious Photoshop skills, Background Burner does a surprisingly good job of removing background images from photos. You just pick the image you want, and the site automatically figures out what’s in the foreground, presenting a few diffe', '', 4, 1, 1411722486, 0, '43.jpg'),
(44, 'FileThis', 'This endlessly scrolling art site’s been around for at least five years, but it’s still going strong as a way to let your mind melt for a while. But Does It Float is mindful enough to get out of the way, with short descriptions (“In one way or another, we', '', 4, 1, 1411723491, 0, '44.png'),
(45, 'CrimeReports', 'You’re already five slides into this list with 45 more to go. Time for a break! Calm.com lets you toggle through peaceful backgrounds and ambient music, with the ability to set a timer for up to 20 minutes. Chill out on your own, or choose a “guided calm”', '', 4, 1, 0, 0, '45.png'),
(46, 'ClickHole', 'Amazon’s a one-stop shop for many people, but its prices tend to fluctuate on a fairly regular basis. CamelCamelCamel can set you up with email- and Twitter-based price alerts that let you know when a particular item goes on sale. You can also see a parti', '', 4, 1, 1412262032, 0, '46.jpg'),
(47, 'Can I Stream.It?', 'In a perfect world, the answer to this question would always be “yes.” But we live in a world of timed release windows, exclusive streaming deals and overly cautious movie studios, so finding what you want to watch can be complicated. Can I Stream.It? mak', '', 4, 1, 1412263040, 0, '47.jpg'),
(48, 'Calm.com', 'No, the irony of using a listicle to celebrate a site that satirizes clickbait isn’t lost on us. But ClickHole is more than just a one-off joke at the expense of obnoxious headlines. It’s an ongoing subversion of every site’s attempt to go viral, frequent', '', 4, 1, 1412324705, 0, '48.jpg'),
(49, 'But Does It Float', 'Keep an eagle-eyed view on your neighborhood with CrimeReports. The site blends Google Maps with local police data, pinpointing where crimes have recently occurred and which types of crimes they were. Each crime features a send-to-a-friend link so you can', '', 4, 1, 0, 0, '49.jpg'),
(50, 'Background Burner', 'Connect FileThis to the various services you use each month — banking, credit cards, utilities and the like — and it’ll automatically pull in your statements and paperwork from each one, storing it all for you online, on your computer or in one of several', '', 4, 1, 1412582563, 0, '50.jpg'),
(51, 'Any.do', 'Billing itself as a “health and fitness social network,” Fitocracy turns working out into a game, letting you unlock achievements, take on “quests,” duel other Fitocracy members and level up along the way. You can join a team of other Fitocracy users base', '', 4, 1, 0, 0, '51.jpg'),
(52, '10 Minute Mail', 'The Sony computer I have, has been the best computer I have ever owned! Fast, light, and has never given any problems.', '', 4, 1, 0, 0, '52.png'),
(53, 'FlapMMO', 'The Flappy Bird craze hit its peak around February of this year, but you’ll still find a fair amount of people playing FlapMMO — arguably the game’s cleverest spin-off. It’s just like the original game, requiring you to tap a button to flap between vertic', '', 4, 1, 1412673988, 0, '53.png'),
(54, 'Forgotify', 'Streaming music service Spotify proudly boasts more than 20 million songs in its catalog, but truth is that no one’s listened to nearly a quarter of those tracks. Forgotify finds those unheard songs and gives them an ear. Even if you don’t end up with gre', '', 4, 1, 1413299591, 0, '54.gif'),
(55, 'Genius', 'Once known as RapGenius, the site is in the midst of reinventing itself as a place where news, historical documents and cultural artifacts can all be annotated by the crowds. (You might even see some creators swing by to mark up their own work.) But it’s ', '', 4, 1, 0, 0, '55.jpg'),
(56, 'Glyde', 'When it comes to selling your gadgets and video games, Glyde looks to split the difference between auction sites and trade-in sites. The result is that you’ll generally make more money than you would from a trade-in site, with less of a hassle than going ', '', 4, 1, 1413900026, 0, '56.png'),
(57, 'Haiku Deck', 'While Microsoft PowerPoint is still the standard for presentations, using its cluttered interface kind of feels like being trapped in a cubicle. Haiku Deck, by comparison, is actually kind of fun, and doesn’t demand much know-how in order to start creatin', '', 4, 1, 1413900372, 0, '57.png');

-- --------------------------------------------------------

--
-- Table structure for table `testimonials`
--

CREATE TABLE IF NOT EXISTS `testimonials` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `description` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `thumb` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=10 ;

--
-- Dumping data for table `testimonials`
--

INSERT INTO `testimonials` (`id`, `name`, `description`, `thumb`) VALUES
(1, 'Outstanding customer service', 'As a non-techy I dread calling anyone about IT problems as usually I am bamboozled by technical questions which I often don''t understand - let alone can answer. So it was very refreshing to have someone patiently help me out without making me feel like an', 'andrewdodd.jpg'),
(2, 'Excellence in practice', 'Did not patronise me, and gave me as much time as needed without pushing me to get off the line, and most importantly we did solve the problem. Thank you', 'andrewmelbourne.jpg'),
(3, 'Provided help when it wasn''t their problem', 'Called about a rouge redirect on my Wordpress site Internetters host for me. It wasn''t their problem but a hack of the theme I was using in Wordpress. The tech support showed me what the error was using a web based Malware service and how to find it and s', 'davegardner.jpg'),
(4, 'Brilliant customer service', 'I was a bit worried when my account was transferred to Internetters but my worries were totally unfounded, they are a terrific company and they really care about their customers. I''m often aboard so I do worry about the length of time phone calls take but', 'James-Bray-Resize.jpg'),
(5, 'Help', 'The help given by Internetters is superb. I called this morning and the technician fixed my email issue on the phone and followed it up with a fantastic email. If you have limited technical knowledge this is the company for you.', 'matthewbrannon.jpg'),
(6, 'Fair pricing and helpful service', 'I was recommended Internetters by Virgin Media because I need more web space for my award-winning Bob Dylan web-site "Searching for a Gem" than they provide for free. The facilities for my package exceed my requirements both in terms of web space and emai', 'matthewsibley.jpg'),
(7, 'Great service', 'The first point of contact was a little slow and confused but once the problem was explained by me and passed to the technical department it was resolved well within reasonable expectations. I have been an Internetters customer for a very long time and ha', 'matthewbrannon.jpg'),
(8, 'Email', 'I love the email setup guide provided after you add a mailbox in the service centre. I set up my ipad in 2 min. Great service and staff', 'James-Bray-Resize.jpg'),
(9, 'WSFTP', 'I was advised by a friend to use WSFTP for uploading my site, i had no clue what to do, i found a guide in the service centre that took me through how to use it, fantastic', 'James-Bray-Resize.jpg');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
