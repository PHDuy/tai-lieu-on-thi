<?php 
//var_dump($_GET['type']);
require_once './model/functions.php';
$myfuntion = new Functions();
$params=array('id'=>$_GET['id']);

switch ($_GET['type']) {
    case "partner" :
        $obj = new Promo();
        $status = $obj->isExisted_id($params['id']);
        if(empty($status)){$myfuntion->error404();  }
        else {$details = $obj->get_row_by_id($params['id']);}
        break;
    case "p":
        $obj = new Products();
        $status = $obj->isExisted_id($params['id']);
        if(empty($status)){$myfuntion->error404();  }
        else {$details = $obj->get_row_by_id($params['id']);}
        break;
    case "b":
        $obj = new Blogs();
        $status = $obj->isExisted_id($params['id']);
        if(empty($status)){$myfuntion->error404();  }
        else {$details = $obj->get_row_by_id($params['id']);}
        break;
    default: $detail ? '':$myfuntion->error404();      
}

//var_dump($params['id']);
?>

<div id="col-left">
    <div id="description">
        <h2 id="title"><?php echo $details['name']?></h2>
        <?php echo $details['description']?>
    </div>
</div>