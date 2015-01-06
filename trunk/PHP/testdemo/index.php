
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<?php 
error_reporting(0);
ini_set('display_errors', false);
require_once './config/config.php';
require_once './model/db.php';
require_once './model/promo.php';
require_once './model/blogs.php';
require_once './model/categories.php';
require_once './model/products.php';
require_once './model/testimonials.php';

?>
<?xml version="1.0"?><html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
    <head>
        <meta http-equiv="content-type" content="text/html; charset=utf-8" />
        <meta http-equiv="content-language" content="en">
            <meta name="robots" content="all,follow">
                <meta name="author" lang="en" content="All: Your name [www.url.com]; e-mail: info@url.com">
                    <meta name="copyright" lang="en" content="Webdesign: Nuvio [www.nuvio.cz]; e-mail: ahoj@nuvio.cz">
                        <meta name="description" content="..."><meta name="keywords" content="...">
                                <link rel="stylesheet" media="screen,projection" type="text/css" href="css/reset.css">
                                    <link rel="stylesheet" media="screen,projection" type="text/css" href="css/main.css">
                                        <!--[if lte IE 6]><link rel="stylesheet" type="text/css" href="css/main-msie.css" />
                                        <![endif]--><link rel="stylesheet" media="screen,projection" type="text/css" href="css/style.css"><link rel="stylesheet" media="print" type="text/css" href="css/print.css"><title>Impress</title>
                                                    </head>
    <body>

<div id="main">

    <!-- Header -->
    <?php require_once './header.php';?>
    <!-- /header -->
    
    <!-- Tray -->
    <?php require_once './menu.php';?>
    <!-- /tray -->

    <!-- Promo -->
    <div id="col-top"></div>
    <?php require_once './promo.php';?>
    <!-- /col -->
    <div id="col-bottom"></div>
    
    <hr class="noscreen"><!-- 3 columns --><div id="cols3-top"></div>
        <?php require_once './products.php';?>
    <div id="cols3-bottom"></div>

    <!-- 2 columns -->
    <div id="cols2-top"></div>
    <div id="cols2" class="box">
    
        <!-- Blog -->
        <?php require_once './blogs.php';?>

        <hr class="noscreen"><!-- Testimonials -->
       <?php require_once './Testimonials.php';?>

         <!-- /col-right -->
    
    </div> <!-- /cols2 -->
    <div id="cols2-bottom"></div>

    <hr class="noscreen"><!-- Footer -->
        <?php require_once './footer.php';?>
        <!-- /main -->

</body></html>
