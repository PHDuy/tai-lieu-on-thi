<?php
function PageName() {
  return substr($_SERVER["SCRIPT_NAME"],strrpos($_SERVER["SCRIPT_NAME"],"/")+1);
}
function Type(){
    $page = isset($_GET['page'])?(int)$_GET['page']:0;
    $subtring = substr($_SERVER["QUERY_STRING"],strrpos($_SERVER["QUERY_STRING"],"/")+5);
    return substr($subtring,0,1);
}
$current_page = PageName();
$type = Type();
//var_dump($type);
?>


<div id="tray">

    <ul><li id="<?php if($current_page=='index.php') echo 'tray-active' ?>"><a href="index.php">Homepage</a></li> <!-- Active page -->            
        <li id="<?php if($type=='p') echo 'tray-active' ?>"><a href="listItems.php?type=p">Products</a></li>
        <li id="<?php if($type=='b') echo 'tray-active' ?>"><a href="listItems.php?type=b">Blog</a></li>
        <li><a href="#">Testimonials</a></li>

    </ul><!-- Search --><div id="search" class="box">
        <form action="listItems.php?type=p&search=<?php echo $_GET['search']?>" method="GET">
            <div class="box">
                <div id="search-input"><span class="noscreen">Search:</span><input type="text" size="30" name="search" placeholder="Searching..."></div>
                <div id="search-submit"><input type="image" src="design/search-submit.gif" value="OK"></div>
            </div>
        </form>
    </div> <!-- /search -->

    <hr class="noscreen"></div>