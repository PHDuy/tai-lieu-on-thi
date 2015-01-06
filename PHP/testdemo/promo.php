<?php
require_once './model/functions.php';

$params=  array('partner'=>  isset($_GET['partner'])?$_GET['partner']:0);
$cutString = new Functions();
$obj = new Promo();
$total = $obj->count()-1;
$id=(int)$params['partner'];

$partners = $obj->select();
//$check = $obj->isExisted_id($partners[$id-1]);
if($_GET['partner']>$total || $_GET['partner']<0) {$cutString->error404();} 
?>

<div id="col" class="box">
    <div id="ribbon"></div> <!-- /ribbon (design/ribbon.gif) -->    
    <!-- Screenshot in browser (replace tmp/browser.gif) -->
    <form method="POST">
        <div id="col-browser"><a href="#"><img src="public/imgs/coms/<?php echo $partners[$id]['thumb']; ?>" width="255" height="177" alt=""></a></div>                  
        <div id="col-text">
            <h2 id=""><a href="detail.php?type=partner&id=<?php echo $partners[$id]['id']?>"><span><?php echo $cutString->truncateString_($partners[$id]['name'], 100) ?></span></a></h2>
            <p><?php echo $cutString->truncateString_($partners[$id]['profile'], 350); ?></p>       
            <p id="btns">
                <a href="index.php?partner=<?php if($id<=0){echo $total;} else {echo ($id-1);} ?>"><img src="design/prev.png" alt=""></a>
                <a href="index.php?partner=<?php if($id>=$total){echo 0;} else {echo ($id+1);} ?>"><img src="design/next.png" alt=""></a>
            </p>
        </div> <!-- /col-text -->
    </form>



</div>





