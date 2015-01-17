<?php
class Pagination {

    function display($params) {
        $current = $params['current_page'];
        $total = $params['total_page'];
        if (($current > 0 && $current <= $total)&&is_int($current*1)) {
            $html = '<li><a class="current" href="#">' . $current . '</a></li>';
            for ($i = 1; $i <= PER_ITEMS / 2; $i++) {
                $next_page = $current + $i;
                if ($next_page <= $total) {
                    $html .= '<li><a href="' . $params['file'] . $params['idColumn']."page={$next_page}" . '">' . $next_page . '</a></li>';
                }
                $prev_page = $current - $i;
                if ($prev_page > 0) {
                    $html = '<li><a href="' . $params['file'] .$params['idColumn']. "page={$prev_page}" . '">' . $prev_page . '</a></li>' . $html;
                }
            }
            
            if ($params['current_page'] > 2) {
                echo '<li><a href="' . $params['file'] . $params['idColumn']."page=1" . '">First</a></li>';
                echo '<li><a href="' . $params['file'] . $params['idColumn']."page=" . ($params['current_page'] - 1) . '">Previous</a></li>';
            } 
            echo $html;
            if ($params['current_page'] < $total) {
                echo '<li><a href="' . $params['file'] . $params['idColumn']."page=" . ($params['current_page'] + 1) . '">Next</a></li>';
                echo '<li><a href="' . $params['file'] .$params['idColumn']. "page=" . $total . '">Last</a></li>';
            }
        } else{
            require_once './model/functions.php';
            $myfuntions = new Functions();
            $myfuntions->error404();
        }
    }

}
