<?php 
require_once './model/functions.php';
$CutString = new Functions();
$obj = new Testimonials();
$params = array(
    'limit'=>'0,3'
);
$testimonials = $obj->select($params);
//var_dump($testimonials);
?>

<div id="col-right">
    <?php foreach ($testimonials as $testimonial): ?>
    <div class="testimonials-item">
        <h4><span>Testimonials</span></h4>
        <div class="box">

            <div class="col-right-img"><img src="public/imgs/testimonials/<?php echo $testimonial['thumb'] ?>" width="65" height="65" alt=""></div>
            <div class="col-right-text">

                <p><?php echo $CutString->truncateString_($testimonial['description'], 130) ?></p>
                <p class="high smaller">– <cite><?php echo $testimonial['name'] ?></cite></p>

            </div> <!-- /col-right-text -->

        </div> <!-- /box -->
    </div>
    <?php endforeach; ?>
</div>