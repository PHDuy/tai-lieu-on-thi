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
require_once './paginations.php';
require_once './model/testimonials.php';
require_once './model/functions.php';
?>
<?xml version="1.0"?>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
    <head>
        <meta http-equiv="content-type" content="text/html; charset=utf-8">
            <meta http-equiv="content-language" content="en">
                <meta name="robots" content="all,follow">
                    <meta name="author" lang="en" content="All: Your name [www.url.com]; e-mail: info@url.com">
                        <meta name="copyright" lang="en" content="Webdesign: Nuvio [www.nuvio.cz]; e-mail: ahoj@nuvio.cz">
                            <meta name="description" content="..."><meta name="keywords" content="...">
                                    <link rel="stylesheet" media="screen,projection" type="text/css" href="css/reset.css">
                                        <link rel="stylesheet" media="screen,projection" type="text/css" href="css/main.css">
                                            <!--[if lte IE 6]><link rel="stylesheet" type="text/css" href="css/main-msie.css" /><![endif]-->
                                            <link rel="stylesheet" media="screen,projection" type="text/css" href="css/style.css">
                                                <link rel="stylesheet" media="print" type="text/css" href="css/print.css">
                                                    <title>Impress</title></head><body>

                                                        <div id="main">

                                                            <?php require_once './header.php'; ?>

                                                            <?php require_once './menu.php'; ?>

                                                            <!-- Promo -->

                                                            <!-- /col -->
                                                            <div id="col-bottom"></div>

                                                            <hr class="noscreen"><!-- 3 columns -->
                                                                <!-- /cols3 -->


                                                                <!-- 2 columns -->

                                                                <!-- /cols2 -->


                                                                <!-- 2 columns -->
                                                                <div id="cols2-top"></div>
                                                                <div id="cols2" class="box">

                                                                    <!-- Blog -->
                                                                    <?php require_once './detail-Description.php'; ?>

                                                                    <hr class="noscreen"><!-- Testimonials -->
                                                                        <?php require_once './detail-Testimonials.php'; ?>

                                                                </div> <!-- /cols2 -->
                                                                <div id="cols2-bottom"></div>



                                                                <hr class="noscreen"><!-- Footer --><div id="footer">

                                                                        <!-- Do you want remove this backlinks? Look at www.nuviotemplates.com/payment.php -->
                                                                        <p class="f-right"><a href="http://www.nuviotemplates.com/">Free web templates</a> presented by <a href="http://www.qartin.cz/">QARTIN</a> – Our tip: <a href="http://last-minute.invia.pl">Wakacje</a> <a href="http://dovolenka.invia.sk">Dovolenka</a></p>
                                                                        <!-- Do you want remove this backlinks? Look at www.nuviotemplates.com/payment.php -->

                                                                        <p>Copyright ©&nbsp;2014 <strong><a href="#">Họ và tên - MSSV - Số Máy - Số Đề</a></strong>, All Rights Reserved ®
                                                                        </p>

                                                                    </div> <!-- /footer -->

                                                                    </div> <!-- /main -->


                                                                    <style>.tb_button {padding:1px;cursor:pointer;border-right: 1px solid #8b8b8b;border-left: 1px solid #FFF;border-bottom: 1px solid #fff;}.tb_button.hover {borer:2px outset #def; background-color: #f8f8f8 !important;}.ws_toolbar {z-index:100000} .ws_toolbar .ws_tb_btn {cursor:pointer;border:1px solid #555;padding:3px}   .tb_highlight{background-color:yellow} .tb_hide {visibility:hidden} .ws_toolbar img {padding:2px;margin:0px}</style><style>.tb_button {padding:1px;cursor:pointer;border-right: 1px solid #8b8b8b;border-left: 1px solid #FFF;border-bottom: 1px solid #fff;}.tb_button.hover {borer:2px outset #def; background-color: #f8f8f8 !important;}.ws_toolbar {z-index:100000} .ws_toolbar .ws_tb_btn {cursor:pointer;border:1px solid #555;padding:3px}   .tb_highlight{background-color:yellow} .tb_hide {visibility:hidden} .ws_toolbar img {padding:2px;margin:0px}</style></body></html>