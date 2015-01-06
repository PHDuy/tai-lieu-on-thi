<?php
require_once './model/functions.php';
$cutString = new Functions();
$obj = new Blogs();
$params = array(
    'offset' => isset($_GET['page'])?(int)$_GET['page']:1,
    'idColumn'=>isset($_GET['column'])?('&column='.$_GET['column'].'&'):'&'
);

$products = $obj->select($params);
$total = $obj->count();
//var_dump($total);
?>

<?php foreach($products as $product):?> 
<div id="col" class="box">    
    <div id="col-browser"><a href="#"><img src="public/imgs/products/<?php echo $product['thumb']?>" width="255" height="177" alt=""></a></div>       
        <div id="col-text">		
            <h2 id="slogan"><a href="detail.php?type=b&id=<?php echo $product['id']?>"><?php echo $product['name']?></a></h2>  
            <p><?php echo $cutString->truncateString_($product['description'],350)?></p>
        </div> <!-- /col-text -->
    </div>
<?php endforeach;?> 

<div id="col-bottom"></div>

<ul class="tsc_pagination tsc_paginationA tsc_paginationA01">
    <?php
    $pagination = new Pagination();
    $params = array_merge($params, array(
        'current_page' => isset($_GET['page']) ? $_GET['page'] : 1,
        'total_page' => ceil($total / PER_PAGE),
        'file' => 'listItems.php?type=b'
    ));
    echo $pagination->display($params);
    ?>
</ul>

