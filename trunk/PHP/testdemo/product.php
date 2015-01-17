<?php
require_once './model/functions.php';
$cutString = new Functions();
$obj = new Products();
$params = array(
    'offset' => isset($_GET['page'])?(int)$_GET['page']:1,
    'id_category' =>isset($_GET['column'])?(int)$_GET['column']:"",
    'idColumn'=>isset($_GET['column'])?('&column='.$_GET['column'].'&'):'&',
    'search'=>$_GET['search']);

//var_dump($_GET['search']);
$products = $obj->select($params);
if(empty($products)) {$cutString->error404();} 
$total = $obj->count($params);
?>

<?php foreach($products as $product):?> 
<div id="col" class="box">    
    <div id="col-browser"><a href="#"><img src="<?php echo PATH_PRODUCTS_IMAGE.$product['thumb']?>" width="255" height="177" alt=""></a></div>       
        <div id="col-text">		
            <h2 id="slogan"><a href="detail.php?type=p&id=<?php echo $product['id']?>"><?php echo $product['name']?></a></h2>  
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
        'file' => 'listItems.php?type=p'
    ));
	if($total>PER_PAGE){echo $pagination->display($params);}
    ?>
</ul>

