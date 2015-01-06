<?php

$obj = new Blogs();

$params = array('limit' => '0,5');
$blogs = $obj->GetAuthorBlog($params);
?>

<div id="col-left">

    <div class="title">
        <h4>Blog</h4>
    </div> <!-- /title -->
    <ul class="ul-list nomb">
<?php foreach ($blogs as $blog): ?> 
            <li>
                <span class="f-right"><a href="#" class="ico-comment"><?php echo $blog['nameAuthor'] ?></a></span> <span class="date"><?php echo date('d-m-Y', $blog['created']); ?></span> <a href="detail.php?type=b&id=<?php echo $blog['id']?>" class="article"><?php echo $blog['name'] ?></a>
            </li>
<?php endforeach; ?>
    </ul>


</div>