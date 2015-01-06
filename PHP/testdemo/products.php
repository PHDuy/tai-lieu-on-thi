<?php 
require_once './model/functions.php';
$cutString = new Functions();




$objCat = new Categories();
$objArt = new Products();

$cat_on_tops=array(
        '1'=>CAT_ON_TOP_1,
        '2'=>CAT_ON_TOP_2,
        '3'=>CAT_ON_TOP_3,
    );
///////////////////////////////////////////////////////
$products=array(
        '1'=>($objArt->select(array('id_category' => CAT_ON_TOP_1,'limit' => '0,4'))),
        '2'=>($objArt->select(array('id_category' => CAT_ON_TOP_2,'limit' => '0,4'))),
        '3'=>($objArt->select(array('id_category' => CAT_ON_TOP_3,'limit' => '0,4'))),
    );
$category_Product=array(
        '1'=>($objCat->select(array('id_category' => CAT_ON_TOP_1))),
        '2'=>($objCat->select(array('id_category' => CAT_ON_TOP_2))),
        '3'=>($objCat->select(array('id_category' => CAT_ON_TOP_3))),
);
?>

<div id="cols3" class="box">
     <!-- Column I. -->
     <?php //var_dump($category_Product);?>
        <?php foreach ($products as $key => $product): ?>
        <div class="col <?php if($key==3){echo " last";}?>">
            <h3><a href="listItems.php?type=p&column=<?php echo $category_Product[$key][0]['id']?>">
                        <?php  echo $category_Product[$key][0]['name']; ?></a></h3>
            <p class="nom t-center"><a href="#"><img src="<?php echo PATH_PRODUCTS_IMAGE.$product[0]['thumb']; ?> " alt="" style="height: 140px;"></a></p>

            <div class="col-text">
				<a href="detail.php?type=p&id=<?php echo $product[0]['id']?>"><span style="font-weight: bold;"><?php echo $product[0]['name'];?></span></a>
                <p><?php echo $cutString->truncateString_($product[0]['overview'], 150);?></p>
                
                <ul class="ul-01">
                    <?php for($i=1;$i<4;$i++):?>
                    <li><a href="detail.php?type=p&id=<?php echo $product[$i]['id']?>"><?php echo $product[$i]['name']?></a></li>
                    <?php endfor;?>
                </ul></div> <!-- /col-text -->
                
        <div class="col-more"><a href="listItems.php?type=p&column=<?php echo $category_Product[$key][0]['id']?>"><img src="design/cols3-more.gif" alt=""></a></div>

        </div> <!-- /col -->
        <?php endforeach; ?>
        
        <hr class="noscreen">
</div>
        
          

        
        
        
